
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


/**
 * ***************************************************
 *    Title: MatrixGraph.java
 *    Author: Koffman and Wolfgang
 *    Site owner/sponsor: wiley.com
 *    Date: 21/04/2010
 *    Code version:
 *    Availability: http://eu.wiley.com/WileyCDA/WileyTitle/productCd-EHEP001607.html(Accessed November 2014)- Only available to Instructors
 *    Modified:  No
 ****************************************************
 */

public class MatrixGraph extends AbstractGraph {
    //entries in matrix are 1.0 or 0.0
    //1.0 indicates an edge.
    //0.0 indicates no edge

    private double[][] matrix;

    public MatrixGraph(int nV, boolean direct) {
        super(nV, direct);
        matrix = new double[nV][nV];
        for (int row = 0; row < nV; row++) {
            for (int col = 0; col < nV; col++) {
                matrix[row][col] = 0.0;
            }
        }
    }

    public boolean isEdge(int source, int dest) {
        //complete this method
        return matrix[source][dest] != 0.0;
    }

    public void insert(Edge edge) {
        //complete this method
        // if graph is undirected, insert two edges
        // otherwise, insert just one edge 
        int s = edge.getSource();
        int d = edge.getDestination();
        matrix[s][d] = 1;
        if (!super.isDirected()) {
            matrix[d][s] = 1;
        }
    }

    public void remove(Edge edge) {
        //complete this method
        // as for insert method
        int s = edge.getSource();
        int d = edge.getDestination();
        matrix[s][d] = 0;
        if (!super.isDirected()) {
            matrix[d][s] = 0;
        }
    }

    public void breadthFirstTraversal(int start) {
        //Output the vertices in breadth first order
        String[] markedAs = new String[this.getNumVertices()]; 
        
        for(int i=0; i<this.getNumVertices(); i++)
        {
            markedAs[i] = "not_visited";
        }
        
        Deque<Integer> myQueue = new LinkedList<Integer>();
        markedAs[start]="waiting";
        myQueue.add(start);
        
        while(myQueue.size()>0)
        {
            System.out.println("Queue is now "+ myQueue.toString());
            int vertex = myQueue.removeFirst();
            markedAs[vertex] = "visited";
            for(int j=0; j<this.getNumVertices(); j++)
            {
                if(matrix[vertex][j]==1)
                {
                    if(markedAs[j]=="not_visited")
                    {
                        markedAs[j]="waiting";
                        myQueue.add(j);
                    }
                }
            }
            
        }
        
        
    }

    public void depthFirstTraversal(int start) {
        //Output the vertices in depth first order
        
    }

    public String toString() {
        
        String output = "";
        
        for (int row = 0; row < super.getNumVertices(); row++) {
            for (int col = 0; col < super.getNumVertices(); col++) {
                if(matrix[row][col] == 0.0)
                {
                    output += "0"+" ";
                }
                else
                {
                    output += "1"+" ";
                }
            }
            output += "\n";
        }
        
        return output;
        
    }
}
