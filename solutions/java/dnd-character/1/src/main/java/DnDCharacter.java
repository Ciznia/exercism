import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    private int hitpoints;

    public DnDCharacter() {
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligence = ability(rollDice());
        wisdom = ability(rollDice());
        charisma = ability(rollDice());

        hitpoints = 10 + modifier(constitution);
    }

    int ability(List<Integer> scores) {
        return scores.stream().mapToInt(Integer::intValue).sum();
    }

    List<Integer> rollDice() {
        List<Integer> rolls = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            rolls.add(random.nextInt(6) + 1);
        }
        rolls.sort(Integer::compareTo);
        rolls.remove(0);
        return rolls;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }
}
