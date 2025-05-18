/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.Client;
import de.buw.se.gendev.lab1.Developer;
import de.buw.se.gendev.lab1.Lab1Package;
import de.buw.se.gendev.lab1.Project;
import de.buw.se.gendev.lab1.ProjectManager;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ProjectImpl#getProjectname <em>Projectname</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ProjectImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ProjectImpl#getDeveloped_by <em>Developed by</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ProjectImpl#getManaged_by <em>Managed by</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.ProjectImpl#getClient <em>Client</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The default value of the '{@link #getProjectname() <em>Projectname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectname()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectname() <em>Projectname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectname()
	 * @generated
	 * @ordered
	 */
	protected String projectname = PROJECTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final Date DEADLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected Date deadline = DEADLINE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeveloped_by() <em>Developed by</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeveloped_by()
	 * @generated
	 * @ordered
	 */
	protected EList<Developer> developed_by;

	/**
	 * The cached value of the '{@link #getManaged_by() <em>Managed by</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManaged_by()
	 * @generated
	 * @ordered
	 */
	protected ProjectManager managed_by;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected Client client;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectname() {
		return projectname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectname(String newProjectname) {
		String oldProjectname = projectname;
		projectname = newProjectname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.PROJECT__PROJECTNAME, oldProjectname,
					projectname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(Date newDeadline) {
		Date oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.PROJECT__DEADLINE, oldDeadline,
					deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Developer> getDeveloped_by() {
		if (developed_by == null) {
			developed_by = new EObjectWithInverseResolvingEList.ManyInverse<Developer>(Developer.class, this,
					Lab1Package.PROJECT__DEVELOPED_BY, Lab1Package.DEVELOPER__WORKS_ON);
		}
		return developed_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectManager getManaged_by() {
		if (managed_by != null && managed_by.eIsProxy()) {
			InternalEObject oldManaged_by = (InternalEObject) managed_by;
			managed_by = (ProjectManager) eResolveProxy(oldManaged_by);
			if (managed_by != oldManaged_by) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab1Package.PROJECT__MANAGED_BY,
							oldManaged_by, managed_by));
			}
		}
		return managed_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectManager basicGetManaged_by() {
		return managed_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManaged_by(ProjectManager newManaged_by, NotificationChain msgs) {
		ProjectManager oldManaged_by = managed_by;
		managed_by = newManaged_by;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Lab1Package.PROJECT__MANAGED_BY, oldManaged_by, newManaged_by);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManaged_by(ProjectManager newManaged_by) {
		if (newManaged_by != managed_by) {
			NotificationChain msgs = null;
			if (managed_by != null)
				msgs = ((InternalEObject) managed_by).eInverseRemove(this, Lab1Package.PROJECT_MANAGER__MANAGES,
						ProjectManager.class, msgs);
			if (newManaged_by != null)
				msgs = ((InternalEObject) newManaged_by).eInverseAdd(this, Lab1Package.PROJECT_MANAGER__MANAGES,
						ProjectManager.class, msgs);
			msgs = basicSetManaged_by(newManaged_by, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.PROJECT__MANAGED_BY, newManaged_by,
					newManaged_by));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject) client;
			client = (Client) eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab1Package.PROJECT__CLIENT, oldClient,
							client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClient(Client newClient, NotificationChain msgs) {
		Client oldClient = client;
		client = newClient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Lab1Package.PROJECT__CLIENT,
					oldClient, newClient);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(Client newClient) {
		if (newClient != client) {
			NotificationChain msgs = null;
			if (client != null)
				msgs = ((InternalEObject) client).eInverseRemove(this, Lab1Package.CLIENT__PROJECT, Client.class, msgs);
			if (newClient != null)
				msgs = ((InternalEObject) newClient).eInverseAdd(this, Lab1Package.CLIENT__PROJECT, Client.class, msgs);
			msgs = basicSetClient(newClient, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.PROJECT__CLIENT, newClient, newClient));
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
		case Lab1Package.PROJECT__DEVELOPED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDeveloped_by()).basicAdd(otherEnd, msgs);
		case Lab1Package.PROJECT__MANAGED_BY:
			if (managed_by != null)
				msgs = ((InternalEObject) managed_by).eInverseRemove(this, Lab1Package.PROJECT_MANAGER__MANAGES,
						ProjectManager.class, msgs);
			return basicSetManaged_by((ProjectManager) otherEnd, msgs);
		case Lab1Package.PROJECT__CLIENT:
			if (client != null)
				msgs = ((InternalEObject) client).eInverseRemove(this, Lab1Package.CLIENT__PROJECT, Client.class, msgs);
			return basicSetClient((Client) otherEnd, msgs);
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
		case Lab1Package.PROJECT__DEVELOPED_BY:
			return ((InternalEList<?>) getDeveloped_by()).basicRemove(otherEnd, msgs);
		case Lab1Package.PROJECT__MANAGED_BY:
			return basicSetManaged_by(null, msgs);
		case Lab1Package.PROJECT__CLIENT:
			return basicSetClient(null, msgs);
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
		case Lab1Package.PROJECT__PROJECTNAME:
			return getProjectname();
		case Lab1Package.PROJECT__DEADLINE:
			return getDeadline();
		case Lab1Package.PROJECT__DEVELOPED_BY:
			return getDeveloped_by();
		case Lab1Package.PROJECT__MANAGED_BY:
			if (resolve)
				return getManaged_by();
			return basicGetManaged_by();
		case Lab1Package.PROJECT__CLIENT:
			if (resolve)
				return getClient();
			return basicGetClient();
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
		case Lab1Package.PROJECT__PROJECTNAME:
			setProjectname((String) newValue);
			return;
		case Lab1Package.PROJECT__DEADLINE:
			setDeadline((Date) newValue);
			return;
		case Lab1Package.PROJECT__DEVELOPED_BY:
			getDeveloped_by().clear();
			getDeveloped_by().addAll((Collection<? extends Developer>) newValue);
			return;
		case Lab1Package.PROJECT__MANAGED_BY:
			setManaged_by((ProjectManager) newValue);
			return;
		case Lab1Package.PROJECT__CLIENT:
			setClient((Client) newValue);
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
		case Lab1Package.PROJECT__PROJECTNAME:
			setProjectname(PROJECTNAME_EDEFAULT);
			return;
		case Lab1Package.PROJECT__DEADLINE:
			setDeadline(DEADLINE_EDEFAULT);
			return;
		case Lab1Package.PROJECT__DEVELOPED_BY:
			getDeveloped_by().clear();
			return;
		case Lab1Package.PROJECT__MANAGED_BY:
			setManaged_by((ProjectManager) null);
			return;
		case Lab1Package.PROJECT__CLIENT:
			setClient((Client) null);
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
		case Lab1Package.PROJECT__PROJECTNAME:
			return PROJECTNAME_EDEFAULT == null ? projectname != null : !PROJECTNAME_EDEFAULT.equals(projectname);
		case Lab1Package.PROJECT__DEADLINE:
			return DEADLINE_EDEFAULT == null ? deadline != null : !DEADLINE_EDEFAULT.equals(deadline);
		case Lab1Package.PROJECT__DEVELOPED_BY:
			return developed_by != null && !developed_by.isEmpty();
		case Lab1Package.PROJECT__MANAGED_BY:
			return managed_by != null;
		case Lab1Package.PROJECT__CLIENT:
			return client != null;
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
		result.append(" (projectname: ");
		result.append(projectname);
		result.append(", deadline: ");
		result.append(deadline);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
