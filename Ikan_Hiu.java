 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ikan_Hiu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ikan_Hiu extends Actor
{
    /**
     * Act - do whatever the Ikan_Hiu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
        setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("right")){
        setLocation(getX()+5, getY());
        }
        
        Makanan a = (Makanan)getOneIntersectingObject(Makanan.class);
        if (a!=null){
        getWorld().removeObject(a);
        play.score.add(10);
        }
        Bom b = (Bom)getOneIntersectingObject(Bom.class);
        if (b!=null){
        getWorld().removeObject(b);
        play.health.add(-1);
        }
    }
}
