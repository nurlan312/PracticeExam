package company.service.impl;

import company.dao.UserDao;
import company.model.User;
import company.service.UserService;

import java.util.Objects;
import java.util.stream.Stream;

public class UserServiceImpl extends UserDao implements UserService {
    /**
     * 7) impl пакеттин ичине UserServiceImpl деген класс тузунуз, бул класс UserService интерфейсин
     * ишке ашырат жана бул класста свойства катары биздин база данныхыбыз болот(UserDao).
     * 8) UserServiceImpl класста UserService интерфейсинин бардык методдорун ишке ашырыныз.
     */

    public UserServiceImpl(int id, User user) {
        super(id, user);
    }

    @Override
    public void
    userkoshuu() {

    }

    @Override
    public void idTabuu() {
        System.out.println(getId());
    }

    @Override
    public void idOchuruu() {
        System.out.println();
    }

    @Override
    public void baardykUserAluu() {
        System.out.println(getUser());
    }
}
