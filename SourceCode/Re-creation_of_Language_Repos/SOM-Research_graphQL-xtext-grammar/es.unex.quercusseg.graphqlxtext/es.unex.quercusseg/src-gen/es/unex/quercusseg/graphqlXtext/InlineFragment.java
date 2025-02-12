/**
 * generated by Xtext 2.35.0
 */
package es.unex.quercusseg.graphqlXtext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unex.quercusseg.graphqlXtext.InlineFragment#getTypeCondition <em>Type Condition</em>}</li>
 *   <li>{@link es.unex.quercusseg.graphqlXtext.InlineFragment#getSelectionSet <em>Selection Set</em>}</li>
 * </ul>
 *
 * @see es.unex.quercusseg.graphqlXtext.GraphqlXtextPackage#getInlineFragment()
 * @model
 * @generated
 */
public interface InlineFragment extends Selection
{
  /**
   * Returns the value of the '<em><b>Type Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Condition</em>' attribute.
   * @see #setTypeCondition(String)
   * @see es.unex.quercusseg.graphqlXtext.GraphqlXtextPackage#getInlineFragment_TypeCondition()
   * @model
   * @generated
   */
  String getTypeCondition();

  /**
   * Sets the value of the '{@link es.unex.quercusseg.graphqlXtext.InlineFragment#getTypeCondition <em>Type Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Condition</em>' attribute.
   * @see #getTypeCondition()
   * @generated
   */
  void setTypeCondition(String value);

  /**
   * Returns the value of the '<em><b>Selection Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection Set</em>' containment reference.
   * @see #setSelectionSet(SelectionSet)
   * @see es.unex.quercusseg.graphqlXtext.GraphqlXtextPackage#getInlineFragment_SelectionSet()
   * @model containment="true"
   * @generated
   */
  SelectionSet getSelectionSet();

  /**
   * Sets the value of the '{@link es.unex.quercusseg.graphqlXtext.InlineFragment#getSelectionSet <em>Selection Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection Set</em>' containment reference.
   * @see #getSelectionSet()
   * @generated
   */
  void setSelectionSet(SelectionSet value);

} // InlineFragment
