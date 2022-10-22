public class App {
    public static void main(String[] args) {
        try {


            Team team1 = new Team("Biali");
            Hero hero1 = new BonusAtack("1", 100, 100, 100, 0.2);
            Hero hero2 = new BonusAtack("2", 100, 100, 100, 0.2);
            team1.addHeroo(hero1);
            team1.addHeroo(hero2);
            team1.addHeroo(hero1);


            Team team2 = new Team("Czarni");
            Hero hero3 = new BonusDefend("3", 100, 100, 100, 0.2);
            Hero hero4 = new BonusDefend("4", 100, 100, 100, 0.2);
            team2.addHeroo(hero3);
            team2.addHeroo(hero4);
            team2.addHeroo(hero4);
            Batlle.batlle(team1, team2);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());


        }
    }
}
