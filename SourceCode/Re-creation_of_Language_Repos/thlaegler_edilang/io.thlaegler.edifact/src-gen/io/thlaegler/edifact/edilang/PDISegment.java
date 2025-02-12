/**
 * generated by Xtext 2.35.0
 */
package io.thlaegler.edifact.edilang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PDI Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.thlaegler.edifact.edilang.PDISegment#getProductDetailsQualifier <em>Product Details Qualifier</em>}</li>
 *   <li>{@link io.thlaegler.edifact.edilang.PDISegment#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see io.thlaegler.edifact.edilang.EdilangPackage#getPDISegment()
 * @model
 * @generated
 */
public interface PDISegment extends AbstractEdiSegment
{
  /**
   * Returns the value of the '<em><b>Product Details Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product Details Qualifier</em>' attribute.
   * @see #setProductDetailsQualifier(String)
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getPDISegment_ProductDetailsQualifier()
   * @model
   * @generated
   */
  String getProductDetailsQualifier();

  /**
   * Sets the value of the '{@link io.thlaegler.edifact.edilang.PDISegment#getProductDetailsQualifier <em>Product Details Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product Details Qualifier</em>' attribute.
   * @see #getProductDetailsQualifier()
   * @generated
   */
  void setProductDetailsQualifier(String value);

  /**
   * Returns the value of the '<em><b>Products</b></em>' containment reference list.
   * The list contents are of type {@link io.thlaegler.edifact.edilang.ProductFunction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Products</em>' containment reference list.
   * @see io.thlaegler.edifact.edilang.EdilangPackage#getPDISegment_Products()
   * @model containment="true"
   * @generated
   */
  EList<ProductFunction> getProducts();

} // PDISegment
