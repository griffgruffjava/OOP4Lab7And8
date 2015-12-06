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
public class AdjacencyListsTest {
    
    public AdjacencyListsTest() {
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
     * Test of isEdge method, of class AdjacencyLists.
     */
//    @Test
//    public void testIsEdge() {
//        System.out.println("isEdge");
//        int source = 0;
//        int dest = 0;
//        AdjacencyLists instance = null;
//        boolean expResult = false;
//        boolean result = instance.isEdge(source, dest);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of insert method, of class AdjacencyLists.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
         Edge edge0 = new Edge(0,3);
        Edge edge1 = new Edge(0,2);
        Edge edge2 = new Edge(0,1);
        Edge edge3 = new Edge(1,2);
        Edge edge4 = new Edge(2,4);
        AdjacencyLists al = new AdjacencyLists(5, false);
//        MatrixGraph mg = new MatrixGraph(5, true);
        al.insert(edge0);
        al.insert(edge1);
        al.insert(edge2);
        al.insert(edge3);
        al.insert(edge4);
        System.out.println(al.toString());
        
        System.out.println(" (0,1) is an edge "+al.isEdge(0, 1));
        System.out.println(" (2,4) is an edge "+al.isEdge(2, 4));
        System.out.println(" (0,2) is an edge "+al.isEdge(0, 2));
        System.out.println(" (0,4) is an edge "+al.isEdge(0, 4));
        
        al.remove(edge2);
        System.out.println(" (0,1) is an edge "+al.isEdge(1,0));

//        al.breadthFirstTraversal(0);
    }
    
    @Test
    public void breadthFirstTraversalTest()
    {
        System.out.println("breadthFirstTraversal test");
        Edge edge0 = new Edge(0,1);
        Edge edge1 = new Edge(0,3);
        Edge edge2 = new Edge(0,4);
        Edge edge3 = new Edge(0,2);
        Edge edge4 = new Edge(1,3);
        Edge edge5 = new Edge(1,4);
        Edge edge6 = new Edge(2,5);
        Edge edge7 = new Edge(2,6);
        Edge edge8 = new Edge(5,6);
        Edge edge9 = new Edge(3,4);
        
        AdjacencyLists al = new AdjacencyLists(7, false);
        al.insert(edge0);
        al.insert(edge1);
        al.insert(edge2);
        al.insert(edge3);
        al.insert(edge4);
        al.insert(edge5);
        al.insert(edge6);
        al.insert(edge7);
        al.insert(edge8);
        al.insert(edge9);
        
//        mg.breadthFirstTraversal(0);
//        System.out.println(mg.toString());
        
//        mg.breadthFirstTraversal(4);
        
        al.breadthFirstTraversal(4);
        System.out.println("");
        al.depthFirstTraversal(4);
    }

    /**
     * Test of remove method, of class AdjacencyLists.
     */
//    @Test
//    public void testRemove() {
//        System.out.println("remove");
//        Edge edge = null;
//        AdjacencyLists instance = null;
//        instance.remove(edge);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
