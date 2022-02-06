import java.util.Scanner;

public class Calculator {
      public static void main(String[] args) {
          int a,b;
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter The First Number: ");
                  a = sc.nextInt();
                  System.out.print("Enter The Second Number: ");
                  b = sc.nextInt();
          int ans = 0;

          while (true) {
                //Take operator as a Input 
                System.out.print("Enter The Operator: ");
                char op = sc.next().trim().charAt(0);
                System.out.println();
                if (op == '+'|| op == '-'|| op == '*'|| op == '/'|| op == '%')
                { 
                  
                   if (op == '+'){
                         ans = a + b;
                   }
                   if (op == '-'){
                         ans = a - b;
                   }
                   if (op == '*'){
                         ans = a * b;
                   }
                   if (op == '/'){
                        if( b != 0 ){
                              ans = a / b;
                        }
                   }
                   if (op == '%'){
                         ans = a % b;
                   }
                }  else if (op == 'x' || op == 'X'){
                      break;
                }
                else {
                      System.out.println("Invalid Operation");
                }
                System.out.println("The Answer is: " +ans);
               // sc.close(); we cannot use scanner close 
          }
          //System.out.println("The Answer is: " +ans);
          // This will not run as it was outside the while loop or infinite loop.
          
      }
      
}

