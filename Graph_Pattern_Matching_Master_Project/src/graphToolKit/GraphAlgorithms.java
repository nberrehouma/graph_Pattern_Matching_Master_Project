package graphToolKit;

import java.net.URI;
import java.util.Iterator;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.jgrapht.graph.AbstractBaseGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;

import graph_Pattern_Matching_Master_Project.Edge;
import graph_Pattern_Matching_Master_Project.Graph;
import graph_Pattern_Matching_Master_Project.Vertex;

public class GraphAlgorithms {

	public static void GraphtoString(Graph graph)

	{

	}

	/*
	 * converting EMF graph to tgrapht
	 */
	public static org.jgrapht.Graph<String, DefaultEdge> EMFtoTgraphT(Graph graph) {

		org.jgrapht.Graph<URI, DefaultEdge> g = new DefaultDirectedGraph<>(DefaultEdge.class);

		EList<Vertex> vertices = graph.getVertices();
		Iterator<Vertex> verticesIt = vertices.iterator();
		while (verticesIt.hasNext()) {
			Vertex vertex = verticesIt.next();

		}

		EList<Edge> edges = graph.getEdges();
		Iterator<Edge> edgeIt = edges.iterator();
		while (edgeIt.hasNext()) {
			Edge edge = edgeIt.next();

		}

		// to complete
		return null;
	}

	/*
	 * converting tgrapht to EMF graph
	 */
	public static Graph tgraphToEMF(org.jgrapht.Graph<String, DefaultEdge> graph) {
		// to complete
		return null;
	}

	/*
	 * random permutation generation from 1 to n
	 */
	public static void randomPermutation(int n, Random ran, int perm[]) {
		int i, j, k;
		for (i = 1; i <= n; i++)
			perm[i] = i;
		for (i = 1; i <= n; i++) {
			j = (int) (i + ran.nextDouble() * (n + 1 - i));
			k = perm[i];
			perm[i] = perm[j];
			perm[j] = k;
		}
	}

	public static int randomGraph(int n, int m, long seed, boolean simple, boolean directed, boolean acyclic,
			boolean weighted, int minweight, int maxweight, int nodei[], int nodej[], int weight[]) {
		int maxedges, nodea, nodeb, numedges, temp;
		int dagpermute[] = new int[n + 1];
		boolean adj[][] = new boolean[n + 1][n + 1];
		Random ran = new Random(seed);
		// initialize the adjacency matrix
		for (nodea = 1; nodea <= n; nodea++)
			for (nodeb = 1; nodeb <= n; nodeb++)
				adj[nodea][nodeb] = false;

		numedges = 0;
		// check for valid input data
		if (simple) {
			maxedges = n * (n - 1);
			if (!directed)
				maxedges /= 2;
			if (m > maxedges)
				return 1;
		}
		if (acyclic) {
			maxedges = (n * (n - 1)) / 2;
			if (m > maxedges)
				return 1;
			randomPermutation(n, ran, dagpermute);
		}

		while (numedges < m) {

			nodea = ran.nextInt(n) + 1;
			nodeb = ran.nextInt(n) + 1;
			if (simple || acyclic)
				if (nodea == nodeb)
					continue;
			if ((simple && (!directed)) || acyclic)
				if (nodea > nodeb) {
					temp = nodea;
					nodea = nodeb;
					nodeb = temp;
				}
			if (acyclic) {
				nodea = dagpermute[nodea];
				nodeb = dagpermute[nodeb];
			}
			if ((!simple) || (simple && (!adj[nodea][nodeb]))) {
				numedges++;
				nodei[numedges] = nodea;
				nodej[numedges] = nodeb;
				adj[nodea][nodeb] = true;
				if (weighted)
					weight[numedges] = (int) (minweight + ran.nextDouble() * (maxweight + 1 - minweight));
			}
		}
		return 0;
	}

	/*
	 * generating tgrapht from matrix representation
	 */

	public static org.jgrapht.Graph<Integer, DefaultEdge> randomGraphT(int n, int m, long seed, boolean simple,
			boolean directed, boolean acyclic, boolean weighted, int minweight, int maxweight) {

		int nodei[] = new int[m + 1];
		int nodej[] = new int[m + 1];
		int weight[] = new int[m + 1];
		int result = randomGraph(n, m, seed, simple, directed, acyclic, weighted, minweight, maxweight, nodei, nodej,
				weight);
		if (result != 0) {
			System.out.println("error");
			return null;
		}
		// graph now is defined as follow
		// nodei[] sources , nodej targets , weight wieghts
		AbstractBaseGraph g;

//		if(simple) {
//			
//		}
//		else
//			if(directed) {
//				
//			}
//			else
//				if(weighted) {
//					
//				}
		g = new DefaultDirectedWeightedGraph(DefaultWeightedEdge.class);

		for (int i = 1; i <= n; i++) {
			g.addVertex(new Integer(i));
		}
		for (int i = 1; i <= m; i++) {

			DefaultWeightedEdge e = (DefaultWeightedEdge) g.addEdge(new Integer(nodei[i]), new Integer(nodej[i]));
			g.setEdgeWeight(e, weight[i]);

		}
		return g;
	}

	public static void main(String args[]) {
		int k;
		int n = 5;
		int m = 8;
		long seed = 1;
		boolean simple = true, directed = false, acyclic = false, weighted = true;
		int minweight = 90;
		int maxweight = 99;
		int nodei[] = new int[m + 1];
		int nodej[] = new int[m + 1];
		int weight[] = new int[m + 1];
		k = randomGraph(n, m, seed, simple, directed, acyclic, weighted, minweight, maxweight, nodei, nodej, weight);
		if (k != 0)
			System.out.println("Invalid input data, error code = " + k);
		else {
			System.out.println("List of edges:\n from to weight");
			for (k = 1; k <= m; k++)
				System.out.println(" " + nodei[k] + " " + nodej[k] + " " + weight[k]);
		}

		DefaultDirectedWeightedGraph g = (DefaultDirectedWeightedGraph) randomGraphT(n, m, seed, simple, directed,
				acyclic, weighted, minweight, maxweight);
		System.out.println(g.toString());
		Iterator<DefaultWeightedEdge> it = g.edgeSet().iterator();
		while (it.hasNext()) {
			DefaultWeightedEdge defaultWeightedEdge = it.next();
			System.out.println(g.getEdgeWeight(defaultWeightedEdge));
		}

	}

}
