/**
 */
package duc.uscript.execution.impl;

import duc.uscript.execution.ArrayInstance;
import duc.uscript.execution.ExecutionPackage;
import duc.uscript.execution.Frame;
import duc.uscript.execution.ObjectInstance;
import duc.uscript.execution.OutputStream;
import duc.uscript.execution.State;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link duc.uscript.execution.impl.StateImpl#getOutputStream <em>Output Stream</em>}</li>
 *   <li>{@link duc.uscript.execution.impl.StateImpl#getRootFrame <em>Root Frame</em>}</li>
 *   <li>{@link duc.uscript.execution.impl.StateImpl#getObjectsHeap <em>Objects Heap</em>}</li>
 *   <li>{@link duc.uscript.execution.impl.StateImpl#getArraysHeap <em>Arrays Heap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getOutputStream() <em>Output Stream</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputStream()
	 * @generated
	 * @ordered
	 */
	protected OutputStream outputStream;

	/**
	 * The cached value of the '{@link #getRootFrame() <em>Root Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootFrame()
	 * @generated
	 * @ordered
	 */
	protected Frame rootFrame;

	/**
	 * The cached value of the '{@link #getObjectsHeap() <em>Objects Heap</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectsHeap()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectInstance> objectsHeap;

	/**
	 * The cached value of the '{@link #getArraysHeap() <em>Arrays Heap</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraysHeap()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayInstance> arraysHeap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputStream getOutputStream() {
		return outputStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputStream(OutputStream newOutputStream, NotificationChain msgs) {
		OutputStream oldOutputStream = outputStream;
		outputStream = newOutputStream;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionPackage.STATE__OUTPUT_STREAM, oldOutputStream, newOutputStream);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputStream(OutputStream newOutputStream) {
		if (newOutputStream != outputStream) {
			NotificationChain msgs = null;
			if (outputStream != null)
				msgs = ((InternalEObject)outputStream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutionPackage.STATE__OUTPUT_STREAM, null, msgs);
			if (newOutputStream != null)
				msgs = ((InternalEObject)newOutputStream).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutionPackage.STATE__OUTPUT_STREAM, null, msgs);
			msgs = basicSetOutputStream(newOutputStream, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.STATE__OUTPUT_STREAM, newOutputStream, newOutputStream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame getRootFrame() {
		return rootFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootFrame(Frame newRootFrame, NotificationChain msgs) {
		Frame oldRootFrame = rootFrame;
		rootFrame = newRootFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionPackage.STATE__ROOT_FRAME, oldRootFrame, newRootFrame);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootFrame(Frame newRootFrame) {
		if (newRootFrame != rootFrame) {
			NotificationChain msgs = null;
			if (rootFrame != null)
				msgs = ((InternalEObject)rootFrame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutionPackage.STATE__ROOT_FRAME, null, msgs);
			if (newRootFrame != null)
				msgs = ((InternalEObject)newRootFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutionPackage.STATE__ROOT_FRAME, null, msgs);
			msgs = basicSetRootFrame(newRootFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.STATE__ROOT_FRAME, newRootFrame, newRootFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectInstance> getObjectsHeap() {
		if (objectsHeap == null) {
			objectsHeap = new EObjectContainmentEList<ObjectInstance>(ObjectInstance.class, this, ExecutionPackage.STATE__OBJECTS_HEAP);
		}
		return objectsHeap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArrayInstance> getArraysHeap() {
		if (arraysHeap == null) {
			arraysHeap = new EObjectContainmentEList<ArrayInstance>(ArrayInstance.class, this, ExecutionPackage.STATE__ARRAYS_HEAP);
		}
		return arraysHeap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionPackage.STATE__OUTPUT_STREAM:
				return basicSetOutputStream(null, msgs);
			case ExecutionPackage.STATE__ROOT_FRAME:
				return basicSetRootFrame(null, msgs);
			case ExecutionPackage.STATE__OBJECTS_HEAP:
				return ((InternalEList<?>)getObjectsHeap()).basicRemove(otherEnd, msgs);
			case ExecutionPackage.STATE__ARRAYS_HEAP:
				return ((InternalEList<?>)getArraysHeap()).basicRemove(otherEnd, msgs);
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
			case ExecutionPackage.STATE__OUTPUT_STREAM:
				return getOutputStream();
			case ExecutionPackage.STATE__ROOT_FRAME:
				return getRootFrame();
			case ExecutionPackage.STATE__OBJECTS_HEAP:
				return getObjectsHeap();
			case ExecutionPackage.STATE__ARRAYS_HEAP:
				return getArraysHeap();
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
			case ExecutionPackage.STATE__OUTPUT_STREAM:
				setOutputStream((OutputStream)newValue);
				return;
			case ExecutionPackage.STATE__ROOT_FRAME:
				setRootFrame((Frame)newValue);
				return;
			case ExecutionPackage.STATE__OBJECTS_HEAP:
				getObjectsHeap().clear();
				getObjectsHeap().addAll((Collection<? extends ObjectInstance>)newValue);
				return;
			case ExecutionPackage.STATE__ARRAYS_HEAP:
				getArraysHeap().clear();
				getArraysHeap().addAll((Collection<? extends ArrayInstance>)newValue);
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
			case ExecutionPackage.STATE__OUTPUT_STREAM:
				setOutputStream((OutputStream)null);
				return;
			case ExecutionPackage.STATE__ROOT_FRAME:
				setRootFrame((Frame)null);
				return;
			case ExecutionPackage.STATE__OBJECTS_HEAP:
				getObjectsHeap().clear();
				return;
			case ExecutionPackage.STATE__ARRAYS_HEAP:
				getArraysHeap().clear();
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
			case ExecutionPackage.STATE__OUTPUT_STREAM:
				return outputStream != null;
			case ExecutionPackage.STATE__ROOT_FRAME:
				return rootFrame != null;
			case ExecutionPackage.STATE__OBJECTS_HEAP:
				return objectsHeap != null && !objectsHeap.isEmpty();
			case ExecutionPackage.STATE__ARRAYS_HEAP:
				return arraysHeap != null && !arraysHeap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
