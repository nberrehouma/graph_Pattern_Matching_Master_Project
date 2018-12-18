/**
 */
package graph_Pattern_Matching_Master_Project.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import graph_Pattern_Matching_Master_Project.Entry;
import graph_Pattern_Matching_Master_Project.Graph;
import graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage;
import graph_Pattern_Matching_Master_Project.Vertex;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Vertex</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link graph_Pattern_Matching_Master_Project.impl.VertexImpl#getGraph
 * <em>Graph</em>}</li>
 * <li>{@link graph_Pattern_Matching_Master_Project.impl.VertexImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link graph_Pattern_Matching_Master_Project.impl.VertexImpl#getEntries
 * <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VertexImpl extends MinimalEObjectImpl.Container implements Vertex {
	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph graph;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<Entry> entries;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graph_Pattern_Matching_Master_ProjectPackage.Literals.VERTEX;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Graph getGraph() {
		if (graph != null && graph.eIsProxy()) {
			InternalEObject oldGraph = (InternalEObject) graph;
			graph = (Graph) eResolveProxy(oldGraph);
			if (graph != oldGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__GRAPH, oldGraph, graph));
			}
		}
		return graph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Graph basicGetGraph() {
		return graph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		Graph oldGraph = graph;
		graph = newGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__GRAPH, oldGraph, newGraph);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setGraph(Graph newGraph) {
		if (newGraph != graph) {
			NotificationChain msgs = null;
			if (graph != null)
				msgs = ((InternalEObject) graph).eInverseRemove(this,
						Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__VERTICES, Graph.class, msgs);
			if (newGraph != null)
				msgs = ((InternalEObject) newGraph).eInverseAdd(this,
						Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__VERTICES, Graph.class, msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__GRAPH, newGraph, newGraph));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Entry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<Entry>(Entry.class, this,
					Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__GRAPH:
			if (graph != null)
				msgs = ((InternalEObject) graph).eInverseRemove(this,
						Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__VERTICES, Graph.class, msgs);
			return basicSetGraph((Graph) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__GRAPH:
			return basicSetGraph(null, msgs);
		case Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__ENTRIES:
			return ((InternalEList<?>) getEntries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__GRAPH:
			if (resolve)
				return getGraph();
			return basicGetGraph();
		case Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__NAME:
			return getName();
		case Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__ENTRIES:
			return getEntries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__GRAPH:
			setGraph((Graph) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__NAME:
			setName((String) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__ENTRIES:
			getEntries().clear();
			getEntries().addAll((Collection<? extends Entry>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__GRAPH:
			setGraph((Graph) null);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__ENTRIES:
			getEntries().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__GRAPH:
			return graph != null;
		case Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__ENTRIES:
			return entries != null && !entries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" ( Vertex name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // VertexImpl
