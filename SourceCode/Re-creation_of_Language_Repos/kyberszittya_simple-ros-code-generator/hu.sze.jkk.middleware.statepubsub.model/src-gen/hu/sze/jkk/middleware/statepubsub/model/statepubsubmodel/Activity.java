/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Activity#getContinousvariable <em>Continousvariable</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Continousvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continousvariable</em>' reference.
	 * @see #setContinousvariable(ContinuousVariable)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getActivity_Continousvariable()
	 * @model
	 * @generated
	 */
	ContinuousVariable getContinousvariable();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Activity#getContinousvariable <em>Continousvariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continousvariable</em>' reference.
	 * @see #getContinousvariable()
	 * @generated
	 */
	void setContinousvariable(ContinuousVariable value);

} // Activity
