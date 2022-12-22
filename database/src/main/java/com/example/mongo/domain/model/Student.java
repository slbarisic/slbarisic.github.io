package com.example.mongo.domain.model;

import com.example.mongo.domain.enums.Gender;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Builder
public record Student(
        String firstName,
        String lastName,
        String email,
        Gender gender,
        Address address,
        List<String> favoriteSubjects,
        BigDecimal totalSpentInBooks,
        LocalDateTime created)
{}
