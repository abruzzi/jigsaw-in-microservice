package com.thoughtworks.jigsaw.model;

public class Skill {
    private String name;
    private Integer rating;
    private NamedEntity group;

    public Skill() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public NamedEntity getGroup() {
        return group;
    }

    public void setGroup(NamedEntity group) {
        this.group = group;
    }
}
