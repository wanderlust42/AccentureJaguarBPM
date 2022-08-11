package com.company.accenturejaguarbpm.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@JmixEntity
@Table(name = "CAR_EXIST", indexes = {
        @Index(name = "IDX_CAR_OLD_CAR_OWNER", columnList = "CAR_OWNER_ID"),
        @Index(name = "IDX_CAR_EXIST_CUSTOMER", columnList = "CUSTOMER_ID")
})
@Entity
public class CarExist {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;


    @Column(name = "MANUFACTURER", nullable = false)
    @NotNull
    private String manufacturer;

    @Column(name = "MODEL", nullable = false)
    @NotNull
    private String model;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "CAR_OWNER_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Customer carOwner;

    @Column(name = "YEAR_OF_PRODUCTION")
    private Integer year_of_production;

    @Column(name = "WARRANTY")
    private Boolean warranty_valid;

    @Column(name = "COSTS_ESTIMATION", precision = 19, scale = 2)
    private BigDecimal costs_counter;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "CUSTOMER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @Column(name = "VCODE", length = 50)
    private String vcode;

    public void setYear_of_production(Integer year_of_production) {
        this.year_of_production = year_of_production;
    }

    public Integer getYear_of_production() {
        return year_of_production;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(Customer carOwner) {
        this.carOwner = carOwner;
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }

    public BigDecimal getCosts_counter() {
        return costs_counter;
    }

    public void setCosts_counter(BigDecimal costs_counter) {
        this.costs_counter = costs_counter;
    }

    public Boolean getWarranty_valid() {
        return warranty_valid;
    }

    public void setWarranty_valid(Boolean warranty_valid) {
        this.warranty_valid = warranty_valid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}