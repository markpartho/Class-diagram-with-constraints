/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /de.buw.se.gendev.lab1/model/lab1.ecore
 * using:
 *   /de.buw.se.gendev.lab1/model/lab1.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package de.buw.se.gendev.lab1;

// import de.buw.se.gendev.lab1.Lab1Package;
// import de.buw.se.gendev.lab1.Lab1Tables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * Lab1Tables provides the dispatch tables for the lab1 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Lab1Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Lab1Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_lab1 = IdManager.getNsURIPackageId("http://www.example.org/lab1", null, Lab1Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = Lab1Tables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Client = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("Client", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Department = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("Department", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Developer = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("Developer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Employee = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("Employee", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Project = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("Project", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProjectManager = Lab1Tables.PACKid_http_c_s_s_www_example_org_s_lab1.getClassId("ProjectManager", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = Lab1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Lab1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_18 = ValueUtil.integerValueOf("18");
	public static final /*@NonInvalid*/ IntegerValue INT_63 = ValueUtil.integerValueOf("63");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Developer = TypeId.ORDERED_SET.getSpecializedId(Lab1Tables.CLSSid_Developer, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Employee = TypeId.ORDERED_SET.getSpecializedId(Lab1Tables.CLSSid_Employee, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Employee_0 = TypeId.ORDERED_SET.getSpecializedId(Lab1Tables.CLSSid_Employee, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Project = TypeId.ORDERED_SET.getSpecializedId(Lab1Tables.CLSSid_Project, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Lab1Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Client = new EcoreExecutorType(Lab1Package.Literals.CLIENT, PACKAGE, 0);
		public static final EcoreExecutorType _Department = new EcoreExecutorType(Lab1Package.Literals.DEPARTMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Developer = new EcoreExecutorType(Lab1Package.Literals.DEVELOPER, PACKAGE, 0);
		public static final EcoreExecutorType _Employee = new EcoreExecutorType(Lab1Package.Literals.EMPLOYEE, PACKAGE, 0);
		public static final EcoreExecutorType _Project = new EcoreExecutorType(Lab1Package.Literals.PROJECT, PACKAGE, 0);
		public static final EcoreExecutorType _ProjectManager = new EcoreExecutorType(Lab1Package.Literals.PROJECT_MANAGER, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Client,
			_Department,
			_Developer,
			_Employee,
			_Project,
			_ProjectManager
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Client__Client = new ExecutorFragment(Types._Client, Lab1Tables.Types._Client);
		private static final ExecutorFragment _Client__OclAny = new ExecutorFragment(Types._Client, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Client__OclElement = new ExecutorFragment(Types._Client, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Department__Department = new ExecutorFragment(Types._Department, Lab1Tables.Types._Department);
		private static final ExecutorFragment _Department__OclAny = new ExecutorFragment(Types._Department, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Department__OclElement = new ExecutorFragment(Types._Department, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Developer__Developer = new ExecutorFragment(Types._Developer, Lab1Tables.Types._Developer);
		private static final ExecutorFragment _Developer__Employee = new ExecutorFragment(Types._Developer, Lab1Tables.Types._Employee);
		private static final ExecutorFragment _Developer__OclAny = new ExecutorFragment(Types._Developer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Developer__OclElement = new ExecutorFragment(Types._Developer, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Employee__Employee = new ExecutorFragment(Types._Employee, Lab1Tables.Types._Employee);
		private static final ExecutorFragment _Employee__OclAny = new ExecutorFragment(Types._Employee, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Employee__OclElement = new ExecutorFragment(Types._Employee, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Project__OclAny = new ExecutorFragment(Types._Project, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Project__OclElement = new ExecutorFragment(Types._Project, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Project__Project = new ExecutorFragment(Types._Project, Lab1Tables.Types._Project);

		private static final ExecutorFragment _ProjectManager__Employee = new ExecutorFragment(Types._ProjectManager, Lab1Tables.Types._Employee);
		private static final ExecutorFragment _ProjectManager__OclAny = new ExecutorFragment(Types._ProjectManager, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProjectManager__OclElement = new ExecutorFragment(Types._ProjectManager, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProjectManager__ProjectManager = new ExecutorFragment(Types._ProjectManager, Lab1Tables.Types._ProjectManager);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Client__clientname = new EcoreExecutorProperty(Lab1Package.Literals.CLIENT__CLIENTNAME, Types._Client, 0);
		public static final ExecutorProperty _Client__industry = new EcoreExecutorProperty(Lab1Package.Literals.CLIENT__INDUSTRY, Types._Client, 1);
		public static final ExecutorProperty _Client__project = new EcoreExecutorProperty(Lab1Package.Literals.CLIENT__PROJECT, Types._Client, 2);

		public static final ExecutorProperty _Department__departmentname = new EcoreExecutorProperty(Lab1Package.Literals.DEPARTMENT__DEPARTMENTNAME, Types._Department, 0);
		public static final ExecutorProperty _Department__employee = new EcoreExecutorProperty(Lab1Package.Literals.DEPARTMENT__EMPLOYEE, Types._Department, 1);
		public static final ExecutorProperty _Department__location = new EcoreExecutorProperty(Lab1Package.Literals.DEPARTMENT__LOCATION, Types._Department, 2);

		public static final ExecutorProperty _Developer__skills = new EcoreExecutorProperty(Lab1Package.Literals.DEVELOPER__SKILLS, Types._Developer, 0);
		public static final ExecutorProperty _Developer__works_on = new EcoreExecutorProperty(Lab1Package.Literals.DEVELOPER__WORKS_ON, Types._Developer, 1);

		public static final ExecutorProperty _Employee__age = new EcoreExecutorProperty(Lab1Package.Literals.EMPLOYEE__AGE, Types._Employee, 0);
		public static final ExecutorProperty _Employee__name = new EcoreExecutorProperty(Lab1Package.Literals.EMPLOYEE__NAME, Types._Employee, 1);
		public static final ExecutorProperty _Employee__works_in = new EcoreExecutorProperty(Lab1Package.Literals.EMPLOYEE__WORKS_IN, Types._Employee, 2);

		public static final ExecutorProperty _Project__client = new EcoreExecutorProperty(Lab1Package.Literals.PROJECT__CLIENT, Types._Project, 0);
		public static final ExecutorProperty _Project__deadline = new EcoreExecutorProperty(Lab1Package.Literals.PROJECT__DEADLINE, Types._Project, 1);
		public static final ExecutorProperty _Project__developed_by = new EcoreExecutorProperty(Lab1Package.Literals.PROJECT__DEVELOPED_BY, Types._Project, 2);
		public static final ExecutorProperty _Project__managed_by = new EcoreExecutorProperty(Lab1Package.Literals.PROJECT__MANAGED_BY, Types._Project, 3);
		public static final ExecutorProperty _Project__projectname = new EcoreExecutorProperty(Lab1Package.Literals.PROJECT__PROJECTNAME, Types._Project, 4);

		public static final ExecutorProperty _ProjectManager__certifications = new EcoreExecutorProperty(Lab1Package.Literals.PROJECT_MANAGER__CERTIFICATIONS, Types._ProjectManager, 0);
		public static final ExecutorProperty _ProjectManager__manages = new EcoreExecutorProperty(Lab1Package.Literals.PROJECT_MANAGER__MANAGES, Types._ProjectManager, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Client =
			{
				Fragments._Client__OclAny /* 0 */,
				Fragments._Client__OclElement /* 1 */,
				Fragments._Client__Client /* 2 */
			};
		private static final int /*@NonNull*/ [] __Client = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Department =
			{
				Fragments._Department__OclAny /* 0 */,
				Fragments._Department__OclElement /* 1 */,
				Fragments._Department__Department /* 2 */
			};
		private static final int /*@NonNull*/ [] __Department = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Developer =
			{
				Fragments._Developer__OclAny /* 0 */,
				Fragments._Developer__OclElement /* 1 */,
				Fragments._Developer__Employee /* 2 */,
				Fragments._Developer__Developer /* 3 */
			};
		private static final int /*@NonNull*/ [] __Developer = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Employee =
			{
				Fragments._Employee__OclAny /* 0 */,
				Fragments._Employee__OclElement /* 1 */,
				Fragments._Employee__Employee /* 2 */
			};
		private static final int /*@NonNull*/ [] __Employee = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Project =
			{
				Fragments._Project__OclAny /* 0 */,
				Fragments._Project__OclElement /* 1 */,
				Fragments._Project__Project /* 2 */
			};
		private static final int /*@NonNull*/ [] __Project = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProjectManager =
			{
				Fragments._ProjectManager__OclAny /* 0 */,
				Fragments._ProjectManager__OclElement /* 1 */,
				Fragments._ProjectManager__Employee /* 2 */,
				Fragments._ProjectManager__ProjectManager /* 3 */
			};
		private static final int /*@NonNull*/ [] __ProjectManager = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Client.initFragments(_Client, __Client);
			Types._Department.initFragments(_Department, __Department);
			Types._Developer.initFragments(_Developer, __Developer);
			Types._Employee.initFragments(_Employee, __Employee);
			Types._Project.initFragments(_Project, __Project);
			Types._ProjectManager.initFragments(_ProjectManager, __ProjectManager);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Client__Client = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Client__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Client__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Department__Department = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Department__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Department__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Developer__Developer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Developer__Employee = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Developer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Developer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Employee__Employee = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Employee__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Employee__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Project__Project = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Project__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Project__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProjectManager__ProjectManager = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProjectManager__Employee = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProjectManager__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProjectManager__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Client__Client.initOperations(_Client__Client);
			Fragments._Client__OclAny.initOperations(_Client__OclAny);
			Fragments._Client__OclElement.initOperations(_Client__OclElement);

			Fragments._Department__Department.initOperations(_Department__Department);
			Fragments._Department__OclAny.initOperations(_Department__OclAny);
			Fragments._Department__OclElement.initOperations(_Department__OclElement);

			Fragments._Developer__Developer.initOperations(_Developer__Developer);
			Fragments._Developer__Employee.initOperations(_Developer__Employee);
			Fragments._Developer__OclAny.initOperations(_Developer__OclAny);
			Fragments._Developer__OclElement.initOperations(_Developer__OclElement);

			Fragments._Employee__Employee.initOperations(_Employee__Employee);
			Fragments._Employee__OclAny.initOperations(_Employee__OclAny);
			Fragments._Employee__OclElement.initOperations(_Employee__OclElement);

			Fragments._Project__OclAny.initOperations(_Project__OclAny);
			Fragments._Project__OclElement.initOperations(_Project__OclElement);
			Fragments._Project__Project.initOperations(_Project__Project);

			Fragments._ProjectManager__Employee.initOperations(_ProjectManager__Employee);
			Fragments._ProjectManager__OclAny.initOperations(_ProjectManager__OclAny);
			Fragments._ProjectManager__OclElement.initOperations(_ProjectManager__OclElement);
			Fragments._ProjectManager__ProjectManager.initOperations(_ProjectManager__ProjectManager);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Client = {
			Lab1Tables.Properties._Client__clientname,
			Lab1Tables.Properties._Client__industry,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Lab1Tables.Properties._Client__project
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Department = {
			Lab1Tables.Properties._Department__departmentname,
			Lab1Tables.Properties._Department__employee,
			Lab1Tables.Properties._Department__location,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Developer = {
			Lab1Tables.Properties._Employee__age,
			Lab1Tables.Properties._Employee__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Lab1Tables.Properties._Developer__skills,
			Lab1Tables.Properties._Employee__works_in,
			Lab1Tables.Properties._Developer__works_on
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Employee = {
			Lab1Tables.Properties._Employee__age,
			Lab1Tables.Properties._Employee__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Lab1Tables.Properties._Employee__works_in
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Project = {
			Lab1Tables.Properties._Project__client,
			Lab1Tables.Properties._Project__deadline,
			Lab1Tables.Properties._Project__developed_by,
			Lab1Tables.Properties._Project__managed_by,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Lab1Tables.Properties._Project__projectname
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProjectManager = {
			Lab1Tables.Properties._Employee__age,
			Lab1Tables.Properties._ProjectManager__certifications,
			Lab1Tables.Properties._ProjectManager__manages,
			Lab1Tables.Properties._Employee__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Lab1Tables.Properties._Employee__works_in
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Client__Client.initProperties(_Client);
			Fragments._Department__Department.initProperties(_Department);
			Fragments._Developer__Developer.initProperties(_Developer);
			Fragments._Employee__Employee.initProperties(_Employee);
			Fragments._Project__Project.initProperties(_Project);
			Fragments._ProjectManager__ProjectManager.initProperties(_ProjectManager);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Lab1Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Lab1Tables();
	}

	private Lab1Tables() {
		super(Lab1Package.eNS_URI);
	}
}
