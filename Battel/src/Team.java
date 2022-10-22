public class Team {
    private String name;
    private final int MAX_HERO = 3;
    private int newHero;
    Hero heros[] = new Hero[MAX_HERO];

    public Team(String name) {
        this.name = name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addHeroo(Hero h) {
        if (newHero > MAX_HERO) {

            throw new ArrayIndexOutOfBoundsException("Dodano maksymalna ilosc zawodnikow " + name);
        }

        heros[newHero] = h;
        newHero++;


    }
    


    public double live(){
        double sum=0;
        for (int i = 0; i < newHero; i++) {
            sum += heros[i].getLive();

        }
        return sum;

    }


    public double atack(){
        double sum=0;
        for (int i = 0; i < newHero; i++) {

            sum+=heros[i].getAtack();
        }
        return sum;
    }

public double defend(){
        double sum=0;
    for (int i = 0; i < newHero; i++) {
        sum += heros[i].getDefend();
    }
    return sum;

    }
}


