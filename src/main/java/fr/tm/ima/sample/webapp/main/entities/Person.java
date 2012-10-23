package fr.tm.ima.sample.webapp.main.entities;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Person {
    private String name;
}
