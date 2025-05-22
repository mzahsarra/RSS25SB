package fr.univrouen.rss25sb.rss25sb.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Image {
    private String type;
    private String href;
    private String alt;
    private Integer length;

    // Getters and setters
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getHref() { return href; }
    public void setHref(String href) { this.href = href; }
    public String getAlt() { return alt; }
    public void setAlt(String alt) { this.alt = alt; }
    public Integer getLength() { return length; }
    public void setLength(Integer length) { this.length = length; }
}