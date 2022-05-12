import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach. They like sand worms 
 * (very yummy, especially the green ones).
 * 
 * Version: 2
 * 
 * In this version, the crab walks around the beach more or less randomly.
 */

public class Crab extends Animal
{
    /** 
     * Act - do whatever the crab wants to do. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        
        checkKeypress();
        move();
        lookForWorm();
        randomTurn();
        turnAtEdge();
        /**
         *  Comprueba su hemos encontrado un gusano
         * So lo hemos visto nos lo comomenos sono no hacemos nada
         * 
         */
        
        
    }
    public void checkKeypress()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
    }
    public void lookForWorm()
    {
        if ( canSee(Worm.class))
        {
            eat(Worm.class);
            Greenfoot.playSound("slurp.wav");
        }
    }
    
    public void randomTurn()
    {
        
    }
    public void turnAtEdge()
    {
        
    }
}