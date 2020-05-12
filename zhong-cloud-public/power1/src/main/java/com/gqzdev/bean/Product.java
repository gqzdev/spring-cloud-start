package com.gqzdev.bean;

/**
 * @ClassName: Product
 * @author: ganquanzhong
 * @date: 2020/5/12 17:34
 */
public class Product {
    private Integer pid;
    private String pname;
    private String description;
    private double price;

    public Product() {
    }

    public Product(Integer pid, String pname, String description, double price) {
        this.pid = pid;
        this.pname = pname;
        this.description = description;
        this.price = price;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
