/**
 */
package de.buw.se.gendev.lab1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Developer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.Developer#getSkills <em>Skills</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Developer#getWorks_on <em>Works on</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getDeveloper()
 * @model
 * @generated
 */
public interface Developer extends Employee {
	/**
	 * Returns the value of the '<em><b>Skills</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' attribute list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getDeveloper_Skills()
	 * @model
	 * @generated
	 */
	EList<String> getSkills();

	/**
	 * Returns the value of the '<em><b>Works on</b></em>' reference list.
	 * The list contents are of type {@link de.buw.se.gendev.lab1.Project}.
	 * It is bidirectional and its opposite is '{@link de.buw.se.gendev.lab1.Project#getDeveloped_by <em>Developed by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works on</em>' reference list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getDeveloper_Works_on()
	 * @see de.buw.se.gendev.lab1.Project#getDeveloped_by
	 * @model opposite="developed_by"
	 * @generated
	 */
	EList<Project> getWorks_on();

} // Developer
