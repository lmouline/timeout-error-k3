/**
 * generated by Xtext 2.16.0
 */
package duc.uscript.uScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link duc.uscript.uScript.PrintStatement#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see duc.uscript.uScript.UScriptPackage#getPrintStatement()
 * @model
 * @generated
 */
public interface PrintStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see duc.uscript.uScript.UScriptPackage#getPrintStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link duc.uscript.uScript.PrintStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // PrintStatement