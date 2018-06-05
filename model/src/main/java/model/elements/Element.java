package model.elements;

import contract.*;
import model.Location;
import model.Sprite;

import java.awt.*;

/**
 * An element of a level
 * @author Rafik Belkadi
 */
public abstract class Element implements IElement {

    /** The behavior of the element */
    protected Behavior behavior;
    /** The location of the element */
    protected ILocation location;
    /** The sprite of the element */
    protected ISprite sprite;
    /** Set if an entity can walk over the element */
    protected boolean permeable;

    /**
     * Instantiates the element
     * @param location
     * The location of the element
     * @param image
     * The path to the image of the element
     */
    public Element(Location location, String image) {
        this.location = location;
        this.sprite = new Sprite(image);
        this.permeable = true;
    }

    /**
     * Instantiates the element
     * @param x
     * The X position of the element
     * @param y
     * The Y Position of the element
     * @param image
     * The path to an image representing the element
     */
    public Element(int x, int y, String image) {
        this.location = new Location(x,y);
        this.sprite = new Sprite(image);
    }

    /**
     * Instantiates the element
     * @param x
     * The X Position of the element
     * @param y
     * The Y position of the element
     * @param sprite
     * The Sprite of the element
     */
    public Element(int x, int y, Sprite sprite) {
        this.location = new Location(x,y);
        this.sprite = sprite;
    }

    /**
     * Instantiates the element
     * @param location
     * The location of the element
     * @param sprite
     * The sprite of the element
     */
    public Element(Location location, Sprite sprite) {
        this.location = location;
        this.sprite = sprite;
    }

  

    /**
     * Executed when an entity has the same position in the world
     * @param other
     * The other element
     * @param level
     * The level
     */
    public void onCollision(IElement other, ILevel level){

    }

    // GETTERS & SETTERS //

    /**
     * Getter for the behavior of the element
     * @return
     * get the behavior
     */
    public Behavior getBehavior() {
        return behavior;
    }

    /**
     * Getter for the location of the element
     * @return
     * get the location
     */
    public ILocation getLocation() {
        return location;
    }

    /**
     * Setter for the new location
     * @param location
     * set the location of the element
     */
    public void setLocation(ILocation location) {
        this.location = location;
    }

    /**
     * Setter for the new location of the element
     * @param x
     * The new X position
     * @param y
     * The new Y position
     */
    public void setLocation(int x, int y) {
        this.location.setX(x);
        this.location.setY(y);
    }

    /**
     * Getter for the sprite of the element
     * @return
     * get the sprite
     */
    public ISprite getSprite() {
        return sprite;
    }

    /**
     * Setter for a new sprite to the element
     * @param sprite
     * set the new sprite
     */
    public void setSprite(ISprite sprite) {
        this.sprite = sprite;
    }

    /**
     * Is (get) if the element is permeable
     * @return A boolean representing if the element is permeable
     */
    public boolean isPermeable() {
        return permeable;
    }

    /**
     * Getter for the image
     * @return The image of the element
     */
    public Image getImage() {
        return this.sprite.getImage();
    }
}

