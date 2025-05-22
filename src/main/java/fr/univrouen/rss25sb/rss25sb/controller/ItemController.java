package fr.univrouen.rss25sb.rss25sb.controller;

import fr.univrouen.rss25sb.rss25sb.model.Item;
import fr.univrouen.rss25sb.rss25sb.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/")
    public String home() {
        return "Application rss25SB is running!";
    }

    @PostMapping("/items")
    public Item createItem(@RequestParam String name) {
        Item item = new Item();
        item.setName(name);
        return itemRepository.save(item);
    }

    @GetMapping("/items")
    public Iterable<Item> getItems() {
        return itemRepository.findAll();
    }
}