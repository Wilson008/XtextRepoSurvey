/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getDiscreteevent <em>Discreteevent</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getContinuousvariable <em>Continuousvariable</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Location)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getTransition_Target()
	 * @model
	 * @generated
	 */
	Location getTarget();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Location value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Location)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getTransition_Source()
	 * @model
	 * @generated
	 */
	Location getSource();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Location value);

	/**
	 * Returns the value of the '<em><b>Discreteevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discreteevent</em>' reference.
	 * @see #setDiscreteevent(DiscreteEvent)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getTransition_Discreteevent()
	 * @model
	 * @generated
	 */
	DiscreteEvent getDiscreteevent();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getDiscreteevent <em>Discreteevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discreteevent</em>' reference.
	 * @see #getDiscreteevent()
	 * @generated
	 */
	void setDiscreteevent(DiscreteEvent value);

	/**
	 * Returns the value of the '<em><b>Continuousvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuousvariable</em>' reference.
	 * @see #setContinuousvariable(ContinuousVariable)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getTransition_Continuousvariable()
	 * @model
	 * @generated
	 */
	ContinuousVariable getContinuousvariable();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Transition#getContinuousvariable <em>Continuousvariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuousvariable</em>' reference.
	 * @see #getContinuousvariable()
	 * @generated
	 */
	void setContinuousvariable(ContinuousVariable value);

} // Transition
