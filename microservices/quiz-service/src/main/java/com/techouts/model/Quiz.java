package com.techouts.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String category;

    @ElementCollection
    private List<Integer> questionsIds;

    @Data
    @RequiredArgsConstructor
    public static class Response {
        private int id;
        private char response;
    }
}
