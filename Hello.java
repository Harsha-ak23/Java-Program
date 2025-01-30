import java.util.Scanner;

public class Hello{
    public static void main(String[] args){
        System.out.println("Hello Ashish");
        System.out.println("Hello Duniya");
        String name = "Ashish Kasaudhan";
        System.out.println("My name is : " +  name + " and String length is : "+ name.length());
        System.out.println(name.substring(3,6));
        int num[] = new int[5];
        try(Scanner sc = new Scanner(System.in)){
        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
    }
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
}