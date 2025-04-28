package com.ps;

public class Product {
    private String sku;
    private String name;
    private double price;
    private String department;


    public Product() {
        this.sku = "";
        this.name = "";
        this.price = 0;
        this.department = "";
    }

    public Product(String sku, String name, double price, String department) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.department = department;
    }

//  Getters
    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDepartment() {
        return department;
    }

    //  Setters
    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public void printProduct() {
        System.out.println("Product: \n"
                            +"\nname: "+this.name
                            +"\nsku: "+this.sku
                            +"\nprice: "+this.price
                            +"\ndescription: "+this.department
        );
    }
}





