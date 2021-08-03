package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class User {
    int id;
    String name, email;
    List<String> history = new ArrayList<String>();
    ChatRepo repo;

    public User(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    };

    public void update(String m) {
        this.repo.addM(m, this);
    }
}
