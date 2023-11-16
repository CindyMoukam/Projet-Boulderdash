package entity.mobile;

/**
 * @author Lionel
 *
 */
public class MobileElementsFactory {

    /**
     * The Green Monster
     */
    private final static GreenMonster MONSTER_GREEN = new GreenMonster();
    /**
     * The Red Monster
     */
    private final static RedMonster RED_MONSTER = new RedMonster();
    /**
     * The diamond
     */
    private final static Diamond diamond = new Diamond();
    /**
     * The rock
     */
    private final static Rock ROCK = new Rock();

    /**
     * The list of mobile elements
     */
    private static Mobile[] mobileElements = {RED_MONSTER, MONSTER_GREEN, diamond, ROCK};

    /**
     * Gets char from file
     * @param fileSymbol
     * @return
     */
    public static Mobile getFromFileSymbol(final char fileSymbol) {
        for (final Mobile mobileElement : mobileElements) {
            if (mobileElement.getSprite().getConsoleImage() == fileSymbol) {
                return mobileElement;
            }
        }
        return ROCK;
    }

    /**
     * creates Red Monster
     * @return Red Monster
     */
    public static Mobile createMonsterR() {
        return RED_MONSTER;
    }

    /**
     * creates Green Monster
     * @return Green Monster
     */
    public static Mobile createMonsterG() {
        return MONSTER_GREEN;
    }

    /**
     * creates diamond
     * @return
     */
    public static Mobile createDiamond() {
        return diamond;
    }

    /**
     * creates rock
     * @return
     */
    public static Mobile createRock() {
        return ROCK;
    }

}
