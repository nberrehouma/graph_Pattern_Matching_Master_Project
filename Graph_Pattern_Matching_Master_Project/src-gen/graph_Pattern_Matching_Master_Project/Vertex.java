/**
 */
package graph_Pattern_Matching_Master_Project;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph_Pattern_Matching_Master_Project.Vertex#getGraph <em>Graph</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.Vertex#getName <em>Name</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.Vertex#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getVertex()
 * @model
 * @generated
 */
public interface Vertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Graph</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link graph_Pattern_Matching_Master_Project.Graph#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' reference.
	 * @see #setGraph(Graph)
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getVertex_Graph()
	 * @see graph_Pattern_Matching_Master_Project.Graph#getVertices
	 * @model opposite="vertices" required="true"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link graph_Pattern_Matching_Master_Project.Vertex#getGraph <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getVertex_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link graph_Pattern_Matching_Master_Project.Vertex#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link graph_Pattern_Matching_Master_Project.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getVertex_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

} // Vertex
