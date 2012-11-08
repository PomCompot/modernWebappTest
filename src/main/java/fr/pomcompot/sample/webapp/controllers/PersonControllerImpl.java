package fr.pomcompot.sample.webapp.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.pomcompot.sample.webapp.entities.Person;

@Controller
@Lazy
public class PersonControllerImpl implements PersonController {

	@PersistenceContext
	private EntityManager entityManager;
	
	/* (non-Javadoc)
	 * @see fr.pomcompot.sample.webapp.controllers.PersonController#list()
	 */
	@Override
	@RequestMapping("/person/list")
	@ResponseBody
	@Transactional(readOnly=true)
	public List<Person> list() {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Person> query = criteriaBuilder.createQuery(Person.class);
		return entityManager.createQuery(query).getResultList();
	}
}
