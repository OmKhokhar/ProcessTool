package com.om.process.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.om.process.dao.ItemDao;
import com.om.process.model.Item;
import com.om.process.model.ItemList;

@RestController
@RequestMapping(path = "/itemlist")
public class ItemController
{
    @Autowired
    private ItemDao itemDao;

    @GetMapping(path="/", produces = "application/json")
    public ItemList getItemList()
    {
        return itemDao.getAllItemList();
    }

    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addItem(
            @RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,
            @RequestHeader(name = "X-COM-LOCATION", required = false, defaultValue = "ASIA") String headerLocation,
            @RequestBody Item item)
            throws Exception
    {
        //Generate resource id
        Integer id = itemDao.getAllItemList().getItemLists().size() + 1;
        item.setId(id);

        //add resource
        itemDao.addItems(item);

        //Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(item.getId())
                .toUri();

        //Send location in response
        return ResponseEntity.created(location).build();
    }
}
//NOTE: Use the Process_Controller to run the code instead of ItemController