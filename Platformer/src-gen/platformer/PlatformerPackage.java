/**
 */
package platformer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see platformer.PlatformerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface PlatformerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "platformer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/platformer";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "platformer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatformerPackage eINSTANCE = platformer.impl.PlatformerPackageImpl.init();

	/**
	 * The meta object id for the '{@link platformer.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.impl.GameImpl
	 * @see platformer.impl.PlatformerPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Current Level Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__CURRENT_LEVEL_COUNTER = 0;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__LEVELS = 1;

	/**
	 * The feature id for the '<em><b>Ui</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__UI = 2;

	/**
	 * The feature id for the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__FRICTION = 3;

	/**
	 * The feature id for the '<em><b>Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GRAVITY = 4;

	/**
	 * The feature id for the '<em><b>Lives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__LIVES = 5;

	/**
	 * The feature id for the '<em><b>Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__SCREEN = 6;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__CLOCK = 7;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__RUNNING = 8;

	/**
	 * The feature id for the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__SCORE = 9;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Start Game</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___START_GAME = 0;

	/**
	 * The operation id for the '<em>Reset Game</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___RESET_GAME = 1;

	/**
	 * The operation id for the '<em>End Game</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___END_GAME = 2;

	/**
	 * The operation id for the '<em>Load Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___LOAD_LEVEL = 3;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___UPDATE = 4;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link platformer.impl.LevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.impl.LevelImpl
	 * @see platformer.impl.PlatformerPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__ENTITIES = 3;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__BACKGROUND = 4;

	/**
	 * The feature id for the '<em><b>Win Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__WIN_COORDINATE = 5;

	/**
	 * The number of structural features of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL___UPDATE = 0;

	/**
	 * The operation id for the '<em>Draw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL___DRAW = 1;

	/**
	 * The number of operations of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link platformer.impl.UIImpl <em>UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.impl.UIImpl
	 * @see platformer.impl.PlatformerPackageImpl#getUI()
	 * @generated
	 */
	int UI = 2;

	/**
	 * The feature id for the '<em><b>Button</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__BUTTON = 0;

	/**
	 * The feature id for the '<em><b>Lives Count</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__LIVES_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Score Count</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__SCORE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Menu open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__MENU_OPEN = 3;

	/**
	 * The number of structural features of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Draw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___DRAW = 0;

	/**
	 * The operation id for the '<em>Handle click</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI___HANDLE_CLICK = 1;

	/**
	 * The number of operations of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link platformer.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.impl.ButtonImpl
	 * @see platformer.impl.PlatformerPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ACTION = 1;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Perform Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON___PERFORM_ACTION = 0;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link platformer.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.impl.EntityImpl
	 * @see platformer.impl.PlatformerPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DIRECTION = 0;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SPEED = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__POSITION = 2;

	/**
	 * The feature id for the '<em><b>Sprite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SPRITE = 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SIZE = 4;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Update Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___UPDATE_POSITION = 0;

	/**
	 * The operation id for the '<em>Draw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___DRAW = 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link platformer.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.impl.PlayerImpl
	 * @see platformer.impl.PlatformerPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 5;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__DIRECTION = ENTITY__DIRECTION;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__SPEED = ENTITY__SPEED;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__POSITION = ENTITY__POSITION;

	/**
	 * The feature id for the '<em><b>Sprite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__SPRITE = ENTITY__SPRITE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__SIZE = ENTITY__SIZE;

	/**
	 * The feature id for the '<em><b>Powered up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__POWERED_UP = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Powered time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__POWERED_TIME = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jump speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__JUMP_SPEED = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ON_GROUND = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Update Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___UPDATE_POSITION = ENTITY___UPDATE_POSITION;

	/**
	 * The operation id for the '<em>Draw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___DRAW = ENTITY___DRAW;

	/**
	 * The operation id for the '<em>Jump</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___JUMP = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___PERFORM_ACTION = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link platformer.impl.EnemyImpl <em>Enemy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.impl.EnemyImpl
	 * @see platformer.impl.PlatformerPackageImpl#getEnemy()
	 * @generated
	 */
	int ENEMY = 6;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__DIRECTION = ENTITY__DIRECTION;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__SPEED = ENTITY__SPEED;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__POSITION = ENTITY__POSITION;

	/**
	 * The feature id for the '<em><b>Sprite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__SPRITE = ENTITY__SPRITE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__SIZE = ENTITY__SIZE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__TYPE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enemy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Update Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY___UPDATE_POSITION = ENTITY___UPDATE_POSITION;

	/**
	 * The operation id for the '<em>Draw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY___DRAW = ENTITY___DRAW;

	/**
	 * The number of operations of the '<em>Enemy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platformer.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.impl.PlatformImpl
	 * @see platformer.impl.PlatformerPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 7;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__DIRECTION = ENTITY__DIRECTION;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__SPEED = ENTITY__SPEED;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__POSITION = ENTITY__POSITION;

	/**
	 * The feature id for the '<em><b>Sprite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__SPRITE = ENTITY__SPRITE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__SIZE = ENTITY__SIZE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__TYPE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Update Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM___UPDATE_POSITION = ENTITY___UPDATE_POSITION;

	/**
	 * The operation id for the '<em>Draw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM___DRAW = ENTITY___DRAW;

	/**
	 * The number of operations of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platformer.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.impl.ItemImpl
	 * @see platformer.impl.PlatformerPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 8;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DIRECTION = ENTITY__DIRECTION;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SPEED = ENTITY__SPEED;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__POSITION = ENTITY__POSITION;

	/**
	 * The feature id for the '<em><b>Sprite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SPRITE = ENTITY__SPRITE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SIZE = ENTITY__SIZE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TYPE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__VALUE = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Update Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___UPDATE_POSITION = ENTITY___UPDATE_POSITION;

	/**
	 * The operation id for the '<em>Draw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___DRAW = ENTITY___DRAW;

	/**
	 * The operation id for the '<em>Apply Effect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___APPLY_EFFECT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link platformer.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.Status
	 * @see platformer.impl.PlatformerPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 13;

	/**
	 * The meta object id for the '{@link platformer.ItemType <em>Item Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.ItemType
	 * @see platformer.impl.PlatformerPackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 14;

	/**
	 * The meta object id for the '{@link platformer.PlatformType <em>Platform Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.PlatformType
	 * @see platformer.impl.PlatformerPackageImpl#getPlatformType()
	 * @generated
	 */
	int PLATFORM_TYPE = 15;

	/**
	 * The meta object id for the '{@link platformer.EnemyType <em>Enemy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.EnemyType
	 * @see platformer.impl.PlatformerPackageImpl#getEnemyType()
	 * @generated
	 */
	int ENEMY_TYPE = 16;

	/**
	 * The meta object id for the '{@link platformer.ButtonType <em>Button Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.ButtonType
	 * @see platformer.impl.PlatformerPackageImpl#getButtonType()
	 * @generated
	 */
	int BUTTON_TYPE = 17;

	/**
	 * The meta object id for the '{@link platformer.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.Direction
	 * @see platformer.impl.PlatformerPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 18;

	/**
	 * The meta object id for the '<em>Pygame</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see platformer.impl.PlatformerPackageImpl#getPygame()
	 * @generated
	 */
	int PYGAME = 19;

	/**
	 * The meta object id for the '{@link platformer.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.impl.ImageImpl
	 * @see platformer.impl.PlatformerPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 9;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PATH = 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platformer.impl.Array2DImpl <em>Array2 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.impl.Array2DImpl
	 * @see platformer.impl.PlatformerPackageImpl#getArray2D()
	 * @generated
	 */
	int ARRAY2_D = 10;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY2_D__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY2_D__Y = 1;

	/**
	 * The number of structural features of the '<em>Array2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY2_D_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Array2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY2_D_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platformer.impl.LivesImpl <em>Lives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.impl.LivesImpl
	 * @see platformer.impl.PlatformerPackageImpl#getLives()
	 * @generated
	 */
	int LIVES = 11;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVES__AMOUNT = 0;

	/**
	 * The number of structural features of the '<em>Lives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platformer.impl.ScoreImpl <em>Score</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platformer.impl.ScoreImpl
	 * @see platformer.impl.PlatformerPackageImpl#getScore()
	 * @generated
	 */
	int SCORE = 12;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE__AMOUNT = 0;

	/**
	 * The number of structural features of the '<em>Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Score</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link platformer.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see platformer.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Game#getCurrentLevelCounter <em>Current Level Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Level Counter</em>'.
	 * @see platformer.Game#getCurrentLevelCounter()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_CurrentLevelCounter();

	/**
	 * Returns the meta object for the containment reference list '{@link platformer.Game#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see platformer.Game#getLevels()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Levels();

	/**
	 * Returns the meta object for the containment reference '{@link platformer.Game#getUi <em>Ui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ui</em>'.
	 * @see platformer.Game#getUi()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Ui();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Game#getFriction <em>Friction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friction</em>'.
	 * @see platformer.Game#getFriction()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Friction();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Game#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity</em>'.
	 * @see platformer.Game#getGravity()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Gravity();

	/**
	 * Returns the meta object for the containment reference '{@link platformer.Game#getLives <em>Lives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lives</em>'.
	 * @see platformer.Game#getLives()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Lives();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Game#getScreen <em>Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screen</em>'.
	 * @see platformer.Game#getScreen()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Screen();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Game#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock</em>'.
	 * @see platformer.Game#getClock()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Clock();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Game#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see platformer.Game#isRunning()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Running();

	/**
	 * Returns the meta object for the containment reference '{@link platformer.Game#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Score</em>'.
	 * @see platformer.Game#getScore()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Score();

	/**
	 * Returns the meta object for the '{@link platformer.Game#startGame() <em>Start Game</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Game</em>' operation.
	 * @see platformer.Game#startGame()
	 * @generated
	 */
	EOperation getGame__StartGame();

	/**
	 * Returns the meta object for the '{@link platformer.Game#resetGame() <em>Reset Game</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Game</em>' operation.
	 * @see platformer.Game#resetGame()
	 * @generated
	 */
	EOperation getGame__ResetGame();

	/**
	 * Returns the meta object for the '{@link platformer.Game#endGame() <em>End Game</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>End Game</em>' operation.
	 * @see platformer.Game#endGame()
	 * @generated
	 */
	EOperation getGame__EndGame();

	/**
	 * Returns the meta object for the '{@link platformer.Game#loadLevel() <em>Load Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Level</em>' operation.
	 * @see platformer.Game#loadLevel()
	 * @generated
	 */
	EOperation getGame__LoadLevel();

	/**
	 * Returns the meta object for the '{@link platformer.Game#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see platformer.Game#update()
	 * @generated
	 */
	EOperation getGame__Update();

	/**
	 * Returns the meta object for class '{@link platformer.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level</em>'.
	 * @see platformer.Level
	 * @generated
	 */
	EClass getLevel();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Level#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see platformer.Level#getWidth()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_Width();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Level#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see platformer.Level#getHeight()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_Height();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Level#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see platformer.Level#getStatus()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link platformer.Level#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see platformer.Level#getEntities()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Entities();

	/**
	 * Returns the meta object for the containment reference '{@link platformer.Level#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background</em>'.
	 * @see platformer.Level#getBackground()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Background();

	/**
	 * Returns the meta object for the containment reference '{@link platformer.Level#getWinCoordinate <em>Win Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Win Coordinate</em>'.
	 * @see platformer.Level#getWinCoordinate()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_WinCoordinate();

	/**
	 * Returns the meta object for the '{@link platformer.Level#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see platformer.Level#update()
	 * @generated
	 */
	EOperation getLevel__Update();

	/**
	 * Returns the meta object for the '{@link platformer.Level#draw() <em>Draw</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Draw</em>' operation.
	 * @see platformer.Level#draw()
	 * @generated
	 */
	EOperation getLevel__Draw();

	/**
	 * Returns the meta object for class '{@link platformer.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI</em>'.
	 * @see platformer.UI
	 * @generated
	 */
	EClass getUI();

	/**
	 * Returns the meta object for the containment reference list '{@link platformer.UI#getButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Button</em>'.
	 * @see platformer.UI#getButton()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_Button();

	/**
	 * Returns the meta object for the reference '{@link platformer.UI#getLivesCount <em>Lives Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lives Count</em>'.
	 * @see platformer.UI#getLivesCount()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_LivesCount();

	/**
	 * Returns the meta object for the reference '{@link platformer.UI#getScoreCount <em>Score Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Score Count</em>'.
	 * @see platformer.UI#getScoreCount()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_ScoreCount();

	/**
	 * Returns the meta object for the attribute '{@link platformer.UI#isMenu_open <em>Menu open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Menu open</em>'.
	 * @see platformer.UI#isMenu_open()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_Menu_open();

	/**
	 * Returns the meta object for the '{@link platformer.UI#draw() <em>Draw</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Draw</em>' operation.
	 * @see platformer.UI#draw()
	 * @generated
	 */
	EOperation getUI__Draw();

	/**
	 * Returns the meta object for the '{@link platformer.UI#handle_click() <em>Handle click</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handle click</em>' operation.
	 * @see platformer.UI#handle_click()
	 * @generated
	 */
	EOperation getUI__Handle_click();

	/**
	 * Returns the meta object for class '{@link platformer.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see platformer.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Button#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see platformer.Button#getLabel()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Label();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Button#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see platformer.Button#getAction()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Action();

	/**
	 * Returns the meta object for the '{@link platformer.Button#performAction() <em>Perform Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform Action</em>' operation.
	 * @see platformer.Button#performAction()
	 * @generated
	 */
	EOperation getButton__PerformAction();

	/**
	 * Returns the meta object for class '{@link platformer.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see platformer.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference '{@link platformer.Entity#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see platformer.Entity#getPosition()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Position();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Entity#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see platformer.Entity#getSize()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Size();

	/**
	 * Returns the meta object for the containment reference list '{@link platformer.Entity#getSprite <em>Sprite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sprite</em>'.
	 * @see platformer.Entity#getSprite()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Sprite();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Entity#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see platformer.Entity#getDirection()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Direction();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Entity#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see platformer.Entity#getSpeed()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Speed();

	/**
	 * Returns the meta object for the '{@link platformer.Entity#updatePosition() <em>Update Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Position</em>' operation.
	 * @see platformer.Entity#updatePosition()
	 * @generated
	 */
	EOperation getEntity__UpdatePosition();

	/**
	 * Returns the meta object for the '{@link platformer.Entity#draw() <em>Draw</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Draw</em>' operation.
	 * @see platformer.Entity#draw()
	 * @generated
	 */
	EOperation getEntity__Draw();

	/**
	 * Returns the meta object for class '{@link platformer.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see platformer.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Player#isPowered_up <em>Powered up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Powered up</em>'.
	 * @see platformer.Player#isPowered_up()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Powered_up();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Player#getPowered_time <em>Powered time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Powered time</em>'.
	 * @see platformer.Player#getPowered_time()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Powered_time();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Player#getJump_speed <em>Jump speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jump speed</em>'.
	 * @see platformer.Player#getJump_speed()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Jump_speed();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Player#isOn_ground <em>On ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On ground</em>'.
	 * @see platformer.Player#isOn_ground()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_On_ground();

	/**
	 * Returns the meta object for the '{@link platformer.Player#jump() <em>Jump</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Jump</em>' operation.
	 * @see platformer.Player#jump()
	 * @generated
	 */
	EOperation getPlayer__Jump();

	/**
	 * Returns the meta object for the '{@link platformer.Player#performAction() <em>Perform Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform Action</em>' operation.
	 * @see platformer.Player#performAction()
	 * @generated
	 */
	EOperation getPlayer__PerformAction();

	/**
	 * Returns the meta object for class '{@link platformer.Enemy <em>Enemy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enemy</em>'.
	 * @see platformer.Enemy
	 * @generated
	 */
	EClass getEnemy();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Enemy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see platformer.Enemy#getType()
	 * @see #getEnemy()
	 * @generated
	 */
	EAttribute getEnemy_Type();

	/**
	 * Returns the meta object for class '{@link platformer.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see platformer.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Platform#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see platformer.Platform#getType()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Type();

	/**
	 * Returns the meta object for class '{@link platformer.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see platformer.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Item#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see platformer.Item#getType()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Type();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Item#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see platformer.Item#getValue()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Value();

	/**
	 * Returns the meta object for the '{@link platformer.Item#applyEffect() <em>Apply Effect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Effect</em>' operation.
	 * @see platformer.Item#applyEffect()
	 * @generated
	 */
	EOperation getItem__ApplyEffect();

	/**
	 * Returns the meta object for enum '{@link platformer.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see platformer.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link platformer.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Item Type</em>'.
	 * @see platformer.ItemType
	 * @generated
	 */
	EEnum getItemType();

	/**
	 * Returns the meta object for enum '{@link platformer.PlatformType <em>Platform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Platform Type</em>'.
	 * @see platformer.PlatformType
	 * @generated
	 */
	EEnum getPlatformType();

	/**
	 * Returns the meta object for enum '{@link platformer.EnemyType <em>Enemy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enemy Type</em>'.
	 * @see platformer.EnemyType
	 * @generated
	 */
	EEnum getEnemyType();

	/**
	 * Returns the meta object for enum '{@link platformer.ButtonType <em>Button Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Button Type</em>'.
	 * @see platformer.ButtonType
	 * @generated
	 */
	EEnum getButtonType();

	/**
	 * Returns the meta object for enum '{@link platformer.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see platformer.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Pygame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pygame</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getPygame();

	/**
	 * Returns the meta object for class '{@link platformer.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see platformer.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Image#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see platformer.Image#getPath()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Path();

	/**
	 * Returns the meta object for class '{@link platformer.Array2D <em>Array2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array2 D</em>'.
	 * @see platformer.Array2D
	 * @generated
	 */
	EClass getArray2D();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Array2D#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see platformer.Array2D#getX()
	 * @see #getArray2D()
	 * @generated
	 */
	EAttribute getArray2D_X();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Array2D#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see platformer.Array2D#getY()
	 * @see #getArray2D()
	 * @generated
	 */
	EAttribute getArray2D_Y();

	/**
	 * Returns the meta object for class '{@link platformer.Lives <em>Lives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lives</em>'.
	 * @see platformer.Lives
	 * @generated
	 */
	EClass getLives();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Lives#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see platformer.Lives#getAmount()
	 * @see #getLives()
	 * @generated
	 */
	EAttribute getLives_Amount();

	/**
	 * Returns the meta object for class '{@link platformer.Score <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score</em>'.
	 * @see platformer.Score
	 * @generated
	 */
	EClass getScore();

	/**
	 * Returns the meta object for the attribute '{@link platformer.Score#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see platformer.Score#getAmount()
	 * @see #getScore()
	 * @generated
	 */
	EAttribute getScore_Amount();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlatformerFactory getPlatformerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link platformer.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.impl.GameImpl
		 * @see platformer.impl.PlatformerPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Current Level Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__CURRENT_LEVEL_COUNTER = eINSTANCE.getGame_CurrentLevelCounter();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__LEVELS = eINSTANCE.getGame_Levels();

		/**
		 * The meta object literal for the '<em><b>Ui</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__UI = eINSTANCE.getGame_Ui();

		/**
		 * The meta object literal for the '<em><b>Friction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__FRICTION = eINSTANCE.getGame_Friction();

		/**
		 * The meta object literal for the '<em><b>Gravity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__GRAVITY = eINSTANCE.getGame_Gravity();

		/**
		 * The meta object literal for the '<em><b>Lives</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__LIVES = eINSTANCE.getGame_Lives();

		/**
		 * The meta object literal for the '<em><b>Screen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__SCREEN = eINSTANCE.getGame_Screen();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__CLOCK = eINSTANCE.getGame_Clock();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__RUNNING = eINSTANCE.getGame_Running();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__SCORE = eINSTANCE.getGame_Score();

		/**
		 * The meta object literal for the '<em><b>Start Game</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___START_GAME = eINSTANCE.getGame__StartGame();

		/**
		 * The meta object literal for the '<em><b>Reset Game</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___RESET_GAME = eINSTANCE.getGame__ResetGame();

		/**
		 * The meta object literal for the '<em><b>End Game</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___END_GAME = eINSTANCE.getGame__EndGame();

		/**
		 * The meta object literal for the '<em><b>Load Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___LOAD_LEVEL = eINSTANCE.getGame__LoadLevel();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___UPDATE = eINSTANCE.getGame__Update();

		/**
		 * The meta object literal for the '{@link platformer.impl.LevelImpl <em>Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.impl.LevelImpl
		 * @see platformer.impl.PlatformerPackageImpl#getLevel()
		 * @generated
		 */
		EClass LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__WIDTH = eINSTANCE.getLevel_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__HEIGHT = eINSTANCE.getLevel_Height();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__STATUS = eINSTANCE.getLevel_Status();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__ENTITIES = eINSTANCE.getLevel_Entities();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__BACKGROUND = eINSTANCE.getLevel_Background();

		/**
		 * The meta object literal for the '<em><b>Win Coordinate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__WIN_COORDINATE = eINSTANCE.getLevel_WinCoordinate();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEVEL___UPDATE = eINSTANCE.getLevel__Update();

		/**
		 * The meta object literal for the '<em><b>Draw</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEVEL___DRAW = eINSTANCE.getLevel__Draw();

		/**
		 * The meta object literal for the '{@link platformer.impl.UIImpl <em>UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.impl.UIImpl
		 * @see platformer.impl.PlatformerPackageImpl#getUI()
		 * @generated
		 */
		EClass UI = eINSTANCE.getUI();

		/**
		 * The meta object literal for the '<em><b>Button</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__BUTTON = eINSTANCE.getUI_Button();

		/**
		 * The meta object literal for the '<em><b>Lives Count</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__LIVES_COUNT = eINSTANCE.getUI_LivesCount();

		/**
		 * The meta object literal for the '<em><b>Score Count</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__SCORE_COUNT = eINSTANCE.getUI_ScoreCount();

		/**
		 * The meta object literal for the '<em><b>Menu open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__MENU_OPEN = eINSTANCE.getUI_Menu_open();

		/**
		 * The meta object literal for the '<em><b>Draw</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___DRAW = eINSTANCE.getUI__Draw();

		/**
		 * The meta object literal for the '<em><b>Handle click</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UI___HANDLE_CLICK = eINSTANCE.getUI__Handle_click();

		/**
		 * The meta object literal for the '{@link platformer.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.impl.ButtonImpl
		 * @see platformer.impl.PlatformerPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__LABEL = eINSTANCE.getButton_Label();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__ACTION = eINSTANCE.getButton_Action();

		/**
		 * The meta object literal for the '<em><b>Perform Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON___PERFORM_ACTION = eINSTANCE.getButton__PerformAction();

		/**
		 * The meta object literal for the '{@link platformer.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.impl.EntityImpl
		 * @see platformer.impl.PlatformerPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__POSITION = eINSTANCE.getEntity_Position();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__SIZE = eINSTANCE.getEntity_Size();

		/**
		 * The meta object literal for the '<em><b>Sprite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SPRITE = eINSTANCE.getEntity_Sprite();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__DIRECTION = eINSTANCE.getEntity_Direction();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__SPEED = eINSTANCE.getEntity_Speed();

		/**
		 * The meta object literal for the '<em><b>Update Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___UPDATE_POSITION = eINSTANCE.getEntity__UpdatePosition();

		/**
		 * The meta object literal for the '<em><b>Draw</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___DRAW = eINSTANCE.getEntity__Draw();

		/**
		 * The meta object literal for the '{@link platformer.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.impl.PlayerImpl
		 * @see platformer.impl.PlatformerPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Powered up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__POWERED_UP = eINSTANCE.getPlayer_Powered_up();

		/**
		 * The meta object literal for the '<em><b>Powered time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__POWERED_TIME = eINSTANCE.getPlayer_Powered_time();

		/**
		 * The meta object literal for the '<em><b>Jump speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__JUMP_SPEED = eINSTANCE.getPlayer_Jump_speed();

		/**
		 * The meta object literal for the '<em><b>On ground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__ON_GROUND = eINSTANCE.getPlayer_On_ground();

		/**
		 * The meta object literal for the '<em><b>Jump</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___JUMP = eINSTANCE.getPlayer__Jump();

		/**
		 * The meta object literal for the '<em><b>Perform Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___PERFORM_ACTION = eINSTANCE.getPlayer__PerformAction();

		/**
		 * The meta object literal for the '{@link platformer.impl.EnemyImpl <em>Enemy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.impl.EnemyImpl
		 * @see platformer.impl.PlatformerPackageImpl#getEnemy()
		 * @generated
		 */
		EClass ENEMY = eINSTANCE.getEnemy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY__TYPE = eINSTANCE.getEnemy_Type();

		/**
		 * The meta object literal for the '{@link platformer.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.impl.PlatformImpl
		 * @see platformer.impl.PlatformerPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__TYPE = eINSTANCE.getPlatform_Type();

		/**
		 * The meta object literal for the '{@link platformer.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.impl.ItemImpl
		 * @see platformer.impl.PlatformerPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__TYPE = eINSTANCE.getItem_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__VALUE = eINSTANCE.getItem_Value();

		/**
		 * The meta object literal for the '<em><b>Apply Effect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___APPLY_EFFECT = eINSTANCE.getItem__ApplyEffect();

		/**
		 * The meta object literal for the '{@link platformer.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.Status
		 * @see platformer.impl.PlatformerPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link platformer.ItemType <em>Item Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.ItemType
		 * @see platformer.impl.PlatformerPackageImpl#getItemType()
		 * @generated
		 */
		EEnum ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '{@link platformer.PlatformType <em>Platform Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.PlatformType
		 * @see platformer.impl.PlatformerPackageImpl#getPlatformType()
		 * @generated
		 */
		EEnum PLATFORM_TYPE = eINSTANCE.getPlatformType();

		/**
		 * The meta object literal for the '{@link platformer.EnemyType <em>Enemy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.EnemyType
		 * @see platformer.impl.PlatformerPackageImpl#getEnemyType()
		 * @generated
		 */
		EEnum ENEMY_TYPE = eINSTANCE.getEnemyType();

		/**
		 * The meta object literal for the '{@link platformer.ButtonType <em>Button Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.ButtonType
		 * @see platformer.impl.PlatformerPackageImpl#getButtonType()
		 * @generated
		 */
		EEnum BUTTON_TYPE = eINSTANCE.getButtonType();

		/**
		 * The meta object literal for the '{@link platformer.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.Direction
		 * @see platformer.impl.PlatformerPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '<em>Pygame</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see platformer.impl.PlatformerPackageImpl#getPygame()
		 * @generated
		 */
		EDataType PYGAME = eINSTANCE.getPygame();

		/**
		 * The meta object literal for the '{@link platformer.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.impl.ImageImpl
		 * @see platformer.impl.PlatformerPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__PATH = eINSTANCE.getImage_Path();

		/**
		 * The meta object literal for the '{@link platformer.impl.Array2DImpl <em>Array2 D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.impl.Array2DImpl
		 * @see platformer.impl.PlatformerPackageImpl#getArray2D()
		 * @generated
		 */
		EClass ARRAY2_D = eINSTANCE.getArray2D();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY2_D__X = eINSTANCE.getArray2D_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY2_D__Y = eINSTANCE.getArray2D_Y();

		/**
		 * The meta object literal for the '{@link platformer.impl.LivesImpl <em>Lives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.impl.LivesImpl
		 * @see platformer.impl.PlatformerPackageImpl#getLives()
		 * @generated
		 */
		EClass LIVES = eINSTANCE.getLives();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVES__AMOUNT = eINSTANCE.getLives_Amount();

		/**
		 * The meta object literal for the '{@link platformer.impl.ScoreImpl <em>Score</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platformer.impl.ScoreImpl
		 * @see platformer.impl.PlatformerPackageImpl#getScore()
		 * @generated
		 */
		EClass SCORE = eINSTANCE.getScore();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE__AMOUNT = eINSTANCE.getScore_Amount();

	}

} //PlatformerPackage
