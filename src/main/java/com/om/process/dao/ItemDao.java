package com.om.process.dao;

import com.om.process.model.Item;
import org.springframework.stereotype.Repository;

import com.om.process.model.ItemList;

@Repository
public class ItemDao
{
    private static ItemList  list = new ItemList();

    static
    {
        list.getItemLists().add(new Item(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com"));
        list.getItemLists().add(new Item(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
        list.getItemLists().add(new Item(3, "David", "Kameron", "titanic@gmail.com"));
    }

    public ItemList getAllItemList()
    {
        return list;
    }

    public void addEmployee(Item item) {
        list.getItemLists().add(item);
    }

    public void addItem(Item item) {

    }
}
