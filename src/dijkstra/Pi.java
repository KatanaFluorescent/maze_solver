package dijkstra;

import java.util.Hashtable;

/* This class just implements the interface PiInterface, using HashTables. 
See the interface PiInterface for further explanation on what the methods do.
We use super methods for implementing the methods needed.
*/

public final class Pi extends Hashtable<VertexInterface, Integer> implements PiInterface {

    private final GraphInterface g;

    public Pi(GraphInterface g) {
        super();
        this.g = g;
    }

    public final int getPi(VertexInterface v) {
        return super.get(v).intValue();
    }

    public final void writePi(VertexInterface v, int x) {
        super.remove(v);
        super.put(v, new Integer(x));
    }

    public final void initializePi(VertexInterface v) {
        writePi(v, 0); //the departure gets its value initalized at 0
        for (VertexInterface v1 : g.getVerticies()) {
            if (v1 != v) {
                writePi(v1, Integer.MAX_VALUE); //Integer.MAX_VALUE represents + infinity
            }
        }
    }
}
