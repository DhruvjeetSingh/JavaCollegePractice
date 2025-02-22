import java.util.Scanner;
public class StudentDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int roll;
        float per;
        char grade;
        System.out.println("Enter the Student's name : ");
        name = sc.nextLine();
        System.out.println("Enter the Student's Roll no : ");
        roll = sc.nextInt();
        System.out.println("Enter the Student's Percentage : ");
        per = sc.nextFloat();
        System.out.println("Enter the Student's Grade : ");
        grade = sc.next().charAt(0);
        System.out.println("..........Student's Details..........");
        System.out.println("Name        : "+name);
        System.out.println("Rollno      : "+roll);
        System.out.println("Percentage  : "+per);
        System.out.println("Grade       : "+grade);
        sc.close();
    }
}