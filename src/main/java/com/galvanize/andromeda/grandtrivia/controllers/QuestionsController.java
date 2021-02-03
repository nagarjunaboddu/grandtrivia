package com.galvanize.andromeda.grandtrivia.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionsController {

    @GetMapping("/api/v1/grandtrivia/questions")
    public void getQuestions() {}
}
