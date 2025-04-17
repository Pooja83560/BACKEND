package com.example.demo.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Club;

public interface ClubRepository extends JpaRepository<Club, Long> {
    // Optionally, add a method to find by clubName and clubCp
    Optional<Club> findByName(String name);
}
