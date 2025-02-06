/**
 */
package python.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import python.Assignment;
import python.Expression;
import python.PythonPackage;
import python.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link python.impl.AssignmentImpl#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link python.impl.AssignmentImpl#getRightSide <em>Right Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends MinimalEObjectImpl.Container implements Assignment {
	/**
	 * The cached value of the '{@link #getLeftSide() <em>Left Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSide()
	 * @generated
	 * @ordered
	 */
	protected Variable leftSide;

	/**
	 * The cached value of the '{@link #getRightSide() <em>Right Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSide()
	 * @generated
	 * @ordered
	 */
	protected Expression rightSide;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonPackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getLeftSide() {
		return leftSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftSide(Variable newLeftSide, NotificationChain msgs) {
		Variable oldLeftSide = leftSide;
		leftSide = newLeftSide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PythonPackage.ASSIGNMENT__LEFT_SIDE, oldLeftSide, newLeftSide);
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
	public void setLeftSide(Variable newLeftSide) {
		if (newLeftSide != leftSide) {
			NotificationChain msgs = null;
			if (leftSide != null)
				msgs = ((InternalEObject) leftSide).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PythonPackage.ASSIGNMENT__LEFT_SIDE, null, msgs);
			if (newLeftSide != null)
				msgs = ((InternalEObject) newLeftSide).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PythonPackage.ASSIGNMENT__LEFT_SIDE, null, msgs);
			msgs = basicSetLeftSide(newLeftSide, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonPackage.ASSIGNMENT__LEFT_SIDE, newLeftSide,
					newLeftSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getRightSide() {
		return rightSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightSide(Expression newRightSide, NotificationChain msgs) {
		Expression oldRightSide = rightSide;
		rightSide = newRightSide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PythonPackage.ASSIGNMENT__RIGHT_SIDE, oldRightSide, newRightSide);
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
	public void setRightSide(Expression newRightSide) {
		if (newRightSide != rightSide) {
			NotificationChain msgs = null;
			if (rightSide != null)
				msgs = ((InternalEObject) rightSide).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PythonPackage.ASSIGNMENT__RIGHT_SIDE, null, msgs);
			if (newRightSide != null)
				msgs = ((InternalEObject) newRightSide).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PythonPackage.ASSIGNMENT__RIGHT_SIDE, null, msgs);
			msgs = basicSetRightSide(newRightSide, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PythonPackage.ASSIGNMENT__RIGHT_SIDE, newRightSide,
					newRightSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PythonPackage.ASSIGNMENT__LEFT_SIDE:
			return basicSetLeftSide(null, msgs);
		case PythonPackage.ASSIGNMENT__RIGHT_SIDE:
			return basicSetRightSide(null, msgs);
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
		case PythonPackage.ASSIGNMENT__LEFT_SIDE:
			return getLeftSide();
		case PythonPackage.ASSIGNMENT__RIGHT_SIDE:
			return getRightSide();
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
		case PythonPackage.ASSIGNMENT__LEFT_SIDE:
			setLeftSide((Variable) newValue);
			return;
		case PythonPackage.ASSIGNMENT__RIGHT_SIDE:
			setRightSide((Expression) newValue);
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
		case PythonPackage.ASSIGNMENT__LEFT_SIDE:
			setLeftSide((Variable) null);
			return;
		case PythonPackage.ASSIGNMENT__RIGHT_SIDE:
			setRightSide((Expression) null);
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
		case PythonPackage.ASSIGNMENT__LEFT_SIDE:
			return leftSide != null;
		case PythonPackage.ASSIGNMENT__RIGHT_SIDE:
			return rightSide != null;
		}
		return super.eIsSet(featureID);
	}

} //AssignmentImpl
