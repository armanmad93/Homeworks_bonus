package homework7.solders;

public abstract class Solder {
    private int push;
    private int heath;
    private double armor;
    public abstract void pushSolder(Solder solder);

    public Solder(int push, int heath, double armor) {
        this.push = push;
        this.heath = heath;
        this.armor = armor;
    }

    public int getPush() {
        return push;
    }

    public void setPush(int push) {
        this.push = push;
    }

    public int getHeath() {
        return heath;
    }

    public void setHeath(int heath) {
        this.heath = heath;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }
}
