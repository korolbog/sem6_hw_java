package org.example.model;

public class Laptops {
    private Integer id;
    private String brand;
    private String operatingSystem;
    private Integer ram;
    private Integer hardDrive;
    private String color;
    private Integer displaySize;
    private Integer price;

    public Laptops(Integer id,
                   String brand,
                   String operatingSystem,
                   Integer ram,
                   Integer hardDrive,
                   String color,
                   Integer displaySize,
                   Integer price) {
        this.id = id;
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.color = color;
        this.displaySize = displaySize;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(Integer hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(Integer displaySize) {
        this.displaySize = displaySize;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Артикул: "+ this.id + ";\tБренд: "+ this.brand + ";\tОЗУ: "+this.ram+ ";\tЖД: "+this.hardDrive+";\tЦена: "+this.price;
    }
}