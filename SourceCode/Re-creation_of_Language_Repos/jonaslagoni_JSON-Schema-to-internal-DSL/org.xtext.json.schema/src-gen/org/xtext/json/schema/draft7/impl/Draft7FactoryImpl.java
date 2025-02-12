/**
 * generated by Xtext 2.35.0
 */
package org.xtext.json.schema.draft7.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.json.schema.draft7.AbstractSchema;
import org.xtext.json.schema.draft7.AdditionalItems;
import org.xtext.json.schema.draft7.AdditionalProperties;
import org.xtext.json.schema.draft7.AnyString;
import org.xtext.json.schema.draft7.Contains;
import org.xtext.json.schema.draft7.Default;
import org.xtext.json.schema.draft7.Dependencies;
import org.xtext.json.schema.draft7.Draft7Factory;
import org.xtext.json.schema.draft7.Draft7Package;
import org.xtext.json.schema.draft7.Example;
import org.xtext.json.schema.draft7.FormatTypes;
import org.xtext.json.schema.draft7.Items;
import org.xtext.json.schema.draft7.JsonSchemaKeyword;
import org.xtext.json.schema.draft7.JsonTypes;
import org.xtext.json.schema.draft7.NamedSchema;
import org.xtext.json.schema.draft7.PropertyDependency;
import org.xtext.json.schema.draft7.Reference;
import org.xtext.json.schema.draft7.Schema;
import org.xtext.json.schema.draft7.Types;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Draft7FactoryImpl extends EFactoryImpl implements Draft7Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Draft7Factory init()
  {
    try
    {
      Draft7Factory theDraft7Factory = (Draft7Factory)EPackage.Registry.INSTANCE.getEFactory(Draft7Package.eNS_URI);
      if (theDraft7Factory != null)
      {
        return theDraft7Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Draft7FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Draft7FactoryImpl()
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
      case Draft7Package.SCHEMA: return createSchema();
      case Draft7Package.DEPENDENCIES: return createDependencies();
      case Draft7Package.PROPERTY_DEPENDENCY: return createPropertyDependency();
      case Draft7Package.CONTAINS: return createContains();
      case Draft7Package.ITEMS: return createItems();
      case Draft7Package.ADDITIONAL_PROPERTIES: return createAdditionalProperties();
      case Draft7Package.ADDITIONAL_ITEMS: return createAdditionalItems();
      case Draft7Package.DEFAULT: return createDefault();
      case Draft7Package.EXAMPLE: return createExample();
      case Draft7Package.TYPES: return createTypes();
      case Draft7Package.ABSTRACT_SCHEMA: return createAbstractSchema();
      case Draft7Package.REFERENCE: return createReference();
      case Draft7Package.NAMED_SCHEMA: return createNamedSchema();
      case Draft7Package.ANY_STRING: return createAnyString();
      case Draft7Package.NUMBER: return createNumber();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case Draft7Package.BOOLEAN:
        return createBooleanFromString(eDataType, initialValue);
      case Draft7Package.JSON_TYPES:
        return createJsonTypesFromString(eDataType, initialValue);
      case Draft7Package.FORMAT_TYPES:
        return createFormatTypesFromString(eDataType, initialValue);
      case Draft7Package.JSON_SCHEMA_KEYWORD:
        return createJsonSchemaKeywordFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case Draft7Package.BOOLEAN:
        return convertBooleanToString(eDataType, instanceValue);
      case Draft7Package.JSON_TYPES:
        return convertJsonTypesToString(eDataType, instanceValue);
      case Draft7Package.FORMAT_TYPES:
        return convertFormatTypesToString(eDataType, instanceValue);
      case Draft7Package.JSON_SCHEMA_KEYWORD:
        return convertJsonSchemaKeywordToString(eDataType, instanceValue);
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
  public Schema createSchema()
  {
    SchemaImpl schema = new SchemaImpl();
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dependencies createDependencies()
  {
    DependenciesImpl dependencies = new DependenciesImpl();
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyDependency createPropertyDependency()
  {
    PropertyDependencyImpl propertyDependency = new PropertyDependencyImpl();
    return propertyDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Contains createContains()
  {
    ContainsImpl contains = new ContainsImpl();
    return contains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Items createItems()
  {
    ItemsImpl items = new ItemsImpl();
    return items;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AdditionalProperties createAdditionalProperties()
  {
    AdditionalPropertiesImpl additionalProperties = new AdditionalPropertiesImpl();
    return additionalProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AdditionalItems createAdditionalItems()
  {
    AdditionalItemsImpl additionalItems = new AdditionalItemsImpl();
    return additionalItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Default createDefault()
  {
    DefaultImpl default_ = new DefaultImpl();
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Example createExample()
  {
    ExampleImpl example = new ExampleImpl();
    return example;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Types createTypes()
  {
    TypesImpl types = new TypesImpl();
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractSchema createAbstractSchema()
  {
    AbstractSchemaImpl abstractSchema = new AbstractSchemaImpl();
    return abstractSchema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedSchema createNamedSchema()
  {
    NamedSchemaImpl namedSchema = new NamedSchemaImpl();
    return namedSchema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AnyString createAnyString()
  {
    AnyStringImpl anyString = new AnyStringImpl();
    return anyString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.xtext.json.schema.draft7.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.json.schema.draft7.Boolean createBooleanFromString(EDataType eDataType, String initialValue)
  {
    org.xtext.json.schema.draft7.Boolean result = org.xtext.json.schema.draft7.Boolean.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonTypes createJsonTypesFromString(EDataType eDataType, String initialValue)
  {
    JsonTypes result = JsonTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertJsonTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormatTypes createFormatTypesFromString(EDataType eDataType, String initialValue)
  {
    FormatTypes result = FormatTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFormatTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonSchemaKeyword createJsonSchemaKeywordFromString(EDataType eDataType, String initialValue)
  {
    JsonSchemaKeyword result = JsonSchemaKeyword.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertJsonSchemaKeywordToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Draft7Package getDraft7Package()
  {
    return (Draft7Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Draft7Package getPackage()
  {
    return Draft7Package.eINSTANCE;
  }

} //Draft7FactoryImpl
