package model.elements;

import model.AnimatedSprite;

/**
 * The hero of the game (Lorann)
 * @author Rafik Belkadi
 */
public class Hero extends Entity implements contract.IHero {
    /** The indicator of the capacity to the hero to launch a RAINBOW SPELL <b>*o*</b> */
    private boolean spell;
    private boolean alive;
    /** The score of the player */
   private Integer score = 0;

    /**
     * Localization and image hero
     *
     * @param x
     *position x
     * @param y
     * position y
     * sprites lorann
     */
    public Hero(int x, int y) {
        super(x, y, "sprites/lorann_l.png");
        String imagesPaths[] = {
                "sprites/lorann_b.png",
                "sprites/lorann_bl.png",
                "sprites/lorann_l.png",
                "sprites/lorann_ul.png",
                "sprites/lorann_u.png",
                "sprites/lorann_ur.png",
                "sprites/lorann_r.png",
                "sprites/lorann_br.png",
        };
        this.sprite = new AnimatedSprite("sprites/lorann_b.png",imagesPaths);
        this.spell = true;
        this.alive = true;
    }
    // GETTER & SETTER
    /**
     * Getter for the score of hero
     * @return
     * get the score
     */

    public Integer getScore() {
        return score;
    }
    /**
     * Setter for the score of hero
     * @param score
     * set the score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * Is (get) if the spell is cast
     * @return
     * The spell
     */
    public boolean isSpell() {
        return spell;
    }
    /**
     * Setter : if the hero casts the spell
     * @param spell
     * The spell
     */
    public void setSpell(boolean spell) {
        this.spell = spell;
    }

   
    /**
     * Get the load Query
     * @return
     * Load query
     */
    public String getLoadQuery(int id) {
        return null;
    }

    /**
     * Boolean if hero is alive or not
     * @return alive
     */
	public boolean isAlive() {
		return alive;
	}

	/**
	 * Set alive
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}
