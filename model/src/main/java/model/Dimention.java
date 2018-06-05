package model;

/**
 *@author Rafik Belkadi
 */
public class Dimention implements contract.IDimention {
    /**
     * the width of the dimension of the game
     * the height of the dimension of the game
     */
    private int width;
    private int height;

    /**
     * Instantiates the class
     * @param width
     * @param height
     */
    public Dimention(int width, int height) {
        this.width = width;
        this.height = height;
    }
    // GETTER & SETTER
    /**
     * Getter for the width of the dimension
     * @return
     * get the width
     */

    public int getWidth() {
        return width;
    }
    /**
     * Set the width of the dimension
     * @param width
     * set the width
     */

    public void setWidth(int width) {
        this.width = width;
    }
    /**
     * Getter for the height of the dimension
     * @return
     * get the height
     */

    public int getHeight() {
        return height;
    }
    /**
     * Setter for the height of the diminution
     * @param height
     * set the height
     */

    public void setHeight(int height) {
        this.height = height;
    }
}
