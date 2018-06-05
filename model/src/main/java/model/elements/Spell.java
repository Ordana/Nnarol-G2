package model.elements;

import contract.Behavior;
import model.AnimatedSprite;
import contract.Direction;
import static contract.AIType.STRAIGHT;

/**
 *@author Rafik Belkadi
 * Spell of hero
 */
public class Spell extends AI{

    /**
     * Instantiates a spell object
     * @param x
     * The X position
     * @param y
     * The Y position
     * @param direction
     * The direction of the spell
     */
    public Spell(int x, int y, Direction direction) {
        super(x, y,"sprites/fireball_1.png");
        String imagesPaths[] = {
                "sprites/fireball_1.png",
                "sprites/fireball_2.png",
                "sprites/fireball_3.png",
                "sprites/fireball_4.png",
                "sprites/fireball_5.png"
        };
        this.sprite = new AnimatedSprite("sprites/fireball_1.png",imagesPaths);
        this.direction = direction;
        this.aiType = STRAIGHT;
        this.behavior = Behavior.SPELL;
    }

}
