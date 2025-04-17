package com.example.demo.controller;

import com.example.demo.entity.Club;
import com.example.demo.service.ClubService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clubs")
@Tag(name = "Club Controller", description = "APIs for club registration and login")
public class ClubController {

    @Autowired
    private ClubService clubService;

    @Operation(summary = "Register a new club")
    @PostMapping("/register")
    public ResponseEntity<?> registerClub(@RequestBody Club club) {
        Club savedClub = clubService.registerClub(club);
        return ResponseEntity.ok(savedClub);
    }

    @Operation(summary = "Login a club with club name and contact")
    @PostMapping("/login")
    public ResponseEntity<?> loginClub(@RequestBody Club loginRequest) {
        return clubService.login(loginRequest.getClubName(), loginRequest.getClubCp())
                .map(club -> ResponseEntity.ok(club))
                .orElse(ResponseEntity.status(401).body("Invalid credentials"));
    }
}
