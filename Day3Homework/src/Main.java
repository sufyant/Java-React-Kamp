public class Main {

    public static void main(String[] args) {

        Student    student1    = new Student("1","Sufyan","Taskin","sufyantaskin@gmail.com",10000);
        Instructor instructor1 = new Instructor("1","Engin","Demirog","engindemirog@",20000);

        StudentManager    studentManager    = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();

        studentManager.add(student1);
        studentManager.addComment(student1, "mukemmel egitim");

        instructorManager.delete(instructor1);
        instructorManager.giveCourse(instructor1, "Java");
    }

}
