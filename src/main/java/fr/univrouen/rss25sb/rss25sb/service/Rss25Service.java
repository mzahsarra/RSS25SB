package fr.univrouen.rss25sb.rss25sb.service;

import fr.univrouen.rss25sb.rss25sb.model.Feed;

public interface Rss25Service {
    Feed getResume();
    Feed getItem(Long id);
    boolean isDuplicate(Feed feed);
    Long saveFeed(Feed feed);
    boolean deleteItem(Long id);
}