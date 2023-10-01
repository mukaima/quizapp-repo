package com.mokh.quizapp.models;

import lombok.Data;

@Data
public class QuestionWrapper {
    private int id;
    private String category;
    private String difficultyLevel;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String questionTitle;

    public QuestionWrapper(int id, String category, String difficultyLevel, String option1, String option2, String option3, String option4, String questionTitle) {
        this.id = id;
        this.category = category;
        this.difficultyLevel = difficultyLevel;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.questionTitle = questionTitle;
    }
}
