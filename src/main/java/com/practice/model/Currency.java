package com.practice.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.sql.Date;

public class Currency {
    private int PK_id;
    @NotEmpty(message = "NumCode should not be empty")
    @Size(min=3, max = 3, message = "NameCode contains only 3 digits")
    private int numCode;
    @NotEmpty(message = "CharCode should not be empty")
    @Size(min=3, max = 3, message = "CharCode contains only 3 characters")
    private String charCode;
    @NotEmpty(message = "Name should not be empty")
    @Size(min=2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;

    public Currency() {
    }

    public Currency(int PK_id, int numCode, String charCode, String name) {
        this.PK_id = PK_id;
        this.numCode = numCode;
        this.charCode = charCode;
        this.name = name;
    }


    public int getPK_Id() {
        return PK_id;
    }

    public void setPK_Id(int PK_id) { this.PK_id = PK_id; }

    public int getNumCode() {
        return numCode;
    }

    public void setNumCode(int numCode) { this.numCode = numCode; }

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


}
