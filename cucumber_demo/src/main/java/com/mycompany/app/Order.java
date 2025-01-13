package com.mycompany.app;

import java.util.List;

public class Order {
    private String owner;
    private String target;
    private List<String> cocktails;


    public String getOwner() {
        return owner;
    }
    public void declareOwner(String owner) {
        this.owner = owner;
    }
    public String getTarget() {
        return target;
    }
    public void declareTarget(String target) {
        this.target = target;
    }
    public List<String> getCocktails() {
        return cocktails;
    }
    public void setCocktails(List<String> cocktails) {
        this.cocktails = cocktails;
    }

    
}
