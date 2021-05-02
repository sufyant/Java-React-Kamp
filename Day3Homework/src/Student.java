public class Student extends User {

    private int credit;

    public Student(String id, String firstName, String lastName, String email, int credit) {
        super(id, firstName, lastName, email);
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
