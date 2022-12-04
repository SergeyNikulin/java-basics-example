package com.nikulin;

public class TeamExample {

    public static void main(String[] args) {
        Sportsman sportsman1 = new Sportsman("Фамилия1", "Имя1", 18, KindSport.BASKETBALL);
        Sportsman sportsman2 = new Sportsman("Фамилия2", "Имя2", 20, KindSport.BASKETBALL);
        Sportsman sportsman3 = new Sportsman("Фамилия3", "Имя3", 25, KindSport.BASKETBALL);
        Sportsman sportsman4 = new Sportsman("Фамилия4", "Имя4", 24, KindSport.BASKETBALL);
        Sportsman sportsman5 = new Sportsman("Фамилия5", "Имя5", 15, KindSport.BASKETBALL);
        Sportsman sportsman6 = new Sportsman("Фамилия6", "Имя6", 65, KindSport.BASKETBALL);
        Sportsman sportsman7 = new Sportsman("Фамилия7", "Имя7", 38, KindSport.HOCKEY);
        Sportsman sportsman8 = new Sportsman("Фамилия8", "Имя8", 51, KindSport.HOCKEY);
        Sportsman sportsman9 = new Sportsman("Фамилия9", "Имя9", 21, KindSport.HOCKEY);
        Sportsman sportsman10 = new Sportsman("Фамилия10", "Имя10", 20, KindSport.HOCKEY);
        Sportsman sportsman11 = new Sportsman("Фамилия11", "Имя11", 33, KindSport.HOCKEY);
        Sportsman sportsman12 = new Sportsman("Фамилия12", "Имя12", 44, KindSport.HOCKEY);
        Sportsman sportsman13 = new Sportsman("Фамилия13", "Имя13", 8, KindSport.FOOTBALL);

        System.out.println("Количество футбольных команд - " + FootballTeam.getCountTeam());
        System.out.println("Количество хоккейных команд - " + HockeyTeam.getCountTeam());
        System.out.println("Количество баскетбольных команд - " + BasketballTeam.getCountTeam());

        SportTeam sportTeam1 = new BasketballTeam("Торпедо", "Москва", "Иванов Иван");
        SportTeam sportTeam2 = new HockeyTeam("ЦСКА", "Москва", "Иванова Елена");
        SportTeam sportTeam3 = new FootballTeam("Химки", "Москва", "Иванов Петр");
        SportTeam sportTeam4 = new FootballTeam("Сатурн", "Москва", "Иванов Петр");

        System.out.println("===============");
        System.out.println("Количество футбольных команд - " + FootballTeam.getCountTeam());
        System.out.println("Количество хоккейных команд - " + HockeyTeam.getCountTeam());
        System.out.println("Количество баскетбольных команд - " + BasketballTeam.getCountTeam());

        System.out.println("===============");
        System.out.println("Количество игроков в команде " + sportTeam1.getName() + " - " + sportTeam1.getCountPlayer());
        sportTeam1.getInfoPlayerTeam();
        System.out.println("Количество игроков в команде " + sportTeam2.getName() + " - " + sportTeam2.getCountPlayer());
        sportTeam2.getInfoPlayerTeam();
        System.out.println("Количество игроков в команде " + sportTeam3.getName() + " - " + sportTeam3.getCountPlayer());
        sportTeam3.getInfoPlayerTeam();

        System.out.println("===============");
        System.out.println("Количество игроков в команде " + sportTeam1.getName() + " - " + sportTeam1.getCountPlayer());
        sportTeam1.getInfoPlayerTeam();
        sportTeam1.addPlayers(sportsman1);
        sportTeam1.addPlayers(sportsman1);
        sportTeam1.addPlayers(sportsman2);
        sportTeam1.addPlayers(sportsman3);
        sportTeam1.addPlayers(sportsman4);
        sportTeam1.addPlayers(sportsman5);
        sportTeam1.addPlayers(sportsman6);
        sportTeam1.getInfoPlayerTeam();
        System.out.println("Количество игроков в команде " + sportTeam1.getName() + " - " + sportTeam1.getCountPlayer());

        System.out.println("-------------");
        System.out.println("Количество игроков в команде " + sportTeam2.getName() + " - " + sportTeam2.getCountPlayer());
        sportTeam2.getInfoPlayerTeam();
        sportTeam2.addPlayers(sportsman1);
        sportTeam2.addPlayers(sportsman6);
        sportTeam2.addPlayers(sportsman7);
        sportTeam2.getInfoPlayerTeam();
        System.out.println("Количество игроков в команде " + sportTeam2.getName() + " - " + sportTeam2.getCountPlayer());

        System.out.println("-------------");
        sportTeam2.deletePlayers(sportsman1);
        sportTeam2.deletePlayers(sportsman12);
        System.out.println("Текуща команда игрока " + sportsman7.getFullName() + " - " + sportsman7.getCurrentTeam());
        sportTeam2.deletePlayers(sportsman7);
        System.out.println("Текуща команда игрока " + sportsman7.getFullName() + " - " + sportsman7.getCurrentTeam());
        sportTeam2.getInfoPlayerTeam();
        System.out.println("Количество игроков в команде " + sportTeam2.getName() + " - " + sportTeam2.getCountPlayer());

        System.out.println("-------------");
        System.out.println("Количество игроков в команде " + sportTeam3.getName() + " - " + sportTeam3.getCountPlayer());
        sportTeam3.getInfoPlayerTeam();

        System.out.println("===============");
        System.out.println("Текуща команда игрока " + sportsman8.getFullName() + " - " + sportsman8.getCurrentTeam());
        sportTeam4.addPlayers(sportsman8);
        System.out.println("Текуща команда игрока " + sportsman8.getFullName() + " - " + sportsman8.getCurrentTeam());

        System.out.println("===============");
        System.out.println("Возраст " + sportsman1.getFullName() + " - " + sportsman1.getAge());
        sportsman1.birthdayCelebration();
        System.out.println("Возраст " + sportsman1.getFullName() + " - " + sportsman1.getAge());

        System.out.println("===============");
        System.out.println("Вид спорта команды " + sportTeam1.getName() + " - " + sportTeam1.getKindSport());
        System.out.println("Вид спорта команды " + sportTeam2.getName() + " - " + sportTeam2.getKindSport());
        System.out.println("Вид спорта команды " + sportTeam3.getName() + " - " + sportTeam3.getKindSport());
        System.out.println("Вид спорта команды " + sportTeam4.getName() + " - " + sportTeam4.getKindSport());
    }
}
