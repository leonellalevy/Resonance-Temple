import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueJewel here.
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class BlueJewel extends Actor
{
    private int timer=0;
    public void act(){
        timer++;
        if(timer==30){
            int rnd = Greenfoot.getRandomNumber(4);
            if(rnd==0){
                setLocation(getX()+60, getY());
            }
            else if(rnd==1){
                setLocation(getX()-60, getY());
            }
            else if(rnd==2){
                setLocation(getX(), getY() + 60);
            }
            else if(rnd==3){
                setLocation(getX(), getY() - 60);
            }
            timer=0;
        }
    }
}
