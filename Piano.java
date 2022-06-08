import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 */
public class Piano extends World
{
    private String[] whiteKeys = { "a", "s", "d", "f", "g", "h", "j", "k", "l", "ö", "ä", "#" };
    private String[] whiteNotes = { "3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g" }; 

    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        prepare();
    }

    public void prepare()
    {
        // for (int i = 54; i < (54 + (63*12)); i += 63) {
            
        //     addObject(new Key("g", "3a.wav"), i, 140);
        // }
        // addObject(new Key("a", "3a.wav"), 300, 180);
        int i = 0;
        for (String whitekey : whiteKeys)
        {
            Key key = new Key(whitekey, whiteNotes[i] + ".wav");
            addObject(key, i*63 + 54, 140);
            i += 1;
        } 
    }
}