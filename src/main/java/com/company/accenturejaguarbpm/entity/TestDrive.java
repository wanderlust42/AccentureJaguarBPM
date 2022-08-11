package com.company.accenturejaguarbpm.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "TEST_DRIVE", indexes = {
        @Index(name = "IDX_TEST_DRIVE_CUSTOMER", columnList = "CUSTOMER_ID"),
        @Index(name = "IDX_TEST_DRIVE_CAR2_DRIVE", columnList = "CAR2_DRIVE_ID"),
        @Index(name = "IDX_TEST_DRIVE_DEAL", columnList = "DEAL_ID"),
        @Index(name = "IDX_TEST_DRIVE_CAR2_DRI_pN9Lla", columnList = "CAR2_DRIVE_ID")
})
@Entity
public class TestDrive {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "CAR2_DRIVE_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Catalogue car2Drive;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Customer customer;

    @Column(name = "DATE_TIME")
    private LocalDateTime date_time;

    @Column(name = "CLIENT_SATISFACTION")
    private String client_satisfaction;


    @JoinColumn(name = "DEAL_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Deal deal;

    public Catalogue getCar2Drive() {
        return car2Drive;
    }

    public void setCar2Drive(Catalogue car2Drive) {
        this.car2Drive = car2Drive;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    public String getClient_satisfaction() {
        return client_satisfaction;
    }

    public void setClient_satisfaction(String client_satisfaction) {
        this.client_satisfaction = client_satisfaction;
    }

    public LocalDateTime getDate_time() {
        return date_time;
    }

    public void setDate_time(LocalDateTime date_time) {
        this.date_time = date_time;
    }





    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}