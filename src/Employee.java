public class Employee extends Person{
    String empId;
    String department;
    MyDate startWork;

    public Employee(){}
    public Employee(String id, String firstName,String lastName,String address, MyDate bd,
                    String eid, String d, MyDate sw){
        super(id, firstName,lastName, address, bd);
        this.empId = eid;
        this.department = d;
        this.startWork = sw;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + empId + " - " + department + " - " + this.startWork;
    }

    public int salary(){
        return 0;
    }
}
