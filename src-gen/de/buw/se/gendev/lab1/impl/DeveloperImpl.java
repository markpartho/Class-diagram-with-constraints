/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.Developer;
import de.buw.se.gendev.lab1.Lab1Package;
import de.buw.se.gendev.lab1.Project;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Developer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.impl.DeveloperImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.DeveloperImpl#getWorks_on <em>Works on</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeveloperImpl extends EmployeeImpl implements Developer {
	/**
	 * The cached value of the '{@link #getSkills() <em>Skills</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<String> skills;

	/**
	 * The cached value of the '{@link #getWorks_on() <em>Works on</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorks_on()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> works_on;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeveloperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.DEVELOPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSkills() {
		if (skills == null) {
			skills = new EDataTypeUniqueEList<String>(String.class, this, Lab1Package.DEVELOPER__SKILLS);
		}
		return skills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getWorks_on() {
		if (works_on == null) {
			works_on = new EObjectWithInverseResolvingEList.ManyInverse<Project>(Project.class, this,
					Lab1Package.DEVELOPER__WORKS_ON, Lab1Package.PROJECT__DEVELOPED_BY);
		}
		return works_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Lab1Package.DEVELOPER__WORKS_ON:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getWorks_on()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Lab1Package.DEVELOPER__WORKS_ON:
			return ((InternalEList<?>) getWorks_on()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab1Package.DEVELOPER__SKILLS:
			return getSkills();
		case Lab1Package.DEVELOPER__WORKS_ON:
			return getWorks_on();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Lab1Package.DEVELOPER__SKILLS:
			getSkills().clear();
			getSkills().addAll((Collection<? extends String>) newValue);
			return;
		case Lab1Package.DEVELOPER__WORKS_ON:
			getWorks_on().clear();
			getWorks_on().addAll((Collection<? extends Project>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Lab1Package.DEVELOPER__SKILLS:
			getSkills().clear();
			return;
		case Lab1Package.DEVELOPER__WORKS_ON:
			getWorks_on().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Lab1Package.DEVELOPER__SKILLS:
			return skills != null && !skills.isEmpty();
		case Lab1Package.DEVELOPER__WORKS_ON:
			return works_on != null && !works_on.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (skills: ");
		result.append(skills);
		result.append(')');
		return result.toString();
	}

} //DeveloperImpl
