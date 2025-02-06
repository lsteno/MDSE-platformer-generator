/**
 */
package platformer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platformer.Game#getCurrentLevelCounter <em>Current Level Counter</em>}</li>
 *   <li>{@link platformer.Game#getLevels <em>Levels</em>}</li>
 *   <li>{@link platformer.Game#getUi <em>Ui</em>}</li>
 *   <li>{@link platformer.Game#getFriction <em>Friction</em>}</li>
 *   <li>{@link platformer.Game#getGravity <em>Gravity</em>}</li>
 *   <li>{@link platformer.Game#getLives <em>Lives</em>}</li>
 *   <li>{@link platformer.Game#getScreen <em>Screen</em>}</li>
 *   <li>{@link platformer.Game#getClock <em>Clock</em>}</li>
 *   <li>{@link platformer.Game#isRunning <em>Running</em>}</li>
 *   <li>{@link platformer.Game#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @see platformer.PlatformerPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Level Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Level Counter</em>' attribute.
	 * @see #setCurrentLevelCounter(int)
	 * @see platformer.PlatformerPackage#getGame_CurrentLevelCounter()
	 * @model required="true"
	 * @generated
	 */
	int getCurrentLevelCounter();

	/**
	 * Sets the value of the '{@link platformer.Game#getCurrentLevelCounter <em>Current Level Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Level Counter</em>' attribute.
	 * @see #getCurrentLevelCounter()
	 * @generated
	 */
	void setCurrentLevelCounter(int value);

	/**
	 * Returns the value of the '<em><b>Levels</b></em>' containment reference list.
	 * The list contents are of type {@link platformer.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' containment reference list.
	 * @see platformer.PlatformerPackage#getGame_Levels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Level> getLevels();

	/**
	 * Returns the value of the '<em><b>Ui</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui</em>' containment reference.
	 * @see #setUi(UI)
	 * @see platformer.PlatformerPackage#getGame_Ui()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UI getUi();

	/**
	 * Sets the value of the '{@link platformer.Game#getUi <em>Ui</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui</em>' containment reference.
	 * @see #getUi()
	 * @generated
	 */
	void setUi(UI value);

	/**
	 * Returns the value of the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friction</em>' attribute.
	 * @see #setFriction(int)
	 * @see platformer.PlatformerPackage#getGame_Friction()
	 * @model required="true"
	 * @generated
	 */
	int getFriction();

	/**
	 * Sets the value of the '{@link platformer.Game#getFriction <em>Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friction</em>' attribute.
	 * @see #getFriction()
	 * @generated
	 */
	void setFriction(int value);

	/**
	 * Returns the value of the '<em><b>Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gravity</em>' attribute.
	 * @see #setGravity(int)
	 * @see platformer.PlatformerPackage#getGame_Gravity()
	 * @model required="true"
	 * @generated
	 */
	int getGravity();

	/**
	 * Sets the value of the '{@link platformer.Game#getGravity <em>Gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gravity</em>' attribute.
	 * @see #getGravity()
	 * @generated
	 */
	void setGravity(int value);

	/**
	 * Returns the value of the '<em><b>Lives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lives</em>' containment reference.
	 * @see #setLives(Lives)
	 * @see platformer.PlatformerPackage#getGame_Lives()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Lives getLives();

	/**
	 * Sets the value of the '{@link platformer.Game#getLives <em>Lives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lives</em>' containment reference.
	 * @see #getLives()
	 * @generated
	 */
	void setLives(Lives value);

	/**
	 * Returns the value of the '<em><b>Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen</em>' attribute.
	 * @see #setScreen(String)
	 * @see platformer.PlatformerPackage#getGame_Screen()
	 * @model required="true"
	 * @generated
	 */
	String getScreen();

	/**
	 * Sets the value of the '{@link platformer.Game#getScreen <em>Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen</em>' attribute.
	 * @see #getScreen()
	 * @generated
	 */
	void setScreen(String value);

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' attribute.
	 * @see #setClock(String)
	 * @see platformer.PlatformerPackage#getGame_Clock()
	 * @model required="true"
	 * @generated
	 */
	String getClock();

	/**
	 * Sets the value of the '{@link platformer.Game#getClock <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' attribute.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(String value);

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(boolean)
	 * @see platformer.PlatformerPackage#getGame_Running()
	 * @model
	 * @generated
	 */
	boolean isRunning();

	/**
	 * Sets the value of the '{@link platformer.Game#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' containment reference.
	 * @see #setScore(Score)
	 * @see platformer.PlatformerPackage#getGame_Score()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Score getScore();

	/**
	 * Sets the value of the '{@link platformer.Game#getScore <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' containment reference.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Score value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void startGame();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resetGame();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void endGame();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void loadLevel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update();

} // Game
