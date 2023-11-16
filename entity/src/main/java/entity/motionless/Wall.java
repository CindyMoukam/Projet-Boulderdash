package entity.motionless;

import entity.Permeability;
import entity.Sprite;

/**
 * @author Lionel
 *
 */
class Wall extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('8', "Wall.png");

    /**
     * Instantiates a new wall.
     */
    Wall() {
        super(SPRITE, Permeability.WALL);
    }
}