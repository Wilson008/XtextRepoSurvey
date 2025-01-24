/**
 */
package es.udima.cesarlaso.tfm.healthmonitors.impl;

import es.udima.cesarlaso.tfm.healthmonitors.HealthmonitorsPackage;
import es.udima.cesarlaso.tfm.healthmonitors.StoragePartition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StoragePartitionImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StoragePartitionImpl#getMount <em>Mount</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StoragePartitionImpl#getFileSystem <em>File System</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StoragePartitionImpl#getInodeFree <em>Inode Free</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StoragePartitionImpl#getInodeTotal <em>Inode Total</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StoragePartitionImpl#getSpaceFree <em>Space Free</em>}</li>
 *   <li>{@link es.udima.cesarlaso.tfm.healthmonitors.impl.StoragePartitionImpl#getSpaceTotal <em>Space Total</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoragePartitionImpl extends MinimalEObjectImpl.Container implements StoragePartition {
	/**
	 * The default value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected String device = DEVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMount() <em>Mount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMount()
	 * @generated
	 * @ordered
	 */
	protected static final String MOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMount() <em>Mount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMount()
	 * @generated
	 * @ordered
	 */
	protected String mount = MOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileSystem() <em>File System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileSystem() <em>File System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSystem()
	 * @generated
	 * @ordered
	 */
	protected String fileSystem = FILE_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getInodeFree() <em>Inode Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInodeFree()
	 * @generated
	 * @ordered
	 */
	protected static final long INODE_FREE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getInodeFree() <em>Inode Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInodeFree()
	 * @generated
	 * @ordered
	 */
	protected long inodeFree = INODE_FREE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInodeTotal() <em>Inode Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInodeTotal()
	 * @generated
	 * @ordered
	 */
	protected static final long INODE_TOTAL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getInodeTotal() <em>Inode Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInodeTotal()
	 * @generated
	 * @ordered
	 */
	protected long inodeTotal = INODE_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpaceFree() <em>Space Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceFree()
	 * @generated
	 * @ordered
	 */
	protected static final long SPACE_FREE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSpaceFree() <em>Space Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceFree()
	 * @generated
	 * @ordered
	 */
	protected long spaceFree = SPACE_FREE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpaceTotal() <em>Space Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceTotal()
	 * @generated
	 * @ordered
	 */
	protected static final long SPACE_TOTAL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSpaceTotal() <em>Space Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceTotal()
	 * @generated
	 * @ordered
	 */
	protected long spaceTotal = SPACE_TOTAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoragePartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmonitorsPackage.Literals.STORAGE_PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevice(String newDevice) {
		String oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmonitorsPackage.STORAGE_PARTITION__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMount() {
		return mount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMount(String newMount) {
		String oldMount = mount;
		mount = newMount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmonitorsPackage.STORAGE_PARTITION__MOUNT, oldMount, mount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileSystem() {
		return fileSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileSystem(String newFileSystem) {
		String oldFileSystem = fileSystem;
		fileSystem = newFileSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmonitorsPackage.STORAGE_PARTITION__FILE_SYSTEM, oldFileSystem, fileSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getInodeFree() {
		return inodeFree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInodeFree(long newInodeFree) {
		long oldInodeFree = inodeFree;
		inodeFree = newInodeFree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmonitorsPackage.STORAGE_PARTITION__INODE_FREE, oldInodeFree, inodeFree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getInodeTotal() {
		return inodeTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInodeTotal(long newInodeTotal) {
		long oldInodeTotal = inodeTotal;
		inodeTotal = newInodeTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmonitorsPackage.STORAGE_PARTITION__INODE_TOTAL, oldInodeTotal, inodeTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSpaceFree() {
		return spaceFree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaceFree(long newSpaceFree) {
		long oldSpaceFree = spaceFree;
		spaceFree = newSpaceFree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmonitorsPackage.STORAGE_PARTITION__SPACE_FREE, oldSpaceFree, spaceFree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSpaceTotal() {
		return spaceTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaceTotal(long newSpaceTotal) {
		long oldSpaceTotal = spaceTotal;
		spaceTotal = newSpaceTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmonitorsPackage.STORAGE_PARTITION__SPACE_TOTAL, oldSpaceTotal, spaceTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthmonitorsPackage.STORAGE_PARTITION__DEVICE:
				return getDevice();
			case HealthmonitorsPackage.STORAGE_PARTITION__MOUNT:
				return getMount();
			case HealthmonitorsPackage.STORAGE_PARTITION__FILE_SYSTEM:
				return getFileSystem();
			case HealthmonitorsPackage.STORAGE_PARTITION__INODE_FREE:
				return getInodeFree();
			case HealthmonitorsPackage.STORAGE_PARTITION__INODE_TOTAL:
				return getInodeTotal();
			case HealthmonitorsPackage.STORAGE_PARTITION__SPACE_FREE:
				return getSpaceFree();
			case HealthmonitorsPackage.STORAGE_PARTITION__SPACE_TOTAL:
				return getSpaceTotal();
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
			case HealthmonitorsPackage.STORAGE_PARTITION__DEVICE:
				setDevice((String)newValue);
				return;
			case HealthmonitorsPackage.STORAGE_PARTITION__MOUNT:
				setMount((String)newValue);
				return;
			case HealthmonitorsPackage.STORAGE_PARTITION__FILE_SYSTEM:
				setFileSystem((String)newValue);
				return;
			case HealthmonitorsPackage.STORAGE_PARTITION__INODE_FREE:
				setInodeFree((Long)newValue);
				return;
			case HealthmonitorsPackage.STORAGE_PARTITION__INODE_TOTAL:
				setInodeTotal((Long)newValue);
				return;
			case HealthmonitorsPackage.STORAGE_PARTITION__SPACE_FREE:
				setSpaceFree((Long)newValue);
				return;
			case HealthmonitorsPackage.STORAGE_PARTITION__SPACE_TOTAL:
				setSpaceTotal((Long)newValue);
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
			case HealthmonitorsPackage.STORAGE_PARTITION__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case HealthmonitorsPackage.STORAGE_PARTITION__MOUNT:
				setMount(MOUNT_EDEFAULT);
				return;
			case HealthmonitorsPackage.STORAGE_PARTITION__FILE_SYSTEM:
				setFileSystem(FILE_SYSTEM_EDEFAULT);
				return;
			case HealthmonitorsPackage.STORAGE_PARTITION__INODE_FREE:
				setInodeFree(INODE_FREE_EDEFAULT);
				return;
			case HealthmonitorsPackage.STORAGE_PARTITION__INODE_TOTAL:
				setInodeTotal(INODE_TOTAL_EDEFAULT);
				return;
			case HealthmonitorsPackage.STORAGE_PARTITION__SPACE_FREE:
				setSpaceFree(SPACE_FREE_EDEFAULT);
				return;
			case HealthmonitorsPackage.STORAGE_PARTITION__SPACE_TOTAL:
				setSpaceTotal(SPACE_TOTAL_EDEFAULT);
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
			case HealthmonitorsPackage.STORAGE_PARTITION__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case HealthmonitorsPackage.STORAGE_PARTITION__MOUNT:
				return MOUNT_EDEFAULT == null ? mount != null : !MOUNT_EDEFAULT.equals(mount);
			case HealthmonitorsPackage.STORAGE_PARTITION__FILE_SYSTEM:
				return FILE_SYSTEM_EDEFAULT == null ? fileSystem != null : !FILE_SYSTEM_EDEFAULT.equals(fileSystem);
			case HealthmonitorsPackage.STORAGE_PARTITION__INODE_FREE:
				return inodeFree != INODE_FREE_EDEFAULT;
			case HealthmonitorsPackage.STORAGE_PARTITION__INODE_TOTAL:
				return inodeTotal != INODE_TOTAL_EDEFAULT;
			case HealthmonitorsPackage.STORAGE_PARTITION__SPACE_FREE:
				return spaceFree != SPACE_FREE_EDEFAULT;
			case HealthmonitorsPackage.STORAGE_PARTITION__SPACE_TOTAL:
				return spaceTotal != SPACE_TOTAL_EDEFAULT;
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
		result.append(" (device: ");
		result.append(device);
		result.append(", mount: ");
		result.append(mount);
		result.append(", fileSystem: ");
		result.append(fileSystem);
		result.append(", inodeFree: ");
		result.append(inodeFree);
		result.append(", inodeTotal: ");
		result.append(inodeTotal);
		result.append(", spaceFree: ");
		result.append(spaceFree);
		result.append(", spaceTotal: ");
		result.append(spaceTotal);
		result.append(')');
		return result.toString();
	}

} //StoragePartitionImpl
