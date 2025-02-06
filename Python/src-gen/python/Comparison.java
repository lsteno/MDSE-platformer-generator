/**
 */
package python;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link python.Comparison#getOperator <em>Operator</em>}</li>
 *   <li>{@link python.Comparison#getLeft <em>Left</em>}</li>
 *   <li>{@link python.Comparison#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see python.PythonPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link python.ConditionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see python.ConditionType
	 * @see #setOperator(ConditionType)
	 * @see python.PythonPackage#getComparison_Operator()
	 * @model
	 * @generated
	 */
	ConditionType getOperator();

	/**
	 * Sets the value of the '{@link python.Comparison#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see python.ConditionType
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ConditionType value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(BooleanExpression)
	 * @see python.PythonPackage#getComparison_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getLeft();

	/**
	 * Sets the value of the '{@link python.Comparison#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(BooleanExpression)
	 * @see python.PythonPackage#getComparison_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getRight();

	/**
	 * Sets the value of the '{@link python.Comparison#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(BooleanExpression value);

} // Comparison
