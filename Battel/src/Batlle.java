public class Batlle {
    static Team team;
    public static void batlle(Team team1,Team team2){
        double team1Atack=(team2.live()-(team1.atack()-team2.defend()));
        double team2Atack=(team1.live()-(team2.atack()-team1.defend()));
        if (team1Atack>team2Atack) {
            System.out.println("Wygrywa druzyna " + team2.getName());
        } else if (team1Atack<team2Atack) {
            System.out.println("Wygrywa druzyna " + team1.getName());
        }else {
            System.out.println("Remis");

        }
    }
    }

