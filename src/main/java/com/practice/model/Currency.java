package com.practice.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "currency")
public class Currency {
    @Id
    private int id;
    @Column(name = "CharCode")
    private String charCode;
    @Column(name = "Name")
    private String name;
    @Column(name = "Nominal")
    private int nominal;
    @Column(name = "Value")
    private int value;

    public Currency() {
    }

    public Currency(int id, String charCode, String name, int nominal, int value) {
        this.id = id;
        this.charCode = charCode;
        this.name = name;
        this.nominal = nominal;
        this.value = value;
    }


    public long getId() {
        return id;
    }

    public String getCharCode() {
        return charCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public long getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
