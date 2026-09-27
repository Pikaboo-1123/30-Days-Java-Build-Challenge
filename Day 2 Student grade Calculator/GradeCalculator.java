import java.util.*;
public class GradeCalculator{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name of student: ");
        String name= sc.nextLine();
        System.out.println("Enter no. of Subjects : ");
        int n= sc.nextInt();
        int marks[]= new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter marks of subject"+(i+1));
            marks[i]=sc.nextInt();
        }
        //Calculating total marks
        int total=0;
        for (int i=0;i<n;i++){
            total+=marks[i];
        }
        System.out.println("Total Marks: " + total);
        //calculating average marks
        double average= (double)total/n;
        System.out.println("Average Marks: " + average);
        //calculating percentage
        double percentage= (double)total/(n*100)*100;
        System.out.println("Percentage: " + percentage + "%");
        //Calculating grade
        String grade;
        if(percentage>=90){
            grade="A";
        }
        else if(percentage>=80){
            grade="B";
        }
        else if(percentage>=70){
            grade="C";
        }
        else if(percentage>=60){
            grade="D";
        }
        else{
            grade="F";
        }
    }
}