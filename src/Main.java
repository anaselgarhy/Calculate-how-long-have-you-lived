import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date currentDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(df.format(currentDate));
        final int numOfDaysInYear = 356;
        String firstName;
        int birthYear = currentYear + 1;
        int years;
        System.out.print("Enter Your First Name: ");
        firstName = input.next(); // read one token from user
        while(birthYear >= currentYear) {
            try{
                System.out.print("Enter Year of Birth: ");
                birthYear = input.nextInt();
            } catch(InputMismatchException ex){
                System.out.println("The entered value is not an integer!");
                System.exit(1);
            }
        }
        // calc num of years
        years = currentYear-birthYear;
        // Print result
        System.out.printf("Hello %s! You have been alive for :\n", firstName);
        System.out.println("Years\tMonth\t Days");
        System.out.printf("%5d\t%5d\t%d\n", years, years * 12, years * numOfDaysInYear);
    }
}
