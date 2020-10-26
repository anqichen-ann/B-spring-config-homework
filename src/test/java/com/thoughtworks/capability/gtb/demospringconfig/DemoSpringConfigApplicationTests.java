package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class DemoSpringConfigApplicationTests {
	@Autowired
	private LevelController levelController;

	@Test
	void contextLoads() {
		String levelStr = levelController.getLevel();
		assert(levelStr).equals("advanced");

	}

}
