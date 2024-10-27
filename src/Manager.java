public class Manager extends  Employee{
    int monthlySalary;

    public Manager(){}
    public Manager(String id, String firstName, String lastName, String address, MyDate bd,
                   String eid, String d, MyDate sw, int ms){
        super(id, firstName, lastName,  address, bd, eid, d, sw);
        this.monthlySalary = ms;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + monthlySalary;
    }

    @Override
    public int salary() {
        return this.monthlySalary;
    }
}