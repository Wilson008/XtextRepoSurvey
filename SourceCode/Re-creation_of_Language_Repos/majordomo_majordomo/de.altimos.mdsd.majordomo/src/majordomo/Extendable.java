/**
 */
package majordomo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extendable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link majordomo.Extendable#getSensors <em>Sensors</em>}</li>
 *   <li>{@link majordomo.Extendable#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see majordomo.MajordomoPackage#getExtendable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Extendable extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link majordomo.Sensor}.
	 * It is bidirectional and its opposite is '{@link majordomo.Sensor#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see majordomo.MajordomoPackage#getExtendable_Sensors()
	 * @see majordomo.Sensor#getCtx
	 * @model opposite="ctx" containment="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link majordomo.Actor}.
	 * It is bidirectional and its opposite is '{@link majordomo.Actor#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see majordomo.MajordomoPackage#getExtendable_Actors()
	 * @see majordomo.Actor#getCtx
	 * @model opposite="ctx" containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

} // Extendable
