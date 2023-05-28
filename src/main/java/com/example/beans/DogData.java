package com.example.beans;

public class DogData {
    private String id;
    private String type;
    private DogAttributes attributes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DogAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(DogAttributes attributes) {
        this.attributes = attributes;
    }
}
