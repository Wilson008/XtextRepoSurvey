/**
 * generated by Xtext 2.35.0
 */
package nl.tue.ele.es.sdf3.editor.sDF3.impl;

import java.util.Collection;

import nl.tue.ele.es.sdf3.editor.sDF3.ApplicationGraph;
import nl.tue.ele.es.sdf3.editor.sDF3.Property;
import nl.tue.ele.es.sdf3.editor.sDF3.SDF3;
import nl.tue.ele.es.sdf3.editor.sDF3.SDF3Package;

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
 * An implementation of the model object '<em><b>SDF3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.ele.es.sdf3.editor.sDF3.impl.SDF3Impl#getApplication <em>Application</em>}</li>
 *   <li>{@link nl.tue.ele.es.sdf3.editor.sDF3.impl.SDF3Impl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDF3Impl extends MinimalEObjectImpl.Container implements SDF3
{
  /**
   * The cached value of the '{@link #getApplication() <em>Application</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplication()
   * @generated
   * @ordered
   */
  protected ApplicationGraph application;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SDF3Impl()
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
    return SDF3Package.Literals.SDF3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ApplicationGraph getApplication()
  {
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetApplication(ApplicationGraph newApplication, NotificationChain msgs)
  {
    ApplicationGraph oldApplication = application;
    application = newApplication;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SDF3Package.SDF3__APPLICATION, oldApplication, newApplication);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setApplication(ApplicationGraph newApplication)
  {
    if (newApplication != application)
    {
      NotificationChain msgs = null;
      if (application != null)
        msgs = ((InternalEObject)application).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SDF3Package.SDF3__APPLICATION, null, msgs);
      if (newApplication != null)
        msgs = ((InternalEObject)newApplication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SDF3Package.SDF3__APPLICATION, null, msgs);
      msgs = basicSetApplication(newApplication, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDF3Package.SDF3__APPLICATION, newApplication, newApplication));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, SDF3Package.SDF3__PROPERTIES);
    }
    return properties;
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
      case SDF3Package.SDF3__APPLICATION:
        return basicSetApplication(null, msgs);
      case SDF3Package.SDF3__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
      case SDF3Package.SDF3__APPLICATION:
        return getApplication();
      case SDF3Package.SDF3__PROPERTIES:
        return getProperties();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SDF3Package.SDF3__APPLICATION:
        setApplication((ApplicationGraph)newValue);
        return;
      case SDF3Package.SDF3__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
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
      case SDF3Package.SDF3__APPLICATION:
        setApplication((ApplicationGraph)null);
        return;
      case SDF3Package.SDF3__PROPERTIES:
        getProperties().clear();
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
      case SDF3Package.SDF3__APPLICATION:
        return application != null;
      case SDF3Package.SDF3__PROPERTIES:
        return properties != null && !properties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SDF3Impl
