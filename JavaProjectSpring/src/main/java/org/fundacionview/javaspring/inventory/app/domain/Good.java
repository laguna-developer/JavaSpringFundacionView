package org.fundacionview.javaspring.inventory.app.domain;

public class Good {
    private String id;
    private String name;
    private String description;

    public Good(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
