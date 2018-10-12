package ScreenPlay.Reto2.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LlenarFormulario extends PageObject {
	
	public static final Target Menu = Target.the("INGRESA Al MENU").
			located(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]"));
	
	public static final Target AGREGAR_EMPLEADO = Target.the("INGRESA SUB MENU ADD EMPLOYEE")
			.located(By.xpath("//*[@id=\"menu_pim_addEmployee\"]/span[2]"));
	
	public static final Target NOMBRE = Target.the("INGRESA CAMPO NOMBRE").
			located(By.xpath("//*[@id=\"firstName\"]"));
	
	public static final Target SEGUNDO_NOMBRE = Target.the("INGRESA SEGUNDO NOMBRE")
			.located(By.xpath("//*[@id=\"middleName\"]"));
	
	public static final Target APELLIDO_EMPLEADO = Target.the("INGRESA APELLIDO EMPLEADO").
			located(By.xpath("//*[@id=\"lastName\"]"));
	
	public static final Target ID_EMPLEADO = Target.the("INGRESA ID EMPLEADO")
			.located(By.xpath("//*[@id=\"employeeId\"]"));
	
	public static final Target SELECCIONAR_UBICACION = Target.the("SELECCIONA LA LISTA UBICACION").
			located(By.xpath("//*[@id=\"location_inputfileddiv\"]/div/input"));
	
	public static final Target UBICACION = Target.the("SELECCIONAR UBICACION").
			located(By.xpath("//*[@id=\"select-options-68f637c3-f0e2-5f78-176e-d01880fbcdbe\"]/li[23]"));
	
	public static final Target GUARDAR = Target.the("CLICK EN EL BOTON GUARDAR").
			located(By.xpath("//*[@id=\"systemUserSaveBtn\"]"));
	
	public static final Target OTRA_ID = Target.the("INGRESA OTRO ID")
			.located(By.xpath("//*[@id=\"other_id\"]"));
	
	public static final Target FECHA_NACIMIENTO = Target.the("SELECCIONA FECHA DE NACIMIENTO").
			located(By.xpath("//*[@id=\"date_of_birth\"]"));
	
	public static final Target SELECCIONAR_ESTADO_CIVIL = Target.the("INGRESA ESTADO CIVIL").
			located(By.xpath("//*[@id=\"marital_status_inputfileddiv\"]/div/input"));
	
	public static final Target ESTADO_CIVIL = Target.the("INGRESA ESTADO CIVIL").
			located(By.xpath("//*[@id='marital_status_inputfileddiv']/div/ul[contains(@id,'select-options')]"));
	
	public static final Target GENERO = Target.the("INGRESA GENERO")
			.located(By.xpath("//*[@id=\"pimPersonalDetailsForm\"]/materializecss-decorator[3]/div/sf-decorator[3]/div/ul/li[1]/label"));
	
	public static final Target SELECCIONAR_NACIONALIDAD = Target.the("SELECCIONA LISTA DE NACIONALIDAD").
			located(By.xpath("//*[@id=\"nationality_inputfileddiv\"]/div/input"));
	
	public static final Target NACIONALIDAD = Target.the("INGRESA NACIONALIDAD").
			located(By.xpath("//*[@id=\"select-options-77d17e5b-f0ed-b1ec-c73b-1bf1847ad53f\"]"));
	
	public static final Target LICENCIA = Target.the("INGRESA LICENCIA").
			located(By.xpath("//*[@id=\"driver_license\"]"));
	
	public static final Target FECHA_VENCIMIENTO = Target.the("INGRESA FECHA DE VENCIMIENTO DE LA LICENCIA")
			.located(By.xpath("//*[@id=\"license_expiry_date\"]"));
	
	public static final Target APODO = Target.the("INGRESA APODO").
			located(By.xpath("//*[@id=\"nickName\"]"));
	
	public static final Target SERVICIO_MILITAR = Target.the("INGRESA NUMERO DE TARJETA MILITAR")
			.located(By.xpath("//*[@id=\"militaryService\"]"));
	
	public static final Target FUMADOR = Target.the("SELECCIONA SI ES FUMADOR")
			.located(By.xpath("//*[@id=\"pimPersonalDetailsForm\"]/materializecss-decorator[5]/div/sf-decorator[3]/div/label"));
	
	public static final Target GUARDAR_COMPLETO = Target.the("DA CLICK EN GUARDAR").
			located(By.xpath("//*[@id=\"pimPersonalDetailsForm\"]/materializecss-decorator[8]/div/sf-decorator[2]/div/button"));
	
	public static final Target VERIFICAR_GUARDADO = Target.the("MENSAJE DE GUARDADO")
			.located(By.xpath("//*[@id=\"toast-container\"]/div/div"));
	
	public static final Target LISTA_EMPLEADOS = Target.the("INGRESA SUBMENU LISTA DE EMPLEADO").
			located(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]/span[2]"));
	
	public static final Target BUSQUEDA_NOMRE = Target.the("INGRESA BUSQUEDA DE NOMBRE")
			.located(By.xpath("//*[@id=\"employee_name_quick_filter_employee_list_value\"]"));
	
	public static final Target SELECCIONA_NOMBRE = Target.the("SELECCIONA LA BUSQUEDA").
			located(By.xpath("//*[@id=\"employee_name_quick_filter_employee_list_dropdown\"]/div[3]"));
	
	public static final Target VERIFICAR_BUSQUEDA = Target.the("VERIFICA SI ES EL CODIGO DEL EMPLEADO")
			.located(By.xpath("//*[@id='employeeListTable']/tbody/tr/td[2]"));
}