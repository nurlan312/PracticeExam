package company.service;

import company.model.User;

import java.util.stream.Stream;

public interface UserService {
    /**
     * 5) service пакеттин ичине UserService деген interface тузунуз жана impl деген пакет тузуп коюнуз.
     * 6) UserServiceтин ичинде 4 метод болот, userди кошуу, id менен табуу, id менен очуруу жана баардык
     *    userлерди алуу.
     */

    void userkoshuu();

    void idTabuu();

    void idOchuruu();

    void baardykUserAluu();

}
