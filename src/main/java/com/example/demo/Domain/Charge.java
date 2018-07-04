package com.example.demo.Domain;

import javax.persistence.*;

@Entity
@Table(name = "charge")
public class Charge {

    @Id
    @Column(name = "charge_id")
    private String chargeId;
    @Column(name = "charge_item")
    private String chargeItem;
    @Column(name = "charge_standard")
    private String chargeStandard;
    @Column(name = "charge_info")
    private String chargeInfo;


    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId;
    }


    public String getChargeItem() {
        return chargeItem;
    }

    public void setChargeItem(String chargeItem) {
        this.chargeItem = chargeItem;
    }


    public String getChargeStandard() {
        return chargeStandard;
    }

    public void setChargeStandard(String chargeStandard) {
        this.chargeStandard = chargeStandard;
    }


    public String getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(String chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

}
