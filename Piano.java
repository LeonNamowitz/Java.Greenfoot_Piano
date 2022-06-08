import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 */
public class Piano extends World
{
    private String[] whiteKeys = { "a", "s", "d", "f", "g", "h", "j", "k", "l", "ö", "ä", "#" };
    private String[] whiteNotes = { "3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g" }; 
    private String[] blackKeys = { "w", "e", "", "t", "z","u", "", "o", "p", "", "+" };
    private String[] blackNotes = { "3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#" };

    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        makeWhiteKeys();
        makeBlackKeys();
    }

    public void makeWhiteKeys()
    {
        // int i = 0;
        // for (String whitekey : whiteKeys)
        // {
        //     Key key = new Key(whitekey, whiteNotes[i] + ".wav");
        //     addObject(key, i*63 + 54, 140);
        //     i += 1;
        // } 

        for (int i = 0; i < whiteKeys.length; i++)
        {
        Key key = new Key(whiteKeys[i], whiteNotes[i] + ".wav");
        addObject(key, i*63 + 54, 140);
        }
    }

    public void makeBlackKeys()
    {
        // int i = 0;
        // for (String blackkey : blackKeys)
        // {
        //     BlackKey key = new BlackKey(blackkey, blackNotes[i] + ".wav");
        //     addObject(key, 100, 86);
        //     i += 1;
        // } 

        for (int i = 0; i < blackKeys.length; i++)
        {
            if (!blackKeys[i].equals(""))   {
                BlackKey key = new BlackKey(blackKeys[i], blackNotes[i] + ".wav");
                addObject(key, i*85 + 54, 86);
            }
        }
    }
}