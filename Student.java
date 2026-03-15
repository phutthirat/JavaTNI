public class Student {
    private String name;
    private int student_year;
    private int score = 0;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setStudent_year(int student_year) {
        this.student_year = student_year;
    }

    public int getStudent_year() {
        return student_year;
    }

    public int getScore() {
        return score;
    }

    public void addPoint(int point){
        this.score += point;
        System.out.println(this.name + "got" + point + "points");
    }
    public String getGrade(){
        if(this.score >= 80) return "A";
        if(this.score >= 70) return "B";
        if(this.score >= 60) return "C";
        return "F";
    }
}
