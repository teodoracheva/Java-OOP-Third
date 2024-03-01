import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Student student = new Student(); //инстанция с подходящи стойности от клавиатурата атрибути
        System.out.print("Student:Name=");
        student.setName(s.nextLine());
        System.out.print(", FN=");
        student.setfNumber(s.nextLine());

        for(int i = 0; i < 5; i++){
            //Добавете 5 оценки към този студент с подходящи стойности за името на курса и оценката от клавиатурата
            Grade grade = new Grade();// Създаваме нов обект Grade за всяка оценка

            System.out.print("Grade " + (i + 1) + " Course: ");
            Course course = new Course();//// Създаваме нов курс за всяка оценка
            course.setName(s.nextLine());
            grade.setCourse(course);


            System.out.print("Grade " + (i + 1) + " Value:");
            grade.setValue(Double.parseDouble(s.nextLine()));

            student.addGrade(grade, i); // Добавяне на оценката към студента !!
        }
        System.out.println("");

        System.out.println("Student: Name=" + student.getName() + ",FN=" + student.getfNumber());
        for(int i = 0; i < student.getGradesCount(); i++){
            Grade grades = student.getGrade(i); //При извеждането на оценките, използвахме метода getGrade(i) на обекта Student, за да получим вече създадените оценки
            System.out.println("Grade: " + (i + 1) + "Course=" + grades.getCourse().getName() + ",Value=" + grades.getValue());
        }

    }
}