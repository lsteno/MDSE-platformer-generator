/**
 */
package python.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import python.ConditionalStatement;
import python.ElseBlock;
import python.ElseIfBlock;
import python.IfBlock;
import python.PythonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link python.impl.ConditionalStatementImpl#getIfblock <em>Ifblock</em>}</li>
 *   <li>{@link python.impl.ConditionalStatementImpl#getElseifblock <em>Elseifblock</em>}</li>
 *   <li>{@link python.impl.ConditionalStatementImpl#getElseblock <em>Elseblock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalStatementImpl extends MinimalEObjectImpl.Container implements ConditionalStatement {
	/**
	 * The cached value of the '{@link #getIfblock() <em>Ifblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfblock()
	 * @generated
	 * @ordered
	 */
	protected IfBlock ifblock;

	/**
	 * The cached value of the '{@link #getElseifblock() <em>Elseifblock</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseifblock()
	 * @generated
	 * @ordered
	 */
	protected EList<ElseIfBlock> elseifblock;

	/**
	 * The cached value of the '{@link #getElseblock() <em>Elseblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseblock()
	 * @generated
	 * @ordered
	 */
	protected ElseBlock elseblock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonPackage.Literals.CONDITIONAL_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfBlock getIfblock() {
		return ifblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfblock(IfBlock newIfblock, NotificationChain msgs) {
		IfBlock oldIfblock = ifblock;
		ifblock = newIfblock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PythonPackage.CONDITIONAL_STATEMENT__IFBLOCK, oldIfblock, newIfblock);
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
	public void setIfblock(IfBlock newIfblock) {
		if (newIfblock != ifblock) {
			NotificationChain msgs = null;
			if (ifblock != null)
				msgs = ((InternalEObject) ifblock).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PythonPackage.CONDITIONAL_STATEMENT__IFBLOCK, null, msgs);
			if (newIfblock != null)
				msgs = ((InternalEObject) newIfblock).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PythonPackage.CONDITIONAL_STATEMENT__IFBLOCK, null, msgs);
			msgs = basicSetIfblock(newIfblock, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonPackage.CONDITIONAL_STATEMENT__IFBLOCK,
					newIfblock, newIfblock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElseIfBlock> getElseifblock() {
		if (elseifblock == null) {
			elseifblock = new EObjectContainmentEList<ElseIfBlock>(ElseIfBlock.class, this,
					PythonPackage.CONDITIONAL_STATEMENT__ELSEIFBLOCK);
		}
		return elseifblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElseBlock getElseblock() {
		return elseblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseblock(ElseBlock newElseblock, NotificationChain msgs) {
		ElseBlock oldElseblock = elseblock;
		elseblock = newElseblock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PythonPackage.CONDITIONAL_STATEMENT__ELSEBLOCK, oldElseblock, newElseblock);
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
	public void setElseblock(ElseBlock newElseblock) {
		if (newElseblock != elseblock) {
			NotificationChain msgs = null;
			if (elseblock != null)
				msgs = ((InternalEObject) elseblock).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PythonPackage.CONDITIONAL_STATEMENT__ELSEBLOCK, null, msgs);
			if (newElseblock != null)
				msgs = ((InternalEObject) newElseblock).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PythonPackage.CONDITIONAL_STATEMENT__ELSEBLOCK, null, msgs);
			msgs = basicSetElseblock(newElseblock, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonPackage.CONDITIONAL_STATEMENT__ELSEBLOCK,
					newElseblock, newElseblock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PythonPackage.CONDITIONAL_STATEMENT__IFBLOCK:
			return basicSetIfblock(null, msgs);
		case PythonPackage.CONDITIONAL_STATEMENT__ELSEIFBLOCK:
			return ((InternalEList<?>) getElseifblock()).basicRemove(otherEnd, msgs);
		case PythonPackage.CONDITIONAL_STATEMENT__ELSEBLOCK:
			return basicSetElseblock(null, msgs);
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
		case PythonPackage.CONDITIONAL_STATEMENT__IFBLOCK:
			return getIfblock();
		case PythonPackage.CONDITIONAL_STATEMENT__ELSEIFBLOCK:
			return getElseifblock();
		case PythonPackage.CONDITIONAL_STATEMENT__ELSEBLOCK:
			return getElseblock();
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
		case PythonPackage.CONDITIONAL_STATEMENT__IFBLOCK:
			setIfblock((IfBlock) newValue);
			return;
		case PythonPackage.CONDITIONAL_STATEMENT__ELSEIFBLOCK:
			getElseifblock().clear();
			getElseifblock().addAll((Collection<? extends ElseIfBlock>) newValue);
			return;
		case PythonPackage.CONDITIONAL_STATEMENT__ELSEBLOCK:
			setElseblock((ElseBlock) newValue);
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
		case PythonPackage.CONDITIONAL_STATEMENT__IFBLOCK:
			setIfblock((IfBlock) null);
			return;
		case PythonPackage.CONDITIONAL_STATEMENT__ELSEIFBLOCK:
			getElseifblock().clear();
			return;
		case PythonPackage.CONDITIONAL_STATEMENT__ELSEBLOCK:
			setElseblock((ElseBlock) null);
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
		case PythonPackage.CONDITIONAL_STATEMENT__IFBLOCK:
			return ifblock != null;
		case PythonPackage.CONDITIONAL_STATEMENT__ELSEIFBLOCK:
			return elseifblock != null && !elseifblock.isEmpty();
		case PythonPackage.CONDITIONAL_STATEMENT__ELSEBLOCK:
			return elseblock != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalStatementImpl
