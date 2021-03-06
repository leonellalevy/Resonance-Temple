import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the main character , Bob in level 3
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Bob3 extends SmoothMover
{
    GreenfootImage ActorRight = new GreenfootImage("Explore2.png");
    GreenfootImage ActorLeft = new GreenfootImage("ExploreLeft.png");
    GreenfootImage ActorWeaponRight = new GreenfootImage("CharWithGunRight.png");
    GreenfootImage ActorWeaponLeft = new GreenfootImage("CharWithGunLeft.png");
    private static final int gunReloadTime = 5; 
    private int reloadDelayCount; 
    
    boolean isImageSet = false;
    private int rotation = 0;
    public int jewels;
    /**
     * Act - do whatever the Bob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bob3()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*1/7, image.getHeight()*1/7);
        
        ActorRight.scale(ActorRight.getWidth()*1/7, ActorRight.getHeight()*1/7);
        ActorLeft.scale(ActorLeft.getWidth()*1/7, ActorLeft.getHeight()*1/7);
        ActorWeaponRight.scale(ActorWeaponRight.getWidth()*1/7, ActorWeaponRight.getHeight()*1/7);
        ActorWeaponLeft.scale(ActorWeaponLeft.getWidth()*1/7, ActorWeaponLeft.getHeight()*1/7);
        setImage(image);
        
        reloadDelayCount = 5;
        addToVelocity(new Vector(13, 0.7));
        
        jewels=0;
    }
    public void act()
    {
        shift();
        lookForDiamonds();
        
        if (isTouching(Weapon2.class)){
            changeimage(ActorWeaponRight);
        }
        reloadDelayCount++;
    }
    private void changeimage(GreenfootImage Image)
    {
        setImage(Image);
        isImageSet = true;
    }
    private void shift()
    {
        moveNoGun();
        moveWithGun();
        addKing();
        if(isTouching(Skeleton2.class))
        {
            ThirdLevel thirdLevel= (ThirdLevel)getWorld();
            thirdLevel.removeLives();
            removeTouching(Skeleton2.class);
        }
        if(isTouching(KingSkeleton.class))
        {
            Greenfoot.setWorld (new Die());
        }
        if (Greenfoot.isKeyDown("space") && isImageSet)
        {
            fire(rotation);
            Greenfoot.playSound("gun.aiff");
        } 
    }
    private void moveNoGun(){
        if (Greenfoot.isKeyDown("up")&&!isImageSet) {
            setLocation(getX(), getY() - 3);
            rotation =270;
        }
        else if (Greenfoot.isKeyDown("down")&&!isImageSet) {
            setLocation(getX(), getY() + 3);
            rotation = 90;
        }
        else if (Greenfoot.isKeyDown("right")&&!isImageSet) {
            setImage(ActorRight);
            setLocation(getX() + 3, getY());
            rotation = 0;
        }
        else if (Greenfoot.isKeyDown("left")&&!isImageSet) {
            setImage(ActorLeft);
            setLocation(getX() - 3, getY());
            rotation = 180;
        }
    }
    private void moveWithGun(){
        if (Greenfoot.isKeyDown("up")&&isImageSet) {
            setLocation(getX(), getY() - 3);
            rotation =270;
        }
        else if (Greenfoot.isKeyDown("down")&&isImageSet) {
            setLocation(getX(), getY() + 3);
            rotation = 90;
        }
        else if (Greenfoot.isKeyDown("right")&&isImageSet) {
            setImage(ActorWeaponRight);
            setLocation(getX() + 3, getY());
            rotation = 0;
        }
        else if (Greenfoot.isKeyDown("left")&&isImageSet) {
            setImage(ActorWeaponLeft);
            setLocation(getX() - 3, getY());
            rotation = 180;
        }
    }
    public void lookForDiamonds(){
        if (isTouching(BlueJewel.class)){
            removeTouching(BlueJewel.class);
            FirstLevel firstLevel= (FirstLevel)getWorld();
            firstLevel.removeJewels();
        }    
        if (isTouching(GreenJewel.class)){
            removeTouching(GreenJewel.class);
            FirstLevel firstLevel= (FirstLevel)getWorld();
            firstLevel.removeJewels();
        }
        if (isTouching(RedJewel.class)){
            removeTouching(RedJewel.class);
            FirstLevel firstLevel= (FirstLevel)getWorld();
            firstLevel.removeJewels();
        }
    }
    private void fire(int rotation)
    {
        if (reloadDelayCount >= gunReloadTime) 
        {
            BulletGun bulletGun = new BulletGun (getVelocity(), rotation);
            getWorld().addObject (bulletGun, getX(), getY());
            bulletGun.move ();
            reloadDelayCount = 0;
        }
    }
    public void addKing(){
        int timer = ((ThirdLevel) getWorld()).timer;
        if (timer==1500){
            getWorld().showText("KILL IT!!!", 400, 400);
            getWorld().addObject(new KingSkeleton(),1,1);
        }
    }
}
