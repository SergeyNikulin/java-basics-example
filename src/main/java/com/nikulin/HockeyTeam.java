package com.nikulin;

public class HockeyTeam extends SportTeam {

    private final KindSport kindSport;
    private final int limitPlayer = 6;
    private static int countTeam;

    public HockeyTeam(String name, String city, String owner) {
        super(name, city, owner);
        countTeam +=1;
        this.kindSport = KindSport.HOCKEY;
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
