package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Zamowienie {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long nrZamowienia;

    public Long getId() {
        return id;
    }

    public Long getNrZamowienia() {
        return nrZamowienia;
    }
}
