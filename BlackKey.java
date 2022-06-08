import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class BlackKey extends Actor
{
    private boolean isDown;
    private String key;
    private String sound;

    /**
     * Create a new key.
     */
    public BlackKey(String keyName, String soundFile)
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

    public void checkKeyDown()
    {
        if (!isDown && Greenfoot.isKeyDown(key))    {
            play();
            setImage("black-key-down.png");
            isDown = true;
        }
        if (isDown && !Greenfoot.isKeyDown(key))    {
            play();
            setImage("black-key.png");
            isDown = false;
        }
    }

    public void play()
    {
        Greenfoot.playSound(sound);
    }
}

