package com.om.process.dao;

import com.om.process.model.Item;
import org.springframework.stereotype.Repository;

import com.om.process.model.ItemList;

import java.util.Objects;

@Repository
public class ItemDao
{
    private static ItemList  list = new ItemList();

    static
    {
        list.getItemLists().add(new Item(1, "Protein" , "Helps in building muscles", 80));

        list.getItemLists().add(new Item(2, "Creatine", "Helps in body building", 30));

        list.getItemLists().add(new Item(3, "Energy Drink", "Contains caffeine", 45));
    }

    public ItemList getAllItemList()
    {
        return list;
    }

    public static void addItems(Item item){

        list.getItemLists().add(item);
    }
    public void addItem(Item item) {
        list.getItemLists().add(item);
    }

    public Item updateItem(String id, Item data){

        Item item = null;

        for (int i=0; i<list.getItemLists().size(); ++i)
            if (Objects.equals(list.getItemLists().get(i).getId(), id))
        {
            item = list.getItemLists().get(i);
        }
            return item;
        }
    }



