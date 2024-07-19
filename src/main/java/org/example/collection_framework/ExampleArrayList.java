package org.example.collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExampleArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);
        list.add(105);
        list.add(105);
        System.out.println("list as: "+list);
        System.out.println("list with index: "+list.getFirst());
        list.remove(3);
        System.out.println("list as: "+list);
        // length, length()
        // size()
        // ----1---
        for(int i=0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        // ----2---
        for (Integer integer : list) {
            System.out.println(integer);
        }
        // ----3---
        list.forEach(item -> System.out.println(item));
        //list.forEach(System.out::println);
        // ----4---
        Iterator<Integer> iterator = list.iterator();
        System.out.println("iterator "+iterator);
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        List<String> list1 = new LinkedList<>();
        list1.add("devashish");
        list1.add("aman");
        System.out.println("list1 LinkedList: "+list1);


        ArrayList<Product> productArrayList = new ArrayList<>();
        //Product 1
        Product product = new Product();
        product.setId(1001);
        product.setName("Puma Black T-Shirt");
        product.setPrice(1999.00);
        //Product 1 , Size 1, XL
        ProductSize productSize1 = new ProductSize(2001, product.getId(), "XL",100.00);
        //Product 1 , Size 2, XXL
        ProductSize productSize2 = new ProductSize(2002, product.getId(), "XXL",70.00);
        //TODO adding product size to product size list
        ArrayList<ProductSize> productSizeArrayList = new ArrayList<>();
        productSizeArrayList.add(productSize1);
        productSizeArrayList.add(productSize2);
        //
        product.setProductSizes(productSizeArrayList);
        //
        productArrayList.add(product);
        for(int i =0; i < productArrayList.size(); i++)
        {
            Product product1 = productArrayList.get(i);
            System.out.println("product name: "+product1.getName());
            ArrayList<ProductSize> productSizes = product1.getProductSizes();
            for(int j=0; j < productSizes.size(); j++)
            {
                ProductSize productSize = productSizes.get(j);
                System.out.println("product size: "+productSize.name);
            }
        }
    }
}
