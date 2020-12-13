package com.grade;

enum GradeLetterEnum {
    A("A"){
        boolean isScoreMatch(Integer score){
            return (score >= 80);
        }
    },
    B("B"){
        boolean isScoreMatch(Integer score){
            return (score >= 70 && score <= 79);
        }
    },
    C("C"){
        boolean isScoreMatch(Integer score){
            return (score >= 60 && score <= 69);
        }
    },
    D("D"){
        boolean isScoreMatch(Integer score){
            return (score >= 50 && score <= 59);
        }
    },
    F("F"){
        boolean isScoreMatch(Integer score) {
            return score <= 49;
        }
    };

    private final String gradeLetter;

    GradeLetterEnum(String gradeLetter) {
        this.gradeLetter = gradeLetter;
    }

    abstract boolean isScoreMatch(Integer score);

    public String getGradeLetter() {
        return gradeLetter;
    }
}
