public class StudentManager extends UserManager {

    public void takeCourse(User user, String courseName) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kisi " + courseName + " kursunu verdi...");
    }

    public void addComment(User user, String comment) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kisi '" + comment + "' yorumunu ekledi");
    }

}
