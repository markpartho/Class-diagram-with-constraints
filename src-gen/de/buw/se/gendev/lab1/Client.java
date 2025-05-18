/**
 */
package de.buw.se.gendev.lab1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.Client#getClientname <em>Clientname</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Client#getIndustry <em>Industry</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Client#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getClient()
 * @model
 * @generated
 */
public interface Client extends EObject {
	/**
	 * Returns the value of the '<em><b>Clientname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clientname</em>' attribute.
	 * @see #setClientname(String)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getClient_Clientname()
	 * @model
	 * @generated
	 */
	String getClientname();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Client#getClientname <em>Clientname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clientname</em>' attribute.
	 * @see #getClientname()
	 * @generated
	 */
	void setClientname(String value);

	/**
	 * Returns the value of the '<em><b>Industry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Industry</em>' attribute.
	 * @see #setIndustry(String)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getClient_Industry()
	 * @model
	 * @generated
	 */
	String getIndustry();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Client#getIndustry <em>Industry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Industry</em>' attribute.
	 * @see #getIndustry()
	 * @generated
	 */
	void setIndustry(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference list.
	 * The list contents are of type {@link de.buw.se.gendev.lab1.Project}.
	 * It is bidirectional and its opposite is '{@link de.buw.se.gendev.lab1.Project#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getClient_Project()
	 * @see de.buw.se.gendev.lab1.Project#getClient
	 * @model opposite="client"
	 * @generated
	 */
	EList<Project> getProject();

} // Client
