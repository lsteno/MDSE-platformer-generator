/**
 */
package platformer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platformer.UI#getButton <em>Button</em>}</li>
 *   <li>{@link platformer.UI#getLivesCount <em>Lives Count</em>}</li>
 *   <li>{@link platformer.UI#getScoreCount <em>Score Count</em>}</li>
 *   <li>{@link platformer.UI#isMenu_open <em>Menu open</em>}</li>
 * </ul>
 *
 * @see platformer.PlatformerPackage#getUI()
 * @model
 * @generated
 */
public interface UI extends EObject {
	/**
	 * Returns the value of the '<em><b>Button</b></em>' containment reference list.
	 * The list contents are of type {@link platformer.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button</em>' containment reference list.
	 * @see platformer.PlatformerPackage#getUI_Button()
	 * @model containment="true" lower="4" upper="4"
	 * @generated
	 */
	EList<Button> getButton();

	/**
	 * Returns the value of the '<em><b>Lives Count</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lives Count</em>' reference.
	 * @see #setLivesCount(Lives)
	 * @see platformer.PlatformerPackage#getUI_LivesCount()
	 * @model required="true"
	 * @generated
	 */
	Lives getLivesCount();

	/**
	 * Sets the value of the '{@link platformer.UI#getLivesCount <em>Lives Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lives Count</em>' reference.
	 * @see #getLivesCount()
	 * @generated
	 */
	void setLivesCount(Lives value);

	/**
	 * Returns the value of the '<em><b>Score Count</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score Count</em>' reference.
	 * @see #setScoreCount(Score)
	 * @see platformer.PlatformerPackage#getUI_ScoreCount()
	 * @model required="true"
	 * @generated
	 */
	Score getScoreCount();

	/**
	 * Sets the value of the '{@link platformer.UI#getScoreCount <em>Score Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score Count</em>' reference.
	 * @see #getScoreCount()
	 * @generated
	 */
	void setScoreCount(Score value);

	/**
	 * Returns the value of the '<em><b>Menu open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu open</em>' attribute.
	 * @see #setMenu_open(boolean)
	 * @see platformer.PlatformerPackage#getUI_Menu_open()
	 * @model required="true"
	 * @generated
	 */
	boolean isMenu_open();

	/**
	 * Sets the value of the '{@link platformer.UI#isMenu_open <em>Menu open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu open</em>' attribute.
	 * @see #isMenu_open()
	 * @generated
	 */
	void setMenu_open(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void draw();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void handle_click();

} // UI
