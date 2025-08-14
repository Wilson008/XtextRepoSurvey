/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage#getAbstractroselement <em>Abstractroselement</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getFilePackage()
 * @model
 * @generated
 */
public interface FilePackage extends RosElement {
	/**
	 * Returns the value of the '<em><b>Abstractroselement</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractRosFileElement}.
	 * It is bidirectional and its opposite is '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractRosFileElement#getFilepackage <em>Filepackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstractroselement</em>' containment reference list.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getFilePackage_Abstractroselement()
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractRosFileElement#getFilepackage
	 * @model opposite="filepackage" containment="true"
	 * @generated
	 */
	EList<AbstractRosFileElement> getAbstractroselement();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getFilePackage_Filter()
	 * @model containment="true"
	 * @generated
	 */
	EList<FilterDefinition> getFilter();

} // FilePackage
