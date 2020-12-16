# Grade Calculator

The project aim to inform a grade based on a score computed from two parameters. 

***Grades***

Grade | Score |
--- | --- |
A | score >= 80
B | score >= 80 and score <= 79
C | score >= 60 and score <= 69
D | score >= 50 and score <= 59
F | score <= 49

***Usage***

```
gradeCalculator.compute(quantityOfQuestions, quantityOfRightQuestions);
```

**Maven Dependency Import**

```
  <repositories>
    <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
    </repository>
  </repositories>
````

```
  <dependency>
    <groupId>com.github.lbernardomaia</groupId>
    <artifactId>grade-calculator</artifactId>
    <version>67ad26aec1</version>
  </dependency>
```
