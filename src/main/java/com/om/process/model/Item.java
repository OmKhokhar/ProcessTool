package com.om.process.model;

public class Item {

    public Item(Integer id, String product, String desc, Integer price) {
        super();
        this.id = id;
        this.product = product;
        this.desc = desc;
        this.price = price;
    }

    private Integer id;

    private String product;

    private String desc;

    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String Product) {
        this.product = product;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String Desc) {
        this.desc = desc;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", product=" + product + ", desc=" + desc + ", price=" + price + "]";
    }
}

