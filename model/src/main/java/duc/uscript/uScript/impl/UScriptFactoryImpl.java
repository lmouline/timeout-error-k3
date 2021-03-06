/**
 * generated by Xtext 2.16.0
 */
package duc.uscript.uScript.impl;

import duc.uscript.uScript.And;
import duc.uscript.uScript.ArrayAccess;
import duc.uscript.uScript.ArrayLength;
import duc.uscript.uScript.ArrayTypeRef;
import duc.uscript.uScript.Assignee;
import duc.uscript.uScript.Assignment;
import duc.uscript.uScript.BernoulliRef;
import duc.uscript.uScript.BinomialRef;
import duc.uscript.uScript.Block;
import duc.uscript.uScript.BoolConstant;
import duc.uscript.uScript.BooleanTypeRef;
import duc.uscript.uScript.ByteTypeRef;
import duc.uscript.uScript.CharTypeRef;
import duc.uscript.uScript.ClassRef;
import duc.uscript.uScript.DiracRef;
import duc.uscript.uScript.Division;
import duc.uscript.uScript.DoubleConstant;
import duc.uscript.uScript.DoubleTypeRef;
import duc.uscript.uScript.DrawExpr;
import duc.uscript.uScript.Equality;
import duc.uscript.uScript.ExistExpr;
import duc.uscript.uScript.Expression;
import duc.uscript.uScript.Field;
import duc.uscript.uScript.FieldAccess;
import duc.uscript.uScript.FloatTypeRef;
import duc.uscript.uScript.ForStatement;
import duc.uscript.uScript.GaussianRef;
import duc.uscript.uScript.IfStatement;
import duc.uscript.uScript.Import;
import duc.uscript.uScript.Inequality;
import duc.uscript.uScript.Inferior;
import duc.uscript.uScript.InferiorOrEqual;
import duc.uscript.uScript.IntConstant;
import duc.uscript.uScript.IntegerTypeRef;
import duc.uscript.uScript.LongConstant;
import duc.uscript.uScript.LongTypeRef;
import duc.uscript.uScript.Method;
import duc.uscript.uScript.MethodCall;
import duc.uscript.uScript.MethodCall2;
import duc.uscript.uScript.Minus;
import duc.uscript.uScript.Multiplication;
import duc.uscript.uScript.Neg;
import duc.uscript.uScript.NewArray;
import duc.uscript.uScript.NewObject;
import duc.uscript.uScript.NewUObject;
import duc.uscript.uScript.Not;
import duc.uscript.uScript.Null;
import duc.uscript.uScript.Or;
import duc.uscript.uScript.Parameter;
import duc.uscript.uScript.Plus;
import duc.uscript.uScript.PrintStatement;
import duc.uscript.uScript.Program;
import duc.uscript.uScript.RayleighRef;
import duc.uscript.uScript.Return;
import duc.uscript.uScript.ShortTypeRef;
import duc.uscript.uScript.SingleTypeRef;
import duc.uscript.uScript.Statement;
import duc.uscript.uScript.StringConstant;
import duc.uscript.uScript.StringTypeRef;
import duc.uscript.uScript.Super;
import duc.uscript.uScript.Superior;
import duc.uscript.uScript.SuperiorOrEqual;
import duc.uscript.uScript.Symbol;
import duc.uscript.uScript.SymbolRef;
import duc.uscript.uScript.This;
import duc.uscript.uScript.TypeRef;
import duc.uscript.uScript.UScriptFactory;
import duc.uscript.uScript.UScriptPackage;
import duc.uscript.uScript.UTypeRef;
import duc.uscript.uScript.VariableDeclaration;
import duc.uscript.uScript.VoidTypeRef;
import duc.uscript.uScript.WhileStatement;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UScriptFactoryImpl extends EFactoryImpl implements UScriptFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UScriptFactory init()
  {
    try
    {
      UScriptFactory theUScriptFactory = (UScriptFactory)EPackage.Registry.INSTANCE.getEFactory(UScriptPackage.eNS_URI);
      if (theUScriptFactory != null)
      {
        return theUScriptFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UScriptFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UScriptFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UScriptPackage.PROGRAM: return createProgram();
      case UScriptPackage.IMPORT: return createImport();
      case UScriptPackage.CLASS: return createClass();
      case UScriptPackage.METHOD: return createMethod();
      case UScriptPackage.PARAMETER: return createParameter();
      case UScriptPackage.FIELD: return createField();
      case UScriptPackage.BLOCK: return createBlock();
      case UScriptPackage.STATEMENT: return createStatement();
      case UScriptPackage.PRINT_STATEMENT: return createPrintStatement();
      case UScriptPackage.RETURN: return createReturn();
      case UScriptPackage.IF_STATEMENT: return createIfStatement();
      case UScriptPackage.WHILE_STATEMENT: return createWhileStatement();
      case UScriptPackage.FOR_STATEMENT: return createForStatement();
      case UScriptPackage.TYPE_REF: return createTypeRef();
      case UScriptPackage.SINGLE_TYPE_REF: return createSingleTypeRef();
      case UScriptPackage.CLASS_REF: return createClassRef();
      case UScriptPackage.UTYPE_REF: return createUTypeRef();
      case UScriptPackage.GAUSSIAN_REF: return createGaussianRef();
      case UScriptPackage.BERNOULLI_REF: return createBernoulliRef();
      case UScriptPackage.RAYLEIGH_REF: return createRayleighRef();
      case UScriptPackage.BINOMIAL_REF: return createBinomialRef();
      case UScriptPackage.DIRAC_REF: return createDiracRef();
      case UScriptPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case UScriptPackage.ASSIGNMENT: return createAssignment();
      case UScriptPackage.ASSIGNEE: return createAssignee();
      case UScriptPackage.EXPRESSION: return createExpression();
      case UScriptPackage.SYMBOL: return createSymbol();
      case UScriptPackage.ARRAY_TYPE_REF: return createArrayTypeRef();
      case UScriptPackage.BYTE_TYPE_REF: return createByteTypeRef();
      case UScriptPackage.INTEGER_TYPE_REF: return createIntegerTypeRef();
      case UScriptPackage.LONG_TYPE_REF: return createLongTypeRef();
      case UScriptPackage.FLOAT_TYPE_REF: return createFloatTypeRef();
      case UScriptPackage.DOUBLE_TYPE_REF: return createDoubleTypeRef();
      case UScriptPackage.SHORT_TYPE_REF: return createShortTypeRef();
      case UScriptPackage.CHAR_TYPE_REF: return createCharTypeRef();
      case UScriptPackage.BOOLEAN_TYPE_REF: return createBooleanTypeRef();
      case UScriptPackage.STRING_TYPE_REF: return createStringTypeRef();
      case UScriptPackage.VOID_TYPE_REF: return createVoidTypeRef();
      case UScriptPackage.OR: return createOr();
      case UScriptPackage.AND: return createAnd();
      case UScriptPackage.EQUALITY: return createEquality();
      case UScriptPackage.INEQUALITY: return createInequality();
      case UScriptPackage.SUPERIOR_OR_EQUAL: return createSuperiorOrEqual();
      case UScriptPackage.INFERIOR_OR_EQUAL: return createInferiorOrEqual();
      case UScriptPackage.SUPERIOR: return createSuperior();
      case UScriptPackage.INFERIOR: return createInferior();
      case UScriptPackage.PLUS: return createPlus();
      case UScriptPackage.MINUS: return createMinus();
      case UScriptPackage.MULTIPLICATION: return createMultiplication();
      case UScriptPackage.DIVISION: return createDivision();
      case UScriptPackage.ARRAY_ACCESS: return createArrayAccess();
      case UScriptPackage.ARRAY_LENGTH: return createArrayLength();
      case UScriptPackage.NOT: return createNot();
      case UScriptPackage.NEG: return createNeg();
      case UScriptPackage.FIELD_ACCESS: return createFieldAccess();
      case UScriptPackage.METHOD_CALL: return createMethodCall();
      case UScriptPackage.INT_CONSTANT: return createIntConstant();
      case UScriptPackage.DOUBLE_CONSTANT: return createDoubleConstant();
      case UScriptPackage.LONG_CONSTANT: return createLongConstant();
      case UScriptPackage.BOOL_CONSTANT: return createBoolConstant();
      case UScriptPackage.STRING_CONSTANT: return createStringConstant();
      case UScriptPackage.THIS: return createThis();
      case UScriptPackage.SUPER: return createSuper();
      case UScriptPackage.NULL: return createNull();
      case UScriptPackage.NEW_OBJECT: return createNewObject();
      case UScriptPackage.NEW_UOBJECT: return createNewUObject();
      case UScriptPackage.NEW_ARRAY: return createNewArray();
      case UScriptPackage.SYMBOL_REF: return createSymbolRef();
      case UScriptPackage.METHOD_CALL2: return createMethodCall2();
      case UScriptPackage.EXIST_EXPR: return createExistExpr();
      case UScriptPackage.DRAW_EXPR: return createDrawExpr();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public duc.uscript.uScript.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrintStatement createPrintStatement()
  {
    PrintStatementImpl printStatement = new PrintStatementImpl();
    return printStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Return createReturn()
  {
    ReturnImpl return_ = new ReturnImpl();
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileStatement createWhileStatement()
  {
    WhileStatementImpl whileStatement = new WhileStatementImpl();
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStatement createForStatement()
  {
    ForStatementImpl forStatement = new ForStatementImpl();
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef createTypeRef()
  {
    TypeRefImpl typeRef = new TypeRefImpl();
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleTypeRef createSingleTypeRef()
  {
    SingleTypeRefImpl singleTypeRef = new SingleTypeRefImpl();
    return singleTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassRef createClassRef()
  {
    ClassRefImpl classRef = new ClassRefImpl();
    return classRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UTypeRef createUTypeRef()
  {
    UTypeRefImpl uTypeRef = new UTypeRefImpl();
    return uTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GaussianRef createGaussianRef()
  {
    GaussianRefImpl gaussianRef = new GaussianRefImpl();
    return gaussianRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BernoulliRef createBernoulliRef()
  {
    BernoulliRefImpl bernoulliRef = new BernoulliRefImpl();
    return bernoulliRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RayleighRef createRayleighRef()
  {
    RayleighRefImpl rayleighRef = new RayleighRefImpl();
    return rayleighRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinomialRef createBinomialRef()
  {
    BinomialRefImpl binomialRef = new BinomialRefImpl();
    return binomialRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiracRef createDiracRef()
  {
    DiracRefImpl diracRef = new DiracRefImpl();
    return diracRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignee createAssignee()
  {
    AssigneeImpl assignee = new AssigneeImpl();
    return assignee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Symbol createSymbol()
  {
    SymbolImpl symbol = new SymbolImpl();
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayTypeRef createArrayTypeRef()
  {
    ArrayTypeRefImpl arrayTypeRef = new ArrayTypeRefImpl();
    return arrayTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ByteTypeRef createByteTypeRef()
  {
    ByteTypeRefImpl byteTypeRef = new ByteTypeRefImpl();
    return byteTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerTypeRef createIntegerTypeRef()
  {
    IntegerTypeRefImpl integerTypeRef = new IntegerTypeRefImpl();
    return integerTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongTypeRef createLongTypeRef()
  {
    LongTypeRefImpl longTypeRef = new LongTypeRefImpl();
    return longTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatTypeRef createFloatTypeRef()
  {
    FloatTypeRefImpl floatTypeRef = new FloatTypeRefImpl();
    return floatTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleTypeRef createDoubleTypeRef()
  {
    DoubleTypeRefImpl doubleTypeRef = new DoubleTypeRefImpl();
    return doubleTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShortTypeRef createShortTypeRef()
  {
    ShortTypeRefImpl shortTypeRef = new ShortTypeRefImpl();
    return shortTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharTypeRef createCharTypeRef()
  {
    CharTypeRefImpl charTypeRef = new CharTypeRefImpl();
    return charTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanTypeRef createBooleanTypeRef()
  {
    BooleanTypeRefImpl booleanTypeRef = new BooleanTypeRefImpl();
    return booleanTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringTypeRef createStringTypeRef()
  {
    StringTypeRefImpl stringTypeRef = new StringTypeRefImpl();
    return stringTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VoidTypeRef createVoidTypeRef()
  {
    VoidTypeRefImpl voidTypeRef = new VoidTypeRefImpl();
    return voidTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inequality createInequality()
  {
    InequalityImpl inequality = new InequalityImpl();
    return inequality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperiorOrEqual createSuperiorOrEqual()
  {
    SuperiorOrEqualImpl superiorOrEqual = new SuperiorOrEqualImpl();
    return superiorOrEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InferiorOrEqual createInferiorOrEqual()
  {
    InferiorOrEqualImpl inferiorOrEqual = new InferiorOrEqualImpl();
    return inferiorOrEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Superior createSuperior()
  {
    SuperiorImpl superior = new SuperiorImpl();
    return superior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inferior createInferior()
  {
    InferiorImpl inferior = new InferiorImpl();
    return inferior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Division createDivision()
  {
    DivisionImpl division = new DivisionImpl();
    return division;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayAccess createArrayAccess()
  {
    ArrayAccessImpl arrayAccess = new ArrayAccessImpl();
    return arrayAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayLength createArrayLength()
  {
    ArrayLengthImpl arrayLength = new ArrayLengthImpl();
    return arrayLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Neg createNeg()
  {
    NegImpl neg = new NegImpl();
    return neg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldAccess createFieldAccess()
  {
    FieldAccessImpl fieldAccess = new FieldAccessImpl();
    return fieldAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodCall createMethodCall()
  {
    MethodCallImpl methodCall = new MethodCallImpl();
    return methodCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntConstant createIntConstant()
  {
    IntConstantImpl intConstant = new IntConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleConstant createDoubleConstant()
  {
    DoubleConstantImpl doubleConstant = new DoubleConstantImpl();
    return doubleConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongConstant createLongConstant()
  {
    LongConstantImpl longConstant = new LongConstantImpl();
    return longConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringConstant createStringConstant()
  {
    StringConstantImpl stringConstant = new StringConstantImpl();
    return stringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public This createThis()
  {
    ThisImpl this_ = new ThisImpl();
    return this_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Super createSuper()
  {
    SuperImpl super_ = new SuperImpl();
    return super_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Null createNull()
  {
    NullImpl null_ = new NullImpl();
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewObject createNewObject()
  {
    NewObjectImpl newObject = new NewObjectImpl();
    return newObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewUObject createNewUObject()
  {
    NewUObjectImpl newUObject = new NewUObjectImpl();
    return newUObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewArray createNewArray()
  {
    NewArrayImpl newArray = new NewArrayImpl();
    return newArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolRef createSymbolRef()
  {
    SymbolRefImpl symbolRef = new SymbolRefImpl();
    return symbolRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodCall2 createMethodCall2()
  {
    MethodCall2Impl methodCall2 = new MethodCall2Impl();
    return methodCall2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExistExpr createExistExpr()
  {
    ExistExprImpl existExpr = new ExistExprImpl();
    return existExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrawExpr createDrawExpr()
  {
    DrawExprImpl drawExpr = new DrawExprImpl();
    return drawExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UScriptPackage getUScriptPackage()
  {
    return (UScriptPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UScriptPackage getPackage()
  {
    return UScriptPackage.eINSTANCE;
  }

} //UScriptFactoryImpl
