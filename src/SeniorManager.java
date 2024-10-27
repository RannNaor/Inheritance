public class SeniorManager extends Manager {
    int bonus;

    public SeniorManager(){}
    public SeniorManager(String id, String firstName, String lastName, String address, MyDate bd,
                         String eid, String d, MyDate sw, int ms, int bonus){
        super(id, firstName, lastName,  address, bd, eid, d, sw, ms);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + bonus;
    }

    @Override
    public int salary() {
        return this.monthlySalary + this.bonus;
    }
}
