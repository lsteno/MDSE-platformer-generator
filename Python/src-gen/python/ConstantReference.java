/**
 */
package python;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link python.ConstantReference#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see python.PythonPackage#getConstantReference()
 * @model
 * @generated
 */
public interface ConstantReference extends Expression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see python.PythonPackage#getConstantReference_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link python.ConstantReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ConstantReference
