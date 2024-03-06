package com.example.day12_jstl.Project;

import java.util.Date;

/**
 * @author GG_B
 * @version 1.0
 */
public class Score {
    private String name;
    private String score;
    private Date examDate = new Date();

    public Score(String name, String score) {
        this.name = name;
        this.score = score;
    }

    public Score() {
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
