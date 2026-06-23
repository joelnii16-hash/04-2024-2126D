import java.util.Scanner;

public class StudentInfo {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String FullName;
        String IndexNumber;
        String Gender;
        String Department;
        String AdultStatus;
        String AcademicStatus = "";
        int Level, Age;
        double GPA;

        System.out.println("What is your Fullname");
        FullName = input.nextLine();
        System.out.println("Enter your Index Number");
        IndexNumber = input.nextLine();
        System.out.println("How old are you");
        Age = input.nextInt();
        System.out.println("Whats your gender");
        Gender = input.next();
        System.out.println("What department are you in");
        Department = input.next();
        System.out.println("What level are you in");
        Level = input.nextInt();
        System.out.println("Whats your current GPA");
        GPA = input.nextDouble();


        AdultStatus = (Age >= 18) ? "YES" : "NO";



        if (GPA >= 3.5 && GPA <= 4.0){
            AcademicStatus = ("First Class");
        }else if (GPA >= 3.0 && GPA <= 3.49){
            AcademicStatus = ("Second Class Upper");
        } else if (GPA >= 2.5 && GPA <= 2.99) {
            AcademicStatus = ("Second Class Lower");
        }else if (GPA < 2.5){
            AcademicStatus = ("Pass");
        }



        System.out.println("Name:" + FullName);
        System.out.println("Index:" + IndexNumber);
        System.out.println("Age:" + Age);
        System.out.println("Gender:" + Gender.charAt(0));
        System.out.println("Department:" + Department);
        System.out.println("Level:" + Level);
        System.out.println("GPA:" + GPA);
        System.out.println("Adult Status:" +AdultStatus);
        System.out.println("Academic Status:" +AcademicStatus);
    }
}

