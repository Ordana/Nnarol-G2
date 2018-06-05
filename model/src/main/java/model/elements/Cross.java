package model.elements;

/**
 * A crossing wall that blocks the hero
 * @author Rafik Belkadi
 */
public class Cross extends Wall {
    /**
     * Localization and image Cross
     *
     * @param x
     * The X position
     * @param y
     * The Y position
     */
    public Cross(int x, int y) {
        super(x, y, "sprites/bone.png");
    }

    /**
     * Getter for the type of this element
     * @return cross-wall
     */
    public String getType() {
        return "cross-wall";
    }
}
