/**
 */
package python;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link python.WhileLoop#getBooleanexpression <em>Booleanexpression</em>}</li>
 *   <li>{@link python.WhileLoop#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see python.PythonPackage#getWhileLoop()
 * @model
 * @generated
 */
public interface WhileLoop extends EObject {
	/**
	 * Returns the value of the '<em><b>Booleanexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booleanexpression</em>' containment reference.
	 * @see #setBooleanexpression(BooleanExpression)
	 * @see python.PythonPackage#getWhileLoop_Booleanexpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getBooleanexpression();

	/**
	 * Sets the value of the '{@link python.WhileLoop#getBooleanexpression <em>Booleanexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booleanexpression</em>' containment reference.
	 * @see #getBooleanexpression()
	 * @generated
	 */
	void setBooleanexpression(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' containment reference.
	 * @see #setScript(Script)
	 * @see python.PythonPackage#getWhileLoop_Script()
	 * @model containment="true"
	 * @generated
	 */
	Script getScript();

	/**
	 * Sets the value of the '{@link python.WhileLoop#getScript <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' containment reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Script value);

} // WhileLoop
