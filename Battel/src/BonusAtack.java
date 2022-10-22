public class BonusAtack extends Hero{
    private double atackBonus;

    public BonusAtack(String name, double live, double atack, double defend, double atackBonus) {
        super(name, live, atack, defend);
        this.atackBonus = atackBonus;
        setAtack(getAtack()+(getAtack()*atackBonus));
    }

    public double getAtackBonus() {
        return atackBonus;
    }

    public void setAtackBonus(double atackBonus) {
        this.atackBonus = atackBonus;
    }
}
