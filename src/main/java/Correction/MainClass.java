package Correction;
/***
 *
 *
 *
 * User: alok
 * Date: 04/02/23
 *
 */
public class MainClass {
    public static void main (String[] args) {
        Employee employee_1= new PermanentEmp ("alok","001",200000);
        System.out.println (employee_1.calculateBonus (employee_1.salary));
        Employee employee_2= new TemproryEmp ("sachin","002",100000);
        System.out.println (employee_2.calculateBonus (employee_2.salary));

    }
}
