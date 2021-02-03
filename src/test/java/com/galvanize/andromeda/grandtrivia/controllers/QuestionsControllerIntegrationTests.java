package com.galvanize.andromeda.grandtrivia.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class QuestionsControllerIntegrationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getQuestionsTest() throws Exception {
        mockMvc.perform(get("/api/v1/grandtrivia/questions"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").exists())
                .andExpect(jsonPath("$.length()").value(1))
                .andExpect(jsonPath("$.[0].question").value("What did Yankee Doodle stick in his cap?"))
                .andExpect(jsonPath("$.[0].question_num").value(1))
                .andExpect(jsonPath("$.[0].timestamp").value("2018-02-02 20:04:25"));

    }
}
