public class Arc {
    Line l;
    
    /**
    *
    * Constructor. Create a new instance of a DirectedArc.
    *
    * @param node1 This includes the position of the node, the line starts from.
    * @param node2 This includes the position of the node, the line ends at and where the arrow will be allocated.
    *
    */

    public Arc(Node node1, Node node2)
    {
        l = new Line (node1.getX(), node1.getY(), node2.getX(), node2.getY(), 3, "WHITE");
    }

    /** 
    * Obtains the line.
    * @return the line.
    */

    public Line getLine()
    {
        return l;
    }
}