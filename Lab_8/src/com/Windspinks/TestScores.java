//Charles Dodge
//CIST 2371 CRN 63075
//Lab 8 TestScores
package com.Windspinks;

public class TestScores {
    private double score1;
    private double score2;
    private double score3;

    public TestScores() {
    }

    public TestScores(double score1, double score2, double score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }

    public double getAverage(){
        return (score1 + score2 + score3) / 3;
    }
}
