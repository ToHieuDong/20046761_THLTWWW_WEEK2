package com.example.thltwww_week2.backend.enums;

public enum ProductStatus {
    ACTIVE(1), DEACTIVE(0), DELETE(-1);
    private int value;

    ProductStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
