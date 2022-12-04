package com.nikulin;

import java.util.ArrayList;

public abstract class SportTeam {
    private String name;
    private String city;
    private String owner;
    private int countPlayer;
    private ArrayList<Sportsman> teamList = new ArrayList<>();

    public SportTeam(String name, String city, String owner) {
        this.name = name;
        this.city = city;
        this.owner = owner;
    }

    public void addPlayers(Sportsman sportsman) {
        if (sportsman.isNotHaveTeam()) {
            teamList.add(sportsman);
            sportsman.setCurrentTeam(name);
            countPlayer +=1;
            System.out.println("Игрок " + sportsman.getFullName() +
                    " принят в команду " + name);
            } else if (sportsman.getCurrentTeam().equals(name)) {
                System.out.println("Нельзя добавить в команду. Игрок " + sportsman.getFullName() +
                    " уже в команде " + name);
        } else {
            System.out.println("Нельзя добавить " + sportsman.getFullName() + " в команду " + name +
                    ". Он уже играет за другую команду " + sportsman.getCurrentTeam());
        }
    }

    public void deletePlayers(Sportsman sportsman) {
        if (sportsman.getCurrentTeam().equals(name)) {
            teamList.remove(sportsman);
            sportsman.setCurrentTeam(Sportsman.noTeam);
            countPlayer -=1;
            System.out.println("Игрок " + sportsman.getFullName() +
                    " отчислен из команды " + name);
        } else {
            System.out.println("Нельзя отчислить из команды. Игрока " + sportsman.getFullName() +
                    " нет в команде " + name);
        }
    }

    public void getInfoPlayerTeam() {
        System.out.println("Состав команды " + name + ":");
        for (Sportsman sportsman : teamList) {
            System.out.println(sportsman.getFullName() + " - " + sportsman.getAge() + " лет");
        }
    }

    public abstract boolean isNotLimitExceeded();

    public abstract KindSport getKindSport();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCountPlayer() {
        return countPlayer;
    }

    public ArrayList<Sportsman> getTeamList() {
        return teamList;
    }

    @Override
    public String toString() {
        return "SportTeam{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", owner='" + owner + '\'' +
                ", countPlayer=" + countPlayer +
                ", teamList=" + teamList +
                '}';
    }
}
