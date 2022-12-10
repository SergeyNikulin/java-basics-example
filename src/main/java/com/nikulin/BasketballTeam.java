package com.nikulin;

public class BasketballTeam extends SportTeam {

    private final KindSport kindSport;
    private final int limitPlayer = 5;
    private static int countTeam;

    public BasketballTeam(String name, String city, String owner) {
        super(name, city, owner);
        countTeam +=1;
        this.kindSport = KindSport.BASKETBALL;
    }

    @Override //ToDo Добавить проверку, что спортсмен занимается тем же видом спорта и удовлетворяет возрастным ограничениям
    public void addPlayers(Sportsman sportsman) {
        if (isNotLimitExceeded()) {
            System.out.println("Нельзя добавить " + sportsman.getFullName() + " в команду " + getName() +
                    ". Команда полностью укомплектована");
        } else  {
            super.addPlayers(sportsman);
        }
    }

    @Override
    public boolean isNotLimitExceeded() {
        return getTeamList().size() == limitPlayer;
    }

    public static int getCountTeam() {
        return countTeam;
    }

    @Override
    public KindSport getKindSport() {
        return kindSport;
    }
}
