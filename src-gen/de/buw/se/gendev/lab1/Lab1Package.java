/**
 */
package de.buw.se.gendev.lab1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see de.buw.se.gendev.lab1.Lab1Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Lab1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lab1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/lab1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lab1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lab1Package eINSTANCE = de.buw.se.gendev.lab1.impl.Lab1PackageImpl.init();

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.EmployeeImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__AGE = 1;

	/**
	 * The feature id for the '<em><b>Works in</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__WORKS_IN = 2;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Valid Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___VALID_AGE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.DeveloperImpl <em>Developer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.DeveloperImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getDeveloper()
	 * @generated
	 */
	int DEVELOPER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__NAME = EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__AGE = EMPLOYEE__AGE;

	/**
	 * The feature id for the '<em><b>Works in</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__WORKS_IN = EMPLOYEE__WORKS_IN;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__SKILLS = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Works on</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__WORKS_ON = EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Valid Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER___VALID_AGE__DIAGNOSTICCHAIN_MAP = EMPLOYEE___VALID_AGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.ProjectManagerImpl <em>Project Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.ProjectManagerImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getProjectManager()
	 * @generated
	 */
	int PROJECT_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MANAGER__NAME = EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MANAGER__AGE = EMPLOYEE__AGE;

	/**
	 * The feature id for the '<em><b>Works in</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MANAGER__WORKS_IN = EMPLOYEE__WORKS_IN;

	/**
	 * The feature id for the '<em><b>Certifications</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MANAGER__CERTIFICATIONS = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Manages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MANAGER__MANAGES = EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Project Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MANAGER_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Valid Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MANAGER___VALID_AGE__DIAGNOSTICCHAIN_MAP = EMPLOYEE___VALID_AGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Project Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MANAGER_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.ProjectImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 3;

	/**
	 * The feature id for the '<em><b>Projectname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECTNAME = 0;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DEADLINE = 1;

	/**
	 * The feature id for the '<em><b>Developed by</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DEVELOPED_BY = 2;

	/**
	 * The feature id for the '<em><b>Managed by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MANAGED_BY = 3;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CLIENT = 4;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.DepartmentImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 4;

	/**
	 * The feature id for the '<em><b>Departmentname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__DEPARTMENTNAME = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Employee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__EMPLOYEE = 2;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>At Least One Project Manager</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT___AT_LEAST_ONE_PROJECT_MANAGER__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.ClientImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 5;

	/**
	 * The feature id for the '<em><b>Clientname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CLIENTNAME = 0;

	/**
	 * The feature id for the '<em><b>Industry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__INDUSTRY = 1;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PROJECT = 2;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see de.buw.se.gendev.lab1.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Employee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.buw.se.gendev.lab1.Employee#getName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Employee#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see de.buw.se.gendev.lab1.Employee#getAge()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Age();

	/**
	 * Returns the meta object for the container reference '{@link de.buw.se.gendev.lab1.Employee#getWorks_in <em>Works in</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Works in</em>'.
	 * @see de.buw.se.gendev.lab1.Employee#getWorks_in()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Works_in();

	/**
	 * Returns the meta object for the '{@link de.buw.se.gendev.lab1.Employee#ValidAge(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Age</em>' operation.
	 * @see de.buw.se.gendev.lab1.Employee#ValidAge(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEmployee__ValidAge__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.Developer <em>Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Developer</em>'.
	 * @see de.buw.se.gendev.lab1.Developer
	 * @generated
	 */
	EClass getDeveloper();

	/**
	 * Returns the meta object for the attribute list '{@link de.buw.se.gendev.lab1.Developer#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Skills</em>'.
	 * @see de.buw.se.gendev.lab1.Developer#getSkills()
	 * @see #getDeveloper()
	 * @generated
	 */
	EAttribute getDeveloper_Skills();

	/**
	 * Returns the meta object for the reference list '{@link de.buw.se.gendev.lab1.Developer#getWorks_on <em>Works on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Works on</em>'.
	 * @see de.buw.se.gendev.lab1.Developer#getWorks_on()
	 * @see #getDeveloper()
	 * @generated
	 */
	EReference getDeveloper_Works_on();

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.ProjectManager <em>Project Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Manager</em>'.
	 * @see de.buw.se.gendev.lab1.ProjectManager
	 * @generated
	 */
	EClass getProjectManager();

	/**
	 * Returns the meta object for the attribute list '{@link de.buw.se.gendev.lab1.ProjectManager#getCertifications <em>Certifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Certifications</em>'.
	 * @see de.buw.se.gendev.lab1.ProjectManager#getCertifications()
	 * @see #getProjectManager()
	 * @generated
	 */
	EAttribute getProjectManager_Certifications();

	/**
	 * Returns the meta object for the reference list '{@link de.buw.se.gendev.lab1.ProjectManager#getManages <em>Manages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manages</em>'.
	 * @see de.buw.se.gendev.lab1.ProjectManager#getManages()
	 * @see #getProjectManager()
	 * @generated
	 */
	EReference getProjectManager_Manages();

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see de.buw.se.gendev.lab1.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Project#getProjectname <em>Projectname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projectname</em>'.
	 * @see de.buw.se.gendev.lab1.Project#getProjectname()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Projectname();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Project#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see de.buw.se.gendev.lab1.Project#getDeadline()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Deadline();

	/**
	 * Returns the meta object for the reference list '{@link de.buw.se.gendev.lab1.Project#getDeveloped_by <em>Developed by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Developed by</em>'.
	 * @see de.buw.se.gendev.lab1.Project#getDeveloped_by()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Developed_by();

	/**
	 * Returns the meta object for the reference '{@link de.buw.se.gendev.lab1.Project#getManaged_by <em>Managed by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Managed by</em>'.
	 * @see de.buw.se.gendev.lab1.Project#getManaged_by()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Managed_by();

	/**
	 * Returns the meta object for the reference '{@link de.buw.se.gendev.lab1.Project#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see de.buw.se.gendev.lab1.Project#getClient()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Client();

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see de.buw.se.gendev.lab1.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Department#getDepartmentname <em>Departmentname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departmentname</em>'.
	 * @see de.buw.se.gendev.lab1.Department#getDepartmentname()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Departmentname();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Department#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see de.buw.se.gendev.lab1.Department#getLocation()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link de.buw.se.gendev.lab1.Department#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employee</em>'.
	 * @see de.buw.se.gendev.lab1.Department#getEmployee()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Employee();

	/**
	 * Returns the meta object for the '{@link de.buw.se.gendev.lab1.Department#AtLeastOneProjectManager(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>At Least One Project Manager</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>At Least One Project Manager</em>' operation.
	 * @see de.buw.se.gendev.lab1.Department#AtLeastOneProjectManager(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDepartment__AtLeastOneProjectManager__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see de.buw.se.gendev.lab1.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Client#getClientname <em>Clientname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clientname</em>'.
	 * @see de.buw.se.gendev.lab1.Client#getClientname()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Clientname();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Client#getIndustry <em>Industry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Industry</em>'.
	 * @see de.buw.se.gendev.lab1.Client#getIndustry()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Industry();

	/**
	 * Returns the meta object for the reference list '{@link de.buw.se.gendev.lab1.Client#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Project</em>'.
	 * @see de.buw.se.gendev.lab1.Client#getProject()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Project();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Lab1Factory getLab1Factory();

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
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.EmployeeImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__NAME = eINSTANCE.getEmployee_Name();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__AGE = eINSTANCE.getEmployee_Age();

		/**
		 * The meta object literal for the '<em><b>Works in</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__WORKS_IN = eINSTANCE.getEmployee_Works_in();

		/**
		 * The meta object literal for the '<em><b>Valid Age</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___VALID_AGE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEmployee__ValidAge__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.DeveloperImpl <em>Developer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.DeveloperImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getDeveloper()
		 * @generated
		 */
		EClass DEVELOPER = eINSTANCE.getDeveloper();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPER__SKILLS = eINSTANCE.getDeveloper_Skills();

		/**
		 * The meta object literal for the '<em><b>Works on</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPER__WORKS_ON = eINSTANCE.getDeveloper_Works_on();

		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.ProjectManagerImpl <em>Project Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.ProjectManagerImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getProjectManager()
		 * @generated
		 */
		EClass PROJECT_MANAGER = eINSTANCE.getProjectManager();

		/**
		 * The meta object literal for the '<em><b>Certifications</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_MANAGER__CERTIFICATIONS = eINSTANCE.getProjectManager_Certifications();

		/**
		 * The meta object literal for the '<em><b>Manages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_MANAGER__MANAGES = eINSTANCE.getProjectManager_Manages();

		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.ProjectImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Projectname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PROJECTNAME = eINSTANCE.getProject_Projectname();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DEADLINE = eINSTANCE.getProject_Deadline();

		/**
		 * The meta object literal for the '<em><b>Developed by</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DEVELOPED_BY = eINSTANCE.getProject_Developed_by();

		/**
		 * The meta object literal for the '<em><b>Managed by</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__MANAGED_BY = eINSTANCE.getProject_Managed_by();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CLIENT = eINSTANCE.getProject_Client();

		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.DepartmentImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Departmentname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__DEPARTMENTNAME = eINSTANCE.getDepartment_Departmentname();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__LOCATION = eINSTANCE.getDepartment_Location();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__EMPLOYEE = eINSTANCE.getDepartment_Employee();

		/**
		 * The meta object literal for the '<em><b>At Least One Project Manager</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTMENT___AT_LEAST_ONE_PROJECT_MANAGER__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDepartment__AtLeastOneProjectManager__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.ClientImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Clientname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__CLIENTNAME = eINSTANCE.getClient_Clientname();

		/**
		 * The meta object literal for the '<em><b>Industry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__INDUSTRY = eINSTANCE.getClient_Industry();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__PROJECT = eINSTANCE.getClient_Project();

	}

} //Lab1Package
