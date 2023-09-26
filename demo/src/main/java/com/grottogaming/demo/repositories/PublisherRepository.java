package com.grottogaming.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grottogaming.demo.models.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
