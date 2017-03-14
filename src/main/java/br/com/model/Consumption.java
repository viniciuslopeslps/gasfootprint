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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ConsumptionType getType() {
        return type;
    }

    public void setType(ConsumptionType type) {
        this.type = type;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}
