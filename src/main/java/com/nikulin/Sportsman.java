package com.nikulin;

public class Sportsman {

    private String firstName;
    private String lastName;
    private int age;
    private String currentTeam;
    private KindSport kindSport;
    public static String noTeam = "Свободный агент";

    public Sportsman(String lastName, String firstName, int age, KindSport kindSport) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.kindSport = kindSport;
        currentTeam = noTeam;
    }

    public String getFullName() {
        return lastName + " " + firstName;
    }

    public boolean isNotHaveTeam() {
        return currentTeam.equals(noTeam);
    }

    public void birthdayCelebration() {
        System.out.println("Я " + lastName + " " + firstName + " сегодня праздную свой день рождения!!!");
        age +=1;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCurrentTeam() {
        return currentTeam;
    }

    public void setCurrentTeam(String currentTeam) {
        this.currentTeam = currentTeam;
    }

    public KindSport getKindSport() {
        return kindSport;
    }

    public void setKindSport(KindSport kindSport) {
        this.kindSport = kindSport;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", currentTeam='" + currentTeam + '\'' +
                ", kindSport=" + kindSport +
                '}';
    }
}
