import java.util.Scanner;
public class verify {
    public static void main(String[] args){
        System.out.println("enter first num1");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("enter first num2");
        Scanner sc1=new Scanner(System.in);
        int num2=sc1.nextInt();
        System.out.println("enter first num3");
        Scanner sc2=new Scanner(System.in);
        int num3=sc2.nextInt();
        System.out.println("enter first num42");
        Scanner sc3=new Scanner(System.in);
        int num4=sc3.nextInt();
        if(num1==num2 && num2==num3 && num3==num4){
            System.out.println("All entered numbers are equal");
        }
        else{
            System.out.println("numbers are not equal");
        }


    }
}
