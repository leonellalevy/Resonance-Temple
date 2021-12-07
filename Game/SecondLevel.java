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
        super(800, 800, 1);
        //showMelody();
        prepare();
    }

    //private void showMelody(){
    //    showText("Melody:",200,320); 
    //    for (int i=0; i< melody.length; i++){
    //        showText (" " +melody[i], 300 + i*50,  320);
    //   }
    //}
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
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bob bob = new Bob();
        addObject(bob,50,151);
        Lever lever = new Lever();
        addObject(lever,443,167);
        lever.setLocation(426,161);
        lever.setLocation(221,139);
        lever.setLocation(223,169);
        Lever lever2 = new Lever();
        addObject(lever2,367,145);
        lever2.setLocation(346,175);
        Lever lever3 = new Lever();
        addObject(lever3,500,146);
        lever3.setLocation(468,178);
        lever.setLocation(209,173);
        lever2.setLocation(306,175);
        lever3.setLocation(437,174);
        Lever lever4 = new Lever();
        addObject(lever4,604,158);
        lever4.setLocation(551,173);
        Lever lever5 = new Lever();
        addObject(lever5,704,152);
        lever5.setLocation(670,172);
        lever.setLocation(200,175);
        lever2.setLocation(315,177);
        lever3.setLocation(434,175);
        lever4.setLocation(551,177);
        lever5.setLocation(677,176);
        Book book = new Book();
        addObject(book,309,408);
        book.setLocation(453,524);
    }
}
