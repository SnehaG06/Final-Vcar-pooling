package com.wpl.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trips")
public class Trips {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String cab_id;
    @Column
    private int cid;
    @Column
    private String userId;
    @Column
    private String is_approved;

	
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }
    
    public String getcab_id() {
        return cab_id;
    }

    public void setcab_id(String cab_id) {
        this.cab_id = cab_id;
    }
    
    public int getcid() {
        return cid;
    }

    public void setcid(int cid) {
        this.cid = cid;
    }
    
    public String getuserId() {
        return userId;
    }

    public void setuserId(String userId) {
        this.userId = userId;
    }
    
    public String getis_approved() {
        return is_approved;
    }

    public void setis_approved(String is_approved) {
        this.is_approved = is_approved;
    }
}