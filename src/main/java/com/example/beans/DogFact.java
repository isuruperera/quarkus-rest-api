package com.example.beans;

import io.vertx.codegen.annotations.DataObject;

import java.util.List;

@DataObject
public class DogFact {
    private List<DogData> data;

    // Getters and setters omitted for brevity
    // A custom method to return a random fact from the array
    public String getRandomFact() {
        if (getData() != null && getData().size() > 0) {
            // Get a random index from 0 to facts.length - 1
            int index = (int) (Math.random() * getData().size());
            // Return the fact at that index
            return data.get(index).getAttributes().getBody();
        } else {
            // Return a default fact if something goes wrong
            return "Dogs are awesome.";
        }
    }

    public List<DogData> getData() {
        return data;
    }

    public void setData(List<DogData> data) {
        this.data = data;
    }
}
