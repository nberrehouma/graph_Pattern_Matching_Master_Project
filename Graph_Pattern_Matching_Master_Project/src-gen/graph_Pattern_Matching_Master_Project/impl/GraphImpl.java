/**
 */
package graph_Pattern_Matching_Master_Project.impl;

import graph_Pattern_Matching_Master_Project.Edge;
import graph_Pattern_Matching_Master_Project.Graph;
import graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage;
import graph_Pattern_Matching_Master_Project.Vertex;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.GraphImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.GraphImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.GraphImpl#getName <em>Name</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.GraphImpl#isDirect <em>Direct</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends MinimalEObjectImpl.Container implements Graph {
	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

	/**
	 * The cached value of the '{@link #getVertices() <em>Vertices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertices()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> vertices;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isDirect() <em>Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIRECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirect() <em>Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirect()
	 * @generated
	 * @ordered
	 */
	protected boolean direct = DIRECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graph_Pattern_Matching_Master_ProjectPackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectWithInverseResolvingEList<Edge>(Edge.class, this,
					Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__EDGES,
					Graph_Pattern_Matching_Master_ProjectPackage.EDGE__GRAPH);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getVertices() {
		if (vertices == null) {
			vertices = new EObjectWithInverseResolvingEList<Vertex>(Vertex.class, this,
					Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__VERTICES,
					Graph_Pattern_Matching_Master_ProjectPackage.VERTEX__GRAPH);
		}
		return vertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirect() {
		return direct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirect(boolean newDirect) {
		boolean oldDirect = direct;
		direct = newDirect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__DIRECT, oldDirect, direct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConnected() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__EDGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEdges()).basicAdd(otherEnd, msgs);
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__VERTICES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVertices()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__EDGES:
			return ((InternalEList<?>) getEdges()).basicRemove(otherEnd, msgs);
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__VERTICES:
			return ((InternalEList<?>) getVertices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__EDGES:
			return getEdges();
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__VERTICES:
			return getVertices();
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__NAME:
			return getName();
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__DIRECT:
			return isDirect();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__EDGES:
			getEdges().clear();
			getEdges().addAll((Collection<? extends Edge>) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__VERTICES:
			getVertices().clear();
			getVertices().addAll((Collection<? extends Vertex>) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__NAME:
			setName((String) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__DIRECT:
			setDirect((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__EDGES:
			getEdges().clear();
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__VERTICES:
			getVertices().clear();
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__DIRECT:
			setDirect(DIRECT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__EDGES:
			return edges != null && !edges.isEmpty();
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__VERTICES:
			return vertices != null && !vertices.isEmpty();
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH__DIRECT:
			return direct != DIRECT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.GRAPH___IS_CONNECTED:
			return isConnected();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", direct: ");
		result.append(direct);
		result.append(')');
		return result.toString();
	}

} //GraphImpl
