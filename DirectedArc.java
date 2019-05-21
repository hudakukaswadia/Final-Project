public class DirectedArc {
    Line l;
    Arrow a;
    
    /**
    *
    * Constructor. Create a new instance of a DirectedArc.
    *
    * @param node1 This includes the position of the node, the line starts from.
    * @param node2 This includes the position of the node, the line ends at and where the arrow will be allocated.
    * @param arena The game arena to add this arrow to.
    *
    */

    public DirectedArc(Node node1, Node node2, GameArena arena)
    {
        l = new Line (node1.getX(), node1.getY(), node2.getX(), node2.getY(), 3, "WHITE");
        a = new Arrow (node1.getX(), node1.getY(), node2.getX(), node2.getY(), 5, "WHITE", arena);
    }

    /** 
    * Obtains the line.
    * @return the line.
    */

    public Line getLine()
    {
        return l;
    }

    /** 
    * Obtains the arrow.
    * @return the arrow a.
    */

    public Arrow getArrow()
    {
        return a;
    }
}