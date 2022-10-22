public class BonusDefend extends Hero {
    private double bonusDefend;

    public BonusDefend(String name, double live, double atack, double defend, double bonusDefend) {
        super(name, live, atack, defend);
        this.bonusDefend = bonusDefend;
        setDefend(getDefend()+(getDefend()*bonusDefend));
    }

    public double getBonusDefend() {
        return bonusDefend;
    }

    public void setBonusDefend(double bonusDefend) {
        this.bonusDefend = bonusDefend;
    }
}
