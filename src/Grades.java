import java.util.ArrayList;
import java.util.Arrays;

public class Grades {
    //instance methods
    private ArrayList<Double> grades;
    double pointScale;
    double[] letterDef = {0,1.0,2.0,3.0,4.0}; //defines 0 as f/z 1 as d ... 4 as a
    //constructor taht takes in percent grades and scale
    public Grades(double[] currentGrades, double pointScale)
    {
        this.pointScale=pointScale;
        grades = new ArrayList<>();
        for (double score:currentGrades) {
            grades.add(score);
        }
    }
    //constructor that takes in percent grades
    public Grades(double[] currentGrades)
    {
        this.pointScale=4;
        grades = new ArrayList<>();
        for (double score:currentGrades) {
            grades.add(score);
        }
    }
    public Grades(ArrayList<Double> currentGrades, double pointScale)
    {
        this.pointScale=pointScale;
        grades=currentGrades;
    }
    //constuctor that takes in the current letter grades and scale
    public Grades(String[] currentGrades, double pointScale)
    {
        grades = new ArrayList<>();
        this.pointScale = pointScale;
        for (String grade: currentGrades) {
            grades.add(stringToGrade(grade));
        }
    }
    //constuctr that takes in letter grades
    public Grades(String[] currentGrades)
    {
        grades = new ArrayList<>();
        this.pointScale = 4;
        for (String grade: currentGrades) {
            grades.add(stringToGrade(grade));
        }
    }
    //convert letter grades to doubles ex. A = 4.0
    public double stringToGrade(String grade)
    {
        grade =grade.toLowerCase();
        switch (grade) {
            case "a":
                return letterDef[4];
            case "b":
                return letterDef[3];
            case "c":
                return letterDef[2];
            case "d":
                return letterDef[1];
            case "f":
            case "z":
            default:
                return letterDef[0];
        }
    }

    //returns the stored grades
    public ArrayList<Double> getGrades() {
        return grades;
    }

    //returns the gpa of the grades
    public double getGpa()
    {
        double total =0;
        for (double grade : grades)
        {
            total+=grade;
        }
        return total/grades.size();
    }

    //discribes the average gpa of all the grades and all the individual grades
    @Override
    public String toString() {
        return "Average gpa: "+getGpa()+"  Grades:"+grades.toString();
    }
}
