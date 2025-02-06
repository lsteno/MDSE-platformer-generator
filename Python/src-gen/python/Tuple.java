/**
 */
package python;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link python.Tuple#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see python.PythonPackage#getTuple()
 * @model
 * @generated
 */
public interface Tuple extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link python.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see python.PythonPackage#getTuple_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // Tuple
