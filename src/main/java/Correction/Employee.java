package Correction;
/***
 *
 *
 *
 * User: alok
 * Date: 04/02/23
 *
 */
public abstract class  Employee {
    String name ;
    String id ;
    double salary;
    public Employee (String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;

    }
    public abstract double calculateBonus(double salary);

}
