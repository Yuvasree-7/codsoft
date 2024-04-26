import java.util.Scanner;
class GradeCalculator{
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int numSubjects=scanner.nextInt();
        int totalMarks=0;
        for(int i=1; i<=numSubjects;i++){
            System.out.println("Enter the marks obtained in each subject " + i + ": " );
            int marks=scanner.nextInt();
            totalMarks+=marks;

        }
        double averagePercentage=(double)totalMarks/numSubjects;
        char grade='F';
        if(averagePercentage>=90){
            grade='A';
        }
        else if(averagePercentage>=80){
            grade='B';
        }
        else if(averagePercentage>=70){
            grade='C';
        }
        else if(averagePercentage>=60){
            grade='D';
        }
        else if(averagePercentage>=50){
            grade='E';
        }
        else {
            System.out.println("You have failed");
        }
        System.out.println("\n Total Marks: "+totalMarks);
        System.out.println("Average Percentage: "+ averagePercentage);
        System.out.println("Grade: "+ grade);
        scanner.close();
    }
}
