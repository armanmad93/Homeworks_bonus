package homework7.solders;

public class Swordsman extends Solder {

    public Swordsman(int push, int heath, double armor) {
        super(push, heath, armor);
    }

    @Override
    public void pushSolder(Solder solder) {
        solder.setHeath((int) (solder.getHeath() - (this.getPush() * solder.getArmor())));
    }

    @Override
    public String toString() {
        return "{ " + "\n" + "Swordsman heath: -> " + getHeath() + "\n" + "}" + "\n";
    }
}
