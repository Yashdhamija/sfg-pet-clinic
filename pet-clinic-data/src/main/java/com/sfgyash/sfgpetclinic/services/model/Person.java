package com.sfgyash.sfgpetclinic.services.model;

public class Person extends BaseEntity {
    private String firstname;
    private String lasttname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasttname() {
        return lasttname;
    }

    public void setLasttname(String lasttname) {
        this.lasttname = lasttname;
    }
}