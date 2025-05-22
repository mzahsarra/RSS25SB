package fr.univrouen.rss25sb.rss25sb.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Person {
    private String name;
    private String email;
    private String uri;

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getUri() { return uri; }
    public void setUri(String uri) { this.uri = uri; }
}