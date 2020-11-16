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


    void attack(Creature defender) {
        int damageToDeal = this.stats.getAttack() - defender.stats.getArmor();
        if (damageToDeal < 0) {
            damageToDeal = 0;
        }
        defender.currentHp = defender.currentHp - damageToDeal;
    }

}
