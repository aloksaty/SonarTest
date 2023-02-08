package Correction;
/***
 *
 *
 *
 * User: alok
 * Date: 04/02/23
 *
 */
public class PermanentEmp extends Employee {
    public PermanentEmp (String name, String id, double salary) {
        super (name, id, salary);
    }
    @Override
    public double calculateBonus (double salary) {
        return salary*.2;
    }
}
