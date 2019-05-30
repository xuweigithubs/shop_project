package com.huawei.vo;

import java.util.Objects;

public class Product {

    private String id;

    private String productname;

    private String productdesc1;

    private String productdesc2;

    private String weight;

    private String productorigin;

    private String productbz;

    private String productshape;

    private String price;

    private String producttypeid;

    private String brandid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getProductdesc1() {
        return productdesc1;
    }

    public void setProductdesc1(String productdesc1) {
        this.productdesc1 = productdesc1 == null ? null : productdesc1.trim();
    }

    public String getProductdesc2() {
        return productdesc2;
    }

    public void setProductdesc2(String productdesc2) {
        this.productdesc2 = productdesc2 == null ? null : productdesc2.trim();
    }

    public String getWeight() {
        return weight;
    }


    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }


    public String getProductorigin() {
        return productorigin;
    }


    public void setProductorigin(String productorigin) {
        this.productorigin = productorigin == null ? null : productorigin.trim();
    }


    public String getProductbz() {
        return productbz;
    }


    public void setProductbz(String productbz) {
        this.productbz = productbz == null ? null : productbz.trim();
    }


    public String getProductshape() {
        return productshape;
    }


    public void setProductshape(String productshape) {
        this.productshape = productshape == null ? null : productshape.trim();
    }


    public String getPrice() {
        return price;
    }


    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }


    public String getProducttypeid() {
        return producttypeid;
    }


    public void setProducttypeid(String producttypeid) {
        this.producttypeid = producttypeid == null ? null : producttypeid.trim();
    }


    public String getBrandid() {
        return brandid;
    }


    public void setBrandid(String brandid) {
        this.brandid = brandid == null ? null : brandid.trim();
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", productname='" + productname + '\'' +
                ", productdesc1='" + productdesc1 + '\'' +
                ", productdesc2='" + productdesc2 + '\'' +
                ", weight='" + weight + '\'' +
                ", productorigin='" + productorigin + '\'' +
                ", productbz='" + productbz + '\'' +
                ", productshape='" + productshape + '\'' +
                ", price='" + price + '\'' +
                ", producttypeid='" + producttypeid + '\'' +
                ", brandid='" + brandid + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(productname, product.productname) &&
                Objects.equals(productdesc1, product.productdesc1) &&
                Objects.equals(productdesc2, product.productdesc2) &&
                Objects.equals(weight, product.weight) &&
                Objects.equals(productorigin, product.productorigin) &&
                Objects.equals(productbz, product.productbz) &&
                Objects.equals(productshape, product.productshape) &&
                Objects.equals(price, product.price) &&
                Objects.equals(producttypeid, product.producttypeid) &&
                Objects.equals(brandid, product.brandid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, productname, productdesc1, productdesc2, weight, productorigin, productbz, productshape, price, producttypeid, brandid);
    }
}