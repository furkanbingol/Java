public class TestMain {
    public static void main(String[] args) {
        Department department1 = new Department();
        department1.name = "Software Engineering";

        Professor professor1 = new Professor();
        professor1.name = "Furkan Bingol";

        Course course1 = new Course();
        course1.name = "Introduction to Software Engineering";

        Student student1 = new Student();
        student1.name = "Kevin";

        department1.head = professor1;
        professor1.department = department1;

        course1.department = department1;
        department1.courses = new Course[100];
        department1.courses[0] = course1;

        course1.teacher = professor1;
        professor1.coursesGiven = new Course[5];
        professor1.coursesGiven[0] = course1;

        professor1.advisee = new Student[10];
        professor1.advisee[0] = student1;
        student1.advisor = professor1;

        student1.coursesTaken = new Course[7];
        student1.coursesTaken[0] = course1;
        course1.students = new Student[100];
        course1.students[0] = student1;

        System.out.println("student1's first course is: " + student1.coursesTaken[0].name);   //(OBJECT) student1.coursesTaken[0] = chapter1.university.Course@7ef20235
        System.out.println("student1's first course's professor is: " + student1.coursesTaken[0].teacher.name);
        System.out.println("student1's first course's professor's department is: " + student1.coursesTaken[0].teacher.department.name);
    }
}
