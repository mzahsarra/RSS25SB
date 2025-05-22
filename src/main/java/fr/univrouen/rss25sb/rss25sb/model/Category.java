package fr.univrouen.rss25sb.rss25sb.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Category {
    private String term;

    // Getters and setters
    public String getTerm() { return term; }
    public void setTerm(String term) { this.term = term; }
}