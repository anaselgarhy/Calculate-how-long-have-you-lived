import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date currentDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(df.format(currentDate));
        final int numOfDaysInYear = 356;
        String firstName;
        int birthYear;
        System.out.print("Enter Your First Name: ");
        firstName = input.next(); // read one token from user
        do
            System.out.print("Enter Year of Birth: ");
        while ((birthYear = input.nextInt()) >= currentYear);
        // calc num of years
        int years = currentYear-birthYear;
        // Print result
        System.out.printf("Hello %s! You have been alive for :\n", firstName);
        System.out.println("Years\tMonth\t Days");
        System.out.printf("%5d\t%5d\t%d\n", years, years * 12, years * numOfDaysInYear);
    }
}
