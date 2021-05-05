public class InstructorManager extends UserManager {

    public void giveCourse(User user, String courseName) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kisi " + courseName + " kursuna katildi...");
    }

    public void deleteComment(User user, String comment) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kisi '" + comment + "' yorumunu sildi");
    }
}
