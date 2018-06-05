package model.elements;

/**
 * A wall element that blocks the hero
 * @author Rafik Belkadi
 */
public abstract class Wall extends Element {
    /**
     * Localization and image Wall
     * @param x
     * @param y
     * @param image
     */
    public Wall(int x, int y, String image) {
        super(x, y, image);
        this.permeable = false;
    }
}
