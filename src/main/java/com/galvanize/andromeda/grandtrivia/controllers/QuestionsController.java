package com.galvanize.andromeda.grandtrivia.controllers;

import com.galvanize.andromeda.grandtrivia.models.Question;
import com.galvanize.andromeda.grandtrivia.services.QuestionsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/grandtrivia/questions")
@Api(tags = {"questions"})
public class QuestionsController {

    @Autowired
    private QuestionsService questionsService;

    @GetMapping
    public List<Question> getQuestions() {
        return questionsService.findAll();
    }
}
