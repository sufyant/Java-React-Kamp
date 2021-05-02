public class InstructorManager extends UserManager {

    void giveCourse(User user, String courseName) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kisi " + courseName + " kursuna katildi...");
    }

    void deleteComment(User user, String comment) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kisi '" + comment + "' yorumunu sildi");
    }
}
