package fr.univrouen.rss25sb.rss25sb.repository;

import fr.univrouen.rss25sb.rss25sb.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}