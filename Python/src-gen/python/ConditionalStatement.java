/**
 */
package python;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link python.ConditionalStatement#getIfblock <em>Ifblock</em>}</li>
 *   <li>{@link python.ConditionalStatement#getElseifblock <em>Elseifblock</em>}</li>
 *   <li>{@link python.ConditionalStatement#getElseblock <em>Elseblock</em>}</li>
 * </ul>
 *
 * @see python.PythonPackage#getConditionalStatement()
 * @model
 * @generated
 */
public interface ConditionalStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifblock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifblock</em>' containment reference.
	 * @see #setIfblock(IfBlock)
	 * @see python.PythonPackage#getConditionalStatement_Ifblock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IfBlock getIfblock();

	/**
	 * Sets the value of the '{@link python.ConditionalStatement#getIfblock <em>Ifblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifblock</em>' containment reference.
	 * @see #getIfblock()
	 * @generated
	 */
	void setIfblock(IfBlock value);

	/**
	 * Returns the value of the '<em><b>Elseifblock</b></em>' containment reference list.
	 * The list contents are of type {@link python.ElseIfBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elseifblock</em>' containment reference list.
	 * @see python.PythonPackage#getConditionalStatement_Elseifblock()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElseIfBlock> getElseifblock();

	/**
	 * Returns the value of the '<em><b>Elseblock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elseblock</em>' containment reference.
	 * @see #setElseblock(ElseBlock)
	 * @see python.PythonPackage#getConditionalStatement_Elseblock()
	 * @model containment="true"
	 * @generated
	 */
	ElseBlock getElseblock();

	/**
	 * Sets the value of the '{@link python.ConditionalStatement#getElseblock <em>Elseblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elseblock</em>' containment reference.
	 * @see #getElseblock()
	 * @generated
	 */
	void setElseblock(ElseBlock value);

} // ConditionalStatement
