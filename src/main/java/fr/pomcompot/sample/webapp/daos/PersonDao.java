package fr.pomcompot.sample.webapp.daos;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import fr.pomcompot.sample.webapp.entities.Person;

@Named
@Repository
public class PersonDao extends AbstractDao<Person> {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@PostConstruct
	public void init() {
		setClazz(Person.class);
	}
}
