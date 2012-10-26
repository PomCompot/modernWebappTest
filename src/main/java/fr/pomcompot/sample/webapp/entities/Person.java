package fr.pomcompot.sample.webapp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	private String id;
	
    private String name;
}
