package com.galvanize.andromeda.grandtrivia.services;

import com.galvanize.andromeda.grandtrivia.models.Question;
import com.galvanize.andromeda.grandtrivia.respositories.QuestionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsService {

    public QuestionsService(QuestionsRepository questionsRepository) {
        this.questionsRepository = questionsRepository;
    }

    private QuestionsRepository questionsRepository;

    public List<Question> findAll() {
        return questionsRepository.findAll();
    }
}
