/**
 * generated by Xtext 2.35.0
 */
package es.unex.quercusseg.graphqlIDL.impl;

import es.unex.quercusseg.graphqlIDL.GraphqlIDLPackage;
import es.unex.quercusseg.graphqlIDL.GraphqlInputField;
import es.unex.quercusseg.graphqlIDL.GraphqlInputTypeDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphql Input Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unex.quercusseg.graphqlIDL.impl.GraphqlInputTypeDefinitionImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphqlInputTypeDefinitionImpl extends GraphqlTypeDefinitionImpl implements GraphqlInputTypeDefinition
{
  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<GraphqlInputField> fields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GraphqlInputTypeDefinitionImpl()
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
    return GraphqlIDLPackage.Literals.GRAPHQL_INPUT_TYPE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GraphqlInputField> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<GraphqlInputField>(GraphqlInputField.class, this, GraphqlIDLPackage.GRAPHQL_INPUT_TYPE_DEFINITION__FIELDS);
    }
    return fields;
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
      case GraphqlIDLPackage.GRAPHQL_INPUT_TYPE_DEFINITION__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
      case GraphqlIDLPackage.GRAPHQL_INPUT_TYPE_DEFINITION__FIELDS:
        return getFields();
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
      case GraphqlIDLPackage.GRAPHQL_INPUT_TYPE_DEFINITION__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends GraphqlInputField>)newValue);
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
      case GraphqlIDLPackage.GRAPHQL_INPUT_TYPE_DEFINITION__FIELDS:
        getFields().clear();
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
      case GraphqlIDLPackage.GRAPHQL_INPUT_TYPE_DEFINITION__FIELDS:
        return fields != null && !fields.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GraphqlInputTypeDefinitionImpl
