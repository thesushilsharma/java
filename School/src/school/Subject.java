package school;

import java.util.ArrayList;


public class Subject {
    //initializing all the variables that will collect information of the subject
    protected String Subjectname;
    protected int Subjectcode;
    ArrayList <Integer> attendanceList = new ArrayList<>(12);

    //The class subject should have appropriate constructors as well as appropriate setters and getters as all data attributes should be protected.
    public Subject(String Subjectname, int Subjectcode) {
        this.Subjectname = Subjectname;
        this.Subjectcode = Subjectcode;

    }

    //the class subject has the constructors as well as suitable protected setters and getter
    public String getCourse() {
        return Subjectname;
    }

    public int getCode() {
        return Subjectcode;
    }

    public void setCourse(String Subjectname) {
        this.Subjectname = Subjectname;
    }

    public void setCode(int Subjectcode) {
        this.Subjectcode = Subjectcode;
    }
    
   public void modifyAttendance(int presence) {// setter for attendance
      attendanceList.add(presence); // assigns attendance
    }

    public void displayProfile() {
        //displaying Student details
        System.out.println(" Subject: " + this.Subjectname + ", Subject code: " + this.Subjectcode);
		int attendedCounter=0;
		double percentage;
		double noOfWeeks=12;
		for(int i=0;i<attendanceList.size();i++) {
			System.out.print(" Week "+(i+1));
			if(attendanceList.get(i)==1) {
				System.out.print(" present");
				attendedCounter++;
			}
			else
				System.out.print(" absent");
			System.out.println();
		}
		percentage=(double)(attendedCounter/noOfWeeks)*100;
		System.out.println("Percentage: "+(double)percentage+"%");
	}
    }























