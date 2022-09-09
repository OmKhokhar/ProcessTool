package com.om.process.model;

import java.util.ArrayList;
import java.util.List;

public class ItemList
{
    private List<com.om.rest.model.Item> ItemLists;

    public List<com.om.rest.model.Item> getItemLists() {
        if(ItemLists == null) {
            ItemLists = new ArrayList<>();
        }
        return ItemLists;
    }

    public void setItemLists(List<com.om.rest.model.Item> ItemLists) {
        this.ItemLists = ItemLists;
    }
}
