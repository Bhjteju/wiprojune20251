package com.wipro.springmvcnew.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
public class Address {
    private String line;
    private String city;
    private String state;
    private String pincode;
}
