/**
 */
package graph_Pattern_Matching_Master_Project;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectFactory
 * @model kind="package"
 * @generated
 */
public interface Graph_Pattern_Matching_Master_ProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graph_Pattern_Matching_Master_Project";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.univ-guelma.dz/graph_Pattern_Matching_Master_Project";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graph_Pattern_Matching_Master_Project";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Graph_Pattern_Matching_Master_ProjectPackage eINSTANCE = graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link graph_Pattern_Matching_Master_Project.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_Pattern_Matching_Master_Project.impl.GraphImpl
	 * @see graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__EDGES = 0;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__VERTICES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NAME = 2;

	/**
	 * The feature id for the '<em><b>Direct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__DIRECT = 3;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Is Connected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___IS_CONNECTED = 0;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link graph_Pattern_Matching_Master_Project.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_Pattern_Matching_Master_Project.impl.VertexImpl
	 * @see graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 1;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NAME = 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__ENTRIES = 2;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graph_Pattern_Matching_Master_Project.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_Pattern_Matching_Master_Project.impl.EdgeImpl
	 * @see graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ENTRIES = 4;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graph_Pattern_Matching_Master_Project.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_Pattern_Matching_Master_Project.impl.EntryImpl
	 * @see graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link graph_Pattern_Matching_Master_Project.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the reference list '{@link graph_Pattern_Matching_Master_Project.Graph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edges</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Graph#getEdges()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Edges();

	/**
	 * Returns the meta object for the reference list '{@link graph_Pattern_Matching_Master_Project.Graph#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vertices</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Graph#getVertices()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Vertices();

	/**
	 * Returns the meta object for the attribute '{@link graph_Pattern_Matching_Master_Project.Graph#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Graph#getName()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Name();

	/**
	 * Returns the meta object for the attribute '{@link graph_Pattern_Matching_Master_Project.Graph#isDirect <em>Direct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direct</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Graph#isDirect()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Direct();

	/**
	 * Returns the meta object for the '{@link graph_Pattern_Matching_Master_Project.Graph#isConnected() <em>Is Connected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Connected</em>' operation.
	 * @see graph_Pattern_Matching_Master_Project.Graph#isConnected()
	 * @generated
	 */
	EOperation getGraph__IsConnected();

	/**
	 * Returns the meta object for class '{@link graph_Pattern_Matching_Master_Project.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the reference '{@link graph_Pattern_Matching_Master_Project.Vertex#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Vertex#getGraph()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Graph();

	/**
	 * Returns the meta object for the attribute '{@link graph_Pattern_Matching_Master_Project.Vertex#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Vertex#getName()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_Pattern_Matching_Master_Project.Vertex#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Vertex#getEntries()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Entries();

	/**
	 * Returns the meta object for class '{@link graph_Pattern_Matching_Master_Project.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link graph_Pattern_Matching_Master_Project.Edge#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Edge#getGraph()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Graph();

	/**
	 * Returns the meta object for the reference '{@link graph_Pattern_Matching_Master_Project.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link graph_Pattern_Matching_Master_Project.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for the attribute '{@link graph_Pattern_Matching_Master_Project.Edge#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Edge#getLabel()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_Pattern_Matching_Master_Project.Edge#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Edge#getEntries()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Entries();

	/**
	 * Returns the meta object for class '{@link graph_Pattern_Matching_Master_Project.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link graph_Pattern_Matching_Master_Project.Entry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Entry#getKey()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link graph_Pattern_Matching_Master_Project.Entry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Entry#getValue()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Graph_Pattern_Matching_Master_ProjectFactory getGraph_Pattern_Matching_Master_ProjectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link graph_Pattern_Matching_Master_Project.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_Pattern_Matching_Master_Project.impl.GraphImpl
		 * @see graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__EDGES = eINSTANCE.getGraph_Edges();

		/**
		 * The meta object literal for the '<em><b>Vertices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__VERTICES = eINSTANCE.getGraph_Vertices();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__NAME = eINSTANCE.getGraph_Name();

		/**
		 * The meta object literal for the '<em><b>Direct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__DIRECT = eINSTANCE.getGraph_Direct();

		/**
		 * The meta object literal for the '<em><b>Is Connected</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___IS_CONNECTED = eINSTANCE.getGraph__IsConnected();

		/**
		 * The meta object literal for the '{@link graph_Pattern_Matching_Master_Project.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_Pattern_Matching_Master_Project.impl.VertexImpl
		 * @see graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__GRAPH = eINSTANCE.getVertex_Graph();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__NAME = eINSTANCE.getVertex_Name();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__ENTRIES = eINSTANCE.getVertex_Entries();

		/**
		 * The meta object literal for the '{@link graph_Pattern_Matching_Master_Project.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_Pattern_Matching_Master_Project.impl.EdgeImpl
		 * @see graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__GRAPH = eINSTANCE.getEdge_Graph();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__LABEL = eINSTANCE.getEdge_Label();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__ENTRIES = eINSTANCE.getEdge_Entries();

		/**
		 * The meta object literal for the '{@link graph_Pattern_Matching_Master_Project.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_Pattern_Matching_Master_Project.impl.EntryImpl
		 * @see graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__KEY = eINSTANCE.getEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__VALUE = eINSTANCE.getEntry_Value();

	}

} //Graph_Pattern_Matching_Master_ProjectPackage
