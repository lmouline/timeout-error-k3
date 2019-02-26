/**
 */
package duc.uscript.execution.util;

import duc.uscript.execution.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see duc.uscript.execution.ExecutionPackage
 * @generated
 */
public class ExecutionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExecutionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExecutionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionSwitch<Adapter> modelSwitch =
		new ExecutionSwitch<Adapter>() {
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseFrame(Frame object) {
				return createFrameAdapter();
			}
			@Override
			public Adapter caseOutputStream(OutputStream object) {
				return createOutputStreamAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseByteValue(ByteValue object) {
				return createByteValueAdapter();
			}
			@Override
			public Adapter caseShortValue(ShortValue object) {
				return createShortValueAdapter();
			}
			@Override
			public Adapter caseIntegerValue(IntegerValue object) {
				return createIntegerValueAdapter();
			}
			@Override
			public Adapter caseLongValue(LongValue object) {
				return createLongValueAdapter();
			}
			@Override
			public Adapter caseFloatValue(FloatValue object) {
				return createFloatValueAdapter();
			}
			@Override
			public Adapter caseDoubleValue(DoubleValue object) {
				return createDoubleValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseStringValue(StringValue object) {
				return createStringValueAdapter();
			}
			@Override
			public Adapter caseNullValue(NullValue object) {
				return createNullValueAdapter();
			}
			@Override
			public Adapter caseSymbolBindings(SymbolBindings object) {
				return createSymbolBindingsAdapter();
			}
			@Override
			public Adapter caseFieldBinding(FieldBinding object) {
				return createFieldBindingAdapter();
			}
			@Override
			public Adapter caseCall(Call object) {
				return createCallAdapter();
			}
			@Override
			public Adapter caseNewCall(NewCall object) {
				return createNewCallAdapter();
			}
			@Override
			public Adapter caseMethodCall2(MethodCall2 object) {
				return createMethodCall2Adapter();
			}
			@Override
			public Adapter caseObjectInstance(ObjectInstance object) {
				return createObjectInstanceAdapter();
			}
			@Override
			public Adapter caseArrayInstance(ArrayInstance object) {
				return createArrayInstanceAdapter();
			}
			@Override
			public Adapter caseObjectRefValue(ObjectRefValue object) {
				return createObjectRefValueAdapter();
			}
			@Override
			public Adapter caseArrayRefValue(ArrayRefValue object) {
				return createArrayRefValueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.Frame
	 * @generated
	 */
	public Adapter createFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.OutputStream <em>Output Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.OutputStream
	 * @generated
	 */
	public Adapter createOutputStreamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.ByteValue <em>Byte Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.ByteValue
	 * @generated
	 */
	public Adapter createByteValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.ShortValue <em>Short Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.ShortValue
	 * @generated
	 */
	public Adapter createShortValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.LongValue <em>Long Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.LongValue
	 * @generated
	 */
	public Adapter createLongValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.FloatValue <em>Float Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.FloatValue
	 * @generated
	 */
	public Adapter createFloatValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.DoubleValue <em>Double Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.DoubleValue
	 * @generated
	 */
	public Adapter createDoubleValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.NullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.NullValue
	 * @generated
	 */
	public Adapter createNullValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.SymbolBindings <em>Symbol Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.SymbolBindings
	 * @generated
	 */
	public Adapter createSymbolBindingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.FieldBinding <em>Field Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.FieldBinding
	 * @generated
	 */
	public Adapter createFieldBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.Call
	 * @generated
	 */
	public Adapter createCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.NewCall <em>New Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.NewCall
	 * @generated
	 */
	public Adapter createNewCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.MethodCall2 <em>Method Call2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.MethodCall2
	 * @generated
	 */
	public Adapter createMethodCall2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.ObjectInstance <em>Object Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.ObjectInstance
	 * @generated
	 */
	public Adapter createObjectInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.ArrayInstance <em>Array Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.ArrayInstance
	 * @generated
	 */
	public Adapter createArrayInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.ObjectRefValue <em>Object Ref Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.ObjectRefValue
	 * @generated
	 */
	public Adapter createObjectRefValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link duc.uscript.execution.ArrayRefValue <em>Array Ref Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see duc.uscript.execution.ArrayRefValue
	 * @generated
	 */
	public Adapter createArrayRefValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExecutionAdapterFactory
