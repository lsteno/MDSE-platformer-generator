/**
 */
package python.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import python.Assignment;
import python.ConditionalStatement;
import python.Expression;
import python.Function;
import python.Import;
import python.Primitives;
import python.PythonPackage;
import python.Script;
import python.Variable;
import python.WhileLoop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link python.impl.ScriptImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link python.impl.ScriptImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link python.impl.ScriptImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link python.impl.ScriptImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link python.impl.ScriptImpl#getConditionalstatement <em>Conditionalstatement</em>}</li>
 *   <li>{@link python.impl.ScriptImpl#getPrimitives <em>Primitives</em>}</li>
 *   <li>{@link python.impl.ScriptImpl#getWhileloop <em>Whileloop</em>}</li>
 *   <li>{@link python.impl.ScriptImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link python.impl.ScriptImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptImpl extends MinimalEObjectImpl.Container implements Script {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<python.Class> class_;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> function;

	/**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> assignment;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

	/**
	 * The cached value of the '{@link #getConditionalstatement() <em>Conditionalstatement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalstatement()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalStatement> conditionalstatement;

	/**
	 * The cached value of the '{@link #getPrimitives() <em>Primitives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitives()
	 * @generated
	 * @ordered
	 */
	protected EList<Primitives> primitives;

	/**
	 * The cached value of the '{@link #getWhileloop() <em>Whileloop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhileloop()
	 * @generated
	 * @ordered
	 */
	protected EList<WhileLoop> whileloop;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> expressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PythonPackage.Literals.SCRIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<python.Class> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<python.Class>(python.Class.class, this, PythonPackage.SCRIPT__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Function> getFunction() {
		if (function == null) {
			function = new EObjectContainmentEList<Function>(Function.class, this, PythonPackage.SCRIPT__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Assignment> getAssignment() {
		if (assignment == null) {
			assignment = new EObjectContainmentEList<Assignment>(Assignment.class, this,
					PythonPackage.SCRIPT__ASSIGNMENT);
		}
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<Variable>(Variable.class, this, PythonPackage.SCRIPT__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionalStatement> getConditionalstatement() {
		if (conditionalstatement == null) {
			conditionalstatement = new EObjectContainmentEList<ConditionalStatement>(ConditionalStatement.class, this,
					PythonPackage.SCRIPT__CONDITIONALSTATEMENT);
		}
		return conditionalstatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Primitives> getPrimitives() {
		if (primitives == null) {
			primitives = new EObjectContainmentEList<Primitives>(Primitives.class, this,
					PythonPackage.SCRIPT__PRIMITIVES);
		}
		return primitives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WhileLoop> getWhileloop() {
		if (whileloop == null) {
			whileloop = new EObjectContainmentEList<WhileLoop>(WhileLoop.class, this, PythonPackage.SCRIPT__WHILELOOP);
		}
		return whileloop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, PythonPackage.SCRIPT__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<Expression>(Expression.class, this,
					PythonPackage.SCRIPT__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PythonPackage.SCRIPT__CLASS:
			return ((InternalEList<?>) getClass_()).basicRemove(otherEnd, msgs);
		case PythonPackage.SCRIPT__FUNCTION:
			return ((InternalEList<?>) getFunction()).basicRemove(otherEnd, msgs);
		case PythonPackage.SCRIPT__ASSIGNMENT:
			return ((InternalEList<?>) getAssignment()).basicRemove(otherEnd, msgs);
		case PythonPackage.SCRIPT__VARIABLE:
			return ((InternalEList<?>) getVariable()).basicRemove(otherEnd, msgs);
		case PythonPackage.SCRIPT__CONDITIONALSTATEMENT:
			return ((InternalEList<?>) getConditionalstatement()).basicRemove(otherEnd, msgs);
		case PythonPackage.SCRIPT__PRIMITIVES:
			return ((InternalEList<?>) getPrimitives()).basicRemove(otherEnd, msgs);
		case PythonPackage.SCRIPT__WHILELOOP:
			return ((InternalEList<?>) getWhileloop()).basicRemove(otherEnd, msgs);
		case PythonPackage.SCRIPT__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
		case PythonPackage.SCRIPT__EXPRESSIONS:
			return ((InternalEList<?>) getExpressions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PythonPackage.SCRIPT__CLASS:
			return getClass_();
		case PythonPackage.SCRIPT__FUNCTION:
			return getFunction();
		case PythonPackage.SCRIPT__ASSIGNMENT:
			return getAssignment();
		case PythonPackage.SCRIPT__VARIABLE:
			return getVariable();
		case PythonPackage.SCRIPT__CONDITIONALSTATEMENT:
			return getConditionalstatement();
		case PythonPackage.SCRIPT__PRIMITIVES:
			return getPrimitives();
		case PythonPackage.SCRIPT__WHILELOOP:
			return getWhileloop();
		case PythonPackage.SCRIPT__IMPORTS:
			return getImports();
		case PythonPackage.SCRIPT__EXPRESSIONS:
			return getExpressions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PythonPackage.SCRIPT__CLASS:
			getClass_().clear();
			getClass_().addAll((Collection<? extends python.Class>) newValue);
			return;
		case PythonPackage.SCRIPT__FUNCTION:
			getFunction().clear();
			getFunction().addAll((Collection<? extends Function>) newValue);
			return;
		case PythonPackage.SCRIPT__ASSIGNMENT:
			getAssignment().clear();
			getAssignment().addAll((Collection<? extends Assignment>) newValue);
			return;
		case PythonPackage.SCRIPT__VARIABLE:
			getVariable().clear();
			getVariable().addAll((Collection<? extends Variable>) newValue);
			return;
		case PythonPackage.SCRIPT__CONDITIONALSTATEMENT:
			getConditionalstatement().clear();
			getConditionalstatement().addAll((Collection<? extends ConditionalStatement>) newValue);
			return;
		case PythonPackage.SCRIPT__PRIMITIVES:
			getPrimitives().clear();
			getPrimitives().addAll((Collection<? extends Primitives>) newValue);
			return;
		case PythonPackage.SCRIPT__WHILELOOP:
			getWhileloop().clear();
			getWhileloop().addAll((Collection<? extends WhileLoop>) newValue);
			return;
		case PythonPackage.SCRIPT__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends Import>) newValue);
			return;
		case PythonPackage.SCRIPT__EXPRESSIONS:
			getExpressions().clear();
			getExpressions().addAll((Collection<? extends Expression>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PythonPackage.SCRIPT__CLASS:
			getClass_().clear();
			return;
		case PythonPackage.SCRIPT__FUNCTION:
			getFunction().clear();
			return;
		case PythonPackage.SCRIPT__ASSIGNMENT:
			getAssignment().clear();
			return;
		case PythonPackage.SCRIPT__VARIABLE:
			getVariable().clear();
			return;
		case PythonPackage.SCRIPT__CONDITIONALSTATEMENT:
			getConditionalstatement().clear();
			return;
		case PythonPackage.SCRIPT__PRIMITIVES:
			getPrimitives().clear();
			return;
		case PythonPackage.SCRIPT__WHILELOOP:
			getWhileloop().clear();
			return;
		case PythonPackage.SCRIPT__IMPORTS:
			getImports().clear();
			return;
		case PythonPackage.SCRIPT__EXPRESSIONS:
			getExpressions().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PythonPackage.SCRIPT__CLASS:
			return class_ != null && !class_.isEmpty();
		case PythonPackage.SCRIPT__FUNCTION:
			return function != null && !function.isEmpty();
		case PythonPackage.SCRIPT__ASSIGNMENT:
			return assignment != null && !assignment.isEmpty();
		case PythonPackage.SCRIPT__VARIABLE:
			return variable != null && !variable.isEmpty();
		case PythonPackage.SCRIPT__CONDITIONALSTATEMENT:
			return conditionalstatement != null && !conditionalstatement.isEmpty();
		case PythonPackage.SCRIPT__PRIMITIVES:
			return primitives != null && !primitives.isEmpty();
		case PythonPackage.SCRIPT__WHILELOOP:
			return whileloop != null && !whileloop.isEmpty();
		case PythonPackage.SCRIPT__IMPORTS:
			return imports != null && !imports.isEmpty();
		case PythonPackage.SCRIPT__EXPRESSIONS:
			return expressions != null && !expressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScriptImpl
