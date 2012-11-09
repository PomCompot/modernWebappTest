package fr.pomcompot.sample.webapp.controllers;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.pomcompot.sample.webapp.daos.PersonDao;
import fr.pomcompot.sample.webapp.entities.Person;

@Named
@Controller
public class PersonControllerImpl implements PersonController {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Inject
	private PersonDao personDao;

	@Override
	public String hello() {
		return "Say what you want.";
	}
	
	@Transactional(readOnly = true)
	@Override
	public @ResponseBody List<Person> list() {
		return personDao.findAll();
	}
}
