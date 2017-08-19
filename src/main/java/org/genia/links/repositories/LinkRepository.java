package org.genia.links.repositories;

import org.genia.links.entities.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Integer> {
}
