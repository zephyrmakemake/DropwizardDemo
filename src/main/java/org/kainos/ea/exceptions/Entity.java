package org.kainos.ea.exceptions;

public enum Entity {
    ORDER("Order"),
    PRODUCT("Product"),
    CUSTOMER("Customer"),;

    private final String entity;

    Entity(String entity) {
        this.entity = entity;
    }

    public String getEntity() {
        return this.entity;
    }
}