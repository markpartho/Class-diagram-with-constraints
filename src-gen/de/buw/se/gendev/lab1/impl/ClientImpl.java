/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.Client;
import de.buw.se.gendev.lab1.Lab1Package;
import de.buw.se.gendev.lab1.Project;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ClientImpl#getClientname <em>Clientname</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ClientImpl#getIndustry <em>Industry</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ClientImpl#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends MinimalEObjectImpl.Container implements Client {
	/**
	 * The default value of the '{@link #getClientname() <em>Clientname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientname()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientname() <em>Clientname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientname()
	 * @generated
	 * @ordered
	 */
	protected String clientname = CLIENTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndustry() <em>Industry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndustry()
	 * @generated
	 * @ordered
	 */
	protected static final String INDUSTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndustry() <em>Industry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndustry()
	 * @generated
	 * @ordered
	 */
	protected String industry = INDUSTRY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> project;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientname() {
		return clientname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientname(String newClientname) {
		String oldClientname = clientname;
		clientname = newClientname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.CLIENT__CLIENTNAME, oldClientname,
					clientname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndustry() {
		return industry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndustry(String newIndustry) {
		String oldIndustry = industry;
		industry = newIndustry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.CLIENT__INDUSTRY, oldIndustry, industry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getProject() {
		if (project == null) {
			project = new EObjectWithInverseResolvingEList<Project>(Project.class, this, Lab1Package.CLIENT__PROJECT,
					Lab1Package.PROJECT__CLIENT);
		}
		return project;
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
		case Lab1Package.CLIENT__PROJECT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProject()).basicAdd(otherEnd, msgs);
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
		case Lab1Package.CLIENT__PROJECT:
			return ((InternalEList<?>) getProject()).basicRemove(otherEnd, msgs);
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
		case Lab1Package.CLIENT__CLIENTNAME:
			return getClientname();
		case Lab1Package.CLIENT__INDUSTRY:
			return getIndustry();
		case Lab1Package.CLIENT__PROJECT:
			return getProject();
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
		case Lab1Package.CLIENT__CLIENTNAME:
			setClientname((String) newValue);
			return;
		case Lab1Package.CLIENT__INDUSTRY:
			setIndustry((String) newValue);
			return;
		case Lab1Package.CLIENT__PROJECT:
			getProject().clear();
			getProject().addAll((Collection<? extends Project>) newValue);
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
		case Lab1Package.CLIENT__CLIENTNAME:
			setClientname(CLIENTNAME_EDEFAULT);
			return;
		case Lab1Package.CLIENT__INDUSTRY:
			setIndustry(INDUSTRY_EDEFAULT);
			return;
		case Lab1Package.CLIENT__PROJECT:
			getProject().clear();
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
		case Lab1Package.CLIENT__CLIENTNAME:
			return CLIENTNAME_EDEFAULT == null ? clientname != null : !CLIENTNAME_EDEFAULT.equals(clientname);
		case Lab1Package.CLIENT__INDUSTRY:
			return INDUSTRY_EDEFAULT == null ? industry != null : !INDUSTRY_EDEFAULT.equals(industry);
		case Lab1Package.CLIENT__PROJECT:
			return project != null && !project.isEmpty();
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
		result.append(" (clientname: ");
		result.append(clientname);
		result.append(", industry: ");
		result.append(industry);
		result.append(')');
		return result.toString();
	}

} //ClientImpl
