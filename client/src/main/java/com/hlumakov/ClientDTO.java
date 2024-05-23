package com.hlumakov;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "CLIENT")
public class ClientDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

}