import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private boolean isDown;
    private String key;
    private String sound;

    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile)
    {
        key = keyName;
        sound = soundFile;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        checkKeyDown();
    }

    /**
     * Checks if a key is pressed and updates the image and plays the matching sound.
     */
    public void checkKeyDown()
    {
        if (!isDown && Greenfoot.isKeyDown(key))    {
            play();
            setImage("white-key-down.png");
            isDown = true;
        }
        if (isDown && !Greenfoot.isKeyDown(key))    {
            play();
            setImage("white-key.png");
            isDown = false;
        }
    }

    public void play()
    {
        Greenfoot.playSound(sound);
    }
}

