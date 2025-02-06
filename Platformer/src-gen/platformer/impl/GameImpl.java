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

import platformer.Game;
import platformer.Level;
import platformer.Lives;
import platformer.PlatformerPackage;
import platformer.Score;
import platformer.UI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platformer.impl.GameImpl#getCurrentLevelCounter <em>Current Level Counter</em>}</li>
 *   <li>{@link platformer.impl.GameImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link platformer.impl.GameImpl#getUi <em>Ui</em>}</li>
 *   <li>{@link platformer.impl.GameImpl#getFriction <em>Friction</em>}</li>
 *   <li>{@link platformer.impl.GameImpl#getGravity <em>Gravity</em>}</li>
 *   <li>{@link platformer.impl.GameImpl#getLives <em>Lives</em>}</li>
 *   <li>{@link platformer.impl.GameImpl#getScreen <em>Screen</em>}</li>
 *   <li>{@link platformer.impl.GameImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link platformer.impl.GameImpl#isRunning <em>Running</em>}</li>
 *   <li>{@link platformer.impl.GameImpl#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The default value of the '{@link #getCurrentLevelCounter() <em>Current Level Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLevelCounter()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_LEVEL_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentLevelCounter() <em>Current Level Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLevelCounter()
	 * @generated
	 * @ordered
	 */
	protected int currentLevelCounter = CURRENT_LEVEL_COUNTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLevels() <em>Levels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<Level> levels;

	/**
	 * The cached value of the '{@link #getUi() <em>Ui</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUi()
	 * @generated
	 * @ordered
	 */
	protected UI ui;

	/**
	 * The default value of the '{@link #getFriction() <em>Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriction()
	 * @generated
	 * @ordered
	 */
	protected static final int FRICTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFriction() <em>Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriction()
	 * @generated
	 * @ordered
	 */
	protected int friction = FRICTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGravity() <em>Gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravity()
	 * @generated
	 * @ordered
	 */
	protected static final int GRAVITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGravity() <em>Gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravity()
	 * @generated
	 * @ordered
	 */
	protected int gravity = GRAVITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLives() <em>Lives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLives()
	 * @generated
	 * @ordered
	 */
	protected Lives lives;

	/**
	 * The default value of the '{@link #getScreen() <em>Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreen()
	 * @generated
	 * @ordered
	 */
	protected static final String SCREEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScreen() <em>Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreen()
	 * @generated
	 * @ordered
	 */
	protected String screen = SCREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getClock() <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected String clock = CLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUNNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected boolean running = RUNNING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected Score score;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformerPackage.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCurrentLevelCounter() {
		return currentLevelCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentLevelCounter(int newCurrentLevelCounter) {
		int oldCurrentLevelCounter = currentLevelCounter;
		currentLevelCounter = newCurrentLevelCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.GAME__CURRENT_LEVEL_COUNTER,
					oldCurrentLevelCounter, currentLevelCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Level> getLevels() {
		if (levels == null) {
			levels = new EObjectContainmentEList<Level>(Level.class, this, PlatformerPackage.GAME__LEVELS);
		}
		return levels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UI getUi() {
		return ui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUi(UI newUi, NotificationChain msgs) {
		UI oldUi = ui;
		ui = newUi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformerPackage.GAME__UI,
					oldUi, newUi);
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
	public void setUi(UI newUi) {
		if (newUi != ui) {
			NotificationChain msgs = null;
			if (ui != null)
				msgs = ((InternalEObject) ui).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatformerPackage.GAME__UI,
						null, msgs);
			if (newUi != null)
				msgs = ((InternalEObject) newUi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatformerPackage.GAME__UI,
						null, msgs);
			msgs = basicSetUi(newUi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.GAME__UI, newUi, newUi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFriction() {
		return friction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFriction(int newFriction) {
		int oldFriction = friction;
		friction = newFriction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.GAME__FRICTION, oldFriction,
					friction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGravity() {
		return gravity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGravity(int newGravity) {
		int oldGravity = gravity;
		gravity = newGravity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.GAME__GRAVITY, oldGravity,
					gravity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lives getLives() {
		return lives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLives(Lives newLives, NotificationChain msgs) {
		Lives oldLives = lives;
		lives = newLives;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PlatformerPackage.GAME__LIVES, oldLives, newLives);
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
	public void setLives(Lives newLives) {
		if (newLives != lives) {
			NotificationChain msgs = null;
			if (lives != null)
				msgs = ((InternalEObject) lives).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PlatformerPackage.GAME__LIVES, null, msgs);
			if (newLives != null)
				msgs = ((InternalEObject) newLives).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PlatformerPackage.GAME__LIVES, null, msgs);
			msgs = basicSetLives(newLives, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.GAME__LIVES, newLives, newLives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScreen() {
		return screen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScreen(String newScreen) {
		String oldScreen = screen;
		screen = newScreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.GAME__SCREEN, oldScreen, screen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClock(String newClock) {
		String oldClock = clock;
		clock = newClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.GAME__CLOCK, oldClock, clock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRunning() {
		return running;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunning(boolean newRunning) {
		boolean oldRunning = running;
		running = newRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.GAME__RUNNING, oldRunning,
					running));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Score getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScore(Score newScore, NotificationChain msgs) {
		Score oldScore = score;
		score = newScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PlatformerPackage.GAME__SCORE, oldScore, newScore);
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
	public void setScore(Score newScore) {
		if (newScore != score) {
			NotificationChain msgs = null;
			if (score != null)
				msgs = ((InternalEObject) score).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PlatformerPackage.GAME__SCORE, null, msgs);
			if (newScore != null)
				msgs = ((InternalEObject) newScore).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PlatformerPackage.GAME__SCORE, null, msgs);
			msgs = basicSetScore(newScore, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.GAME__SCORE, newScore, newScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void startGame() {
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
	public void resetGame() {
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
	public void endGame() {
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
	public void loadLevel() {
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
	public void update() {
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
		case PlatformerPackage.GAME__LEVELS:
			return ((InternalEList<?>) getLevels()).basicRemove(otherEnd, msgs);
		case PlatformerPackage.GAME__UI:
			return basicSetUi(null, msgs);
		case PlatformerPackage.GAME__LIVES:
			return basicSetLives(null, msgs);
		case PlatformerPackage.GAME__SCORE:
			return basicSetScore(null, msgs);
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
		case PlatformerPackage.GAME__CURRENT_LEVEL_COUNTER:
			return getCurrentLevelCounter();
		case PlatformerPackage.GAME__LEVELS:
			return getLevels();
		case PlatformerPackage.GAME__UI:
			return getUi();
		case PlatformerPackage.GAME__FRICTION:
			return getFriction();
		case PlatformerPackage.GAME__GRAVITY:
			return getGravity();
		case PlatformerPackage.GAME__LIVES:
			return getLives();
		case PlatformerPackage.GAME__SCREEN:
			return getScreen();
		case PlatformerPackage.GAME__CLOCK:
			return getClock();
		case PlatformerPackage.GAME__RUNNING:
			return isRunning();
		case PlatformerPackage.GAME__SCORE:
			return getScore();
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
		case PlatformerPackage.GAME__CURRENT_LEVEL_COUNTER:
			setCurrentLevelCounter((Integer) newValue);
			return;
		case PlatformerPackage.GAME__LEVELS:
			getLevels().clear();
			getLevels().addAll((Collection<? extends Level>) newValue);
			return;
		case PlatformerPackage.GAME__UI:
			setUi((UI) newValue);
			return;
		case PlatformerPackage.GAME__FRICTION:
			setFriction((Integer) newValue);
			return;
		case PlatformerPackage.GAME__GRAVITY:
			setGravity((Integer) newValue);
			return;
		case PlatformerPackage.GAME__LIVES:
			setLives((Lives) newValue);
			return;
		case PlatformerPackage.GAME__SCREEN:
			setScreen((String) newValue);
			return;
		case PlatformerPackage.GAME__CLOCK:
			setClock((String) newValue);
			return;
		case PlatformerPackage.GAME__RUNNING:
			setRunning((Boolean) newValue);
			return;
		case PlatformerPackage.GAME__SCORE:
			setScore((Score) newValue);
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
		case PlatformerPackage.GAME__CURRENT_LEVEL_COUNTER:
			setCurrentLevelCounter(CURRENT_LEVEL_COUNTER_EDEFAULT);
			return;
		case PlatformerPackage.GAME__LEVELS:
			getLevels().clear();
			return;
		case PlatformerPackage.GAME__UI:
			setUi((UI) null);
			return;
		case PlatformerPackage.GAME__FRICTION:
			setFriction(FRICTION_EDEFAULT);
			return;
		case PlatformerPackage.GAME__GRAVITY:
			setGravity(GRAVITY_EDEFAULT);
			return;
		case PlatformerPackage.GAME__LIVES:
			setLives((Lives) null);
			return;
		case PlatformerPackage.GAME__SCREEN:
			setScreen(SCREEN_EDEFAULT);
			return;
		case PlatformerPackage.GAME__CLOCK:
			setClock(CLOCK_EDEFAULT);
			return;
		case PlatformerPackage.GAME__RUNNING:
			setRunning(RUNNING_EDEFAULT);
			return;
		case PlatformerPackage.GAME__SCORE:
			setScore((Score) null);
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
		case PlatformerPackage.GAME__CURRENT_LEVEL_COUNTER:
			return currentLevelCounter != CURRENT_LEVEL_COUNTER_EDEFAULT;
		case PlatformerPackage.GAME__LEVELS:
			return levels != null && !levels.isEmpty();
		case PlatformerPackage.GAME__UI:
			return ui != null;
		case PlatformerPackage.GAME__FRICTION:
			return friction != FRICTION_EDEFAULT;
		case PlatformerPackage.GAME__GRAVITY:
			return gravity != GRAVITY_EDEFAULT;
		case PlatformerPackage.GAME__LIVES:
			return lives != null;
		case PlatformerPackage.GAME__SCREEN:
			return SCREEN_EDEFAULT == null ? screen != null : !SCREEN_EDEFAULT.equals(screen);
		case PlatformerPackage.GAME__CLOCK:
			return CLOCK_EDEFAULT == null ? clock != null : !CLOCK_EDEFAULT.equals(clock);
		case PlatformerPackage.GAME__RUNNING:
			return running != RUNNING_EDEFAULT;
		case PlatformerPackage.GAME__SCORE:
			return score != null;
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
		case PlatformerPackage.GAME___START_GAME:
			startGame();
			return null;
		case PlatformerPackage.GAME___RESET_GAME:
			resetGame();
			return null;
		case PlatformerPackage.GAME___END_GAME:
			endGame();
			return null;
		case PlatformerPackage.GAME___LOAD_LEVEL:
			loadLevel();
			return null;
		case PlatformerPackage.GAME___UPDATE:
			update();
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
		result.append(" (currentLevelCounter: ");
		result.append(currentLevelCounter);
		result.append(", friction: ");
		result.append(friction);
		result.append(", gravity: ");
		result.append(gravity);
		result.append(", screen: ");
		result.append(screen);
		result.append(", clock: ");
		result.append(clock);
		result.append(", running: ");
		result.append(running);
		result.append(')');
		return result.toString();
	}

} //GameImpl
