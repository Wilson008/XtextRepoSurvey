/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractNodeParameter;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.AbstractRosFileElement;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Behavior;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilePackage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.FilterConnection;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InternalEdge;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.LanguageType;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosElement;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.RosRuntimeElement;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Runtime Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosRuntimeElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosRuntimeElementImpl#isGenerateartifact <em>Generateartifact</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosRuntimeElementImpl#getFilepackage <em>Filepackage</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosRuntimeElementImpl#getContinousstate <em>Continousstate</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosRuntimeElementImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosRuntimeElementImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosRuntimeElementImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosRuntimeElementImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosRuntimeElementImpl#getNodeparameters <em>Nodeparameters</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosRuntimeElementImpl#getPort <em>Port</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosRuntimeElementImpl#getFilterconnection <em>Filterconnection</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.RosRuntimeElementImpl#getInternaledge <em>Internaledge</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RosRuntimeElementImpl extends DescriptiveElementImpl implements RosRuntimeElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateartifact() <em>Generateartifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateartifact()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATEARTIFACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateartifact() <em>Generateartifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateartifact()
	 * @generated
	 * @ordered
	 */
	protected boolean generateartifact = GENERATEARTIFACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContinousstate() <em>Continousstate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinousstate()
	 * @generated
	 * @ordered
	 */
	protected EList<ContinousState> continousstate;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected RosRuntimeElement implements_;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behavior;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<LanguageType> language;

	/**
	 * The cached value of the '{@link #getNodeparameters() <em>Nodeparameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeparameters()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractNodeParameter> nodeparameters;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * The cached value of the '{@link #getFilterconnection() <em>Filterconnection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterconnection()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterConnection> filterconnection;

	/**
	 * The cached value of the '{@link #getInternaledge() <em>Internaledge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternaledge()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalEdge> internaledge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosRuntimeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.ROS_RUNTIME_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateartifact() {
		return generateartifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateartifact(boolean newGenerateartifact) {
		boolean oldGenerateartifact = generateartifact;
		generateartifact = newGenerateartifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__GENERATEARTIFACT, oldGenerateartifact,
					generateartifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilePackage getFilepackage() {
		if (eContainerFeatureID() != StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILEPACKAGE)
			return null;
		return (FilePackage) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilepackage(FilePackage newFilepackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFilepackage,
				StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILEPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilepackage(FilePackage newFilepackage) {
		if (newFilepackage != eInternalContainer()
				|| (eContainerFeatureID() != StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILEPACKAGE
						&& newFilepackage != null)) {
			if (EcoreUtil.isAncestor(this, newFilepackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFilepackage != null)
				msgs = ((InternalEObject) newFilepackage).eInverseAdd(this,
						StatepubsubmodelPackage.FILE_PACKAGE__ABSTRACTROSELEMENT, FilePackage.class, msgs);
			msgs = basicSetFilepackage(newFilepackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILEPACKAGE, newFilepackage, newFilepackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContinousState> getContinousstate() {
		if (continousstate == null) {
			continousstate = new EObjectContainmentEList<ContinousState>(ContinousState.class, this,
					StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__CONTINOUSSTATE);
		}
		return continousstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosRuntimeElement getImplements() {
		if (implements_ != null && implements_.eIsProxy()) {
			InternalEObject oldImplements = (InternalEObject) implements_;
			implements_ = (RosRuntimeElement) eResolveProxy(oldImplements);
			if (implements_ != oldImplements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__IMPLEMENTS, oldImplements, implements_));
			}
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosRuntimeElement basicGetImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(RosRuntimeElement newImplements) {
		RosRuntimeElement oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__IMPLEMENTS, oldImplements, implements_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehavior() {
		if (behavior == null) {
			behavior = new EObjectContainmentEList<Behavior>(Behavior.class, this,
					StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__BEHAVIOR);
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LanguageType> getLanguage() {
		if (language == null) {
			language = new EDataTypeUniqueEList<LanguageType>(LanguageType.class, this,
					StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractNodeParameter> getNodeparameters() {
		if (nodeparameters == null) {
			nodeparameters = new EObjectContainmentEList<AbstractNodeParameter>(AbstractNodeParameter.class, this,
					StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NODEPARAMETERS);
		}
		return nodeparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<Port>(Port.class, this,
					StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterConnection> getFilterconnection() {
		if (filterconnection == null) {
			filterconnection = new EObjectContainmentEList<FilterConnection>(FilterConnection.class, this,
					StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILTERCONNECTION);
		}
		return filterconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalEdge> getInternaledge() {
		if (internaledge == null) {
			internaledge = new EObjectContainmentEList<InternalEdge>(InternalEdge.class, this,
					StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__INTERNALEDGE);
		}
		return internaledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILEPACKAGE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFilepackage((FilePackage) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILEPACKAGE:
			return basicSetFilepackage(null, msgs);
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__CONTINOUSSTATE:
			return ((InternalEList<?>) getContinousstate()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__BEHAVIOR:
			return ((InternalEList<?>) getBehavior()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NODEPARAMETERS:
			return ((InternalEList<?>) getNodeparameters()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__PORT:
			return ((InternalEList<?>) getPort()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILTERCONNECTION:
			return ((InternalEList<?>) getFilterconnection()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__INTERNALEDGE:
			return ((InternalEList<?>) getInternaledge()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILEPACKAGE:
			return eInternalContainer().eInverseRemove(this, StatepubsubmodelPackage.FILE_PACKAGE__ABSTRACTROSELEMENT,
					FilePackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NAME:
			return getName();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__GENERATEARTIFACT:
			return isGenerateartifact();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILEPACKAGE:
			return getFilepackage();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__CONTINOUSSTATE:
			return getContinousstate();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__IMPLEMENTS:
			if (resolve)
				return getImplements();
			return basicGetImplements();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NAMESPACE:
			return getNamespace();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__BEHAVIOR:
			return getBehavior();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__LANGUAGE:
			return getLanguage();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NODEPARAMETERS:
			return getNodeparameters();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__PORT:
			return getPort();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILTERCONNECTION:
			return getFilterconnection();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__INTERNALEDGE:
			return getInternaledge();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NAME:
			setName((String) newValue);
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__GENERATEARTIFACT:
			setGenerateartifact((Boolean) newValue);
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILEPACKAGE:
			setFilepackage((FilePackage) newValue);
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__CONTINOUSSTATE:
			getContinousstate().clear();
			getContinousstate().addAll((Collection<? extends ContinousState>) newValue);
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__IMPLEMENTS:
			setImplements((RosRuntimeElement) newValue);
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NAMESPACE:
			setNamespace((String) newValue);
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__BEHAVIOR:
			getBehavior().clear();
			getBehavior().addAll((Collection<? extends Behavior>) newValue);
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__LANGUAGE:
			getLanguage().clear();
			getLanguage().addAll((Collection<? extends LanguageType>) newValue);
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NODEPARAMETERS:
			getNodeparameters().clear();
			getNodeparameters().addAll((Collection<? extends AbstractNodeParameter>) newValue);
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__PORT:
			getPort().clear();
			getPort().addAll((Collection<? extends Port>) newValue);
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILTERCONNECTION:
			getFilterconnection().clear();
			getFilterconnection().addAll((Collection<? extends FilterConnection>) newValue);
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__INTERNALEDGE:
			getInternaledge().clear();
			getInternaledge().addAll((Collection<? extends InternalEdge>) newValue);
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
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__GENERATEARTIFACT:
			setGenerateartifact(GENERATEARTIFACT_EDEFAULT);
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILEPACKAGE:
			setFilepackage((FilePackage) null);
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__CONTINOUSSTATE:
			getContinousstate().clear();
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__IMPLEMENTS:
			setImplements((RosRuntimeElement) null);
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NAMESPACE:
			setNamespace(NAMESPACE_EDEFAULT);
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__BEHAVIOR:
			getBehavior().clear();
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__LANGUAGE:
			getLanguage().clear();
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NODEPARAMETERS:
			getNodeparameters().clear();
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__PORT:
			getPort().clear();
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILTERCONNECTION:
			getFilterconnection().clear();
			return;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__INTERNALEDGE:
			getInternaledge().clear();
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
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__GENERATEARTIFACT:
			return generateartifact != GENERATEARTIFACT_EDEFAULT;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILEPACKAGE:
			return getFilepackage() != null;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__CONTINOUSSTATE:
			return continousstate != null && !continousstate.isEmpty();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__IMPLEMENTS:
			return implements_ != null;
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NAMESPACE:
			return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__BEHAVIOR:
			return behavior != null && !behavior.isEmpty();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__LANGUAGE:
			return language != null && !language.isEmpty();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NODEPARAMETERS:
			return nodeparameters != null && !nodeparameters.isEmpty();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__PORT:
			return port != null && !port.isEmpty();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILTERCONNECTION:
			return filterconnection != null && !filterconnection.isEmpty();
		case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__INTERNALEDGE:
			return internaledge != null && !internaledge.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RosElement.class) {
			switch (derivedFeatureID) {
			case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NAME:
				return StatepubsubmodelPackage.ROS_ELEMENT__NAME;
			case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__GENERATEARTIFACT:
				return StatepubsubmodelPackage.ROS_ELEMENT__GENERATEARTIFACT;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractRosFileElement.class) {
			switch (derivedFeatureID) {
			case StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILEPACKAGE:
				return StatepubsubmodelPackage.ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RosElement.class) {
			switch (baseFeatureID) {
			case StatepubsubmodelPackage.ROS_ELEMENT__NAME:
				return StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__NAME;
			case StatepubsubmodelPackage.ROS_ELEMENT__GENERATEARTIFACT:
				return StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__GENERATEARTIFACT;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractRosFileElement.class) {
			switch (baseFeatureID) {
			case StatepubsubmodelPackage.ABSTRACT_ROS_FILE_ELEMENT__FILEPACKAGE:
				return StatepubsubmodelPackage.ROS_RUNTIME_ELEMENT__FILEPACKAGE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", generateartifact: ");
		result.append(generateartifact);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //RosRuntimeElementImpl
