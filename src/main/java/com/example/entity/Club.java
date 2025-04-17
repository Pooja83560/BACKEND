package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "club")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clubId;

    @Column(nullable = false)
    private String clubName;

    @Column(nullable = false)
    private String clubCp; // Club contact number

    @Column(length = 500)
    private String clubDescription;

    public Club() {}

    public Club(String clubName, String clubCp, String clubDescription) {
        this.clubName = clubName;
        this.clubCp = clubCp;
        this.clubDescription = clubDescription;
    }

    // Getters and Setters
    public Long getClubId() {
        return clubId;
    }

    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubCp() {
        return clubCp;
    }

    public void setClubCp(String clubCp) {
        this.clubCp = clubCp;
    }

    public String getClubDescription() {
        return clubDescription;
    }

    public void setClubDescription(String clubDescription) {
        this.clubDescription = clubDescription;
    }
}
