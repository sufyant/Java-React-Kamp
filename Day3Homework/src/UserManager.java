public class UserManager {

    public void add(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kisi eklendi");
    }

    public void delete(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kisi silindi");
    }

    public void update(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kisi guncellendi");
    }

}
