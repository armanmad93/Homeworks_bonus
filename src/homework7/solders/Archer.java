package homework7.solders;

public class Archer extends Solder {

    public Archer(int push, int heath, double armor) {
        super(push, heath, armor);
    }

    @Override
    public void pushSolder(Solder solder) {
        solder.setHeath((int) (solder.getHeath() - (this.getPush() * solder.getArmor())));
    }

    @Override
    public String toString() {
        return "{ " + "\n" + "Archer heath: -> " + getHeath() + "\n" + "}" + "\n";
    }
}
