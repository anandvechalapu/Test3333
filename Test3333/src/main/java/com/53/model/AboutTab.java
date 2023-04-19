package com.53.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AboutTab {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String introduction;
    private String anmwWebsite;
    private String emailUs;
    private Boolean login;

    public AboutTab() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getAnmwWebsite() {
        return anmwWebsite;
    }

    public void setAnmwWebsite(String anmwWebsite) {
        this.anmwWebsite = anmwWebsite;
    }

    public String getEmailUs() {
        return emailUs;
    }

    public void setEmailUs(String emailUs) {
        this.emailUs = emailUs;
    }

    public Boolean getLogin() {
        return login;
    }

    public void setLogin(Boolean login) {
        this.login = login;
    }

}