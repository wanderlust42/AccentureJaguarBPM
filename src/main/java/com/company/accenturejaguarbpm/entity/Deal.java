package com.company.accenturejaguarbpm.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "DEAL", indexes = {
        @Index(name = "IDX_DEAL_CUSTOMER", columnList = "CUSTOMER_ID"),
        @Index(name = "IDX_DEAL_CATALOGUE", columnList = "CATALOGUE_ID")
})
@Entity
public class Deal {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Customer customer;

    @Column(name = "MATURE", nullable = false)
    @NotNull
    private String mature;

    @JoinColumn(name = "CATALOGUE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Catalogue catalogue;

    @OneToMany(mappedBy = "deal")
    private List<TestDrive> testDrive;

    @Column(name = "PROJECTED_RESULT", precision = 19, scale = 2)
    private BigDecimal projectedResult;

    public Catalogue getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(Catalogue catalogue) {
        this.catalogue = catalogue;
    }

    public BigDecimal getProjectedResult() {
        return projectedResult;
    }

    public void setProjectedResult(BigDecimal projectedResult) {
        this.projectedResult = projectedResult;
    }

    public List<TestDrive> getTestDrive() {
        return testDrive;
    }

    public void setTestDrive(List<TestDrive> testDrive) {
        this.testDrive = testDrive;
    }

    public StatusMature getMature() {
        return mature == null ? null : StatusMature.fromId(mature);
    }

    public void setMature(StatusMature mature) {
        this.mature = mature == null ? null : mature.getId();
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

    @InstanceName
    @DependsOnProperties({"catalogue", "customer"})
    public String getInstanceName() {
        return String.format("%s - %s", catalogue.getInstanceName(), customer.getInstanceName());
    }
}