package br.com.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "consumption")
public class Consumption {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "the quantity field should not be null")
    private int quantity;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "the type field should not be null")
    private ConsumptionType type;

    @Column(name = "created_at")
    private Date createdAt = new Date();
}
