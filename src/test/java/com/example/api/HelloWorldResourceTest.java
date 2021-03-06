package com.example.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldResourceTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void shouldDisplayHelloWorld() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders.get("/api/v1"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andExpect(
						MockMvcResultMatchers.content().string("Hello World"));

	}
}
