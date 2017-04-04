package com.ms._2006.saturn.resources.sybase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import com.ms._2006.saturn.types.TypesModelFactory;
import com.ms._2006.saturn.values.ComplexValue;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: sybaseResource. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SybaseResourceModelFactory implements ModelFactory
{

  /**
   * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          creates a Object instance for this EClass
   * @return an object representing the eClass
   * @generated
   */
  public Object create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case SybaseResourceModelPackage.SYBASERESOURCE_CLASSIFIER_ID:
      return createSybaseResource();
    }
    throw new IllegalArgumentException("The EClass '" + eClass.getName() + "' is not a valid EClass for this EPackage");
  }

  /**
   * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          the EClass of the object
   * @param adaptee
   *          the object being wrapped/adapted
   * @return the wrapper {@link ModelObject}
   * @generated
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public ModelObject createModelObject(EClass eClass, Object adaptee)
  {
    ModelObject<Object> modelObject = null;
    switch (eClass.getClassifierID())
    {
    case SybaseResourceModelPackage.SYBASERESOURCE_CLASSIFIER_ID:
      modelObject = new SybaseResourceModelObject();
      break;
    default:
      throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
    }
    modelObject.setTarget(adaptee);
    return modelObject;
  }

  /**
   * Creates a feature map entry instance for a certain EStructuralFeature.
   * 
   * @param eStructuralFeature
   *          the feature map feature
   * @return the pojo feature map entry
   * @generated
   */
  public Object createFeatureMapEntry(EStructuralFeature eFeature)
  {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}. If the feature map entry is null then a
   * new one is created and <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eStructuralFeature
   *          the feature map feature of the object
   * @param adaptee
   *          the pojo feature map entry being wrapped/adapted
   * @return the wrapper {@link ModelFeatureMapEntry}
   * @generated
   */
  public ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature, Object adaptee)
  {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SybaseResource
   * @generated
   */
  public SybaseResource createSybaseResource()
  {
    return new SybaseResource();
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if the value is null then null is returned.
   * @generated
   */
  public Object createFromString(EDataType eDataType, String value)
  {
    switch (eDataType.getClassifierID())
    {
    case SybaseResourceModelPackage.AUTHENTIFICATIONENUMS_CLASSIFIER_ID:
      return createAuthentificationEnumsFromString(value);
    case SybaseResourceModelPackage.AUTHENTIFICATIONENUMSOBJECT_CLASSIFIER_ID:
      return createAuthentificationEnumsObjectFromString(value);
    }
    throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if value == null then null is returned
   * @generated
   */
  public String convertToString(EDataType eDataType, Object value)
  {
    switch (eDataType.getClassifierID())
    {
    case SybaseResourceModelPackage.AUTHENTIFICATIONENUMS_CLASSIFIER_ID:
      return convertAuthentificationEnumsToString((AuthentificationEnums) value);
    case SybaseResourceModelPackage.AUTHENTIFICATIONENUMSOBJECT_CLASSIFIER_ID:
      return convertAuthentificationEnumsObjectToString((AuthentificationEnums) value);
    }
    throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
  }

  /**
   * Converts the EDataType: AuthentificationEnums to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertAuthentificationEnumsToString(AuthentificationEnums value)
  {
    if (value == null) { return null; }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: AuthentificationEnums from a String. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public AuthentificationEnums createAuthentificationEnumsFromString(String value)
  {
    if (value == null) { return null; }
    return AuthentificationEnums.get(value);
  }

  /**
   * Converts the EDataType: AuthentificationEnumsObject to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertAuthentificationEnumsObjectToString(AuthentificationEnums value)
  {
    if (value == null) { return null; }
    return convertAuthentificationEnumsToString(value);
  }

  /**
   * Creates an instance of the EDataType: AuthentificationEnumsObject from a String. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public AuthentificationEnums createAuthentificationEnumsObjectFromString(String value)
  {
    if (value == null) { return null; }
    return createAuthentificationEnumsFromString(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SybaseResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static class SybaseResourceModelObject<E extends SybaseResource> extends
      TypesModelFactory.DeviceResourceDefinitionModelObject<E>
  {
    /**
     * @generated
     */
    @Override
    public EClass eClass()
    {
      return SybaseResourceModelPackage.INSTANCE.getSybaseResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage()
    {
      return SybaseResourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature)
    {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID)
      {
      case SybaseResourceModelPackage.SYBASERESOURCE_LOGIN_FEATURE_ID:
        return getTarget().getLogin();
      case SybaseResourceModelPackage.SYBASERESOURCE_PASSWORD_FEATURE_ID:
        return getTarget().getPassword();
      case SybaseResourceModelPackage.SYBASERESOURCE_SERVER_FEATURE_ID:
        return getTarget().getServer();
      case SybaseResourceModelPackage.SYBASERESOURCE_DATABASE_FEATURE_ID:
        return getTarget().getDatabase();
      case SybaseResourceModelPackage.SYBASERESOURCE_MAXCONNECT_FEATURE_ID:
        return getTarget().getMaxConnect();
      case SybaseResourceModelPackage.SYBASERESOURCE_AUTHENTIFICATION_FEATURE_ID:
        return getTarget().getAuthentification();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value)
    {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID)
      {
      case SybaseResourceModelPackage.SYBASERESOURCE_LOGIN_FEATURE_ID:
        getTarget().setLogin((ComplexValue) value);
        return;
      case SybaseResourceModelPackage.SYBASERESOURCE_PASSWORD_FEATURE_ID:
        getTarget().setPassword((ComplexValue) value);
        return;
      case SybaseResourceModelPackage.SYBASERESOURCE_SERVER_FEATURE_ID:
        getTarget().setServer((ComplexValue) value);
        return;
      case SybaseResourceModelPackage.SYBASERESOURCE_DATABASE_FEATURE_ID:
        getTarget().setDatabase((ComplexValue) value);
        return;
      case SybaseResourceModelPackage.SYBASERESOURCE_MAXCONNECT_FEATURE_ID:
        getTarget().setMaxConnect((ComplexValue) value);
        return;
      case SybaseResourceModelPackage.SYBASERESOURCE_AUTHENTIFICATION_FEATURE_ID:
        getTarget().setAuthentification((AuthentificationEnums) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eAddTo(EStructuralFeature eStructuralFeature, Object value)
    {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID)
      {

      }
      super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eRemoveFrom(EStructuralFeature eStructuralFeature, Object value)
    {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID)
      {

      }
      super.eRemoveFrom(eStructuralFeature, value);
    }
  }

}
