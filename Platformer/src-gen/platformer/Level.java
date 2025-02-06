/**
 */
package platformer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platformer.Level#getWidth <em>Width</em>}</li>
 *   <li>{@link platformer.Level#getHeight <em>Height</em>}</li>
 *   <li>{@link platformer.Level#getStatus <em>Status</em>}</li>
 *   <li>{@link platformer.Level#getEntities <em>Entities</em>}</li>
 *   <li>{@link platformer.Level#getBackground <em>Background</em>}</li>
 *   <li>{@link platformer.Level#getWinCoordinate <em>Win Coordinate</em>}</li>
 * </ul>
 *
 * @see platformer.PlatformerPackage#getLevel()
 * @model
 * @generated
 */
public interface Level extends EObject {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see platformer.PlatformerPackage#getLevel_Width()
	 * @model required="true"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link platformer.Level#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see platformer.PlatformerPackage#getLevel_Height()
	 * @model required="true"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link platformer.Level#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link platformer.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see platformer.Status
	 * @see #setStatus(Status)
	 * @see platformer.PlatformerPackage#getLevel_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link platformer.Level#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see platformer.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link platformer.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see platformer.PlatformerPackage#getLevel_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' containment reference.
	 * @see #setBackground(Image)
	 * @see platformer.PlatformerPackage#getLevel_Background()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Image getBackground();

	/**
	 * Sets the value of the '{@link platformer.Level#getBackground <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' containment reference.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(Image value);

	/**
	 * Returns the value of the '<em><b>Win Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Win Coordinate</em>' containment reference.
	 * @see #setWinCoordinate(Array2D)
	 * @see platformer.PlatformerPackage#getLevel_WinCoordinate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Array2D getWinCoordinate();

	/**
	 * Sets the value of the '{@link platformer.Level#getWinCoordinate <em>Win Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Win Coordinate</em>' containment reference.
	 * @see #getWinCoordinate()
	 * @generated
	 */
	void setWinCoordinate(Array2D value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void draw();

} // Level
