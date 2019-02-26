/**
 */
package duc.uscript.execution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Byte Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link duc.uscript.execution.ByteValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see duc.uscript.execution.ExecutionPackage#getByteValue()
 * @model
 * @generated
 */
public interface ByteValue extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(byte)
	 * @see duc.uscript.execution.ExecutionPackage#getByteValue_Value()
	 * @model unique="false"
	 * @generated
	 */
	byte getValue();

	/**
	 * Sets the value of the '{@link duc.uscript.execution.ByteValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(byte value);

} // ByteValue
