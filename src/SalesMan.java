public class SalesMan extends  Employee{
    private int totalSales;
    private final static double SALES_RATE = 0.15;

    public SalesMan(){}
    public SalesMan(String id, String firstName,String lastName, String address, MyDate bd,
                    String eid, String d, MyDate sw, int ts){
        super(id, firstName,lastName, address, bd, eid, d, sw);
        this.totalSales = ts;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + totalSales;
    }

    @Override
    public int salary() {
        return (int)(this.totalSales * SalesMan.SALES_RATE);
    }
}
