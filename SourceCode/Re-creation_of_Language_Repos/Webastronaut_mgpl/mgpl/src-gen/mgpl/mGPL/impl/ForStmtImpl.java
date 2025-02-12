/**
 * generated by Xtext 2.35.0
 */
package mgpl.mGPL.impl;

import mgpl.mGPL.AssStmt;
import mgpl.mGPL.Expr;
import mgpl.mGPL.ForStmt;
import mgpl.mGPL.MGPLPackage;
import mgpl.mGPL.StmtBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgpl.mGPL.impl.ForStmtImpl#getInit <em>Init</em>}</li>
 *   <li>{@link mgpl.mGPL.impl.ForStmtImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link mgpl.mGPL.impl.ForStmtImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link mgpl.mGPL.impl.ForStmtImpl#getStmtBlock <em>Stmt Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForStmtImpl extends StmtImpl implements ForStmt
{
  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected AssStmt init;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expr condition;

  /**
   * The cached value of the '{@link #getLoop() <em>Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoop()
   * @generated
   * @ordered
   */
  protected AssStmt loop;

  /**
   * The cached value of the '{@link #getStmtBlock() <em>Stmt Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmtBlock()
   * @generated
   * @ordered
   */
  protected StmtBlock stmtBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForStmtImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MGPLPackage.Literals.FOR_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssStmt getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit(AssStmt newInit, NotificationChain msgs)
  {
    AssStmt oldInit = init;
    init = newInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGPLPackage.FOR_STMT__INIT, oldInit, newInit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInit(AssStmt newInit)
  {
    if (newInit != init)
    {
      NotificationChain msgs = null;
      if (init != null)
        msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGPLPackage.FOR_STMT__INIT, null, msgs);
      if (newInit != null)
        msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGPLPackage.FOR_STMT__INIT, null, msgs);
      msgs = basicSetInit(newInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGPLPackage.FOR_STMT__INIT, newInit, newInit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expr getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expr newCondition, NotificationChain msgs)
  {
    Expr oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGPLPackage.FOR_STMT__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCondition(Expr newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGPLPackage.FOR_STMT__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGPLPackage.FOR_STMT__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGPLPackage.FOR_STMT__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssStmt getLoop()
  {
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLoop(AssStmt newLoop, NotificationChain msgs)
  {
    AssStmt oldLoop = loop;
    loop = newLoop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGPLPackage.FOR_STMT__LOOP, oldLoop, newLoop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLoop(AssStmt newLoop)
  {
    if (newLoop != loop)
    {
      NotificationChain msgs = null;
      if (loop != null)
        msgs = ((InternalEObject)loop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGPLPackage.FOR_STMT__LOOP, null, msgs);
      if (newLoop != null)
        msgs = ((InternalEObject)newLoop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGPLPackage.FOR_STMT__LOOP, null, msgs);
      msgs = basicSetLoop(newLoop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGPLPackage.FOR_STMT__LOOP, newLoop, newLoop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StmtBlock getStmtBlock()
  {
    return stmtBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStmtBlock(StmtBlock newStmtBlock, NotificationChain msgs)
  {
    StmtBlock oldStmtBlock = stmtBlock;
    stmtBlock = newStmtBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGPLPackage.FOR_STMT__STMT_BLOCK, oldStmtBlock, newStmtBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStmtBlock(StmtBlock newStmtBlock)
  {
    if (newStmtBlock != stmtBlock)
    {
      NotificationChain msgs = null;
      if (stmtBlock != null)
        msgs = ((InternalEObject)stmtBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGPLPackage.FOR_STMT__STMT_BLOCK, null, msgs);
      if (newStmtBlock != null)
        msgs = ((InternalEObject)newStmtBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGPLPackage.FOR_STMT__STMT_BLOCK, null, msgs);
      msgs = basicSetStmtBlock(newStmtBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGPLPackage.FOR_STMT__STMT_BLOCK, newStmtBlock, newStmtBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MGPLPackage.FOR_STMT__INIT:
        return basicSetInit(null, msgs);
      case MGPLPackage.FOR_STMT__CONDITION:
        return basicSetCondition(null, msgs);
      case MGPLPackage.FOR_STMT__LOOP:
        return basicSetLoop(null, msgs);
      case MGPLPackage.FOR_STMT__STMT_BLOCK:
        return basicSetStmtBlock(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MGPLPackage.FOR_STMT__INIT:
        return getInit();
      case MGPLPackage.FOR_STMT__CONDITION:
        return getCondition();
      case MGPLPackage.FOR_STMT__LOOP:
        return getLoop();
      case MGPLPackage.FOR_STMT__STMT_BLOCK:
        return getStmtBlock();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MGPLPackage.FOR_STMT__INIT:
        setInit((AssStmt)newValue);
        return;
      case MGPLPackage.FOR_STMT__CONDITION:
        setCondition((Expr)newValue);
        return;
      case MGPLPackage.FOR_STMT__LOOP:
        setLoop((AssStmt)newValue);
        return;
      case MGPLPackage.FOR_STMT__STMT_BLOCK:
        setStmtBlock((StmtBlock)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MGPLPackage.FOR_STMT__INIT:
        setInit((AssStmt)null);
        return;
      case MGPLPackage.FOR_STMT__CONDITION:
        setCondition((Expr)null);
        return;
      case MGPLPackage.FOR_STMT__LOOP:
        setLoop((AssStmt)null);
        return;
      case MGPLPackage.FOR_STMT__STMT_BLOCK:
        setStmtBlock((StmtBlock)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MGPLPackage.FOR_STMT__INIT:
        return init != null;
      case MGPLPackage.FOR_STMT__CONDITION:
        return condition != null;
      case MGPLPackage.FOR_STMT__LOOP:
        return loop != null;
      case MGPLPackage.FOR_STMT__STMT_BLOCK:
        return stmtBlock != null;
    }
    return super.eIsSet(featureID);
  }

} //ForStmtImpl
