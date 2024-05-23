package com.hlumakov;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity(name = "BookDTO")
@Table(name = "BOOK")
public class BookDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

 }