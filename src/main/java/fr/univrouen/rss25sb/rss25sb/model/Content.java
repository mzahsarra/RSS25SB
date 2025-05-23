package fr.univrouen.rss25sb.rss25sb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Content {
    private String type;
    private String src;
    private String value;

    // Getters and setters
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getSrc() { return src; }
    public void setSrc(String src) { this.src = src; }
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
}