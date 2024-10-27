public class Worker extends  Employee{
    int baseSalary;
    int workingHours;

    public Worker(){}
    public Worker(String id, String firstName, String lastName,String address, MyDate bd,
                  String eid, String d, MyDate sw, int bs, int wh){
        super(id, firstName, lastName,  address, bd, eid, d, sw);
        this.baseSalary = bs;
        this.workingHours = wh;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + baseSalary + " - " + workingHours;
    }

    @Override
    public int salary() {
        return this.baseSalary * this.workingHours;
    }
}
