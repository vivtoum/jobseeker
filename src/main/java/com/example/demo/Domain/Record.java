package com.example.demo.Domain;

import javax.persistence.*;

@Entity
@Table(name = "record.sql")
public class Record {

 @Id
 @Column(name = "record_id")
  private String recordId;
 @Column(name = "record_number")
  private String recordNumber;
 @Column(name = "room_id")
  private String roomId;
 @Column(name = "record_time")
  private java.sql.Timestamp recordTime;
 @Column(name = "record_item")
  private String recordItem;
 @Column(name = "record_gas")
  private String recordGas;
 @Column(name = "record_power")
  private String recordPower;
 @Column(name = "record_water")
  private String recordWater;


  public String getRecordId() {
    return recordId;
  }

  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }


  public String getRecordNumber() {
    return recordNumber;
  }

  public void setRecordNumber(String recordNumber) {
    this.recordNumber = recordNumber;
  }


  public String getRoomId() {
    return roomId;
  }

  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }


  public java.sql.Timestamp getRecordTime() {
    return recordTime;
  }

  public void setRecordTime(java.sql.Timestamp recordTime) {
    this.recordTime = recordTime;
  }


  public String getRecordItem() {
    return recordItem;
  }

  public void setRecordItem(String recordItem) {
    this.recordItem = recordItem;
  }


  public String getRecordGas() {
    return recordGas;
  }

  public void setRecordGas(String recordGas) {
    this.recordGas = recordGas;
  }


  public String getRecordPower() {
    return recordPower;
  }

  public void setRecordPower(String recordPower) {
    this.recordPower = recordPower;
  }


  public String getRecordWater() {
    return recordWater;
  }

  public void setRecordWater(String recordWater) {
    this.recordWater = recordWater;
  }

}
