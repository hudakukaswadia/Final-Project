/**
 * Models Graph 4. 
 * This class represents Graph 4. When combined with the GameArena class,
 * instances of the Game5 class can be displayed on the screen.
 */

public class Game5
{
    // The following instance variables define the information needed to represent a Graph 4

    private int xPosition;                                              // The X coordinate - private class attribute
    private GameArena arena;                                            //Game Arena will add this arrow to
    private int yPosition;                                              // The y coordinate - private class attribute
    private Node[] nodes = new Node [4];                                //An array for nodes with array length = 4 
    private Text[] texts = new Text [4];                                //An array for texts with array length = 4
    private DirectedArc[] directedarcs = new DirectedArc [10];          //An array for directed arcs with array length = 10
    private SelfArc[] selfarcs = new SelfArc [10];                      //An array for directed arcs with array length = 10


    /**
    *
    * Constructor. Create a new instance of a Game5.
    *
    * @param x The X co-ordinate in the Game Arena where the node will be located.
    * @param y The Y co-ordinate in the Game Arena where the node will be located.
    * @param a The game arena to add this arrow to.
    *
    */

    public Game5 (int x, int y, GameArena a)
    {
        xPosition = x;
        arena = a;
        yPosition = y;

        //The x and y co-ordinates of the node and the text allocated in each.

        nodes[0] = new Node(x+150, y-90, "J");
        nodes[1] = new Node (x-180, y+270, "K");
        nodes [2] = new Node (x+150, y+700, "L");
        nodes [3] = new Node (x+450, y+270,  "M");

        //The connection between two nodes via a Directedarc.

        directedarcs [0] = new DirectedArc (nodes[1], nodes[0],a);
        directedarcs [1] = new DirectedArc (nodes[3], nodes [2],a);
        directedarcs [2] = new DirectedArc (nodes [2], nodes [1],a);
        directedarcs [3] = new DirectedArc (nodes [3], nodes[0],a);
        directedarcs [4] = new DirectedArc (nodes [0], nodes[3],a);

        //X and Y position of the self arc

        selfarcs [0] = new SelfArc (x-195, y+270);
        selfarcs [1] = new SelfArc (x+465, y+270);

        //A for loop has been created which in turn will then add Line on the screen.

        arena.addBall(selfarcs[0].getSelfArc1()); 
        arena.addBall(selfarcs[0].getSelfArc2());
        arena.addBall(selfarcs[1].getSelfArc1()); 
        arena.addBall(selfarcs[1].getSelfArc2());

        for (int i = 0; i<4; i++)   
        {
           arena.addLine(directedarcs[i].getLine());
        }    

        //A for loop has been created which in turn will then add Ball and the Text on the screen. 

        for (int i = 0; i<4; i++)  
        {
            arena.addBall(nodes[i].getNode());  
            arena.addText(nodes[i].getText());       
        }
       
        arena.update();                                     //All changes will now be implemented.
    }

    public static void main (String[] args) 
    {
        GameArena arena = new GameArena (1200, 1200);       //The size of the window has been allocated.
        
        int x =250;
        
        Game5[] game = new Game5[1];
        
        for (int i=0; i<1; i++)
        {
            game[i] = new Game5 (i*250 +250, 200, arena);    //Sets the initial value for the class attribute.
        }

    }   

}