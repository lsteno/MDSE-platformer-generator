/**
 */
package platformer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platformer.Button#getLabel <em>Label</em>}</li>
 *   <li>{@link platformer.Button#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see platformer.PlatformerPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see platformer.PlatformerPackage#getButton_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link platformer.Button#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link platformer.ButtonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see platformer.ButtonType
	 * @see #setAction(ButtonType)
	 * @see platformer.PlatformerPackage#getButton_Action()
	 * @model
	 * @generated
	 */
	ButtonType getAction();

	/**
	 * Sets the value of the '{@link platformer.Button#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see platformer.ButtonType
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ButtonType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void performAction();

} // Button
