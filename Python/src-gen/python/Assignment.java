/**
 */
package python;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link python.Assignment#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link python.Assignment#getRightSide <em>Right Side</em>}</li>
 * </ul>
 *
 * @see python.PythonPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Left Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Side</em>' containment reference.
	 * @see #setLeftSide(Variable)
	 * @see python.PythonPackage#getAssignment_LeftSide()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getLeftSide();

	/**
	 * Sets the value of the '{@link python.Assignment#getLeftSide <em>Left Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Side</em>' containment reference.
	 * @see #getLeftSide()
	 * @generated
	 */
	void setLeftSide(Variable value);

	/**
	 * Returns the value of the '<em><b>Right Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Side</em>' containment reference.
	 * @see #setRightSide(Expression)
	 * @see python.PythonPackage#getAssignment_RightSide()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightSide();

	/**
	 * Sets the value of the '{@link python.Assignment#getRightSide <em>Right Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Side</em>' containment reference.
	 * @see #getRightSide()
	 * @generated
	 */
	void setRightSide(Expression value);

} // Assignment
