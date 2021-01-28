package pl.sdk.model;


public class Creature {

    private final CreatureStatistic stats;
    private int currentHp;
    private boolean counterAttackedInThisTurn;

    public Creature() {
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
        if (isAlive()) {
            int damageToDeal = calculateDamage(defender);
            defender.currentHp = defender.currentHp - damageToDeal;

            if (!defender.counterAttackedInThisTurn) {
                int damageToDealCounterAttack = defender.calculateDamage(this);
                currentHp = currentHp - damageToDealCounterAttack;
                defender.counterAttackedInThisTurn = true;
            }
        }
    }

    private int calculateDamage(Creature defender) {
        int damageToDeal = this.stats.getAttack() - defender.stats.getArmor();
        if (damageToDeal < 0) {
            damageToDeal = 0;
        }
        return damageToDeal;
    }

    private boolean isAlive() {
        return currentHp > 0;
    }

}
