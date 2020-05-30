public class Tester {
    //used to test grades
    public static void main(String[]animeTrash)
    {
        String[] grades = {"a","a","c","a","f","b","b","b","f","d","b","a","b","b","d",}; //example grades
        double[] grades2 = {80.0, 90.0,78.3}; // example decimal grades
        Grades grader = new Grades(grades);
        System.out.println(grader);
    }
}
