/**
 */
package de.buw.se.gendev.lab1.util;

import de.buw.se.gendev.lab1.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.buw.se.gendev.lab1.Lab1Package
 * @generated
 */
public class Lab1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Lab1Validator INSTANCE = new Lab1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.buw.se.gendev.lab1";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Age' of 'Employee'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMPLOYEE__VALID_AGE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'At Least One Project Manager' of 'Department'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPARTMENT__AT_LEAST_ONE_PROJECT_MANAGER = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab1Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Lab1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Lab1Package.EMPLOYEE:
			return validateEmployee((Employee) value, diagnostics, context);
		case Lab1Package.DEVELOPER:
			return validateDeveloper((Developer) value, diagnostics, context);
		case Lab1Package.PROJECT_MANAGER:
			return validateProjectManager((ProjectManager) value, diagnostics, context);
		case Lab1Package.PROJECT:
			return validateProject((Project) value, diagnostics, context);
		case Lab1Package.DEPARTMENT:
			return validateDepartment((Department) value, diagnostics, context);
		case Lab1Package.CLIENT:
			return validateClient((Client) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployee(Employee employee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(employee, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(employee, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEmployee_ValidAge(employee, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidAge constraint of '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployee_ValidAge(Employee employee, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return employee.ValidAge(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeveloper(Developer developer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(developer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(developer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(developer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(developer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(developer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(developer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(developer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(developer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(developer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEmployee_ValidAge(developer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectManager(ProjectManager projectManager, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(projectManager, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(projectManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(projectManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(projectManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(projectManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(projectManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(projectManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(projectManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(projectManager, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEmployee_ValidAge(projectManager, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject(Project project, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(project, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(department, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(department, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(department, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(department, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(department, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(department, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(department, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(department, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(department, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDepartment_AtLeastOneProjectManager(department, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AtLeastOneProjectManager constraint of '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment_AtLeastOneProjectManager(Department department, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return department.AtLeastOneProjectManager(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClient(Client client, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(client, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Lab1Validator
