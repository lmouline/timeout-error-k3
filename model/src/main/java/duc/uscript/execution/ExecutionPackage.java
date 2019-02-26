/**
 */
package duc.uscript.execution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see duc.uscript.execution.ExecutionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel complianceLevel='8.0' modelDirectory='/duc.uscript.execution.modelstate/src-gen' basePackage='duc.uscript'"
 * @generated
 */
public interface ExecutionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "execution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "duc.uscript.execution";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "execution";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExecutionPackage eINSTANCE = duc.uscript.execution.impl.ExecutionPackageImpl.init();

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.ContextImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CHILD = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__BINDINGS = 2;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.FrameImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.FrameImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 1;

	/**
	 * The feature id for the '<em><b>Root Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__ROOT_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__CHILD = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__CALL = 4;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__INSTANCE = 5;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.OutputStreamImpl <em>Output Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.OutputStreamImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getOutputStream()
	 * @generated
	 */
	int OUTPUT_STREAM = 2;

	/**
	 * The feature id for the '<em><b>Stream</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STREAM__STREAM = 0;

	/**
	 * The number of structural features of the '<em>Output Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STREAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STREAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.StateImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getState()
	 * @generated
	 */
	int STATE = 3;

	/**
	 * The feature id for the '<em><b>Output Stream</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTPUT_STREAM = 0;

	/**
	 * The feature id for the '<em><b>Root Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ROOT_FRAME = 1;

	/**
	 * The feature id for the '<em><b>Objects Heap</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OBJECTS_HEAP = 2;

	/**
	 * The feature id for the '<em><b>Arrays Heap</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ARRAYS_HEAP = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.Value <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.Value
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 4;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.ByteValueImpl <em>Byte Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.ByteValueImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getByteValue()
	 * @generated
	 */
	int BYTE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Byte Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Byte Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.ShortValueImpl <em>Short Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.ShortValueImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getShortValue()
	 * @generated
	 */
	int SHORT_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Short Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Short Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.IntegerValueImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.LongValueImpl <em>Long Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.LongValueImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getLongValue()
	 * @generated
	 */
	int LONG_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Long Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Long Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.FloatValueImpl <em>Float Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.FloatValueImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getFloatValue()
	 * @generated
	 */
	int FLOAT_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Float Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.DoubleValueImpl <em>Double Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.DoubleValueImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getDoubleValue()
	 * @generated
	 */
	int DOUBLE_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.BooleanValueImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.StringValueImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.NullValueImpl <em>Null Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.NullValueImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getNullValue()
	 * @generated
	 */
	int NULL_VALUE = 13;

	/**
	 * The number of structural features of the '<em>Null Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.SymbolBindingsImpl <em>Symbol Bindings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.SymbolBindingsImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getSymbolBindings()
	 * @generated
	 */
	int SYMBOL_BINDINGS = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_BINDINGS__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Symbol Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_BINDINGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Symbol Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_BINDINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.FieldBindingImpl <em>Field Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.FieldBindingImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getFieldBinding()
	 * @generated
	 */
	int FIELD_BINDING = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BINDING__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Field Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BINDING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Field Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.CallImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 16;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.NewCallImpl <em>New Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.NewCallImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getNewCall()
	 * @generated
	 */
	int NEW_CALL = 17;

	/**
	 * The number of structural features of the '<em>New Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CALL_FEATURE_COUNT = CALL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>New Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CALL_OPERATION_COUNT = CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.MethodCall2Impl <em>Method Call2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.MethodCall2Impl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getMethodCall2()
	 * @generated
	 */
	int METHOD_CALL2 = 18;

	/**
	 * The number of structural features of the '<em>Method Call2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL2_FEATURE_COUNT = CALL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Method Call2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL2_OPERATION_COUNT = CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.ObjectInstanceImpl <em>Object Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.ObjectInstanceImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getObjectInstance()
	 * @generated
	 */
	int OBJECT_INSTANCE = 19;

	/**
	 * The feature id for the '<em><b>Fieldbindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE__FIELDBINDINGS = 0;

	/**
	 * The number of structural features of the '<em>Object Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Object Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.ArrayInstanceImpl <em>Array Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.ArrayInstanceImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getArrayInstance()
	 * @generated
	 */
	int ARRAY_INSTANCE = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INSTANCE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INSTANCE__SIZE = 1;

	/**
	 * The number of structural features of the '<em>Array Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Array Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.ObjectRefValueImpl <em>Object Ref Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.ObjectRefValueImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getObjectRefValue()
	 * @generated
	 */
	int OBJECT_REF_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_VALUE__INSTANCE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Ref Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Ref Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link duc.uscript.execution.impl.ArrayRefValueImpl <em>Array Ref Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see duc.uscript.execution.impl.ArrayRefValueImpl
	 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getArrayRefValue()
	 * @generated
	 */
	int ARRAY_REF_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_REF_VALUE__INSTANCE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Ref Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_REF_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Ref Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_REF_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see duc.uscript.execution.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference '{@link duc.uscript.execution.Context#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see duc.uscript.execution.Context#getChild()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Child();

	/**
	 * Returns the meta object for the container reference '{@link duc.uscript.execution.Context#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see duc.uscript.execution.Context#getParent()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link duc.uscript.execution.Context#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see duc.uscript.execution.Context#getBindings()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Bindings();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see duc.uscript.execution.Frame
	 * @generated
	 */
	EClass getFrame();

	/**
	 * Returns the meta object for the containment reference '{@link duc.uscript.execution.Frame#getRootContext <em>Root Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Context</em>'.
	 * @see duc.uscript.execution.Frame#getRootContext()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_RootContext();

	/**
	 * Returns the meta object for the containment reference '{@link duc.uscript.execution.Frame#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see duc.uscript.execution.Frame#getChild()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_Child();

	/**
	 * Returns the meta object for the container reference '{@link duc.uscript.execution.Frame#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see duc.uscript.execution.Frame#getParent()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link duc.uscript.execution.Frame#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see duc.uscript.execution.Frame#getValue()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_Value();

	/**
	 * Returns the meta object for the containment reference '{@link duc.uscript.execution.Frame#getCall <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Call</em>'.
	 * @see duc.uscript.execution.Frame#getCall()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_Call();

	/**
	 * Returns the meta object for the reference '{@link duc.uscript.execution.Frame#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see duc.uscript.execution.Frame#getInstance()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_Instance();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.OutputStream <em>Output Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Stream</em>'.
	 * @see duc.uscript.execution.OutputStream
	 * @generated
	 */
	EClass getOutputStream();

	/**
	 * Returns the meta object for the attribute list '{@link duc.uscript.execution.OutputStream#getStream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stream</em>'.
	 * @see duc.uscript.execution.OutputStream#getStream()
	 * @see #getOutputStream()
	 * @generated
	 */
	EAttribute getOutputStream_Stream();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see duc.uscript.execution.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference '{@link duc.uscript.execution.State#getOutputStream <em>Output Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Stream</em>'.
	 * @see duc.uscript.execution.State#getOutputStream()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutputStream();

	/**
	 * Returns the meta object for the containment reference '{@link duc.uscript.execution.State#getRootFrame <em>Root Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Frame</em>'.
	 * @see duc.uscript.execution.State#getRootFrame()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_RootFrame();

	/**
	 * Returns the meta object for the containment reference list '{@link duc.uscript.execution.State#getObjectsHeap <em>Objects Heap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects Heap</em>'.
	 * @see duc.uscript.execution.State#getObjectsHeap()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ObjectsHeap();

	/**
	 * Returns the meta object for the containment reference list '{@link duc.uscript.execution.State#getArraysHeap <em>Arrays Heap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arrays Heap</em>'.
	 * @see duc.uscript.execution.State#getArraysHeap()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ArraysHeap();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see duc.uscript.execution.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.ByteValue <em>Byte Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte Value</em>'.
	 * @see duc.uscript.execution.ByteValue
	 * @generated
	 */
	EClass getByteValue();

	/**
	 * Returns the meta object for the attribute '{@link duc.uscript.execution.ByteValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see duc.uscript.execution.ByteValue#getValue()
	 * @see #getByteValue()
	 * @generated
	 */
	EAttribute getByteValue_Value();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.ShortValue <em>Short Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Value</em>'.
	 * @see duc.uscript.execution.ShortValue
	 * @generated
	 */
	EClass getShortValue();

	/**
	 * Returns the meta object for the attribute '{@link duc.uscript.execution.ShortValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see duc.uscript.execution.ShortValue#getValue()
	 * @see #getShortValue()
	 * @generated
	 */
	EAttribute getShortValue_Value();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see duc.uscript.execution.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link duc.uscript.execution.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see duc.uscript.execution.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.LongValue <em>Long Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Value</em>'.
	 * @see duc.uscript.execution.LongValue
	 * @generated
	 */
	EClass getLongValue();

	/**
	 * Returns the meta object for the attribute '{@link duc.uscript.execution.LongValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see duc.uscript.execution.LongValue#getValue()
	 * @see #getLongValue()
	 * @generated
	 */
	EAttribute getLongValue_Value();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.FloatValue <em>Float Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Value</em>'.
	 * @see duc.uscript.execution.FloatValue
	 * @generated
	 */
	EClass getFloatValue();

	/**
	 * Returns the meta object for the attribute '{@link duc.uscript.execution.FloatValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see duc.uscript.execution.FloatValue#getValue()
	 * @see #getFloatValue()
	 * @generated
	 */
	EAttribute getFloatValue_Value();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.DoubleValue <em>Double Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Value</em>'.
	 * @see duc.uscript.execution.DoubleValue
	 * @generated
	 */
	EClass getDoubleValue();

	/**
	 * Returns the meta object for the attribute '{@link duc.uscript.execution.DoubleValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see duc.uscript.execution.DoubleValue#getValue()
	 * @see #getDoubleValue()
	 * @generated
	 */
	EAttribute getDoubleValue_Value();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see duc.uscript.execution.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link duc.uscript.execution.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see duc.uscript.execution.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see duc.uscript.execution.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link duc.uscript.execution.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see duc.uscript.execution.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.NullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Value</em>'.
	 * @see duc.uscript.execution.NullValue
	 * @generated
	 */
	EClass getNullValue();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.SymbolBindings <em>Symbol Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Bindings</em>'.
	 * @see duc.uscript.execution.SymbolBindings
	 * @generated
	 */
	EClass getSymbolBindings();

	/**
	 * Returns the meta object for the containment reference '{@link duc.uscript.execution.SymbolBindings#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see duc.uscript.execution.SymbolBindings#getValue()
	 * @see #getSymbolBindings()
	 * @generated
	 */
	EReference getSymbolBindings_Value();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.FieldBinding <em>Field Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Binding</em>'.
	 * @see duc.uscript.execution.FieldBinding
	 * @generated
	 */
	EClass getFieldBinding();

	/**
	 * Returns the meta object for the containment reference '{@link duc.uscript.execution.FieldBinding#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see duc.uscript.execution.FieldBinding#getValue()
	 * @see #getFieldBinding()
	 * @generated
	 */
	EReference getFieldBinding_Value();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see duc.uscript.execution.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.NewCall <em>New Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Call</em>'.
	 * @see duc.uscript.execution.NewCall
	 * @generated
	 */
	EClass getNewCall();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.MethodCall2 <em>Method Call2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Call2</em>'.
	 * @see duc.uscript.execution.MethodCall2
	 * @generated
	 */
	EClass getMethodCall2();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.ObjectInstance <em>Object Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Instance</em>'.
	 * @see duc.uscript.execution.ObjectInstance
	 * @generated
	 */
	EClass getObjectInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link duc.uscript.execution.ObjectInstance#getFieldbindings <em>Fieldbindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fieldbindings</em>'.
	 * @see duc.uscript.execution.ObjectInstance#getFieldbindings()
	 * @see #getObjectInstance()
	 * @generated
	 */
	EReference getObjectInstance_Fieldbindings();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.ArrayInstance <em>Array Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Instance</em>'.
	 * @see duc.uscript.execution.ArrayInstance
	 * @generated
	 */
	EClass getArrayInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link duc.uscript.execution.ArrayInstance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see duc.uscript.execution.ArrayInstance#getValue()
	 * @see #getArrayInstance()
	 * @generated
	 */
	EReference getArrayInstance_Value();

	/**
	 * Returns the meta object for the attribute '{@link duc.uscript.execution.ArrayInstance#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see duc.uscript.execution.ArrayInstance#getSize()
	 * @see #getArrayInstance()
	 * @generated
	 */
	EAttribute getArrayInstance_Size();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.ObjectRefValue <em>Object Ref Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Ref Value</em>'.
	 * @see duc.uscript.execution.ObjectRefValue
	 * @generated
	 */
	EClass getObjectRefValue();

	/**
	 * Returns the meta object for the reference '{@link duc.uscript.execution.ObjectRefValue#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see duc.uscript.execution.ObjectRefValue#getInstance()
	 * @see #getObjectRefValue()
	 * @generated
	 */
	EReference getObjectRefValue_Instance();

	/**
	 * Returns the meta object for class '{@link duc.uscript.execution.ArrayRefValue <em>Array Ref Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Ref Value</em>'.
	 * @see duc.uscript.execution.ArrayRefValue
	 * @generated
	 */
	EClass getArrayRefValue();

	/**
	 * Returns the meta object for the reference '{@link duc.uscript.execution.ArrayRefValue#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see duc.uscript.execution.ArrayRefValue#getInstance()
	 * @see #getArrayRefValue()
	 * @generated
	 */
	EReference getArrayRefValue_Instance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExecutionFactory getExecutionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.ContextImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CHILD = eINSTANCE.getContext_Child();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__PARENT = eINSTANCE.getContext_Parent();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__BINDINGS = eINSTANCE.getContext_Bindings();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.FrameImpl <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.FrameImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '<em><b>Root Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__ROOT_CONTEXT = eINSTANCE.getFrame_RootContext();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__CHILD = eINSTANCE.getFrame_Child();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__PARENT = eINSTANCE.getFrame_Parent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__VALUE = eINSTANCE.getFrame_Value();

		/**
		 * The meta object literal for the '<em><b>Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__CALL = eINSTANCE.getFrame_Call();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__INSTANCE = eINSTANCE.getFrame_Instance();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.OutputStreamImpl <em>Output Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.OutputStreamImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getOutputStream()
		 * @generated
		 */
		EClass OUTPUT_STREAM = eINSTANCE.getOutputStream();

		/**
		 * The meta object literal for the '<em><b>Stream</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_STREAM__STREAM = eINSTANCE.getOutputStream_Stream();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.StateImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Output Stream</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTPUT_STREAM = eINSTANCE.getState_OutputStream();

		/**
		 * The meta object literal for the '<em><b>Root Frame</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ROOT_FRAME = eINSTANCE.getState_RootFrame();

		/**
		 * The meta object literal for the '<em><b>Objects Heap</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OBJECTS_HEAP = eINSTANCE.getState_ObjectsHeap();

		/**
		 * The meta object literal for the '<em><b>Arrays Heap</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ARRAYS_HEAP = eINSTANCE.getState_ArraysHeap();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.Value <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.Value
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.ByteValueImpl <em>Byte Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.ByteValueImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getByteValue()
		 * @generated
		 */
		EClass BYTE_VALUE = eINSTANCE.getByteValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BYTE_VALUE__VALUE = eINSTANCE.getByteValue_Value();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.ShortValueImpl <em>Short Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.ShortValueImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getShortValue()
		 * @generated
		 */
		EClass SHORT_VALUE = eINSTANCE.getShortValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_VALUE__VALUE = eINSTANCE.getShortValue_Value();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.IntegerValueImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.LongValueImpl <em>Long Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.LongValueImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getLongValue()
		 * @generated
		 */
		EClass LONG_VALUE = eINSTANCE.getLongValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_VALUE__VALUE = eINSTANCE.getLongValue_Value();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.FloatValueImpl <em>Float Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.FloatValueImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getFloatValue()
		 * @generated
		 */
		EClass FLOAT_VALUE = eINSTANCE.getFloatValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_VALUE__VALUE = eINSTANCE.getFloatValue_Value();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.DoubleValueImpl <em>Double Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.DoubleValueImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getDoubleValue()
		 * @generated
		 */
		EClass DOUBLE_VALUE = eINSTANCE.getDoubleValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_VALUE__VALUE = eINSTANCE.getDoubleValue_Value();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.BooleanValueImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.StringValueImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.NullValueImpl <em>Null Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.NullValueImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getNullValue()
		 * @generated
		 */
		EClass NULL_VALUE = eINSTANCE.getNullValue();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.SymbolBindingsImpl <em>Symbol Bindings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.SymbolBindingsImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getSymbolBindings()
		 * @generated
		 */
		EClass SYMBOL_BINDINGS = eINSTANCE.getSymbolBindings();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL_BINDINGS__VALUE = eINSTANCE.getSymbolBindings_Value();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.FieldBindingImpl <em>Field Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.FieldBindingImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getFieldBinding()
		 * @generated
		 */
		EClass FIELD_BINDING = eINSTANCE.getFieldBinding();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_BINDING__VALUE = eINSTANCE.getFieldBinding_Value();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.CallImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.NewCallImpl <em>New Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.NewCallImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getNewCall()
		 * @generated
		 */
		EClass NEW_CALL = eINSTANCE.getNewCall();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.MethodCall2Impl <em>Method Call2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.MethodCall2Impl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getMethodCall2()
		 * @generated
		 */
		EClass METHOD_CALL2 = eINSTANCE.getMethodCall2();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.ObjectInstanceImpl <em>Object Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.ObjectInstanceImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getObjectInstance()
		 * @generated
		 */
		EClass OBJECT_INSTANCE = eINSTANCE.getObjectInstance();

		/**
		 * The meta object literal for the '<em><b>Fieldbindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INSTANCE__FIELDBINDINGS = eINSTANCE.getObjectInstance_Fieldbindings();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.ArrayInstanceImpl <em>Array Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.ArrayInstanceImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getArrayInstance()
		 * @generated
		 */
		EClass ARRAY_INSTANCE = eINSTANCE.getArrayInstance();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_INSTANCE__VALUE = eINSTANCE.getArrayInstance_Value();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_INSTANCE__SIZE = eINSTANCE.getArrayInstance_Size();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.ObjectRefValueImpl <em>Object Ref Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.ObjectRefValueImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getObjectRefValue()
		 * @generated
		 */
		EClass OBJECT_REF_VALUE = eINSTANCE.getObjectRefValue();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_REF_VALUE__INSTANCE = eINSTANCE.getObjectRefValue_Instance();

		/**
		 * The meta object literal for the '{@link duc.uscript.execution.impl.ArrayRefValueImpl <em>Array Ref Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see duc.uscript.execution.impl.ArrayRefValueImpl
		 * @see duc.uscript.execution.impl.ExecutionPackageImpl#getArrayRefValue()
		 * @generated
		 */
		EClass ARRAY_REF_VALUE = eINSTANCE.getArrayRefValue();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_REF_VALUE__INSTANCE = eINSTANCE.getArrayRefValue_Instance();

	}

} //ExecutionPackage
