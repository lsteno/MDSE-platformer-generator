/**
 */
package platformer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enemy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platformer.Enemy#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see platformer.PlatformerPackage#getEnemy()
 * @model
 * @generated
 */
public interface Enemy extends Entity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link platformer.EnemyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see platformer.EnemyType
	 * @see #setType(EnemyType)
	 * @see platformer.PlatformerPackage#getEnemy_Type()
	 * @model
	 * @generated
	 */
	EnemyType getType();

	/**
	 * Sets the value of the '{@link platformer.Enemy#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see platformer.EnemyType
	 * @see #getType()
	 * @generated
	 */
	void setType(EnemyType value);

} // Enemy
