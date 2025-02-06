/**
 */
package python;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link python.Not#getBooleanexpression <em>Booleanexpression</em>}</li>
 * </ul>
 *
 * @see python.PythonPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Booleanexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booleanexpression</em>' containment reference.
	 * @see #setBooleanexpression(BooleanExpression)
	 * @see python.PythonPackage#getNot_Booleanexpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getBooleanexpression();

	/**
	 * Sets the value of the '{@link python.Not#getBooleanexpression <em>Booleanexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booleanexpression</em>' containment reference.
	 * @see #getBooleanexpression()
	 * @generated
	 */
	void setBooleanexpression(BooleanExpression value);

} // Not
