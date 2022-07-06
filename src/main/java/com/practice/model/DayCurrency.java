package com.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "DayCurrency")
public class DayCurrency {
    @Id
    private int PK_id;
    @Column(name = "nominal")
    private int nominal;
    @Column(name = "value")
    private double value;
    @Column(name = "date")
    private Date date;

    public DayCurrency(){

    }
    public int getPK_Id() {
        return PK_id;
    }

    public void setPK_Id(int PK_id) {
        this.PK_id = PK_id;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
