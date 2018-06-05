package model.elements;

/**
 * Horizontal wall that blocks the hero
 * @author Rafik Belkadi
 */
public class HWall extends Wall{
    /**
     * Localization and image HWall
     *
     * @param x
     * The X position
     * @param y
     * The Y position
     */
    public HWall(int x, int y) {
        super(x, y, "sprites/horizontal_bone.png");
    }

    public String getLoadQuery(int id) {
        return null;
    }
}
