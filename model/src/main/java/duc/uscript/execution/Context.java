/**
 */
package duc.uscript.execution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link duc.uscript.execution.Context#getChild <em>Child</em>}</li>
 *   <li>{@link duc.uscript.execution.Context#getParent <em>Parent</em>}</li>
 *   <li>{@link duc.uscript.execution.Context#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @see duc.uscript.execution.ExecutionPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link duc.uscript.execution.Context#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(Context)
	 * @see duc.uscript.execution.ExecutionPackage#getContext_Child()
	 * @see duc.uscript.execution.Context#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	Context getChild();

	/**
	 * Sets the value of the '{@link duc.uscript.execution.Context#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Context value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link duc.uscript.execution.Context#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Context)
	 * @see duc.uscript.execution.ExecutionPackage#getContext_Parent()
	 * @see duc.uscript.execution.Context#getChild
	 * @model opposite="child" transient="false"
	 * @generated
	 */
	Context getParent();

	/**
	 * Sets the value of the '{@link duc.uscript.execution.Context#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Context value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link duc.uscript.execution.SymbolBindings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see duc.uscript.execution.ExecutionPackage#getContext_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SymbolBindings> getBindings();

} // Context
