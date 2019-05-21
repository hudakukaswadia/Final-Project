/**
 * Models Graph 1. 
 * This class represents Graph 1. When combined with the GameArena class,
 * instances of the Game2 class can be displayed on the screen.
 */

public class Game2
{

    // The following instance variables define the information needed to represent a Graph 1

    private int xPosition;                  // The X coordinate - private class attribute
    private GameArena arena;                //Game Arena will add this arrow to 
    private int yPosition;                  // The y coordinate - private class attribute
    private Node[] nodes = new Node [4];    //An array for nodes with array length = 4 
    private Arc[] arcs = new Arc [4];       //An array for arcs with array length = 4 
    private Text[] texts = new Text [4];    //An array for texts with array length = 4 

    /**
    *
    * Constructor. Create a new instance of a Game2.
    *
    * @param x The X co-ordinate in the Game Arena where the node will be located.
    * @param y The Y co-ordinate in the Game Arena where the node will be located.
    * @param a The game arena to add this arrow to.
    *
    */

    public Game2 (int x, int y, GameArena a)
    {
        xPosition = x;
        arena = a;
        yPosition = y;

        //The x and y co-ordinates of the node and the text allocated in each.

        nodes[0] = new Node(x-60, y, "A");
        nodes[1] = new Node (x-60, y+130, "C");
        nodes [2] = new Node (x+60, y, "B");
        nodes [3] = new Node (x+60, y+130,  "D");

        //The connection between two nodes via an arc.

        arcs [0] = new Arc (nodes[0], nodes[1]);
        arcs [1] = new Arc (nodes[1], nodes [3]);
        arcs [2] = new Arc (nodes [3], nodes [2]);
        arcs [3] = new Arc (nodes [2], nodes[0]);

        //A for loop has been created which in turn will then add Line on the screen.

        for (int i = 0; i<4; i++)   
        {
           arena.addLine(arcs[i].getLine());
        } 

        //A for loop has been created which in turn will then add Ball and the Text on the screen.
             
        for (int i = 0; i<4; i++)    
        {
            arena.addBall(nodes[i].getNode());  
            arena.addText(nodes[i].getText());       
        }

        arena.update();                                         //All changes will now be implemented.
    }
       
    public static void main (String[] args) 
    {
        GameArena arena = new GameArena (1200, 500);            //The size of the window has been allocated.
        
        int x =250;
        
        Game2[] game = new Game2[1];
        
        for (int i=0; i<1; i++)
        {
            game[i] = new Game2 (i*250 +250, 200, arena);       //Sets the initial value for the class attribute.
        }
    }   
}