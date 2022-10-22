public class Hero {
   private String name;
   private double live;
   private double atack;
   private double defend;

    public Hero(String name, double live, double atack, double defend) {
        this.name = name;
        this.live = live;
        this.atack = atack;
        this.defend = defend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLive() {
        return live;
    }

    public void setLive(double live) {
        this.live = live;
    }

    public double getAtack() {
        return atack;
    }

    public void setAtack(double atack) {
        this.atack = atack;
    }

    public double getDefend() {
        return defend;
    }

    public void setDefend(double defend) {
        this.defend = defend;
    }
}
