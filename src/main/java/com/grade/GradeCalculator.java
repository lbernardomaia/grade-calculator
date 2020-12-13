package com.grade;

import java.util.Arrays;

public class GradeCalculator {

    public String compute(int quantityOfQuestions, int quantityOfrightQuestions){

        if (quantityOfQuestions <= 0 ||
                quantityOfQuestions < quantityOfrightQuestions){
            return "";
        }

        int score = (quantityOfrightQuestions * 100) / quantityOfQuestions;

        return Arrays.stream(GradeLetterEnum.values())
                .filter(grade -> grade.isScoreMatch(score))
                .findFirst()
                .map(GradeLetterEnum::getGradeLetter)
                .orElse("");
    }
}
