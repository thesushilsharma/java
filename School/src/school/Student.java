package school;

import java.util.Scanner;

public class Student {

    static Scanner console = new Scanner(System.in);
    //Student attributes to store information
    protected String Studentname;
    protected int ID;
    Subject[] subjectList;

    //The class Student should have appropriate constructors as well as appropriate setters and getters as all data attributes should be protected.
    public Student(String Studentname, int ID) {
        this.Studentname = Studentname;
        this.ID = ID;
        subjectList = new Subject[2];
        EnrollSubjects();
    }

    //the class student has the constructors as well as suitable protected setters and getter
    public String getStudentname() {
        return Studentname;
    }

    public int getID() {
        return ID;
    }

    public void setStudentname(String Studentname) {
        this.Studentname = Studentname;
    }

    public void setId(int ID) {
        this.ID = ID;
    }

    public void EnrollSubjects() {
        String Subjectname;
        int Subjectcode;
        for (int i = 0; i < subjectList.length; i++) {
            //The information based on the subject such subject name, subject code.
            System.out.println("Enter required details for the subject " + (i + 1));
            System.out.println("Enter Subject Name: ");
            Subjectname = console.next();
            System.out.println("Enter Subject Code: ");
            Subjectcode = console.nextInt();
            subjectList[i] = new Subject(Subjectname, Subjectcode);
        }
    }

    public void updateAttendance() {
        System.out.println("Enter the Subject Name: ");//updating student database(Attendance) using their course
        String Subname = console.next();
        System.out.print("\nInput ID of student you are looking for : ");// the updating student database (Attendance) using their student id
        int id = console.nextInt();
       
        for (Subject sub : subjectList) {
            if (sub.getCourse().equals(Subname)&&getID() == id) {
                //recording the attendance of the students enrolled
                int menuOption;
                int week;
                do {
                    System.out.println("Select Option:\n" + " 1) Week 1\n" + " 2) Week 2\n" + " 3) Week 3\n" + " 4) Week 4\n" + " 5) Week 5\n" + " 6) Week 6\n" + " 7) Week 7\n" + " 8) Week 8\n" + " 9) Week 9\n" + " 10) Week 10\n" + " 11) Week 11\n" + " 12) Week 12\n" + " 13) Return to Main Menu\n");
                    menuOption = console.nextInt();
                    int presence = 0;
                    switch (menuOption) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            week = menuOption;
                            do { //validation loop
                                System.out.println("Enter attendance for Week " + week + "\n Select Option:\n" + " 1) Yes\n" + " 2) No"); //prompts for subject attendance                                
                                presence = console.nextInt(); //stores it 
                                console.nextLine(); //clears input stream
                            } while (presence != 1 && presence != 2); //loops if the entered value is out of bounds
                            sub.modifyAttendance(presence);
                            break;
                        case 13:
                            break;
                        default:
                            System.out.println("Select valid option");
                    }
                } while (menuOption != 13);
            }
        }
    }

    public void displayProfile() {
        //displaying Student details
        System.out.println("Stuent ID: " + this.ID);
        System.out.println("Student name: " + this.Studentname);
        for (Subject subjectList1 : subjectList) {
            subjectList1.displayProfile();
        }
    }
}












