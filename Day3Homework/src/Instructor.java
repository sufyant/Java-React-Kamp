public class Instructor extends User {

    private int salary;

    public Instructor(String id, String firstName, String lastName, String email, int salary) {
        super(id, firstName, lastName, email);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
