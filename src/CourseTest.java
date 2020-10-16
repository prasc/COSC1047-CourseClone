public class CourseTest  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course courseOne = new Course("Data Structures");

        courseOne.addStudent("PC");
        courseOne.addStudent("JD");
        courseOne.addStudent("AL");
        Course courseTwo = (Course)courseOne.clone();

        courseOne.addStudent("Lebron");
        courseTwo.dropStudent("AL");


        System.out.println("number of students in course one is " + courseOne.getNumberOfStudents());

        String[] students = courseOne.getStudents();

        for (int i = 0; i < courseOne.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < courseTwo.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }

        System.out.println();




    }
}