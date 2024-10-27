public class Person {
    String id;
    String firstName;
    String lastName;
    String address;
    MyDate bd;

    public Person(){}
    public Person(String id, String firstName,String lastName, String address, MyDate bd){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.bd = bd;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.firstName + " - " + this.lastName + " - " + this.address + " - " + this.bd;
    }

    public static void main(String[] args) {
        Person p2 = new Person("111", "rann", "naor", "ben-shemen", new MyDate(2000, 10, 5));
        System.out.println(p2);
    }
}
