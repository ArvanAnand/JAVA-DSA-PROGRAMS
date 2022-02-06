
import java.util.Scanner;

class NetSalary {
    public static void main(String args[]) {
        double gs, it, pt, pf, netSalary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Gross salary");
        gs = sc.nextDouble();
        System.out.println("Enter Income Tax %");
        it = sc.nextDouble();
        System.out.println("Enter Professional Tax %");
        pt = sc.nextDouble();
        System.out.println("Enter Provident Fund %");
        pf = sc.nextDouble();
        pf = pf * (gs / 100);
        it = it * (gs / 100);
        pt = pt * (gs / 100);
        netSalary = gs - it - pt - pf;
        System.out.println("Net Salary is=" + netSalary);
        sc.close();
    }
}
