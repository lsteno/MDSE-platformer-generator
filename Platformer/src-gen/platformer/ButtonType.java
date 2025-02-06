/**
 */
package platformer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Button Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see platformer.PlatformerPackage#getButtonType()
 * @model
 * @generated
 */
public enum ButtonType implements Enumerator {
	/**
	 * The '<em><b>RESET GAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET_GAME_VALUE
	 * @generated
	 * @ordered
	 */
	RESET_GAME(0, "RESET_GAME", "RESET_GAME"),

	/**
	 * The '<em><b>EXIT GAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXIT_GAME_VALUE
	 * @generated
	 * @ordered
	 */
	EXIT_GAME(1, "EXIT_GAME", "EXIT_GAME"),

	/**
	 * The '<em><b>OPEN MENU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_MENU_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_MENU(2, "OPEN_MENU", "OPEN_MENU"),

	/**
	 * The '<em><b>CLOSE MENU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSE_MENU_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSE_MENU(3, "CLOSE_MENU", "CLOSE_MENU");

	/**
	 * The '<em><b>RESET GAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET_GAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESET_GAME_VALUE = 0;

	/**
	 * The '<em><b>EXIT GAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXIT_GAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXIT_GAME_VALUE = 1;

	/**
	 * The '<em><b>OPEN MENU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_MENU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_MENU_VALUE = 2;

	/**
	 * The '<em><b>CLOSE MENU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSE_MENU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOSE_MENU_VALUE = 3;

	/**
	 * An array of all the '<em><b>Button Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ButtonType[] VALUES_ARRAY = new ButtonType[] { RESET_GAME, EXIT_GAME, OPEN_MENU, CLOSE_MENU, };

	/**
	 * A public read-only list of all the '<em><b>Button Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ButtonType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Button Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ButtonType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ButtonType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Button Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ButtonType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ButtonType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Button Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ButtonType get(int value) {
		switch (value) {
		case RESET_GAME_VALUE:
			return RESET_GAME;
		case EXIT_GAME_VALUE:
			return EXIT_GAME;
		case OPEN_MENU_VALUE:
			return OPEN_MENU;
		case CLOSE_MENU_VALUE:
			return CLOSE_MENU;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ButtonType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ButtonType
