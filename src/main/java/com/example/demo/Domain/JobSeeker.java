package com.example.demo.Domain;

import javax.persistence.*;

@Entity
@Table(name = "job_seeker")
public class JobSeeker {

    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "english_name")
    private String englishName;
    @Column(name = "sex")
    private long sex;
    @Column(name = "hometown")
    private String hometown;
    @Column(name = "school")
    private String school;
    @Column(name = "major")
    private String major;
    @Column(name = "educational_background")
    private String educationalBackground;
    @Column(name = "qq_num")
    private long qqNum;
    @Column(name = "tel_num")
    private long telNum;
    @Column(name = "birthday")
    private java.sql.Timestamp birthday;
    @Column(name = "email")
    private String email;
    @Column(name = "skill")
    private String skill;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String english_Name) {
        this.englishName = english_Name;
    }


    public long getSex() {
        return sex;
    }

    public void setSex(long sex) {
        this.sex = sex;
    }


    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }


    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    public String getEducationalBackground() {
        return educationalBackground;
    }

    public void setEducationalBackground(String educational_Background) {
        this.educationalBackground = educational_Background;
    }


    public long getQqNum() {
        return qqNum;
    }

    public void setQqNum(long qq_Num) {
        this.qqNum = qq_Num;
    }


    public long getTelNum() {
        return telNum;
    }

    public void setTelNum(long tel_Num) {
        this.telNum = tel_Num;
    }


    public java.sql.Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(java.sql.Timestamp birthday) {
        this.birthday = birthday;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

}
