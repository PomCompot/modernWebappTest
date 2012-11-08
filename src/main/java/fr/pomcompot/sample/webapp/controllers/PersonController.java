package fr.pomcompot.sample.webapp.controllers;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.pomcompot.sample.webapp.entities.Person;

public interface PersonController {

	@RequestMapping("/person/list")
	@ResponseBody
	@Transactional(readOnly = true)
	public abstract List<Person> list();

}