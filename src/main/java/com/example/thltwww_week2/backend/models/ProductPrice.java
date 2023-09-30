package com.example.thltwww_week2.backend.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "product_price")
public class ProductPrice {
    @Id
    @Column(name = "localDateTime", columnDefinition = "datetime")
    private LocalDateTime localDateTime;
    @Column(name = "note", length = 50)
    private String note;
    @Column(name = "price", columnDefinition = "double")
    private double price;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public ProductPrice() {
    }

    public ProductPrice(LocalDateTime localDateTime, String note, double price) {
        this.localDateTime = localDateTime;
        this.note = note;
        this.price = price;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "localDateTime=" + localDateTime +
                ", note='" + note + '\'' +
                ", price=" + price +
                '}';
    }
}
