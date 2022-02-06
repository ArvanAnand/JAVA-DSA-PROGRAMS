/* Take input of salary from user. If the salary is greater
than 10,000 add bonus as 2000, otherwise bonus is 1000 */

import java.util.Scanner;

class Salary {
    public static void main(String args[]) {
        double salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee Salary: ");
        salary = sc.nextDouble();
        if (salary >= 10000) {
            salary = salary + 2000;
            System.out.println("The Bonus for good Performance " + salary);
        } else {
            salary = salary + 1000;
            System.out.println("The Bonus for average Performance " + salary);
        }
          sc.close();
    }

}
