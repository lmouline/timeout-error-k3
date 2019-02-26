/**
 */
package duc.uscript.execution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link duc.uscript.execution.OutputStream#getStream <em>Stream</em>}</li>
 * </ul>
 *
 * @see duc.uscript.execution.ExecutionPackage#getOutputStream()
 * @model
 * @generated
 */
public interface OutputStream extends EObject {
	/**
	 * Returns the value of the '<em><b>Stream</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stream</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream</em>' attribute list.
	 * @see duc.uscript.execution.ExecutionPackage#getOutputStream_Stream()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getStream();

} // OutputStream
