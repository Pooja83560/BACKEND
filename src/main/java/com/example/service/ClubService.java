package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Club;
import com.example.demo.repository.ClubRepository;

@Service
public class ClubService {

    @Autowired
    private ClubRepository clubRepository;

    public Club registerClub(Club club) {
        return clubRepository.save(club);
    }

    public Optional<Club> getClubById(Long clubId) {
        return clubRepository.findById(clubId);
    }

    public Optional<Club> login(String clubName, String clubCp) {
        return clubRepository.findByClubNameAndClubCp(clubName, clubCp);
    }
}
