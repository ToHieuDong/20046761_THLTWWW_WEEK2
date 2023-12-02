package com.example.thltwww_week2.backend.enums;

public enum ProductStatus {
    ACTIVE(0), DEACTIVE(1), DELETE(2);
    private int value;

    ProductStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
