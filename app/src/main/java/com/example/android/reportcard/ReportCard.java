package com.example.android.reportcard;

    public class ReportCard  {
      String name;
      String mathGrade;
      char englishGrade;
      int historyGrade;
      double biologyGrade;


    public ReportCard() {
        name = "Tiffany Brewer";
        mathGrade = "A-";
        englishGrade = 'A';
        historyGrade = 85;
        biologyGrade = 90.5;
    }

    String Grades[] = new String[20];
    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = "Jess";
    }

    public char getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade() {
        englishGrade = 'C';
    }

    public String getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade() {
        mathGrade = "A+";
    }

    public int getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade() {
        historyGrade = 75;
    }

    public double getBiologyGrade(){
        return biologyGrade;
    }

    public void setBiologyGrade(){
        biologyGrade = 86.8;
    }
    @Override
    public String toString() {

        return ("Name:" + getName() + "" + "" +
                "; English grade:" + getEnglishGrade() +
                " History grade: " + getHistoryGrade() +
                "; Math grade:" + getMathGrade() +
                "Biology grade:" + getBiologyGrade());
    }

    public static void main (String args[]) {
        ReportCard r = new ReportCard();

        String abc = r.toString();
        System.out.println(abc);

    }

}