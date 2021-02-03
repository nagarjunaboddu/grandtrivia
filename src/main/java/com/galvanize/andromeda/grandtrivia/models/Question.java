package com.galvanize.andromeda.grandtrivia.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String question;

    @Column(name = "question_number")
    private Long questionNumber;

    @Column(name = "quiz_id")
    private Long quizId;

    @Column(name = "created_at")
    private String createdAt;


}
