package com.company.accenturejaguarbpm.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@JmixEntity
@Table(name = "CATALOGUE")
@Entity
public class Catalogue {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "YEAR_")
    private Integer year;

    @Column(name = "VCODE", length = 50)
    private String vcode;

    @Column(name = "ENGINE")
    private String engine;

    @Column(name = "FUEL")
    private String fuel;

    @Column(name = "PRICE", precision = 19, scale = 2)
    private BigDecimal price;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "car2Drive")
    private TestDrive testDrive;

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public TestDrive getTestDrive() {
        return testDrive;
    }

    public void setTestDrive(TestDrive testDrive) {
        this.testDrive = testDrive;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @InstanceName
    @DependsOnProperties({"model", "year"})
    public String getInstanceName() {
        return String.format("%s %s", model, year);
    }
}