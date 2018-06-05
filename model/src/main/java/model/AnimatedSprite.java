package model;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 *@author Rafik Belkadi
 * 
 * switch sprites to make an animation
 */
public class AnimatedSprite extends Sprite implements contract.IAnimatedSprite {
	/**
	 * make a list of sprites for an object that will appear on screen
	 */
    private Image images[];

    
    /**
     * defines the current animation status
     */
    private int step;
    
    
    /**
     * constructor of this class
     */
    public AnimatedSprite(String defaultImage, String[] images) {
        super(defaultImage);
        this.images = new Image[images.length];
        for(int i = 0; i<images.length; i++){
            try {
                this.images[i] = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream(images[i]));
            } catch (IOException e) {
                System.err.println("Can't load "+images[i]);
                e.printStackTrace();
            }
        }
        this.step = 0;
    }

    /**
     * initiates the next step of the animation sequence
     */
    public void nextStep()
    {
        this.step++;
        if(this.step >= this.images.length){
            this.step = 0;
        }
    }

    @Override
    public Image getImage() {
        return this.images[this.step];
    }
}
