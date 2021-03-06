/**
 * generated by Xtext 2.16.0
 */
package duc.uscript.uScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exist Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link duc.uscript.uScript.ExistExpr#getExpr <em>Expr</em>}</li>
 *   <li>{@link duc.uscript.uScript.ExistExpr#getConfidence <em>Confidence</em>}</li>
 * </ul>
 *
 * @see duc.uscript.uScript.UScriptPackage#getExistExpr()
 * @model
 * @generated
 */
public interface ExistExpr extends Expression
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see duc.uscript.uScript.UScriptPackage#getExistExpr_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link duc.uscript.uScript.ExistExpr#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Confidence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Confidence</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Confidence</em>' containment reference.
   * @see #setConfidence(Expression)
   * @see duc.uscript.uScript.UScriptPackage#getExistExpr_Confidence()
   * @model containment="true"
   * @generated
   */
  Expression getConfidence();

  /**
   * Sets the value of the '{@link duc.uscript.uScript.ExistExpr#getConfidence <em>Confidence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Confidence</em>' containment reference.
   * @see #getConfidence()
   * @generated
   */
  void setConfidence(Expression value);

} // ExistExpr
