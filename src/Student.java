public class Student {
    private String name;
    private String fNumber;
    private Grade[] grades;

    public String getName(){

        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getfNumber(){

        return fNumber;
    }
    public void setfNumber(String fNumber){
        this.fNumber = fNumber;
    }

    public Student(){
        this.grades = new Grade[5]; //конструктор на класа(по подразбиране)Студент с масив 5 елемента
    }

    public void addGrade(Grade grades, int index){
        this.grades[index] = grades; //!
    }

    public Grade getGrade(int index){ //Grade[] RETURN!!!
        return this.grades[index];
    }

    public int getGradesCount(){ //връща масива
        return this.grades.length;
    }
}
