package Observer_Pattern;

import java.util.*;

class ChatRepo {
    Map<User, List<String>> repo;

    void addM(String m, User user) {
        this.repo.get(user).add(m);
        user.update();
    }

}