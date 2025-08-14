/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Majordomo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.Majordomo#getHouse <em>House</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.Majordomo#getName <em>Name</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.Majordomo#getRooms <em>Rooms</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.Majordomo#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getMajordomo()
 * @model
 * @generated
 */
public interface Majordomo extends EObject {
	/**
	 * Returns the value of the '<em><b>House</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' containment reference.
	 * @see #setHouse(House)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getMajordomo_House()
	 * @model containment="true"
	 * @generated
	 */
	House getHouse();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.Majordomo#getHouse <em>House</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House</em>' containment reference.
	 * @see #getHouse()
	 * @generated
	 */
	void setHouse(House value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"m"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getMajordomo_Name()
	 * @model default="m" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.Majordomo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link de.altimos.mdsd.majordomo.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getMajordomo_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' containment reference.
	 * @see #setProgram(Program)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getMajordomo_Program()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.Majordomo#getProgram <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' containment reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

} // Majordomo
