public class Grade {
    private Course course;
    private double value;

    public Course getCourse(){

        return course;
    }
    public void setCourse(Course course){
        this.course = course;
    }

    public double getValue(){

        return value;
    }
    public void setValue(double value){
        this.value = value;
    }
}
