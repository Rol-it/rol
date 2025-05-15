import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float num1,num2;
        int input;

        System.out.print("first number:");
        num1= in.nextFloat();

        System.out.print("1 for +,2 for -,3 for /,4 for *:");
        input=in.nextInt();

        System.out.print("Second number:");
        num2= in.nextFloat();

        switch (input){
            case 1:
                System.out.println(num1+num2);
            case 2:
                System.out.println(num1-num2);
            case 3:
                System.out.println(num1*num2);
            case 4:
                System.out.println(num1/num2);
            break;
        }

    }
}
