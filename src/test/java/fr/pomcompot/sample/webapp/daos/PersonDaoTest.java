package fr.pomcompot.sample.webapp.daos;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class PersonDaoTest {
	@Inject
	private PersonDao personDao;
	
	@SuppressWarnings("unchecked")
	@Test
	public void testList() {
		assertThat("Not the expected result.", personDao.findAll(), allOf(notNullValue(), hasSize(1)));
		
	}
}
