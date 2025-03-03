package com.springboot.jpa.data.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer stock;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;

    public void setName(String name) {
        this.name = name;
    }

    public void setUpdatedAt(LocalDateTime now) {
        this.updateAt = now;
    }
}
