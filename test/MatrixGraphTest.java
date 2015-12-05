/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author C_Train
 */
public class MatrixGraphTest {
    
    public MatrixGraphTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isEdge method, of class MatrixGraph.
     */
    @Test
    public void testIsEdge() {
        System.out.println("isEdge");
        int source = 0;
        int dest = 0;
        MatrixGraph instance = null;
        boolean expResult = false;
        boolean result = instance.isEdge(source, dest);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class MatrixGraph.
     */
    @Test
    public void testMatrixGraph() {
        System.out.println("matrix methods test");
        Edge edge0 = new Edge(0,3);
        Edge edge1 = new Edge(0,2);
        Edge edge2 = new Edge(0,1);
        Edge edge3 = new Edge(1,2);
        Edge edge4 = new Edge(2,4);
        MatrixGraph mg = new MatrixGraph(5, true);
        mg.insert(edge0);
        mg.insert(edge1);
        mg.insert(edge2);
        mg.insert(edge3);
        mg.insert(edge4);
        
        System.out.println(mg.toString());
        
        mg.remove(edge1);
        
        System.out.println(mg.toString());
        
        System.out.println(" (0,1) is an edge "+mg.isEdge(0, 1));
        System.out.println(" (2,4) is an edge "+mg.isEdge(2, 4));
        System.out.println(" (0,2) is an edge "+mg.isEdge(0, 2));
        
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class MatrixGraph.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Edge edge = null;
        MatrixGraph instance = null;
        instance.remove(edge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of breadthFirstTraversal method, of class MatrixGraph.
//     */
//    @Test
//    public void testBreadthFirstTraversal() {
//        System.out.println("breadthFirstTraversal");
//        int start = 0;
//        MatrixGraph instance = null;
//        instance.breadthFirstTraversal(start);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of depthFirstTraversal method, of class MatrixGraph.
//     */
//    @Test
//    public void testDepthFirstTraversal() {
//        System.out.println("depthFirstTraversal");
//        int start = 0;
//        MatrixGraph instance = null;
//        instance.depthFirstTraversal(start);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
