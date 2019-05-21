/**
 * Models Graph 2. 
 * This class represents Graph 2. When combined with the GameArena class,
 * instances of the Game3 class can be displayed on the screen.
 */

public class Game3
{
    // The following instance variables define the information needed to represent a Graph 2

    private int xPosition;                  // The X coordinate - private class attribute
    private GameArena arena;                //Game Arena will add this arrow to
    private int yPosition;                  // The y coordinate - private class attribute
    private Node [] nodes = new Node [5];   //An array for nodes with array length = 5 
    private Arc [] arcs = new Arc [10];     //An array for arcs with array length = 10
    private Text [] texts = new Text [5];   //An array for texts with array length = 5

    /**
    *
    * Constructor. Create a new instance of a Game2.
    *
    * @param x The X co-ordinate in the Game Arena where the node will be located.
    * @param y The Y co-ordinate in the Game Arena where the node will be located.
    * @param a The game arena to add this arrow to.
    *
    */

    public Game3 (int x, int y, GameArena a)
    {
        xPosition = x;
        arena = a;
        yPosition = y;

        //The x and y co-ordinates of the node and the text allocated in each.

        nodes [0] = new Node(x+20, y-90, "E");
        nodes [1] = new Node (x+200, y+60, "F");
        nodes [2] = new Node (x-110, y+230, "H");
        nodes [3] = new Node (x+110, y+230, "G");
        nodes [4] = new Node (x-180, y+60, "I");

        //The connection between two nodes via an arc.

        arcs [0] = new Arc (nodes [0], nodes [1]);
        arcs [1] = new Arc (nodes [1], nodes [3]);
        arcs [2] = new Arc (nodes [3], nodes [2]);
        arcs [3] = new Arc (nodes [2], nodes [0]);
        arcs [4] = new Arc (nodes [0], nodes [4]);
        arcs [5] = new Arc (nodes [1], nodes [4]);
        arcs [6] = new Arc (nodes [0], nodes [3]);
        arcs [7] = new Arc (nodes [2], nodes [1]);
        arcs [8] = new Arc (nodes [2], nodes [4]);
        arcs [9] = new Arc (nodes [3], nodes [4]);
        
        //A for loop has been created which in turn will then add Line on the screen.

        for (int i = 0; i<10; i++)   
        {
            arena.addLine(arcs[i].getLine());
        }

        //A for loop has been created which in turn will then add Ball and the Text on the screen.
             
        for (int i = 0; i<5; i++)   
        {
            arena.addBall(nodes[i].getNode());
            arena.addText(nodes[i].getText()); 
        }
        arena.update();                                         //All changes will now be implemented.
    }

    public static void main (String[] args) 
    {
        GameArena arena = new GameArena (1200, 1200);           //The size of the window has been allocated.
        
        int x =250;
        
        Game3[] game = new Game3[1];

        for (int i=0; i<1; i++)
        {
            game[i] = new Game3 (i*250 +250, 200, arena);
        }

    }   
}