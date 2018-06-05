package model;

/**
 * This class represents the location of an element
 * @author Rafik Belkadi
 */
public class Location implements contract.ILocation {
    /** The X position */
    private int x;
    /** The Y position */
    private int y;

    /**
     * Instantiates the class
     * @param x
     * the X position
     * @param y
     * The Y position
     */
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // GETTER & SETTER //

    /**
     * Get the Y position
     * @return The Y position
     */
    public int getY() {
        return y;
    }

    /**
     * Setter for a new Y position
     * @param y
     * set a new Y position
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Getter for the X position
     * @return The X position
     */
    public int getX() {
        return x;
    }

    /**
     * Setter for a new X position
     * @param x
     * The new X position
     */
    public void setX(int x) {
        this.x = x;
    }
}
