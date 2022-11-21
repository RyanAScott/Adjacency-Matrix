import java.util.ArrayList;

public class Graph {
    /* Making Headers for the graph
     * Think of a legend on a map
     */
    ArrayList<Node> nodes;


    int[][] matrix;

    Graph(int size){
        nodes = new ArrayList<>();// For the Headers
        matrix = new int[size][size]; // My biggest question here is, can this support objects?
    }// Graph

    // This function's sole purpose is creating the headers
    public void addNode(Node node){
        nodes.add(node);
    }// addNode

    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }// addEdge

    public boolean checkEdge(int src, int dst){
        if(matrix[src][dst] == 1){
            return true;
        }// if
        else {
            return false;
        }// else
    }// checkEdge

    public void print(){
        // Print Headers first
        System.out.print("  ");// Spacing added for formatting
        for(Node node : nodes){
            System.out.print(node.data + " ");
        }// for
        System.out.println();
        
        for(int i = 0; i < matrix.length; i++){
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }// for
            System.out.println();
        }// for
    }// print
}// Graph Class
