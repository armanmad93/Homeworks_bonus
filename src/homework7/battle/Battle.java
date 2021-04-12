package homework7.battle;

import homework7.solders.Solder;

public class Battle {
    public void battle(Solder solder1, Solder solder2) {
        solder1.pushSolder(solder2);
        solder2.pushSolder(solder1);
    }
}
