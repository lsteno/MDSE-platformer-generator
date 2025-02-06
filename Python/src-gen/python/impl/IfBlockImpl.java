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
import python.IfBlock;
import python.PythonPackage;
import python.Script;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link python.impl.IfBlockImpl#getScript <em>Script</em>}</li>
 *   <li>{@link python.impl.IfBlockImpl#getBooleanexpression <em>Booleanexpression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfBlockImpl extends MinimalEObjectImpl.Container implements IfBlock {
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
	 * The cached value of the '{@link #getBooleanexpression() <em>Booleanexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanexpression()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression booleanexpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonPackage.Literals.IF_BLOCK;
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
					PythonPackage.IF_BLOCK__SCRIPT, oldScript, newScript);
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
						EOPPOSITE_FEATURE_BASE - PythonPackage.IF_BLOCK__SCRIPT, null, msgs);
			if (newScript != null)
				msgs = ((InternalEObject) newScript).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PythonPackage.IF_BLOCK__SCRIPT, null, msgs);
			msgs = basicSetScript(newScript, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonPackage.IF_BLOCK__SCRIPT, newScript,
					newScript));
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
					PythonPackage.IF_BLOCK__BOOLEANEXPRESSION, oldBooleanexpression, newBooleanexpression);
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
						EOPPOSITE_FEATURE_BASE - PythonPackage.IF_BLOCK__BOOLEANEXPRESSION, null, msgs);
			if (newBooleanexpression != null)
				msgs = ((InternalEObject) newBooleanexpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PythonPackage.IF_BLOCK__BOOLEANEXPRESSION, null, msgs);
			msgs = basicSetBooleanexpression(newBooleanexpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonPackage.IF_BLOCK__BOOLEANEXPRESSION,
					newBooleanexpression, newBooleanexpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PythonPackage.IF_BLOCK__SCRIPT:
			return basicSetScript(null, msgs);
		case PythonPackage.IF_BLOCK__BOOLEANEXPRESSION:
			return basicSetBooleanexpression(null, msgs);
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
		case PythonPackage.IF_BLOCK__SCRIPT:
			return getScript();
		case PythonPackage.IF_BLOCK__BOOLEANEXPRESSION:
			return getBooleanexpression();
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
		case PythonPackage.IF_BLOCK__SCRIPT:
			setScript((Script) newValue);
			return;
		case PythonPackage.IF_BLOCK__BOOLEANEXPRESSION:
			setBooleanexpression((BooleanExpression) newValue);
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
		case PythonPackage.IF_BLOCK__SCRIPT:
			setScript((Script) null);
			return;
		case PythonPackage.IF_BLOCK__BOOLEANEXPRESSION:
			setBooleanexpression((BooleanExpression) null);
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
		case PythonPackage.IF_BLOCK__SCRIPT:
			return script != null;
		case PythonPackage.IF_BLOCK__BOOLEANEXPRESSION:
			return booleanexpression != null;
		}
		return super.eIsSet(featureID);
	}

} //IfBlockImpl
