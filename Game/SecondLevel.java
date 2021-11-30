import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecondLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecondLevel extends World
{
    private int points = 0;
    private int trials = 3;
    
    private String [] melody = {"C", "C", "D", "C", "F", "E"};
    private String [] melody_keyboard = {"A", "A", "S", "A", "F", "D"};
    /**
     * Constructor for objects of class SecondLevel.
     * 
     */
    public SecondLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        showMelody();
    }
    private void showMelody(){
        showText("Melody:",200,320); 
        for (int i=0; i< melody.length; i++){
            showText (" " +melody[i], 300 + i*50,  320);
        }
    }
    /*public void checkMelody(Key k){
        if(points==0&& k.getKey().equals(melody_keyboard[0])){
        points++; 
    }
    else if (points==1&& k.getKey().equals(melody_keyboard[1])){
        points++;
    }
    else if (points==2&& k.getKey().equals(melody_keyboard[2])){
        points++;
    }
    else if (points==3&& k.getKey().equals(melody_keyboard[3])){
        points++;
    }
    else if (points==4&& k.getKey().equals(melody_keyboard[4])){
        points++;
    }
    else if (points==5&& k.getKey().equals(melody_keyboard[5])){
        points++;
    }
    else {
        trials--;
        points=0;
    }
        if(points==6){
        showText("WIN", 100, 320);
        Greenfoot.stop(); 
    }
        if(trials==0){
        showText("LOSE", 100, 320);
        Greenfoot.stop(); 
    }
    }*/
}
