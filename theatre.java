import java.util.Scanner;
public class theatre 
{
    static Scanner sushil = new Scanner(System.in);
    public static void main(String[] args) 
    {    
        String seats[][] = new String[15][30];
        int operator;
        char choice;
        do{
        System.out.print("Enter an operator \nPress 1 for List of Movie Name \nPress 2 for Instant booking \nPress 3 for Booking seat manually \nPress 4 for Quit "); 
        operator = sushil.nextInt();
        switch (operator) {
            case 1:
                display();
            break;
            case 2:
                instant(seats);
            break;
            case 3:
             manually(seats);
            break;
            case 4:
                System.out.println("Thank you for using this program");
            break;  
            default:
                System.out.println("Invalid option");
        } 
            System.out.println("Countiue? Y/N");
            choice = sushil.next().charAt(0);
    } while (choice == 'y' || choice == 'Y'); 
    }
    public static void display() 
    {
        System.out.println("Movies\t\tTime\t\tVacany");
        System.out.println("2.O\t\t1200\t\tYes");
        System.out.println("ZERO\t\t1500\t\tNo");
        System.out.println("Aquaman\t\t600\t\tYes");
        System.out.println("Spiderman\t900\t\tYes");
    }
    public static void manually(String seats[][] ) {
        int numbTickets;  
        int bookingRow = 0;    //the row the seat bought is located
        int bookingColumn = 0;     //the column the seat bought is located
        int totalPrice = 0; 
        print(seats);
        seatMap(seats);
        System.out.println("\nHow many tickets do you wish to buy? ");
        numbTickets=sushil.nextInt();
        for (int x = 0; x < numbTickets; x++) {    //repeats for the amount of tickets being bought
        //adds the price of the ticket to the total depending on the type of ticket bought
                    totalPrice += 10;
            while (true) {
            //user selects the position of their seat
            System.out.println("\n\nI wish to buy a ticket on:");
            System.out.println("\n     Row ");
            bookingRow=sushil.nextInt();
            bookingRow -=1;
            System.out.println("     Column ");
            bookingColumn=sushil.nextInt();
            bookingColumn -=1; //(1 is subtracted because what they consider row 1 is actually row 0 for the computer)
            //if the seat is available:
            if (availableSeat(bookingRow, bookingColumn, seats) == true) {
                seats[bookingRow][bookingColumn] = "X";   //seat is set to busy
               break;      
            }
            else { //if seat not available, user has to try again
                System.out.println("Sorry, these seat is not available. Please try again.");
            }
        }
    }    
        System.out.println("UPDATED!!!!");
        seatMap(seats); //displays the new seat map with all the seats taken
        System.out.println("\nYour total for these tickets is: $"+totalPrice);       
}
  public static boolean availableSeat(int row, int column, String Map[][]) { 
    if ((row <= 15) && (column <= 30) && (Map[row][column] == "O")) {
        return true;
    }
    else {
        return false;
    }
}
public static void print(String seats[][]) {
        for (int row = 0; row < seats.length; row++) {
            for (int column = 0; column < seats[row].length; column++) {
                seats[row][column] = "O";
            }
        }
}
public static void seatMap(String seats[][]) {    
    //DISPLAYS THE MAP WITH SEATS
    System.out.println("\n\t\t\t\t\tMap of JACKY Theatre Hall");
    int count = 1;  //the number that will be displayed for column/row
    System.out.println();
    System.out.print("Column");
    //displays column numbers
    for (int column = 0; column < 30; column++) { //repeats for each row number
        
        if (count> 9) {
            System.out.print(" "+count);  
        }
        else {
            System.out.print("  "+ count);
        }
            count++;
    }
    count=1;
    //displays rows
    for (int row = 0; row < 15; row++) {    
        System.out.print("\nRow  "+count +"\t");
         count++;
        for (int column = 0; column < 30; column++) {
             System.out.print(seats[row][column]+"  ");//repeats a total of (15*30) times, for each column in each row, displaying all seats saved (O or X)
        }
    }   
        System.out.println("\n");
}
public static void instant(String seats[][]) {
        int  numbTickets;
        int totalPrice=0;
        System.out.println("\nHow many tickets do you wish to buy? ");
        numbTickets = sushil.nextInt();
        print(seats);
        seatMap(seats);
        for (int x = 0; x < numbTickets; x++)
        {    
            totalPrice += 10;  
        }
            int h=0;
            for (int row = 0; row < 15&& h!=numbTickets; row++) {
                for (int column = 10; column < 20&&h!=numbTickets; column++) {
                    seats[row][column]="X";
                    h++;
                }
            }
            System.out.println("UPDATED!!!!");
            seatMap(seats);
        System.out.println("\nYour total for these tickets is: $" + totalPrice);
}
}
