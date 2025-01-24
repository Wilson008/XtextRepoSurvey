/**
 */
package majordomo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link majordomo.Actor#getCtx <em>Ctx</em>}</li>
 * </ul>
 *
 * @see majordomo.MajordomoPackage#getActor()
 * @model abstract="true"
 * @generated
 */
public interface Actor extends Extension {
	/**
	 * Returns the value of the '<em><b>Ctx</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link majordomo.Extendable#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctx</em>' container reference.
	 * @see #setCtx(Extendable)
	 * @see majordomo.MajordomoPackage#getActor_Ctx()
	 * @see majordomo.Extendable#getActors
	 * @model opposite="actors" required="true" transient="false"
	 * @generated
	 */
	Extendable getCtx();

	/**
	 * Sets the value of the '{@link majordomo.Actor#getCtx <em>Ctx</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctx</em>' container reference.
	 * @see #getCtx()
	 * @generated
	 */
	void setCtx(Extendable value);

} // Actor
