package com.example.demo.application.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import javax.ws.rs.core.MediaType;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class HelloWorldControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void test() throws Exception {
//        given(service.getAllEmployees()).willReturn(allEmployees);

//        mvc.perform(get("/hello-world")
//                .param("name","rash")
//                .contentType(MediaType.TEXT_PLAIN))
//                .andExpect(status().isOk());
//                .andExpect(jsonPath("$[0].name", is(alex.getName())));
    }
}
