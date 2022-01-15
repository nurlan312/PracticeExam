package company.model;

import company.Gender;

public class User {
    /**
     * 3) model пакеттин ичине User деген класс тузунуз, свойствалары - id, name, age, company.Gender,
     *  Genderди enum кылып башка пакетке тузуп койсонуз болот. id бул жон эле userдин
     *   уникалдуу свойствасы болот.
     */
    private final int id;
    private String name;
    private int age;
    Gender gender;

    public User(int id, String name, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public User(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
