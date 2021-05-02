public class Main {

    public static void main(String[] args) {

        Course     course1     = new Course("1", "C#","Engin");
        Course     course2     = new Course("2", "Java","Engin");

        Instructor instructor1 = new Instructor("1","Engin","Demirog");
        Instructor instructor2 = new Instructor("1","Sufyan","Taskin");

        CourseManager     courseManager     = new CourseManager();
        InstructorManager instructorManager = new InstructorManager();


        courseManager.add(course1);
        courseManager.delete(course2);

        instructorManager.add(instructor1);
        instructorManager.add(instructor2);


    }

}
