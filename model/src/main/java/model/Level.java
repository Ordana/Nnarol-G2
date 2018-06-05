package model;


import contract.*;
import model.elements.Element;
import model.elements.Hero;
import model.elements.Spell;
import java.util.ArrayList;

/**
 *@author Rafik Belkadi
 * Level of the game
 */
public class Level implements ILevel {

    /**
     * the number of the level
     * If Lorann can exit the level
     */
    private int number;
    private boolean exit = false;

    private ArrayList<IEntity> entities;

    /**
     * The database ID of the level
     */
    private int id;

    /**
     * Interface of Element
     */
    private IElement elements[][];

    /**
     * Interface of hero
     */

    private IHero hero;

    /**
     * Interface of dimension
     */
    private IDimention dimention;

    /**
     * Indicate if the level is finished
     */
    private boolean finished;
    

    /**
     * Localization of elements
     * @param width
     * @param height
     * @param hero
     *
     */
    public Level(int id,int width, int height, Hero hero, int number) {
        this.dimention = new Dimention(width,height);
        this.hero = hero;
        this.number = number;
        this.elements = new Element[height][width];
        this.entities = new ArrayList<IEntity>();
        this.id = id;
    }

    /**
     * Add the entity
     * @param entity
     */
    public void addEntity(IEntity entity){
        this.entities.add(entity);
    }

    /**
     * Remove the entity
     * @param entity
     */
    public void removeEntity(IEntity entity){
        this.entities.remove(entity);
    }
    /**
     * Create the spell
     * @param direction
     */

    public void createSpell(int x, int y, Direction direction) {
        this.addEntity(new Spell(x,y,direction));
    }
    /**
     * Destroy the element
     * @param element
     */
    public void destroyElement(IElement element) {
        if (element instanceof IEntity) {
            this.entities.remove(element);
        } else {
            this.setElement(element.getLocation().getX(), element.getLocation().getY(), null);
        }

    }

    //GETTER & SETTER

    /**
     * Getter for the number of level
     * @return
     * get the number
     */
    public int getNumber() {
        return number;
    }
    /**
     * Getter for the load Query
     *@return
     * The load query
     */
    public String getLoadQuery(int id) {
        return null;
    }
    /**
     * Setter for the number of level
     * @param number
     * set the number
     */
    public void setNumber(int number) {
        this.number = number;
    }
    /**
     * Getter for the dimension of level
     * @return
     * get the dimension
     */
    public IDimention getDimention() {
        return dimention;
    }
    /**
     * Setter for the dimension of level
     * @param dimention
     * set the dimension
     */
    public void setDimention(IDimention dimention) {
        this.dimention = dimention;
    }
    /**
     * Getter for the hero of level
     * @return
     * get the Hero
     */
    public IHero getHero() {
        return hero;
    }
    /**
     * Setter for the hero of level
     * @param hero
     * set the hero
     */
    public void setHero(IHero hero) {
        this.hero = hero;
    }

    public IElement[][] getElements() {
        return elements;
    }
    /**
     * Set the elements of the level
    */
    public void setElements(IElement[][] elements) {
        this.elements = elements;
    }
    /**
     * Get the elements of level
     * @return elements
     */
    public IElement getElement(int x, int y){
        return this.elements[y][x];
    }

    /**
     * Localization of element
     * @param x
     * Localization x
     * @param y
     * Localization y
     * @param element
     */
    public void setElement(int x, int y, IElement element){
        this.elements[y][x] = element;
    }

    /**
     * Getter for the entities of the level
     * @return
     * The entity
     */
    public ArrayList<IEntity> getEntities() {
        return (ArrayList<IEntity>) entities.clone();
    }
    /**
     * Setter for the entities of the level
     * @param entities
     * The entity
     */
    public void setEntities(ArrayList<IEntity> entities) {
        this.entities = entities;
    }
    /**
     * Is (get) the exit of the level
     * @return
     * The sprite
     */
    public boolean isExit() {
        return exit;
    }
    /**
     * Setter to exit the level
     * @param exit
     * set the exit
     */
    public void setExit(boolean exit) {
        this.exit = exit;
    }
    /**
     * If the level is finished
     * The end of the level
     */

    public boolean isFinished() {
        return finished;
    }
    /**
     * Setter :  if the level is finished
     * @param finished
     * The end of the level
     */
    public void setFinished(boolean finished) {
        this.finished = finished;
    }
    /**
     * Getter for the value of the level
     * @return
     * get the value
     */

    public int getValue() {
        return 1000;
    }
    /**
     * Getter for the id of the level
     * @return
     * get the ID
     */
    public int getId() {
        return id;
    }
    /**
     * Setter for the id of the level
     * @param id
     * set the ID
     */
    public void setId(int id) {
        this.id = id;
    }
}

