public class UserManager {

    void add(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kisi eklendi");
    }

    void delete(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kisi silindi");
    }

    void update(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kisi guncellendi");
    }

}
