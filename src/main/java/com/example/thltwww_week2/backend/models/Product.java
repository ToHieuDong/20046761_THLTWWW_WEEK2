package com.example.thltwww_week2.backend.models;

import com.example.thltwww_week2.backend.enums.ProductStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_id", length = 50)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long product_id;
    @Column(name = "description", length = 50)
    private String description;
    @Column(name = "manufacturer", length = 50)
    private String manufacturer;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "unit", length = 50)
    private String unit;
    @Column(name = "status", columnDefinition = "tinyint(4)")
    private ProductStatus status;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", description='" + description + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", status=" + status +
                '}';
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public Product(String description, String manufacturer, String name, String unit, ProductStatus status) {
        this.description = description;
        this.manufacturer = manufacturer;
        this.name = name;
        this.unit = unit;
        this.status = status;
    }
}

