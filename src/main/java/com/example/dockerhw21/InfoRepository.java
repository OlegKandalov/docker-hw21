package com.example.dockerhw21;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoRepository extends JpaRepository<Picture, Long> {
}
