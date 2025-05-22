package fr.univrouen.rss25sb.rss25sb.service;

import fr.univrouen.rss25sb.rss25sb.model.Feed;
import fr.univrouen.rss25sb.rss25sb.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Rss25ServiceImpl implements Rss25Service {
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Feed getResume() {
        // Return a feed with only id, date, and guid for all items
        return new Feed(); // Implement logic to fetch summary
    }

    @Override
    public Feed getItem(Long id) {
        // Fetch full item by id
        return null; // Implement logic
    }

    @Override
    public boolean isDuplicate(Feed feed) {
        // Check for duplicate based on title and pubDate
        return false; // Implement logic
    }

    @Override
    public Long saveFeed(Feed feed) {
        // Save feed and return generated id
        return 1L; // Implement logic
    }

    @Override
    public boolean deleteItem(Long id) {
        // Delete item and return success
        return true; // Implement logic
    }
}