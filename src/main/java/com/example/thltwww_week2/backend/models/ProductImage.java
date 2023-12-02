package com.example.thltwww_week2.backend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "product_image")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private long imageId;
    @Column(name = "alternative", length = 50)
    private String alternative;
    @Lob
    @Column(name = "path", length = 255)
    private String path;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public ProductImage() {
    }

    public ProductImage(String path,  String alternative, Product product) {
        this.path = path;
        this.alternative = alternative;
        this.product=product;
    }

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "imageId=" + imageId +
                ", alternative='" + alternative + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
