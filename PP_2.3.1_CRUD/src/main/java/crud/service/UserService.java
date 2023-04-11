package crud.service;

import crud.model.User;

import java.util.List;

public interface UserService {
    void create(User user);

    User read(Long id);

    void update(User user);

    void delete(Long id);

    List<User> listUser();
}
