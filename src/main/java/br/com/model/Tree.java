package br.com.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "tree")
public class Tree {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "the quantity field should not be null")
    private int quantity;

    @Column(name = "created_at")
    private Date createdAt = new Date();
}
