/**
 */
package de.buw.se.gendev.lab1;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.Department#getDepartmentname <em>Departmentname</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Department#getLocation <em>Location</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Department#getEmployee <em>Employee</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getDepartment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOneProjectManager'"
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Departmentname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departmentname</em>' attribute.
	 * @see #setDepartmentname(String)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getDepartment_Departmentname()
	 * @model
	 * @generated
	 */
	String getDepartmentname();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Department#getDepartmentname <em>Departmentname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departmentname</em>' attribute.
	 * @see #getDepartmentname()
	 * @generated
	 */
	void setDepartmentname(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getDepartment_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Department#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Employee</b></em>' containment reference list.
	 * The list contents are of type {@link de.buw.se.gendev.lab1.Employee}.
	 * It is bidirectional and its opposite is '{@link de.buw.se.gendev.lab1.Employee#getWorks_in <em>Works in</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' containment reference list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getDepartment_Employee()
	 * @see de.buw.se.gendev.lab1.Employee#getWorks_in
	 * @model opposite="works_in" containment="true" required="true"
	 * @generated
	 */
	EList<Employee> getEmployee();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    self.employee-&gt;select(e | e.oclIsTypeOf(ProjectManager))-&gt;size() &gt;= 1'"
	 * @generated
	 */
	boolean AtLeastOneProjectManager(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Department
