import java.util.*;
public class PatternProblem
{
	public static void main(String[] args) {
	    try(Scanner sc=new Scanner(System.in)){
	        System.out.println("Enter the row and column size respectivily for printing pattern ");
	        int row=sc.nextInt();
	        int column=sc.nextInt();
	        System.out.println("Pattern is:");
	        for(int i=0;i<row;i++){
	            for(int j=0;j<column;j++){
	                System.out.print("@");
	            }
	            System.out.println();
	        }
	    }
    }
}