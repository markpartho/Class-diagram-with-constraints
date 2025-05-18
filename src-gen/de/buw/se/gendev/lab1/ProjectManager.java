/**
 */
package de.buw.se.gendev.lab1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.ProjectManager#getCertifications <em>Certifications</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.ProjectManager#getManages <em>Manages</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getProjectManager()
 * @model
 * @generated
 */
public interface ProjectManager extends Employee {
	/**
	 * Returns the value of the '<em><b>Certifications</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certifications</em>' attribute list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getProjectManager_Certifications()
	 * @model
	 * @generated
	 */
	EList<String> getCertifications();

	/**
	 * Returns the value of the '<em><b>Manages</b></em>' reference list.
	 * The list contents are of type {@link de.buw.se.gendev.lab1.Project}.
	 * It is bidirectional and its opposite is '{@link de.buw.se.gendev.lab1.Project#getManaged_by <em>Managed by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manages</em>' reference list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getProjectManager_Manages()
	 * @see de.buw.se.gendev.lab1.Project#getManaged_by
	 * @model opposite="managed_by"
	 * @generated
	 */
	EList<Project> getManages();

} // ProjectManager
