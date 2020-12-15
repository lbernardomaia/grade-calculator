package com.grade;

import java.util.Arrays;

public class GradeCalculator {

    public String compute(int quantityOfQuestions, int quantityOfRightQuestions){

        if (quantityOfQuestions <= 0 ||
                quantityOfQuestions < quantityOfRightQuestions){
            return "";
        }

        int score = (quantityOfRightQuestions * 100) / quantityOfQuestions;

        return Arrays.stream(GradeLetterEnum.values())
                .filter(grade -> grade.isScoreMatch(score))
                .findFirst()
                .map(GradeLetterEnum::getGradeLetter)
                .orElse("");
    }
}
