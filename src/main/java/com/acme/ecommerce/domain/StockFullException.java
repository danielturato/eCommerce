package com.acme.ecommerce.domain;

public class StockFullException extends RuntimeException {
    public StockFullException() {
        super("The new quantity for that stock exceeds the stock level.");
    }
}
