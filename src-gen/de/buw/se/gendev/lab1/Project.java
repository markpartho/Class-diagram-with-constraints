/**
 */
package de.buw.se.gendev.lab1;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.Project#getProjectname <em>Projectname</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Project#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Project#getDeveloped_by <em>Developed by</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Project#getManaged_by <em>Managed by</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Project#getClient <em>Client</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Projectname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projectname</em>' attribute.
	 * @see #setProjectname(String)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getProject_Projectname()
	 * @model
	 * @generated
	 */
	String getProjectname();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Project#getProjectname <em>Projectname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projectname</em>' attribute.
	 * @see #getProjectname()
	 * @generated
	 */
	void setProjectname(String value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #setDeadline(Date)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getProject_Deadline()
	 * @model
	 * @generated
	 */
	Date getDeadline();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Project#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(Date value);

	/**
	 * Returns the value of the '<em><b>Developed by</b></em>' reference list.
	 * The list contents are of type {@link de.buw.se.gendev.lab1.Developer}.
	 * It is bidirectional and its opposite is '{@link de.buw.se.gendev.lab1.Developer#getWorks_on <em>Works on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developed by</em>' reference list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getProject_Developed_by()
	 * @see de.buw.se.gendev.lab1.Developer#getWorks_on
	 * @model opposite="works_on" required="true"
	 * @generated
	 */
	EList<Developer> getDeveloped_by();

	/**
	 * Returns the value of the '<em><b>Managed by</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.buw.se.gendev.lab1.ProjectManager#getManages <em>Manages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed by</em>' reference.
	 * @see #setManaged_by(ProjectManager)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getProject_Managed_by()
	 * @see de.buw.se.gendev.lab1.ProjectManager#getManages
	 * @model opposite="manages" required="true"
	 * @generated
	 */
	ProjectManager getManaged_by();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Project#getManaged_by <em>Managed by</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed by</em>' reference.
	 * @see #getManaged_by()
	 * @generated
	 */
	void setManaged_by(ProjectManager value);

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.buw.se.gendev.lab1.Client#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(Client)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getProject_Client()
	 * @see de.buw.se.gendev.lab1.Client#getProject
	 * @model opposite="project" required="true"
	 * @generated
	 */
	Client getClient();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Project#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Client value);

} // Project
