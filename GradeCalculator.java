//TASK 2
//STUDENT GRADE CALCULLATOR
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String [] args){
        System.out.println("Enter your marks out of 100");
        System.out.print("Enter number of subjects:");
        Scanner obj = new Scanner(System.in);
        int subject = obj.nextInt();
        int total=0;
        //Entering marks
        for (int i=1;i<=subject;i++){
            System.out.print("Enter your marks for subject "+i+":");
            int marks=obj.nextInt();
            total+=marks;
        }
        int avg=total/subject;
        System.out.println("Total marks scored in "+subject+" subjects:"+total);
        System.out.println("Average:"+avg);
        //Grading
        if (avg>=90)
            System.out.print("Congrats! Grade : A+");
        else if (avg<90 && avg>=80)
            System.out.print("Grade : A");
        else if (avg<80 && avg>=70)
            System.out.print("Grade : B");
        else if (avg<70 && avg>=60)
            System.out.print("Grade : C");
        else if (avg<60 && avg>=50)
            System.out.print("Grade : D");
        else if (avg<50 && avg>=40)
            System.out.print("Grade : E");
        else if (avg<40)
            System.out.print("Sorry ! You Failed");
    obj.close();
    }
}
