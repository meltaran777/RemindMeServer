package com.bohdankhrystov.remindme.server.entity;

import org.hibernate.annotations.GenericGenerator;
import org.joda.time.DateTime;

import javax.persistence.*;

/**
 * Created by Bodia on 07.02.2017.
 */
@Entity
@Table(name = "remind")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long idDB;

    @Column
    private String name;

    @Column(name = "id_vk")
    private int idVK;

    @Column(name = "birth_date")
    private DateTime birthDate;

    @Column(name = "date_format")
    private String dateFormat;

    @Column(name = "avatar_url")
    private String avatarURL;

    @Column
    private boolean notify;

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdVK() {
        return idVK;
    }

    public void setIdVK(int idVK) {
        this.idVK = idVK;
    }

    public DateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(DateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public boolean isNotify() {
        return notify;
    }

    public void setNotify(boolean notify) {
        this.notify = notify;
    }
}
