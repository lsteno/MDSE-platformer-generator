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

import platformer.Array2D;
import platformer.Entity;
import platformer.Image;
import platformer.Level;
import platformer.PlatformerPackage;
import platformer.Status;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platformer.impl.LevelImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link platformer.impl.LevelImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link platformer.impl.LevelImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link platformer.impl.LevelImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link platformer.impl.LevelImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link platformer.impl.LevelImpl#getWinCoordinate <em>Win Coordinate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LevelImpl extends MinimalEObjectImpl.Container implements Level {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.INCOMPLETE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected Image background;

	/**
	 * The cached value of the '{@link #getWinCoordinate() <em>Win Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinCoordinate()
	 * @generated
	 * @ordered
	 */
	protected Array2D winCoordinate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformerPackage.Literals.LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.LEVEL__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.LEVEL__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.LEVEL__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, PlatformerPackage.LEVEL__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Image getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackground(Image newBackground, NotificationChain msgs) {
		Image oldBackground = background;
		background = newBackground;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PlatformerPackage.LEVEL__BACKGROUND, oldBackground, newBackground);
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
	public void setBackground(Image newBackground) {
		if (newBackground != background) {
			NotificationChain msgs = null;
			if (background != null)
				msgs = ((InternalEObject) background).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PlatformerPackage.LEVEL__BACKGROUND, null, msgs);
			if (newBackground != null)
				msgs = ((InternalEObject) newBackground).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PlatformerPackage.LEVEL__BACKGROUND, null, msgs);
			msgs = basicSetBackground(newBackground, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.LEVEL__BACKGROUND, newBackground,
					newBackground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Array2D getWinCoordinate() {
		return winCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWinCoordinate(Array2D newWinCoordinate, NotificationChain msgs) {
		Array2D oldWinCoordinate = winCoordinate;
		winCoordinate = newWinCoordinate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PlatformerPackage.LEVEL__WIN_COORDINATE, oldWinCoordinate, newWinCoordinate);
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
	public void setWinCoordinate(Array2D newWinCoordinate) {
		if (newWinCoordinate != winCoordinate) {
			NotificationChain msgs = null;
			if (winCoordinate != null)
				msgs = ((InternalEObject) winCoordinate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PlatformerPackage.LEVEL__WIN_COORDINATE, null, msgs);
			if (newWinCoordinate != null)
				msgs = ((InternalEObject) newWinCoordinate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PlatformerPackage.LEVEL__WIN_COORDINATE, null, msgs);
			msgs = basicSetWinCoordinate(newWinCoordinate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformerPackage.LEVEL__WIN_COORDINATE,
					newWinCoordinate, newWinCoordinate));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PlatformerPackage.LEVEL__ENTITIES:
			return ((InternalEList<?>) getEntities()).basicRemove(otherEnd, msgs);
		case PlatformerPackage.LEVEL__BACKGROUND:
			return basicSetBackground(null, msgs);
		case PlatformerPackage.LEVEL__WIN_COORDINATE:
			return basicSetWinCoordinate(null, msgs);
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
		case PlatformerPackage.LEVEL__WIDTH:
			return getWidth();
		case PlatformerPackage.LEVEL__HEIGHT:
			return getHeight();
		case PlatformerPackage.LEVEL__STATUS:
			return getStatus();
		case PlatformerPackage.LEVEL__ENTITIES:
			return getEntities();
		case PlatformerPackage.LEVEL__BACKGROUND:
			return getBackground();
		case PlatformerPackage.LEVEL__WIN_COORDINATE:
			return getWinCoordinate();
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
		case PlatformerPackage.LEVEL__WIDTH:
			setWidth((Integer) newValue);
			return;
		case PlatformerPackage.LEVEL__HEIGHT:
			setHeight((Integer) newValue);
			return;
		case PlatformerPackage.LEVEL__STATUS:
			setStatus((Status) newValue);
			return;
		case PlatformerPackage.LEVEL__ENTITIES:
			getEntities().clear();
			getEntities().addAll((Collection<? extends Entity>) newValue);
			return;
		case PlatformerPackage.LEVEL__BACKGROUND:
			setBackground((Image) newValue);
			return;
		case PlatformerPackage.LEVEL__WIN_COORDINATE:
			setWinCoordinate((Array2D) newValue);
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
		case PlatformerPackage.LEVEL__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case PlatformerPackage.LEVEL__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case PlatformerPackage.LEVEL__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case PlatformerPackage.LEVEL__ENTITIES:
			getEntities().clear();
			return;
		case PlatformerPackage.LEVEL__BACKGROUND:
			setBackground((Image) null);
			return;
		case PlatformerPackage.LEVEL__WIN_COORDINATE:
			setWinCoordinate((Array2D) null);
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
		case PlatformerPackage.LEVEL__WIDTH:
			return width != WIDTH_EDEFAULT;
		case PlatformerPackage.LEVEL__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case PlatformerPackage.LEVEL__STATUS:
			return status != STATUS_EDEFAULT;
		case PlatformerPackage.LEVEL__ENTITIES:
			return entities != null && !entities.isEmpty();
		case PlatformerPackage.LEVEL__BACKGROUND:
			return background != null;
		case PlatformerPackage.LEVEL__WIN_COORDINATE:
			return winCoordinate != null;
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
		case PlatformerPackage.LEVEL___UPDATE:
			update();
			return null;
		case PlatformerPackage.LEVEL___DRAW:
			draw();
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //LevelImpl
