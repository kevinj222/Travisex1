package com.travis.travisexample;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TravisexampleApplication.class)
@RunWith(SpringRunner.class)
class TravisexampleApplicationTests
{
	@Autowired
	private MockMvc mockMvc;
	@Test
	public void testapp() throws Exception
	{
		mockMvc.perform(get("/value")).andExpect(status().isOk());
	}

}
