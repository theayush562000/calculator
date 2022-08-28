import java .util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator;
        double n1,n2;
        int check=1;
        int count =1;

        while(check==1) {
            

            System.out.println("Enter the operator ('+', '-', '*', '/') ");
               operator=sc.next().charAt(0);

            System.out.println("Enter two numbers: ");
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();

        switch (operator) {
            case '+':
            System.out.println(n1+n2);
                break;
            case '-':
            System.out.println(n1-n2);
                 break;
            case '*':
            System.out.println(n1*n2);
                break;
            case '/':
            System.out.println(n1/n2);
                break;
            default:
            System.out.println("Invalid Operator.Please Enter Again");
                break;
        }
        
        System.out.println("Enter 0 to exit OR 1 to Continue");
        check = sc.nextInt();
        if(check==0) {
            System.out.println("calculator used : " + count + " times.");
            break;
        }
        else if(check==1){
            count++;
            continue;
        }
        else {
            System.out.println("Invalid input");
            break;
        }
        

    }



    }
}
