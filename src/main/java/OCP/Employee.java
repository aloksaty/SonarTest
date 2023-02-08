package OCP;
/***
 *
 *
 *
 * User: alok
 * Date: 04/02/23
 *
 */
public class Employee {
    String name ;
    String id ;
    String type;
    public Employee (String name, String id, double salary,String type) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.type=type;

    }
    double salary;
    public double calculateBonus(double salary,String type){
        if (type.equals ("permanent")) {
            return (salary) * .2;
        }else {
            return salary*.1;
        }
    }
    public static void main (String[] args) {
            Employee employee = new Employee ("alok","001",200000,"permanent");
            System.out.println (employee.calculateBonus (employee.salary, employee.type));
            Employee employee_2 = new Employee ("sachin","001",100000,"temprory");
            System.out.println (employee.calculateBonus (employee_2.salary, employee_2.type));

    }
}
