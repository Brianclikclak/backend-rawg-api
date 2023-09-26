package com.grottogaming.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grottogaming.demo.models.Developer;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
}
