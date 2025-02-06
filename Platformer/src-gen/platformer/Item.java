/**
 */
package platformer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platformer.Item#getType <em>Type</em>}</li>
 *   <li>{@link platformer.Item#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see platformer.PlatformerPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends Entity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link platformer.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see platformer.ItemType
	 * @see #setType(ItemType)
	 * @see platformer.PlatformerPackage#getItem_Type()
	 * @model
	 * @generated
	 */
	ItemType getType();

	/**
	 * Sets the value of the '{@link platformer.Item#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see platformer.ItemType
	 * @see #getType()
	 * @generated
	 */
	void setType(ItemType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see platformer.PlatformerPackage#getItem_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link platformer.Item#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void applyEffect();

} // Item
