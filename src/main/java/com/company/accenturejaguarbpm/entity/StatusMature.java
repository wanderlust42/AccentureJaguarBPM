package com.company.accenturejaguarbpm.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;

public enum StatusMature implements EnumClass<String> {

    AWARENESS("A"),
    RESEARCH_COMPARISION("RC"),
    EVALUATE_TEST("ET"),
    FIND_CUSTOMER_SENTIMENT("FCS"),
    VEHICLE_CUSTOMIZATION("VC"),
    DECIDE("Dec"),
    PAY_CHECKOUT("PC"),
    DELIVERY("Del"),
    MAINTENANCE("M");

    private String id;

    StatusMature(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static StatusMature fromId(String id) {
        for (StatusMature at : StatusMature.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}