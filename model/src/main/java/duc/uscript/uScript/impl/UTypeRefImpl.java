/**
 * generated by Xtext 2.16.0
 */
package duc.uscript.uScript.impl;

import duc.uscript.uScript.SingleTypeRef;
import duc.uscript.uScript.UScriptPackage;
import duc.uscript.uScript.UTypeRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UType Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link duc.uscript.uScript.impl.UTypeRefImpl#getGenericType <em>Generic Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UTypeRefImpl extends TypeRefImpl implements UTypeRef
{
  /**
   * The cached value of the '{@link #getGenericType() <em>Generic Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericType()
   * @generated
   * @ordered
   */
  protected SingleTypeRef genericType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UTypeRefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UScriptPackage.Literals.UTYPE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleTypeRef getGenericType()
  {
    return genericType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGenericType(SingleTypeRef newGenericType, NotificationChain msgs)
  {
    SingleTypeRef oldGenericType = genericType;
    genericType = newGenericType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UScriptPackage.UTYPE_REF__GENERIC_TYPE, oldGenericType, newGenericType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenericType(SingleTypeRef newGenericType)
  {
    if (newGenericType != genericType)
    {
      NotificationChain msgs = null;
      if (genericType != null)
        msgs = ((InternalEObject)genericType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UScriptPackage.UTYPE_REF__GENERIC_TYPE, null, msgs);
      if (newGenericType != null)
        msgs = ((InternalEObject)newGenericType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UScriptPackage.UTYPE_REF__GENERIC_TYPE, null, msgs);
      msgs = basicSetGenericType(newGenericType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UScriptPackage.UTYPE_REF__GENERIC_TYPE, newGenericType, newGenericType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UScriptPackage.UTYPE_REF__GENERIC_TYPE:
        return basicSetGenericType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UScriptPackage.UTYPE_REF__GENERIC_TYPE:
        return getGenericType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UScriptPackage.UTYPE_REF__GENERIC_TYPE:
        setGenericType((SingleTypeRef)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UScriptPackage.UTYPE_REF__GENERIC_TYPE:
        setGenericType((SingleTypeRef)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UScriptPackage.UTYPE_REF__GENERIC_TYPE:
        return genericType != null;
    }
    return super.eIsSet(featureID);
  }

} //UTypeRefImpl
