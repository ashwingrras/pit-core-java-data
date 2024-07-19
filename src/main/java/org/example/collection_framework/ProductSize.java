package org.example.collection_framework;

public class ProductSize
{
     Integer id;

     Integer productId;

     String name;

     Double stockQty;

    ProductSize(Integer id,Integer productId, String name, Double stockQty)
    {
        this.id = id;
        this.productId = productId;
        this.name = name;
        this.stockQty = stockQty;
    }
}
