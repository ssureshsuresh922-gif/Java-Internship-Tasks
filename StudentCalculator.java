
import java.util.Scanner;
class StudentCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Register No: ");
        int reg = sc.nextInt();
        System.out.print("Enter 3 Marks: ");
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        int total = a+b+c;
        double avg = total/3.0;
        System.out.println("Name: "+name);
        System.out.println("Register No: "+reg);
        System.out.println("Total: "+total);
        System.out.println("Average: "+avg);
        if(avg>=90) System.out.println("Grade: A");
        else if(avg>=75) System.out.println("Grade: B");
        else if(avg>=50) System.out.println("Grade: C");
        else System.out.println("Grade: Fail");
    }
}
