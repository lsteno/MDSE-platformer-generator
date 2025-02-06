/**
 */
package python.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import python.Assignment;
import python.Attribute;
import python.ClassInstance;
import python.ClassReference;
import python.Comparison;
import python.ConditionType;
import python.ConditionalStatement;
import python.ConstantReference;
import python.ElseBlock;
import python.ElseIfBlock;
import python.Function;
import python.FunctionCall;
import python.IfBlock;
import python.Import;
import python.Literal;
import python.Method;
import python.Not;
import python.Primitives;
import python.Python;
import python.PythonFactory;
import python.PythonPackage;
import python.Script;
import python.Tuple;
import python.Variable;
import python.VariableReference;
import python.WhileLoop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PythonFactoryImpl extends EFactoryImpl implements PythonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PythonFactory init() {
		try {
			PythonFactory thePythonFactory = (PythonFactory) EPackage.Registry.INSTANCE
					.getEFactory(PythonPackage.eNS_URI);
			if (thePythonFactory != null) {
				return thePythonFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PythonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PythonFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PythonPackage.SCRIPT:
			return createScript();
		case PythonPackage.CLASS:
			return createClass();
		case PythonPackage.METHOD:
			return createMethod();
		case PythonPackage.ATTRIBUTE:
			return createAttribute();
		case PythonPackage.VARIABLE:
			return createVariable();
		case PythonPackage.FUNCTION:
			return createFunction();
		case PythonPackage.WHILE_LOOP:
			return createWhileLoop();
		case PythonPackage.ASSIGNMENT:
			return createAssignment();
		case PythonPackage.CLASS_INSTANCE:
			return createClassInstance();
		case PythonPackage.FUNCTION_CALL:
			return createFunctionCall();
		case PythonPackage.CONSTANT_REFERENCE:
			return createConstantReference();
		case PythonPackage.CLASS_REFERENCE:
			return createClassReference();
		case PythonPackage.LITERAL:
			return createLiteral();
		case PythonPackage.TUPLE:
			return createTuple();
		case PythonPackage.COMPARISON:
			return createComparison();
		case PythonPackage.BOOLEAN:
			return createBoolean();
		case PythonPackage.NOT:
			return createNot();
		case PythonPackage.CONDITIONAL_STATEMENT:
			return createConditionalStatement();
		case PythonPackage.IF_BLOCK:
			return createIfBlock();
		case PythonPackage.ELSE_IF_BLOCK:
			return createElseIfBlock();
		case PythonPackage.ELSE_BLOCK:
			return createElseBlock();
		case PythonPackage.PRIMITIVES:
			return createPrimitives();
		case PythonPackage.PYTHON:
			return createPython();
		case PythonPackage.IMPORT:
			return createImport();
		case PythonPackage.VARIABLE_REFERENCE:
			return createVariableReference();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case PythonPackage.CONDITION_TYPE:
			return createConditionTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case PythonPackage.CONDITION_TYPE:
			return convertConditionTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public python.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhileLoop createWhileLoop() {
		WhileLoopImpl whileLoop = new WhileLoopImpl();
		return whileLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInstance createClassInstance() {
		ClassInstanceImpl classInstance = new ClassInstanceImpl();
		return classInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantReference createConstantReference() {
		ConstantReferenceImpl constantReference = new ConstantReferenceImpl();
		return constantReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassReference createClassReference() {
		ClassReferenceImpl classReference = new ClassReferenceImpl();
		return classReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tuple createTuple() {
		TupleImpl tuple = new TupleImpl();
		return tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comparison createComparison() {
		ComparisonImpl comparison = new ComparisonImpl();
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public python.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalStatement createConditionalStatement() {
		ConditionalStatementImpl conditionalStatement = new ConditionalStatementImpl();
		return conditionalStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfBlock createIfBlock() {
		IfBlockImpl ifBlock = new IfBlockImpl();
		return ifBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElseIfBlock createElseIfBlock() {
		ElseIfBlockImpl elseIfBlock = new ElseIfBlockImpl();
		return elseIfBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElseBlock createElseBlock() {
		ElseBlockImpl elseBlock = new ElseBlockImpl();
		return elseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Primitives createPrimitives() {
		PrimitivesImpl primitives = new PrimitivesImpl();
		return primitives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Python createPython() {
		PythonImpl python = new PythonImpl();
		return python;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableReference createVariableReference() {
		VariableReferenceImpl variableReference = new VariableReferenceImpl();
		return variableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionType createConditionTypeFromString(EDataType eDataType, String initialValue) {
		ConditionType result = ConditionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PythonPackage getPythonPackage() {
		return (PythonPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PythonPackage getPackage() {
		return PythonPackage.eINSTANCE;
	}

} //PythonFactoryImpl
