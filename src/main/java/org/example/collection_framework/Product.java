package org.example.collection_framework;

import java.util.ArrayList;

public class Product
{

    private Integer id;
    private String name;
    private Double price;

    ////ArrayList<String> sizes;

    //Aggregation
    private ArrayList<ProductSize> productSizes;

    // encapsulation
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ArrayList<ProductSize> getProductSizes() {
        return productSizes;
    }

    public void setProductSizes(ArrayList<ProductSize> productSizes) {
        this.productSizes = productSizes;
    }
}
