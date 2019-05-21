public class SelfArc {
    Ball b1;
    Ball b2;
    
    /**
    *
    * Constructor. Create a new instance of a DirectedArc.
    *
    * @param node1 This includes the position of the node, the line starts from.
    * @param node2 This includes the position of the node, the line ends at and where the arrow will be allocated.
    * @param arena The game arena to add this arrow to.
    *
    */

    public SelfArc(int x, int y)
    {

        b1 = new Ball (x, y, 20,"WHITE");
        b2 = new Ball (x, y, 16,"BLACK");

    }

    /**
    * Obtains the X coordinte of ball 1.
    * @return the X coordinte of the node within the GameArena.
    */

    public double getX1()
    {
        return b1.getXPosition();
    }

    /**
    * Obtains the y coordinte of the ball 1.
    * @return the y coordinte of the node within the GameArena.
    */

    public double getY1()
    {
        return b1.getYPosition();
    }

    /**
    * Obtains the X coordinte of ball 2.
    * @return the X coordinte of the node within the GameArena.
    */

       public double getX2()
    {
        return b1.getXPosition();
    }

    /**
    * Obtains the y coordinte of the ball 2.
    * @return the y coordinte of the node within the GameArena.
    */

    public double getY2()
    {
        return b1.getYPosition();
    }

    /**
    * Obtain the balls.
    * @return the ball within the GameArena.
    */

    public Ball getSelfArc1()
    { 
        return b1;                                                                   //ball becomes part of the SelfArc and is shown on the screen
    }
       public Ball getSelfArc2()
    { 
        return b2;                                                                   //ball becomes part of the SelfArc and is shown on the screen
    }

}