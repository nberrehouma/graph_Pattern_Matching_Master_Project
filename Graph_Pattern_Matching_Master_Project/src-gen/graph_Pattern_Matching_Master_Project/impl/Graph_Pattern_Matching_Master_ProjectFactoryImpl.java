/**
 */
package graph_Pattern_Matching_Master_Project.impl;

import graph_Pattern_Matching_Master_Project.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Graph_Pattern_Matching_Master_ProjectFactoryImpl extends EFactoryImpl
		implements Graph_Pattern_Matching_Master_ProjectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Graph_Pattern_Matching_Master_ProjectFactory init() {
		try {
			Graph_Pattern_Matching_Master_ProjectFactory theGraph_Pattern_Matching_Master_ProjectFactory = (Graph_Pattern_Matching_Master_ProjectFactory) EPackage.Registry.INSTANCE
					.getEFactory(Graph_Pattern_Matching_Master_ProjectPackage.eNS_URI);
			if (theGraph_Pattern_Matching_Master_ProjectFactory != null) {
				return theGraph_Pattern_Matching_Master_ProjectFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Graph_Pattern_Matching_Master_ProjectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph_Pattern_Matching_Master_ProjectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH:
			return createGraph();
		case Graph_Pattern_Matching_Master_ProjectPackage.VERTEX:
			return createVertex();
		case Graph_Pattern_Matching_Master_ProjectPackage.EDGE:
			return createEdge();
		case Graph_Pattern_Matching_Master_ProjectPackage.ENTRY:
			return createEntry();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex createVertex() {
		VertexImpl vertex = new VertexImpl();
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph_Pattern_Matching_Master_ProjectPackage getGraph_Pattern_Matching_Master_ProjectPackage() {
		return (Graph_Pattern_Matching_Master_ProjectPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Graph_Pattern_Matching_Master_ProjectPackage getPackage() {
		return Graph_Pattern_Matching_Master_ProjectPackage.eINSTANCE;
	}

} //Graph_Pattern_Matching_Master_ProjectFactoryImpl
