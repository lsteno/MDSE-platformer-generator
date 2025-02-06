/**
 */
package platformer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platformer.Character#isPowered_up <em>Powered up</em>}</li>
 *   <li>{@link platformer.Character#getPowered_time <em>Powered time</em>}</li>
 *   <li>{@link platformer.Character#getJump_speed <em>Jump speed</em>}</li>
 *   <li>{@link platformer.Character#isOn_ground <em>On ground</em>}</li>
 * </ul>
 *
 * @see platformer.PlatformerPackage#getCharacter()
 * @model
 * @generated
 */
public interface Character extends Entity {
	/**
	 * Returns the value of the '<em><b>Powered up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powered up</em>' attribute.
	 * @see #setPowered_up(boolean)
	 * @see platformer.PlatformerPackage#getCharacter_Powered_up()
	 * @model required="true"
	 * @generated
	 */
	boolean isPowered_up();

	/**
	 * Sets the value of the '{@link platformer.Character#isPowered_up <em>Powered up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powered up</em>' attribute.
	 * @see #isPowered_up()
	 * @generated
	 */
	void setPowered_up(boolean value);

	/**
	 * Returns the value of the '<em><b>Powered time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powered time</em>' attribute.
	 * @see #setPowered_time(int)
	 * @see platformer.PlatformerPackage#getCharacter_Powered_time()
	 * @model required="true"
	 * @generated
	 */
	int getPowered_time();

	/**
	 * Sets the value of the '{@link platformer.Character#getPowered_time <em>Powered time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powered time</em>' attribute.
	 * @see #getPowered_time()
	 * @generated
	 */
	void setPowered_time(int value);

	/**
	 * Returns the value of the '<em><b>Jump speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jump speed</em>' attribute.
	 * @see #setJump_speed(int)
	 * @see platformer.PlatformerPackage#getCharacter_Jump_speed()
	 * @model required="true"
	 * @generated
	 */
	int getJump_speed();

	/**
	 * Sets the value of the '{@link platformer.Character#getJump_speed <em>Jump speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jump speed</em>' attribute.
	 * @see #getJump_speed()
	 * @generated
	 */
	void setJump_speed(int value);

	/**
	 * Returns the value of the '<em><b>On ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On ground</em>' attribute.
	 * @see #setOn_ground(boolean)
	 * @see platformer.PlatformerPackage#getCharacter_On_ground()
	 * @model required="true"
	 * @generated
	 */
	boolean isOn_ground();

	/**
	 * Sets the value of the '{@link platformer.Character#isOn_ground <em>On ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On ground</em>' attribute.
	 * @see #isOn_ground()
	 * @generated
	 */
	void setOn_ground(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void jump();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void performAction();

} // Character
