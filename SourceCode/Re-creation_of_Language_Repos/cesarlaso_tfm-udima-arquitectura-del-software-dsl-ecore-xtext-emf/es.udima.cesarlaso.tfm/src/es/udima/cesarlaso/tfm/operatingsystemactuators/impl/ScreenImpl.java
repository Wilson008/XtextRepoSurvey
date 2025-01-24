/**
 */
package es.udima.cesarlaso.tfm.operatingsystemactuators.impl;

import es.udima.cesarlaso.tfm.operatingsystemactuators.FilePath;
import es.udima.cesarlaso.tfm.operatingsystemactuators.OperatingsystemactuatorsPackage;
import es.udima.cesarlaso.tfm.operatingsystemactuators.ResizeType;
import es.udima.cesarlaso.tfm.operatingsystemactuators.Screen;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.ScreenImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.ScreenImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.ScreenImpl#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.ScreenImpl#getPositionZ <em>Position Z</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.ScreenImpl#getColor <em>Color</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.operatingsystemactuators.impl.ScreenImpl#getResizeType <em>Resize Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ScreenImpl extends OperatingSystemActuatorImpl implements Screen {
	/**
	 * The cached value of the '{@link #getFilePath() <em>File Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected FilePath filePath;

	/**
	 * The default value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected int positionX = POSITION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected int positionY = POSITION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionZ() <em>Position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionZ()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPositionZ() <em>Position Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionZ()
	 * @generated
	 * @ordered
	 */
	protected int positionZ = POSITION_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final long COLOR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected long color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getResizeType() <em>Resize Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResizeType()
	 * @generated
	 * @ordered
	 */
	protected static final ResizeType RESIZE_TYPE_EDEFAULT = ResizeType.NONE;

	/**
	 * The cached value of the '{@link #getResizeType() <em>Resize Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResizeType()
	 * @generated
	 * @ordered
	 */
	protected ResizeType resizeType = RESIZE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperatingsystemactuatorsPackage.Literals.SCREEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilePath getFilePath() {
		if (filePath != null && filePath.eIsProxy()) {
			InternalEObject oldFilePath = (InternalEObject)filePath;
			filePath = (FilePath)eResolveProxy(oldFilePath);
			if (filePath != oldFilePath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatingsystemactuatorsPackage.SCREEN__FILE_PATH, oldFilePath, filePath));
			}
		}
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilePath basicGetFilePath() {
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilePath(FilePath newFilePath) {
		FilePath oldFilePath = filePath;
		filePath = newFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatingsystemactuatorsPackage.SCREEN__FILE_PATH, oldFilePath, filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPositionX() {
		return positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionX(int newPositionX) {
		int oldPositionX = positionX;
		positionX = newPositionX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatingsystemactuatorsPackage.SCREEN__POSITION_X, oldPositionX, positionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPositionY() {
		return positionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionY(int newPositionY) {
		int oldPositionY = positionY;
		positionY = newPositionY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatingsystemactuatorsPackage.SCREEN__POSITION_Y, oldPositionY, positionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPositionZ() {
		return positionZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionZ(int newPositionZ) {
		int oldPositionZ = positionZ;
		positionZ = newPositionZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatingsystemactuatorsPackage.SCREEN__POSITION_Z, oldPositionZ, positionZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(long newColor) {
		long oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatingsystemactuatorsPackage.SCREEN__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResizeType getResizeType() {
		return resizeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResizeType(ResizeType newResizeType) {
		ResizeType oldResizeType = resizeType;
		resizeType = newResizeType == null ? RESIZE_TYPE_EDEFAULT : newResizeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatingsystemactuatorsPackage.SCREEN__RESIZE_TYPE, oldResizeType, resizeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperatingsystemactuatorsPackage.SCREEN__FILE_PATH:
				if (resolve) return getFilePath();
				return basicGetFilePath();
			case OperatingsystemactuatorsPackage.SCREEN__POSITION_X:
				return getPositionX();
			case OperatingsystemactuatorsPackage.SCREEN__POSITION_Y:
				return getPositionY();
			case OperatingsystemactuatorsPackage.SCREEN__POSITION_Z:
				return getPositionZ();
			case OperatingsystemactuatorsPackage.SCREEN__COLOR:
				return getColor();
			case OperatingsystemactuatorsPackage.SCREEN__RESIZE_TYPE:
				return getResizeType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OperatingsystemactuatorsPackage.SCREEN__FILE_PATH:
				setFilePath((FilePath)newValue);
				return;
			case OperatingsystemactuatorsPackage.SCREEN__POSITION_X:
				setPositionX((Integer)newValue);
				return;
			case OperatingsystemactuatorsPackage.SCREEN__POSITION_Y:
				setPositionY((Integer)newValue);
				return;
			case OperatingsystemactuatorsPackage.SCREEN__POSITION_Z:
				setPositionZ((Integer)newValue);
				return;
			case OperatingsystemactuatorsPackage.SCREEN__COLOR:
				setColor((Long)newValue);
				return;
			case OperatingsystemactuatorsPackage.SCREEN__RESIZE_TYPE:
				setResizeType((ResizeType)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case OperatingsystemactuatorsPackage.SCREEN__FILE_PATH:
				setFilePath((FilePath)null);
				return;
			case OperatingsystemactuatorsPackage.SCREEN__POSITION_X:
				setPositionX(POSITION_X_EDEFAULT);
				return;
			case OperatingsystemactuatorsPackage.SCREEN__POSITION_Y:
				setPositionY(POSITION_Y_EDEFAULT);
				return;
			case OperatingsystemactuatorsPackage.SCREEN__POSITION_Z:
				setPositionZ(POSITION_Z_EDEFAULT);
				return;
			case OperatingsystemactuatorsPackage.SCREEN__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case OperatingsystemactuatorsPackage.SCREEN__RESIZE_TYPE:
				setResizeType(RESIZE_TYPE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OperatingsystemactuatorsPackage.SCREEN__FILE_PATH:
				return filePath != null;
			case OperatingsystemactuatorsPackage.SCREEN__POSITION_X:
				return positionX != POSITION_X_EDEFAULT;
			case OperatingsystemactuatorsPackage.SCREEN__POSITION_Y:
				return positionY != POSITION_Y_EDEFAULT;
			case OperatingsystemactuatorsPackage.SCREEN__POSITION_Z:
				return positionZ != POSITION_Z_EDEFAULT;
			case OperatingsystemactuatorsPackage.SCREEN__COLOR:
				return color != COLOR_EDEFAULT;
			case OperatingsystemactuatorsPackage.SCREEN__RESIZE_TYPE:
				return resizeType != RESIZE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (positionX: ");
		result.append(positionX);
		result.append(", positionY: ");
		result.append(positionY);
		result.append(", positionZ: ");
		result.append(positionZ);
		result.append(", color: ");
		result.append(color);
		result.append(", resizeType: ");
		result.append(resizeType);
		result.append(')');
		return result.toString();
	}

} //ScreenImpl
