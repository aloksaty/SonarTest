package Correction;
/***
 *
 *
 *
 * User: alok
 * Date: 04/02/23
 *
 */
public class TemproryEmp extends Employee {
    public TemproryEmp (String name, String id, double salary) {
        super (name, id, salary);
    }
    @Override
    public double calculateBonus (double salary) {
        return salary*.1;
    }
}
