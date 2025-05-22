package fr.univrouen.rss25sb.rss25sb.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Feed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String pubDate;
    private String copyright;
    @ElementCollection
    private List<Link> links;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> items;
    private String lang;
    private String version;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getPubDate() { return pubDate; }
    public void setPubDate(String pubDate) { this.pubDate = pubDate; }
    public String getCopyright() { return copyright; }
    public void setCopyright(String copyright) { this.copyright = copyright; }
    public List<Link> getLinks() { return links; }
    public void setLinks(List<Link> links) { this.links = links; }
    public List<Item> getItems() { return items; }
    public void setItems(List<Item> items) { this.items = items; }
    public String getLang() { return lang; }
    public void setLang(String lang) { this.lang = lang; }
    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }
}