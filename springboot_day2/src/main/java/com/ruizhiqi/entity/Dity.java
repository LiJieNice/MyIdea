package com.ruizhiqi.entity;

public class Dity {
    private String id;
    private String name;
    private String dityType;
    private Double price;
    private String city;

    @Override
    public String toString() {
        return "Dity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dityType='" + dityType + '\'' +
                ", price=" + price +
                ", city='" + city + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDityType() {
        return dityType;
    }

    public void setDityType(String dityType) {
        this.dityType = dityType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Dity() {

    }

    public Dity(String id, String name, String dityType, Double price, String city) {

        this.id = id;
        this.name = name;
        this.dityType = dityType;
        this.price = price;
        this.city = city;
    }
}
