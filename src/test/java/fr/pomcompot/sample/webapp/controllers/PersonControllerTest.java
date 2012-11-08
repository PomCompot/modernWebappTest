package fr.pomcompot.sample.webapp.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContext.xml"})
public class PersonControllerTest {
	@Test
	public void testList() {
		PersonController controller = new PersonControllerImpl();
		controller.list();
	}
}
