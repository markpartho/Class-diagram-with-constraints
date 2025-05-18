/**
 */
package de.buw.se.gendev.lab1;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.Employee#getName <em>Name</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Employee#getAge <em>Age</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Employee#getWorks_in <em>Works in</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getEmployee()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidAge'"
 * @generated
 */
public interface Employee extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getEmployee_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Employee#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getEmployee_Age()
	 * @model required="true"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Employee#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Works in</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.buw.se.gendev.lab1.Department#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works in</em>' container reference.
	 * @see #setWorks_in(Department)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getEmployee_Works_in()
	 * @see de.buw.se.gendev.lab1.Department#getEmployee
	 * @model opposite="employee" required="true" transient="false"
	 * @generated
	 */
	Department getWorks_in();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Employee#getWorks_in <em>Works in</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Works in</em>' container reference.
	 * @see #getWorks_in()
	 * @generated
	 */
	void setWorks_in(Department value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.age &gt;= 18 and self.age &lt;= 63'"
	 * @generated
	 */
	boolean ValidAge(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Employee
