public class Node {

    Ball b;
    Text t;
    Node n;

    /**
    *
    * Constructor. Create a new instance of a Node.
    *
    * @param x The x co-ordinate in the GameArena where this node will be located.
    * @param y The y co-ordinate in the GameArena where this node will be located.
    * @param l The text to display on the node.
    *
    */

    public Node(int x, int y, String l)
    {
        int offsetX=-8,  offsetY=5;
        b = new Ball (x, y, 20,"BLUE");
        t = new Text (l,x+offsetX, y+offsetY, 19, "BLACK");

    }

    /**
    * Obtains the X coordinte of the node.
    * @return the X coordinte of the node within the GameArena.
    */

    public double getX()
    {
        return b.getXPosition();
    }

    /**
    * Obtains the y coordinte of the node.
    * @return the y coordinte of the node within the GameArena.
    */

    public double getY()
    {
        return b.getYPosition();
    }

    /**
    * Obtains the ball.
    * @return the ball within the GameArena.
    */

    public Ball getNode()
    { 
        return b;                                                                   //ball becomes part of the node and is shown on the screen
    }

    /**
    * Obtains the text on the ball.
    * @return the text within the GameArena.
    */

    public Text getText()
    {
        return t;                                                                   //text will appear on the node
    }

}