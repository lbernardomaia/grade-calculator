package com.grade


import spock.lang.Specification

class GradeCalculatorSpecification extends Specification {

    def gradeCalculator = new GradeCalculator()

    def "given the quantityOfRightQuestions and quantityOfQuestions,then gradeLetterExpected matches"() {
        when:
            def result = gradeCalculator.compute(quantityOfQuestions, quantityOfRightQuestions)
        then:
            assert result == gradeLetterExpected
        where:
                quantityOfRightQuestions | quantityOfQuestions | gradeLetterExpected
                0                        |  0                  | ""
                2                        |  1                  | ""
                10                       |  10                 | "A"
                10                       |  11                 | "A"
                9                        |  10                 | "A"
                8                        |  10                 | "A"
                7                        |  10                 | "B"
                6                        |  10                 | "C"
                5                        |  10                 | "D"
                4                        |  10                 | "F"
                3                        |  10                 | "F"
                2                        |  10                 | "F"
                1                        |  10                 | "F"
    }
}
