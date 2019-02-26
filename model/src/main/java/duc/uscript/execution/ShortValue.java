/**
 */
package duc.uscript.execution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Short Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link duc.uscript.execution.ShortValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see duc.uscript.execution.ExecutionPackage#getShortValue()
 * @model
 * @generated
 */
public interface ShortValue extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(short)
	 * @see duc.uscript.execution.ExecutionPackage#getShortValue_Value()
	 * @model unique="false"
	 * @generated
	 */
	short getValue();

	/**
	 * Sets the value of the '{@link duc.uscript.execution.ShortValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(short value);

} // ShortValue
