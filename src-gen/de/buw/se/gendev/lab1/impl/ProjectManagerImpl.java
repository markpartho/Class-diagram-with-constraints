/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.Lab1Package;
import de.buw.se.gendev.lab1.Project;
import de.buw.se.gendev.lab1.ProjectManager;

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
 * An implementation of the model object '<em><b>Project Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ProjectManagerImpl#getCertifications <em>Certifications</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ProjectManagerImpl#getManages <em>Manages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectManagerImpl extends EmployeeImpl implements ProjectManager {
	/**
	 * The cached value of the '{@link #getCertifications() <em>Certifications</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertifications()
	 * @generated
	 * @ordered
	 */
	protected EList<String> certifications;

	/**
	 * The cached value of the '{@link #getManages() <em>Manages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManages()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> manages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.PROJECT_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCertifications() {
		if (certifications == null) {
			certifications = new EDataTypeUniqueEList<String>(String.class, this,
					Lab1Package.PROJECT_MANAGER__CERTIFICATIONS);
		}
		return certifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getManages() {
		if (manages == null) {
			manages = new EObjectWithInverseResolvingEList<Project>(Project.class, this,
					Lab1Package.PROJECT_MANAGER__MANAGES, Lab1Package.PROJECT__MANAGED_BY);
		}
		return manages;
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
		case Lab1Package.PROJECT_MANAGER__MANAGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getManages()).basicAdd(otherEnd, msgs);
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
		case Lab1Package.PROJECT_MANAGER__MANAGES:
			return ((InternalEList<?>) getManages()).basicRemove(otherEnd, msgs);
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
		case Lab1Package.PROJECT_MANAGER__CERTIFICATIONS:
			return getCertifications();
		case Lab1Package.PROJECT_MANAGER__MANAGES:
			return getManages();
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
		case Lab1Package.PROJECT_MANAGER__CERTIFICATIONS:
			getCertifications().clear();
			getCertifications().addAll((Collection<? extends String>) newValue);
			return;
		case Lab1Package.PROJECT_MANAGER__MANAGES:
			getManages().clear();
			getManages().addAll((Collection<? extends Project>) newValue);
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
		case Lab1Package.PROJECT_MANAGER__CERTIFICATIONS:
			getCertifications().clear();
			return;
		case Lab1Package.PROJECT_MANAGER__MANAGES:
			getManages().clear();
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
		case Lab1Package.PROJECT_MANAGER__CERTIFICATIONS:
			return certifications != null && !certifications.isEmpty();
		case Lab1Package.PROJECT_MANAGER__MANAGES:
			return manages != null && !manages.isEmpty();
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
		result.append(" (certifications: ");
		result.append(certifications);
		result.append(')');
		return result.toString();
	}

} //ProjectManagerImpl
