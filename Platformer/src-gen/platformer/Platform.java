/**
 */
package platformer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platformer.Platform#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see platformer.PlatformerPackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends Entity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link platformer.PlatformType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see platformer.PlatformType
	 * @see #setType(PlatformType)
	 * @see platformer.PlatformerPackage#getPlatform_Type()
	 * @model
	 * @generated
	 */
	PlatformType getType();

	/**
	 * Sets the value of the '{@link platformer.Platform#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see platformer.PlatformType
	 * @see #getType()
	 * @generated
	 */
	void setType(PlatformType value);

} // Platform
