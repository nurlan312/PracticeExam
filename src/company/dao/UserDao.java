package company.dao;

import company.model.User;

import javax.naming.InsufficientResourcesException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class UserDao<T, Y> {
    /**
     * 4) dao пакеттин ичине UserDao деген класс тузунуз, ичинде бир эле свойствасы болот - userлер,
     *  бул класс биздин база данныхыбыз болот.
     */

//    Map<T, Y> users = new TreeMap<>();
//
//    public Map<T, Y> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Map<T, Y> users) {
//        this.users = users;
//    }

    T id;
    Y User;

    public UserDao(T id, Y user) {
        this.id = id;
        User = user;
    }

    public UserDao() {
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public Y getUser() {
        return User;
    }

    public void setUser(Y user) {
        User = user;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "id=" + id +
                ", User=" + User +
                '}';
    }
}
