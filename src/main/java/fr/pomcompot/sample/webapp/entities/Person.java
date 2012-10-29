package fr.pomcompot.sample.webapp.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	private String id;
	
    private String firstname, lastname;
    
    private Date birthDate;
    
    private Gender gender;
}
