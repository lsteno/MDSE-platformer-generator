/**
 */
package platformer.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import platformer.PlatformerPackage;
import platformer.Player;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platformer.impl.PlayerImpl#isPowered_up <em>Powered up</em>}</li>
 *   <li>{@link platformer.impl.PlayerImpl#getPowered_time <em>Powered time</em>}</li>
 *   <li>{@link platformer.impl.PlayerImpl#getJump_speed <em>Jump speed</em>}</li>
 *   <li>{@link platformer.impl.PlayerImpl#isOn_ground <em>On ground</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends EntityImpl implements Player {
	/**
	 * The default value of the '{@link #isPowered_up() <em>Powered up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPowered_up()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POWERED_UP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPowered_up() <em>Powered up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPowered_up()
	 * @generated
	 * @ordered
	 */
	protected boolean powered_up = POWERED_UP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowered_time() <em>Powered time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowered_time()
	 * @generated
	 * @ordered
	 */
	protected static final int POWERED_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPowered_time() <em>Powered time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowered_time()
	 * @generated
	 * @ordered
	 */
	protected int powered_time = POWERED_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJump_speed() <em>Jump speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJump_speed()
	 * @generated
	 * @ordered
	 */
	protected static final int JUMP_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJump_speed() <em>Jump speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJump_speed()
	 * @generated
	 * @ordered
	 */
	protected int jump_speed = JUMP_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #isOn_ground() <em>On ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOn_ground()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ON_GROUND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOn_ground() <em>On ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOn_ground()
	 * @generated
	 * @ordered
	 */
	protected boolean on_ground = ON_GROUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformerPackage.Literals.PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPowered_up() {
		return powered_up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowered_up(boolean newPowered_up) {
		boolean oldPowered_up = powered_up;
		powered_up = newPowered_up;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.PLAYER__POWERED_UP, oldPowered_up,
					powered_up));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPowered_time() {
		return powered_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowered_time(int newPowered_time) {
		int oldPowered_time = powered_time;
		powered_time = newPowered_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.PLAYER__POWERED_TIME,
					oldPowered_time, powered_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getJump_speed() {
		return jump_speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJump_speed(int newJump_speed) {
		int oldJump_speed = jump_speed;
		jump_speed = newJump_speed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.PLAYER__JUMP_SPEED, oldJump_speed,
					jump_speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOn_ground() {
		return on_ground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOn_ground(boolean newOn_ground) {
		boolean oldOn_ground = on_ground;
		on_ground = newOn_ground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.PLAYER__ON_GROUND, oldOn_ground,
					on_ground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void jump() {
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
	public void performAction() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlatformerPackage.PLAYER__POWERED_UP:
			return isPowered_up();
		case PlatformerPackage.PLAYER__POWERED_TIME:
			return getPowered_time();
		case PlatformerPackage.PLAYER__JUMP_SPEED:
			return getJump_speed();
		case PlatformerPackage.PLAYER__ON_GROUND:
			return isOn_ground();
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
		case PlatformerPackage.PLAYER__POWERED_UP:
			setPowered_up((Boolean) newValue);
			return;
		case PlatformerPackage.PLAYER__POWERED_TIME:
			setPowered_time((Integer) newValue);
			return;
		case PlatformerPackage.PLAYER__JUMP_SPEED:
			setJump_speed((Integer) newValue);
			return;
		case PlatformerPackage.PLAYER__ON_GROUND:
			setOn_ground((Boolean) newValue);
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
		case PlatformerPackage.PLAYER__POWERED_UP:
			setPowered_up(POWERED_UP_EDEFAULT);
			return;
		case PlatformerPackage.PLAYER__POWERED_TIME:
			setPowered_time(POWERED_TIME_EDEFAULT);
			return;
		case PlatformerPackage.PLAYER__JUMP_SPEED:
			setJump_speed(JUMP_SPEED_EDEFAULT);
			return;
		case PlatformerPackage.PLAYER__ON_GROUND:
			setOn_ground(ON_GROUND_EDEFAULT);
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
		case PlatformerPackage.PLAYER__POWERED_UP:
			return powered_up != POWERED_UP_EDEFAULT;
		case PlatformerPackage.PLAYER__POWERED_TIME:
			return powered_time != POWERED_TIME_EDEFAULT;
		case PlatformerPackage.PLAYER__JUMP_SPEED:
			return jump_speed != JUMP_SPEED_EDEFAULT;
		case PlatformerPackage.PLAYER__ON_GROUND:
			return on_ground != ON_GROUND_EDEFAULT;
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
		case PlatformerPackage.PLAYER___JUMP:
			jump();
			return null;
		case PlatformerPackage.PLAYER___PERFORM_ACTION:
			performAction();
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
		result.append(" (powered_up: ");
		result.append(powered_up);
		result.append(", powered_time: ");
		result.append(powered_time);
		result.append(", jump_speed: ");
		result.append(jump_speed);
		result.append(", on_ground: ");
		result.append(on_ground);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl
