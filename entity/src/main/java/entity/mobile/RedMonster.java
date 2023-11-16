package entity.mobile;

import entity.Permeability;
import entity.Sprite;

/**
 * @author Lionel
 *
 */

public class RedMonster extends Mobile {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('R', "redMonster.png");

    /**
     * Instantiates a new monster.
     */
    RedMonster() {
        super(SPRITE, Permeability.KILLABLE);
    }

    @Override
    public void win() {
        // TODO Auto-generated method stub
        return;
    }

    /**
     *Gets the diamonds
     */
    @Override
    public int getDiamonds() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     *Gets the diamonds
     */
    @Override
    public void grabDiamond() {
        return;
    }
}

