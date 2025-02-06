/**
 */
package python;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link python.Script#getClass_ <em>Class</em>}</li>
 *   <li>{@link python.Script#getFunction <em>Function</em>}</li>
 *   <li>{@link python.Script#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link python.Script#getVariable <em>Variable</em>}</li>
 *   <li>{@link python.Script#getConditionalstatement <em>Conditionalstatement</em>}</li>
 *   <li>{@link python.Script#getPrimitives <em>Primitives</em>}</li>
 *   <li>{@link python.Script#getWhileloop <em>Whileloop</em>}</li>
 *   <li>{@link python.Script#getImports <em>Imports</em>}</li>
 *   <li>{@link python.Script#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see python.PythonPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link python.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see python.PythonPackage#getScript_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<python.Class> getClass_();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link python.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see python.PythonPackage#getScript_Function()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunction();

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link python.Assignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference list.
	 * @see python.PythonPackage#getScript_Assignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assignment> getAssignment();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link python.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see python.PythonPackage#getScript_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();

	/**
	 * Returns the value of the '<em><b>Conditionalstatement</b></em>' containment reference list.
	 * The list contents are of type {@link python.ConditionalStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionalstatement</em>' containment reference list.
	 * @see python.PythonPackage#getScript_Conditionalstatement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalStatement> getConditionalstatement();

	/**
	 * Returns the value of the '<em><b>Primitives</b></em>' containment reference list.
	 * The list contents are of type {@link python.Primitives}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitives</em>' containment reference list.
	 * @see python.PythonPackage#getScript_Primitives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Primitives> getPrimitives();

	/**
	 * Returns the value of the '<em><b>Whileloop</b></em>' containment reference list.
	 * The list contents are of type {@link python.WhileLoop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whileloop</em>' containment reference list.
	 * @see python.PythonPackage#getScript_Whileloop()
	 * @model containment="true"
	 * @generated
	 */
	EList<WhileLoop> getWhileloop();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link python.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see python.PythonPackage#getScript_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link python.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see python.PythonPackage#getScript_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // Script
