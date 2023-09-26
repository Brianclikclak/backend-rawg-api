package com.grottogaming.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grottogaming.demo.models.Screenshot;

public interface ScreenshotRepository extends JpaRepository<Screenshot, Long> {
}
