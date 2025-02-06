/**
 */
package platformer.impl;

import java.lang.reflect.InvocationTargetException;
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
import platformer.Button;
import platformer.Lives;
import platformer.PlatformerPackage;
import platformer.Score;
import platformer.UI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platformer.impl.UIImpl#getButton <em>Button</em>}</li>
 *   <li>{@link platformer.impl.UIImpl#getLivesCount <em>Lives Count</em>}</li>
 *   <li>{@link platformer.impl.UIImpl#getScoreCount <em>Score Count</em>}</li>
 *   <li>{@link platformer.impl.UIImpl#isMenu_open <em>Menu open</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIImpl extends MinimalEObjectImpl.Container implements UI {
	/**
	 * The cached value of the '{@link #getButton() <em>Button</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButton()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> button;

	/**
	 * The cached value of the '{@link #getLivesCount() <em>Lives Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLivesCount()
	 * @generated
	 * @ordered
	 */
	protected Lives livesCount;

	/**
	 * The cached value of the '{@link #getScoreCount() <em>Score Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoreCount()
	 * @generated
	 * @ordered
	 */
	protected Score scoreCount;

	/**
	 * The default value of the '{@link #isMenu_open() <em>Menu open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMenu_open()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MENU_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMenu_open() <em>Menu open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMenu_open()
	 * @generated
	 * @ordered
	 */
	protected boolean menu_open = MENU_OPEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformerPackage.Literals.UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Button> getButton() {
		if (button == null) {
			button = new EObjectContainmentEList<Button>(Button.class, this, PlatformerPackage.UI__BUTTON);
		}
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lives getLivesCount() {
		if (livesCount != null && livesCount.eIsProxy()) {
			InternalEObject oldLivesCount = (InternalEObject) livesCount;
			livesCount = (Lives) eResolveProxy(oldLivesCount);
			if (livesCount != oldLivesCount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformerPackage.UI__LIVES_COUNT,
							oldLivesCount, livesCount));
			}
		}
		return livesCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lives basicGetLivesCount() {
		return livesCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLivesCount(Lives newLivesCount) {
		Lives oldLivesCount = livesCount;
		livesCount = newLivesCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.UI__LIVES_COUNT, oldLivesCount,
					livesCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Score getScoreCount() {
		if (scoreCount != null && scoreCount.eIsProxy()) {
			InternalEObject oldScoreCount = (InternalEObject) scoreCount;
			scoreCount = (Score) eResolveProxy(oldScoreCount);
			if (scoreCount != oldScoreCount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformerPackage.UI__SCORE_COUNT,
							oldScoreCount, scoreCount));
			}
		}
		return scoreCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Score basicGetScoreCount() {
		return scoreCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScoreCount(Score newScoreCount) {
		Score oldScoreCount = scoreCount;
		scoreCount = newScoreCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.UI__SCORE_COUNT, oldScoreCount,
					scoreCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMenu_open() {
		return menu_open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMenu_open(boolean newMenu_open) {
		boolean oldMenu_open = menu_open;
		menu_open = newMenu_open;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.UI__MENU_OPEN, oldMenu_open,
					menu_open));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void draw() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void handle_click() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PlatformerPackage.UI__BUTTON:
			return ((InternalEList<?>) getButton()).basicRemove(otherEnd, msgs);
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
		case PlatformerPackage.UI__BUTTON:
			return getButton();
		case PlatformerPackage.UI__LIVES_COUNT:
			if (resolve)
				return getLivesCount();
			return basicGetLivesCount();
		case PlatformerPackage.UI__SCORE_COUNT:
			if (resolve)
				return getScoreCount();
			return basicGetScoreCount();
		case PlatformerPackage.UI__MENU_OPEN:
			return isMenu_open();
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
		case PlatformerPackage.UI__BUTTON:
			getButton().clear();
			getButton().addAll((Collection<? extends Button>) newValue);
			return;
		case PlatformerPackage.UI__LIVES_COUNT:
			setLivesCount((Lives) newValue);
			return;
		case PlatformerPackage.UI__SCORE_COUNT:
			setScoreCount((Score) newValue);
			return;
		case PlatformerPackage.UI__MENU_OPEN:
			setMenu_open((Boolean) newValue);
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
		case PlatformerPackage.UI__BUTTON:
			getButton().clear();
			return;
		case PlatformerPackage.UI__LIVES_COUNT:
			setLivesCount((Lives) null);
			return;
		case PlatformerPackage.UI__SCORE_COUNT:
			setScoreCount((Score) null);
			return;
		case PlatformerPackage.UI__MENU_OPEN:
			setMenu_open(MENU_OPEN_EDEFAULT);
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
		case PlatformerPackage.UI__BUTTON:
			return button != null && !button.isEmpty();
		case PlatformerPackage.UI__LIVES_COUNT:
			return livesCount != null;
		case PlatformerPackage.UI__SCORE_COUNT:
			return scoreCount != null;
		case PlatformerPackage.UI__MENU_OPEN:
			return menu_open != MENU_OPEN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PlatformerPackage.UI___DRAW:
			draw();
			return null;
		case PlatformerPackage.UI___HANDLE_CLICK:
			handle_click();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (menu_open: ");
		result.append(menu_open);
		result.append(')');
		return result.toString();
	}

} //UIImpl
