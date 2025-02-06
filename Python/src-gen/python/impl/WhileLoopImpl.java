/**
 */
package python.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import python.BooleanExpression;
import python.PythonPackage;
import python.Script;
import python.WhileLoop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link python.impl.WhileLoopImpl#getBooleanexpression <em>Booleanexpression</em>}</li>
 *   <li>{@link python.impl.WhileLoopImpl#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileLoopImpl extends MinimalEObjectImpl.Container implements WhileLoop {
	/**
	 * The cached value of the '{@link #getBooleanexpression() <em>Booleanexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanexpression()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression booleanexpression;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected Script script;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonPackage.Literals.WHILE_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanExpression getBooleanexpression() {
		return booleanexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanexpression(BooleanExpression newBooleanexpression, NotificationChain msgs) {
		BooleanExpression oldBooleanexpression = booleanexpression;
		booleanexpression = newBooleanexpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PythonPackage.WHILE_LOOP__BOOLEANEXPRESSION, oldBooleanexpression, newBooleanexpression);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBooleanexpression(BooleanExpression newBooleanexpression) {
		if (newBooleanexpression != booleanexpression) {
			NotificationChain msgs = null;
			if (booleanexpression != null)
				msgs = ((InternalEObject) booleanexpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PythonPackage.WHILE_LOOP__BOOLEANEXPRESSION, null, msgs);
			if (newBooleanexpression != null)
				msgs = ((InternalEObject) newBooleanexpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PythonPackage.WHILE_LOOP__BOOLEANEXPRESSION, null, msgs);
			msgs = basicSetBooleanexpression(newBooleanexpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonPackage.WHILE_LOOP__BOOLEANEXPRESSION,
					newBooleanexpression, newBooleanexpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Script getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(Script newScript, NotificationChain msgs) {
		Script oldScript = script;
		script = newScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PythonPackage.WHILE_LOOP__SCRIPT, oldScript, newScript);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScript(Script newScript) {
		if (newScript != script) {
			NotificationChain msgs = null;
			if (script != null)
				msgs = ((InternalEObject) script).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PythonPackage.WHILE_LOOP__SCRIPT, null, msgs);
			if (newScript != null)
				msgs = ((InternalEObject) newScript).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PythonPackage.WHILE_LOOP__SCRIPT, null, msgs);
			msgs = basicSetScript(newScript, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonPackage.WHILE_LOOP__SCRIPT, newScript,
					newScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PythonPackage.WHILE_LOOP__BOOLEANEXPRESSION:
			return basicSetBooleanexpression(null, msgs);
		case PythonPackage.WHILE_LOOP__SCRIPT:
			return basicSetScript(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PythonPackage.WHILE_LOOP__BOOLEANEXPRESSION:
			return getBooleanexpression();
		case PythonPackage.WHILE_LOOP__SCRIPT:
			return getScript();
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
		case PythonPackage.WHILE_LOOP__BOOLEANEXPRESSION:
			setBooleanexpression((BooleanExpression) newValue);
			return;
		case PythonPackage.WHILE_LOOP__SCRIPT:
			setScript((Script) newValue);
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
		case PythonPackage.WHILE_LOOP__BOOLEANEXPRESSION:
			setBooleanexpression((BooleanExpression) null);
			return;
		case PythonPackage.WHILE_LOOP__SCRIPT:
			setScript((Script) null);
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
		case PythonPackage.WHILE_LOOP__BOOLEANEXPRESSION:
			return booleanexpression != null;
		case PythonPackage.WHILE_LOOP__SCRIPT:
			return script != null;
		}
		return super.eIsSet(featureID);
	}

} //WhileLoopImpl
