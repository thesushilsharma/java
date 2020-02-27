package school;

import java.util.Scanner;

public class School {

    final int MAXIMUM_NUMBER_OF_STUDENTS = 4000;
    Student[] pupil = new Student[MAXIMUM_NUMBER_OF_STUDENTS];

    int numberOfStudents = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //initializing and declaration of variables for School
        School S = new School();
        int userSelection;
        String username;
        String password;

        System.out.println("Admin log in:");
        System.out.println("username: ");
        username = sc.next();

        System.out.println("password: ");
        password = sc.next();

        if (username.equals("admin") && password.equals("wollongong")) {
            System.out.println("\n Congratulation!!! Access granted \n");
            System.out.println("\n Welcome Admin. :-) \n\n");
            System.out.println("--------You are logged in to Student Mangement System-------\n");
            //Each student can be enrolled, attendance can be recorded and the user can also display the students that has attended the class.
            do {
                System.out.println("To Add a Student, press 1");
                System.out.println("To Change Student Attendance, press 2");
                System.out.println("To Display all Student Attendance, press 3");
                System.out.println("To Delete a student, press 4");
                System.out.println("Input -1 to quit the program");
                System.out.println("");
                userSelection = sc.nextInt();

                switch (userSelection) {
                    case 1:
                        S.enrolledStudentDetails();
                        break;
                    case 2:
                       S.update();
                        break;
                    case 3:
                         S.displayAllStudents();
                        break;
                    case 4:
                        S.deleteStudent();
                        break;
                }
            } while (userSelection != -1);
            System.out.println("Thank you for using this system");
        } else {
            System.out.println("\n Error: Your Password Doesn't Meet. Access Denied !!! :-( \n\n");
            System.out.println("\n Enter Correct Password.\n\n");
        }
    }

    public void enrolledStudentDetails() {
        //Create new students and stores their details
        System.out.print("Please input Student ID : ");
        int ID = sc.nextInt();
        System.out.print("Please input name : ");
        String name = sc.next();
        //calls the method
        addStudent(name, ID);
        System.out.println("");
    }

    public void addStudent(String name, int id) {
        //stores the information in an array and class the both constructor subject and student 
        Student s = new Student(name, id);
        pupil[numberOfStudents] = s;
        numberOfStudents++;
    }

    public void displayAllStudents() {
        //displaying Student all details through class (student & subject)
        for (int i = 0; i < numberOfStudents; i++) {
            Student SchoolPupil = pupil[i];
            System.out.println("\nStudent : " + (i + 1));
            SchoolPupil.displayProfile();
        }
    }

    public void update() {
        
         for(int i=0;i<numberOfStudents;i++){
            Student S = pupil[i];
                 
            S.updateAttendance();            
     
}
    }

    public int findStudents(int id) {
        //method to match id
        for (int i = 0; i < numberOfStudents; i++) {
            Student SchoolPupil = pupil[i];
            if (SchoolPupil.getID() == id) {
                return i;
            }
        }
        return -1;
    }

    public void deleteStudent() {
        //method to change attendance
        System.out.println("\nInput the ID of the Student you want to remove");
        int id = sc.nextInt();
        int indexOfStudentsToRemove = findStudents(id);
        for (int i = indexOfStudentsToRemove; i < numberOfStudents - 1; i++) {
            pupil[i] = pupil[i + 1];
        }
        pupil[numberOfStudents] = null;

        numberOfStudents--;
    }

}























