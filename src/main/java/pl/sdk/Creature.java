package pl.sdk;

class Creature {

    private final CreatureStatistic stats;
    private int currentHp;

    Creature() {
        stats = new CreatureStatistic("DefName", 1, 1, 10, 100);
    }

    Creature(String aName, int aAttack, int aArmor, int aMaxHp, int aMoveRange) {
        stats = new CreatureStatistic(aName, aAttack, aArmor, aMaxHp, aMoveRange);
        currentHp = stats.getMaxHp();
    }


    int getCurrentHp() {
        return currentHp;
    }


    void attack(Creature b) {
        b.currentHp = b.currentHp - this.stats.getAttack() + b.stats.getArmor();
    }

}
