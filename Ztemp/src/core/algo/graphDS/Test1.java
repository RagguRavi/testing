package core.algo.graphDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
	public static void main(String [] args) {
		//https://www.geeksforgeeks.org/graph-and-its-representations/
		
		int[][] matrix = getAdjacencyMatrix(5);
		for(int[] mat: matrix) {
			System.out.println(Arrays.toString(mat));
		}
		
		ArrayList<ArrayList<Integer>> list = getAdjacencyList(5);
		for(int i=0;i<list.size();i++) {
			System.out.println(i+" ---> "+list.get(i));
		}
	}
	
	public static int[][] getAdjacencyMatrix(int v) {
		
		int [][] matrix = new int[v][v];
		
		addEdge2(0, 1, matrix);
		addEdge2(0, 4, matrix);
		addEdge2(1, 2, matrix);
		addEdge2(1, 4, matrix);
		addEdge2(1, 3, matrix);
		addEdge2(2, 3, matrix);
		addEdge2(3, 4, matrix);
		
		return matrix;
	}
	
	static void addEdge2(int source, int dest,int[][] matrix) {
		matrix[source][dest] = 1;
		matrix[dest][source] = 1;
	}
	
	public static ArrayList<ArrayList<Integer>> getAdjacencyList(int v) {
		
		ArrayList<ArrayList<Integer>> adjacentList = new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++) {
			adjacentList.add(new ArrayList<Integer>());
		}
		
		addEdge2(0, 1, adjacentList);
		addEdge2(0, 4, adjacentList);
		addEdge2(1, 2, adjacentList);
		addEdge2(1, 4, adjacentList);
		addEdge2(1, 3, adjacentList);
		addEdge2(2, 3, adjacentList);
		addEdge2(3, 4, adjacentList);
		
		return adjacentList;
	}
	
	public static void addEdge2(int source,int destination,ArrayList<ArrayList<Integer>> list) {
		list.get(source).add(destination);
		list.get(destination).add(source);
	}
}
