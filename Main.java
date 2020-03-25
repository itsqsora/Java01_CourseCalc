import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number of student:");
        int student_number = sc.nextInt();
        System.out.println("Enter your hour:");
        int student_hour = sc.nextInt();
        int price = 0;
        String Bath = "Bath";
        
        if (student_number<1) {
            System.out.println("Sorry, Please Enter the number of student again.");
        } else if (student_number ==1 ) {
            price = student_hour*500;
            System.out.println("You have to pay:" +price+ Bath);
        } else if (student_number ==2) {
            price = student_hour*450;
            System.out.println("You have to pay:" +price+ Bath);
        } else if (student_number ==3) {
            price = student_hour*400;
            System.out.println("You have to pay:" + price + Bath);
        } else if (student_number ==4) {
            price = student_hour*350;
            System.out.println("You have to pay:" +price+ Bath);
        } else if (student_number >=5) {
            price = student_hour*300;
            System.out.println("You have to pay:" +price+ Bath);
        } else {
            System.out.println("Please Try again later.");
            return;
        }
        
    }
}
