/**
 * generated by Xtext 2.35.0
 */
package jpaqldsl.jPAQLDsl.impl;

import jpaqldsl.jPAQLDsl.*;

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
public class JPAQLDslFactoryImpl extends EFactoryImpl implements JPAQLDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JPAQLDslFactory init()
  {
    try
    {
      JPAQLDslFactory theJPAQLDslFactory = (JPAQLDslFactory)EPackage.Registry.INSTANCE.getEFactory(JPAQLDslPackage.eNS_URI);
      if (theJPAQLDslFactory != null)
      {
        return theJPAQLDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JPAQLDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JPAQLDslFactoryImpl()
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
      case JPAQLDslPackage.MODEL: return createModel();
      case JPAQLDslPackage.NAMED_QUERY: return createNamedQuery();
      case JPAQLDslPackage.QL_STATEMENT: return createQLStatement();
      case JPAQLDslPackage.SELECT_STATEMENT: return createSelectStatement();
      case JPAQLDslPackage.FROM_CLAUSE: return createFromClause();
      case JPAQLDslPackage.IDENTIFICATION_VARIABLE_DECLARATION: return createIdentificationVariableDeclaration();
      case JPAQLDslPackage.RANGE_VARIABLE_DECLARATION: return createRangeVariableDeclaration();
      case JPAQLDslPackage.JOIN: return createJoin();
      case JPAQLDslPackage.FETCH_JOIN: return createFetchJoin();
      case JPAQLDslPackage.JPA_PATH_EXPRESSION: return createJPAPathExpression();
      case JPAQLDslPackage.JPA_ATTRIBUTE: return createJpaAttribute();
      case JPAQLDslPackage.COLLECTION_MEMBER_DECLARATION: return createCollectionMemberDeclaration();
      case JPAQLDslPackage.SELECT_CLAUSE: return createSelectClause();
      case JPAQLDslPackage.SELECT_EXPRESSION: return createSelectExpression();
      case JPAQLDslPackage.CONSTRUCTOR_EXPRESSION: return createConstructorExpression();
      case JPAQLDslPackage.CONSTRUCTOR_ITEM: return createConstructorItem();
      case JPAQLDslPackage.AGGREGATE_EXPRESSION: return createAggregateExpression();
      case JPAQLDslPackage.IDENTIFICATION_VARIABLE: return createIdentificationVariable();
      case JPAQLDslPackage.CONSTRUCTOR_NAME: return createConstructorName();
      case JPAQLDslPackage.WHERE_CLAUSE: return createWhereClause();
      case JPAQLDslPackage.EXPRESSION: return createExpression();
      case JPAQLDslPackage.SIMPLE_CONDITIONAL_EXPRESSION: return createSimpleConditionalExpression();
      case JPAQLDslPackage.BETWEEN_EXPRESSION: return createBetweenExpression();
      case JPAQLDslPackage.IN_EXPRESSION: return createInExpression();
      case JPAQLDslPackage.IN_ITEM: return createInItem();
      case JPAQLDslPackage.LIKE_EXPRESSION: return createLikeExpression();
      case JPAQLDslPackage.NULL_COMPARISON_EXPRESSION: return createNullComparisonExpression();
      case JPAQLDslPackage.EMPTY_COLLECTION_COMPARISON_EXPRESSION: return createEmptyCollectionComparisonExpression();
      case JPAQLDslPackage.COLLECTION_MEMBER_EXPRESSION: return createCollectionMemberExpression();
      case JPAQLDslPackage.EXISTS_EXPRESSION: return createExistsExpression();
      case JPAQLDslPackage.ALL_OR_ANY_EXPRESSION: return createAllOrAnyExpression();
      case JPAQLDslPackage.COMPARISON_EXPRESSION: return createComparisonExpression();
      case JPAQLDslPackage.ARITHMETIC_EXPRESSION: return createArithmeticExpression();
      case JPAQLDslPackage.ARITHMETIC_PRIMARY: return createArithmeticPrimary();
      case JPAQLDslPackage.STRING_EXPRESSION: return createStringExpression();
      case JPAQLDslPackage.STRING_PRIMARY: return createStringPrimary();
      case JPAQLDslPackage.DATE_TIME_EXPRESSION: return createDateTimeExpression();
      case JPAQLDslPackage.DATE_TIME_PRIMARY: return createDateTimePrimary();
      case JPAQLDslPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case JPAQLDslPackage.BOOLEAN_PRIMARY: return createBooleanPrimary();
      case JPAQLDslPackage.ENUM_EXPRESSION: return createEnumExpression();
      case JPAQLDslPackage.ENUM_PRIMARY: return createEnumPrimary();
      case JPAQLDslPackage.ENTITY_EXPRESSION: return createEntityExpression();
      case JPAQLDslPackage.SIMPLE_ENTITY_EXPRESSION: return createSimpleEntityExpression();
      case JPAQLDslPackage.FUNCTIONS_RETURNING_NUMERICS: return createFunctionsReturningNumerics();
      case JPAQLDslPackage.FUNCTIONS_RETURNING_STRINGS: return createFunctionsReturningStrings();
      case JPAQLDslPackage.SUB_QUERY: return createSubQuery();
      case JPAQLDslPackage.SUBQUERY_FROM_CLAUSE: return createSubqueryFromClause();
      case JPAQLDslPackage.SUBSELECT_IDENTIFICATION_VARIABLE_DECLARATION: return createSubselectIdentificationVariableDeclaration();
      case JPAQLDslPackage.SIMPLE_SELECT_CLAUSE: return createSimpleSelectClause();
      case JPAQLDslPackage.SIMPLE_SELECT_EXPRESSION: return createSimpleSelectExpression();
      case JPAQLDslPackage.INPUT_PARAMETER: return createInputParameter();
      case JPAQLDslPackage.ESCAPE_CHARACTER: return createEscapeCharacter();
      case JPAQLDslPackage.LITERAL: return createLiteral();
      case JPAQLDslPackage.PATTERN_VALUE: return createPatternValue();
      case JPAQLDslPackage.STRING_LITERAL: return createStringLiteral();
      case JPAQLDslPackage.NUMERIC_LITERAL: return createNumericLiteral();
      case JPAQLDslPackage.ENUM_LITERAL: return createEnumLiteral();
      case JPAQLDslPackage.TRIM_CHARACTER: return createTrimCharacter();
      case JPAQLDslPackage.IMPORT: return createImport();
      case JPAQLDslPackage.CONDITIONAL_EXPRESSION: return createConditionalExpression();
      case JPAQLDslPackage.CONDITIONAL_TERM: return createConditionalTerm();
      case JPAQLDslPackage.SIMPLE_ARITHMETIC_EXPRESSION: return createSimpleArithmeticExpression();
      case JPAQLDslPackage.ARITHMETIC_TERM: return createArithmeticTerm();
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
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedQuery createNamedQuery()
  {
    NamedQueryImpl namedQuery = new NamedQueryImpl();
    return namedQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QLStatement createQLStatement()
  {
    QLStatementImpl qlStatement = new QLStatementImpl();
    return qlStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectStatement createSelectStatement()
  {
    SelectStatementImpl selectStatement = new SelectStatementImpl();
    return selectStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FromClause createFromClause()
  {
    FromClauseImpl fromClause = new FromClauseImpl();
    return fromClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IdentificationVariableDeclaration createIdentificationVariableDeclaration()
  {
    IdentificationVariableDeclarationImpl identificationVariableDeclaration = new IdentificationVariableDeclarationImpl();
    return identificationVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RangeVariableDeclaration createRangeVariableDeclaration()
  {
    RangeVariableDeclarationImpl rangeVariableDeclaration = new RangeVariableDeclarationImpl();
    return rangeVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Join createJoin()
  {
    JoinImpl join = new JoinImpl();
    return join;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FetchJoin createFetchJoin()
  {
    FetchJoinImpl fetchJoin = new FetchJoinImpl();
    return fetchJoin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JPAPathExpression createJPAPathExpression()
  {
    JPAPathExpressionImpl jpaPathExpression = new JPAPathExpressionImpl();
    return jpaPathExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JpaAttribute createJpaAttribute()
  {
    JpaAttributeImpl jpaAttribute = new JpaAttributeImpl();
    return jpaAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CollectionMemberDeclaration createCollectionMemberDeclaration()
  {
    CollectionMemberDeclarationImpl collectionMemberDeclaration = new CollectionMemberDeclarationImpl();
    return collectionMemberDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectClause createSelectClause()
  {
    SelectClauseImpl selectClause = new SelectClauseImpl();
    return selectClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectExpression createSelectExpression()
  {
    SelectExpressionImpl selectExpression = new SelectExpressionImpl();
    return selectExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstructorExpression createConstructorExpression()
  {
    ConstructorExpressionImpl constructorExpression = new ConstructorExpressionImpl();
    return constructorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstructorItem createConstructorItem()
  {
    ConstructorItemImpl constructorItem = new ConstructorItemImpl();
    return constructorItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AggregateExpression createAggregateExpression()
  {
    AggregateExpressionImpl aggregateExpression = new AggregateExpressionImpl();
    return aggregateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IdentificationVariable createIdentificationVariable()
  {
    IdentificationVariableImpl identificationVariable = new IdentificationVariableImpl();
    return identificationVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstructorName createConstructorName()
  {
    ConstructorNameImpl constructorName = new ConstructorNameImpl();
    return constructorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WhereClause createWhereClause()
  {
    WhereClauseImpl whereClause = new WhereClauseImpl();
    return whereClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
  @Override
  public SimpleConditionalExpression createSimpleConditionalExpression()
  {
    SimpleConditionalExpressionImpl simpleConditionalExpression = new SimpleConditionalExpressionImpl();
    return simpleConditionalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BetweenExpression createBetweenExpression()
  {
    BetweenExpressionImpl betweenExpression = new BetweenExpressionImpl();
    return betweenExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InExpression createInExpression()
  {
    InExpressionImpl inExpression = new InExpressionImpl();
    return inExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InItem createInItem()
  {
    InItemImpl inItem = new InItemImpl();
    return inItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LikeExpression createLikeExpression()
  {
    LikeExpressionImpl likeExpression = new LikeExpressionImpl();
    return likeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NullComparisonExpression createNullComparisonExpression()
  {
    NullComparisonExpressionImpl nullComparisonExpression = new NullComparisonExpressionImpl();
    return nullComparisonExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EmptyCollectionComparisonExpression createEmptyCollectionComparisonExpression()
  {
    EmptyCollectionComparisonExpressionImpl emptyCollectionComparisonExpression = new EmptyCollectionComparisonExpressionImpl();
    return emptyCollectionComparisonExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CollectionMemberExpression createCollectionMemberExpression()
  {
    CollectionMemberExpressionImpl collectionMemberExpression = new CollectionMemberExpressionImpl();
    return collectionMemberExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExistsExpression createExistsExpression()
  {
    ExistsExpressionImpl existsExpression = new ExistsExpressionImpl();
    return existsExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AllOrAnyExpression createAllOrAnyExpression()
  {
    AllOrAnyExpressionImpl allOrAnyExpression = new AllOrAnyExpressionImpl();
    return allOrAnyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComparisonExpression createComparisonExpression()
  {
    ComparisonExpressionImpl comparisonExpression = new ComparisonExpressionImpl();
    return comparisonExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArithmeticExpression createArithmeticExpression()
  {
    ArithmeticExpressionImpl arithmeticExpression = new ArithmeticExpressionImpl();
    return arithmeticExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArithmeticPrimary createArithmeticPrimary()
  {
    ArithmeticPrimaryImpl arithmeticPrimary = new ArithmeticPrimaryImpl();
    return arithmeticPrimary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringExpression createStringExpression()
  {
    StringExpressionImpl stringExpression = new StringExpressionImpl();
    return stringExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringPrimary createStringPrimary()
  {
    StringPrimaryImpl stringPrimary = new StringPrimaryImpl();
    return stringPrimary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DateTimeExpression createDateTimeExpression()
  {
    DateTimeExpressionImpl dateTimeExpression = new DateTimeExpressionImpl();
    return dateTimeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DateTimePrimary createDateTimePrimary()
  {
    DateTimePrimaryImpl dateTimePrimary = new DateTimePrimaryImpl();
    return dateTimePrimary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanExpression createBooleanExpression()
  {
    BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
    return booleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanPrimary createBooleanPrimary()
  {
    BooleanPrimaryImpl booleanPrimary = new BooleanPrimaryImpl();
    return booleanPrimary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumExpression createEnumExpression()
  {
    EnumExpressionImpl enumExpression = new EnumExpressionImpl();
    return enumExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumPrimary createEnumPrimary()
  {
    EnumPrimaryImpl enumPrimary = new EnumPrimaryImpl();
    return enumPrimary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityExpression createEntityExpression()
  {
    EntityExpressionImpl entityExpression = new EntityExpressionImpl();
    return entityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleEntityExpression createSimpleEntityExpression()
  {
    SimpleEntityExpressionImpl simpleEntityExpression = new SimpleEntityExpressionImpl();
    return simpleEntityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionsReturningNumerics createFunctionsReturningNumerics()
  {
    FunctionsReturningNumericsImpl functionsReturningNumerics = new FunctionsReturningNumericsImpl();
    return functionsReturningNumerics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionsReturningStrings createFunctionsReturningStrings()
  {
    FunctionsReturningStringsImpl functionsReturningStrings = new FunctionsReturningStringsImpl();
    return functionsReturningStrings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubQuery createSubQuery()
  {
    SubQueryImpl subQuery = new SubQueryImpl();
    return subQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubqueryFromClause createSubqueryFromClause()
  {
    SubqueryFromClauseImpl subqueryFromClause = new SubqueryFromClauseImpl();
    return subqueryFromClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubselectIdentificationVariableDeclaration createSubselectIdentificationVariableDeclaration()
  {
    SubselectIdentificationVariableDeclarationImpl subselectIdentificationVariableDeclaration = new SubselectIdentificationVariableDeclarationImpl();
    return subselectIdentificationVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleSelectClause createSimpleSelectClause()
  {
    SimpleSelectClauseImpl simpleSelectClause = new SimpleSelectClauseImpl();
    return simpleSelectClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleSelectExpression createSimpleSelectExpression()
  {
    SimpleSelectExpressionImpl simpleSelectExpression = new SimpleSelectExpressionImpl();
    return simpleSelectExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputParameter createInputParameter()
  {
    InputParameterImpl inputParameter = new InputParameterImpl();
    return inputParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EscapeCharacter createEscapeCharacter()
  {
    EscapeCharacterImpl escapeCharacter = new EscapeCharacterImpl();
    return escapeCharacter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PatternValue createPatternValue()
  {
    PatternValueImpl patternValue = new PatternValueImpl();
    return patternValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumericLiteral createNumericLiteral()
  {
    NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
    return numericLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumLiteral createEnumLiteral()
  {
    EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
    return enumLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TrimCharacter createTrimCharacter()
  {
    TrimCharacterImpl trimCharacter = new TrimCharacterImpl();
    return trimCharacter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
  @Override
  public ConditionalExpression createConditionalExpression()
  {
    ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
    return conditionalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConditionalTerm createConditionalTerm()
  {
    ConditionalTermImpl conditionalTerm = new ConditionalTermImpl();
    return conditionalTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleArithmeticExpression createSimpleArithmeticExpression()
  {
    SimpleArithmeticExpressionImpl simpleArithmeticExpression = new SimpleArithmeticExpressionImpl();
    return simpleArithmeticExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArithmeticTerm createArithmeticTerm()
  {
    ArithmeticTermImpl arithmeticTerm = new ArithmeticTermImpl();
    return arithmeticTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JPAQLDslPackage getJPAQLDslPackage()
  {
    return (JPAQLDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JPAQLDslPackage getPackage()
  {
    return JPAQLDslPackage.eINSTANCE;
  }

} //JPAQLDslFactoryImpl
