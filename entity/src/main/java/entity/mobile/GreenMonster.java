package entity.mobile;

import entity.Permeability;
import entity.Sprite;

/**
 * @author Lionel
 * The class GreenMonster.
 * Represents the worm monsters on the map
 */
public class GreenMonster extends Mobile{

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('G', "greenMonster.png");

    /**
     * Instantiates a new monster.
     */
    GreenMonster() {
        super(SPRITE, Permeability.KILLABLE);
    }



    @Override
    public void win() {
        // TODO Auto-generated method stub
        return;
    }

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