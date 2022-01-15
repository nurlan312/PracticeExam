package company;

import company.dao.UserDao;
import company.model.User;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        /**
         * Практикалык тапшырма
         * 1) Жаны проект тузунуз.
         * 2) company деген пакеттин ичине 3 жаны пакет тузунуз - model, service, dao.
         * 3) model пакеттин ичине User деген класс тузунуз, свойствалары - id, name, age, company.Gender,
         * Genderди enum кылып башка пакетке тузуп койсонуз болот. id бул жон эле userдин
         * уникалдуу свойствасы болот.
         * 4) dao пакеттин ичине UserDao деген класс тузунуз, ичинде бир эле свойствасы болот - userлер,
         * бул класс биздин база данныхыбыз болот.
         * 5) service пакеттин ичине UserService деген interface тузунуз жана impl деген пакет тузуп коюнуз.
         * 6) UserServiceтин ичинде 4 метод болот, userди кошуу, id менен табуу, id менен очуруу жана баардык
         * userлерди алуу.
         * 7) impl пакеттин ичине UserServiceImpl деген класс тузунуз, бул класс UserService интерфейсин ишке ашырат жана бул класста свойства катары биздин база данныхыбыз болот(UserDao).
         * 8) UserServiceImpl класста UserService интерфейсинин бардык методдорун ишке ашырыныз.
         *
         *
         *
         *
         *
         *
         * 9) company.Main методдо 3 user тузунуз idлери 1,2,3 болсун.
         * 10) Аларды биздин базага кошунуз.
         * 11) 1 деген id менен userди таап консольго чыгарыныз.
         * 12) Эгер ал id жок болсо анда RunTimeException кармасын.
         * 13) Exception ди озунуздор тузунуздор.
         * 14) Баардык userлерди консольго чыгарыныз.
         * 15) 2 деген id менен userди очурунуз.
         * 16) Баардык userлерди консольго чыгарыныз.
         */

        Map<Integer , User> userDao = new HashMap<>();
        userDao.put(1, new User(1, "Venera", 20, Gender.WOMAN));
        userDao.put(2, new User(2, "Mirbek", 30, Gender.MAN));
        userDao.put(3, new User(3, "Meerim", 23, Gender.WOMAN));

//        Stream.of(userDao)
//                .forEach(System.out::println);

        System.out.println("\nСписок студентов: ");
        for (Map.Entry<Integer, User> entry1 : userDao.entrySet()) {
            System.out.println(entry1);
        }
        System.out.println("\n1 деген id менен userди таап консольго чыгарыныз: ");
        try {
            System.out.println(userDao.get(1));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        //2 деген id менен userди очурунуз.
        userDao.remove(2);

        System.out.println("\n2 деген id менен user очурулгон сон:");
        for (Map.Entry<Integer, User> entry2 : userDao.entrySet()) {
            System.out.println(entry2);
        }




//        System.out.println("\nUserDao rabotaet, ne meshaite!: ");
//        UserDao<Integer, User> users1 = new UserDao<>(1, new User(1, "Muhamed", 23, Gender.MAN));
//        UserDao<Integer, User> users2 = new UserDao<>(2, new User(2, "Daniel", 20, Gender.MAN));
//        UserDao<Integer, User> users3 = new UserDao<>(3, new User(3, "Almaz", 20, Gender.MAN));
//
//        UserDao[] users = {users1, users2, users3};
//        for (UserDao a : users) {
//            System.out.println(a);
//        }
    }
}
