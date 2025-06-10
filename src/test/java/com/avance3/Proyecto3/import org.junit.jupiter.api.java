package com.avance3.Proyecto3;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

// Java

// Test para cargar el contexto de Spring Boot
@SpringBootTest
class Proyecto3ApplicationTests {

	@Test
	void contextLoads() {
	}
}

// Test para un controlador específico (ejemplo: RedSocialController)
@WebMvcTest
class RedSocialControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testHomePage() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/"))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
}