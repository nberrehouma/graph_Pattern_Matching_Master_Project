package graphToolKit;

import org.jgrapht.graph.*;

import java.net.URI;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.jgrapht.*;

import org.jgrapht.io.*;
import org.jgrapht.traverse.*;

import graph_Pattern_Matching_Master_Project.Edge;
import graph_Pattern_Matching_Master_Project.Graph;
import graph_Pattern_Matching_Master_Project.Vertex;

public  class GraphAlgorithms {
	
	public static void GraphtoString(Graph graph) 
	
	{
		
		
	}  
	

	public static org.jgrapht.Graph<String, DefaultEdge> EMFtoTgraphT(Graph graph) 
	{
		
		org.jgrapht.Graph<URI, DefaultEdge> g = new DefaultDirectedGraph<>(DefaultEdge.class);
		
		 EList<Vertex> vertices = graph.getVertices();
		 Iterator<Vertex> verticesIt = vertices.iterator();
		 while (verticesIt.hasNext()) {
			Vertex vertex = (Vertex) verticesIt.next();
			
		}
		 
		 
		 EList<Edge> edges = graph.getEdges();
		 Iterator<Edge> edgeIt = edges.iterator();
		 while (edgeIt.hasNext()) {
			Edge edge = (Edge) edgeIt.next();
			
		}
		
		 
		return null;
	}
	
	
	public static Graph tgraphToEMF (org.jgrapht.Graph<String, DefaultEdge> graph) 
	{
		
		return null;
	}
	
	

}
