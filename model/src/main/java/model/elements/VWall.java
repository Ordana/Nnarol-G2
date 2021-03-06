package model.elements;

/**
 * A vertical wall that blocks the hero
 * @author Rafik Belkadi
 */
public class VWall extends Wall
{
    /**
     * Localization and image VWall
     *
     * @param x
     * The X position
     * @param y
     * The Y position
     */
    public VWall(int x, int y) {
        super(x, y, "sprites/vertical_bone.png");
    }
}
