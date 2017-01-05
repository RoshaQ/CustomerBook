package pl.spring.demo.web.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatcher;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;
import org.springframework.web.method.annotation.ExceptionHandlerMethodResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import pl.spring.demo.constants.ModelConstans;

import pl.spring.demo.controller.HomeController;

public class HomeControllerTest {

	private MockMvc mockMvc;

	@Before
	public void setup() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/templates/");
		viewResolver.setSuffix(".html");

		mockMvc = MockMvcBuilders.standaloneSetup(new HomeController()).setViewResolvers(viewResolver).build();
	}

	@Test
	public void testHomePage() {
		// given when
		ResultActions resultActions;
		try {
			resultActions = mockMvc.perform(get("/"));
			// then
			resultActions.andExpect(view().name("welcome"))
					.andExpect(model().attribute(ModelConstans.GREETING, new ArgumentMatcher<Object>() {

						@Override
						public boolean matches(Object argument) {
							String text = (String) argument;
							return null != text && text.length() > 0;
						}
					}));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
