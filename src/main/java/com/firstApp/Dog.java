package com.firstApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class Dog {
    private Long id;
    private String name;
    @Autowired
    private Toy toy;

    public Dog(){
        System.out.println("Tworze obiekt Dog!");
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public void sayHello(){
        System.out.println("Hello");
        toy.play();
    }

}
