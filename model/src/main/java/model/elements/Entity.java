package model.elements;

import contract.IEntity;
import contract.Direction;


/**
 * An element that can move
 * @author Rafik Belkadi
 */
public abstract class Entity extends Element implements IEntity {

    public boolean moveTo(Integer x, Integer y){
        return false;
    }
    /**
     * Direction of the entity
     */
    protected Direction direction;

    /**
     * Localization and image entity
     * @param x
     * @param y
     * @param image
     */

    public Entity(int x, int y, String image) {
        super(x, y, image);
        this.permeable = true;
        this.direction = Direction.UP;
    }

    /**
     * Moves the entity to a specified position
     * @param x
     * The new X position
     * @param y
     * The new Y position
     */
    public void moveTo(int x, int y){
        this.setLocation(x,y);
    }

    /**
     * Getter for the direction of the Entity
     * @return
     * get the direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Setter for a new direction to the Entity
     * @param direction
     * set a new direction
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

}
