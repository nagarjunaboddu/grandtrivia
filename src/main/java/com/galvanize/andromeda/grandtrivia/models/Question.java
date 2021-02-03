package com.galvanize.andromeda.grandtrivia.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonIgnore
    private long id;

    private String question;

    @Column(name = "question_number")
    @JsonProperty("question_num")
    private Long questionNumber;

    @Column(name = "quiz_id")
    @JsonIgnore
    private Long quizId;

    @Column(name = "created_at")
    @JsonProperty("timestamp")
    private String createdAt;


}
