package Userinterfaces.HU0008;

import net.serenitybdd.screenplay.targets.Target;

public class Botones {

    // BOTONES PARA EL LOGIN EN LA WEN NEAT

    public static final Target INPUT_USUARIO_L = Target.the("Input para ingresar el usuario").locatedBy("//input[contains(@name,'username')]");

    public static final Target INPUT_PASSWORD_L = Target.the("Input para ingresar la contraseña").locatedBy("//input[contains(@name,'password')]");

    public static final Target BUTTON_INGRESAR = Target.the("Boton ingresar").locatedBy("//p[contains(.,'Ingresar')]");




    // BOTONES INGRESAR AL MODULO CREAR EMPRESA OPERADORA
    public static final Target ICONO_EMPRESA = Target.the("").locatedBy("//p[contains(.,'Empresa Operadora')]");

    public static final Target BUTTON_EMPRESA = Target.the("").locatedBy("(//span[contains(.,'Gestión Operador')])[2]");

    public static final Target CREAR_EMPRESA = Target.the("").locatedBy("//i[contains(@class,'fa-solid fa-plus')]");


    // CREAR EMPRESA

    public static final Target INPUT_NOMBRE_E = Target.the("").locatedBy("//input[contains(@name,'name')]");

    public static final Target INPUT_NIT_E = Target.the("").locatedBy("//input[contains(@name,'nit')]");

    public static final Target INPUT_CORREO_E = Target.the("").locatedBy("//input[contains(@name,'email')]");

    public static final Target INPUT_REPRESENTANTE_E = Target.the("").locatedBy("//input[contains(@name,'legalRepresentative')]");

    public static final Target SELECT_PAIS = Target.the("").locatedBy("//div[contains(@id,'selectCountry')]");

    public static final Target PAIS_SELECCIONADO = Target.the("").locatedBy("//li[contains(.,'Colombia')]");

    public static final Target SELECT_DEPARTAMENTO = Target.the("").locatedBy("//div[contains(@id,'selectState')]");

    public static final Target DEPARTAMENTO_SELECCIONADO = Target.the("").locatedBy("//li[contains(.,'Quindio')]");

    public static final Target SELECT_MUNICIPIO = Target.the("").locatedBy("//div[contains(@id,'selectCity')]");

    public static final Target MUNICIPIO_SELECCIONADO = Target.the("").locatedBy("//li[contains(.,'Armenia')]");

    public static final Target INPUT_TELEFONO = Target.the("").locatedBy("//input[contains(@name,'phone')]");

    public static final Target BUTTON_GUARDAR = Target.the("").locatedBy("//button[contains(.,'Guardar')]");

    public static final Target CONFIRMAR_GUARDAR = Target.the("").locatedBy("//button[contains(.,'Si')]");

    public static final Target MENSAJE_EXITOSO = Target.the("").locatedBy("(//div[contains(.,'Éxitoso')])[20]");


    // CANCALAR EMPRESA OPERADORA

    public static final Target BUTTON_CANCELAR = Target.the("").locatedBy("//button[contains(.,'Cancelar')]");

    public static final Target CONFIRMAR_CANCELAR = Target.the("").locatedBy("//button[contains(.,'Si')]");

    public static final Target VER_PAG_PRINCIPAL = Target.the("").locatedBy("//p[contains(.,'Gestión empresa operadora')]");


    // BORRAR DATOS REGISTRO

    public static final Target ICONO_BORRADOR = Target.the("").locatedBy("");

    public static final Target CONFIRMAR_BORRADOR = Target.the("").locatedBy("");

    public static final Target VERFICAR_BORRADOR = Target.the("").locatedBy("");


    // Filtrar

    public static final Target BUTTON_FILTRAR = Target.the("").locatedBy("//label[contains(.,'FILTRAR')]");

    public static final Target VERIFICAR_FILTRO = Target.the("").locatedBy("//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter MuiTableCell-sizeMedium css-1yhpg23-MuiTableCell-root'][contains(.,'809018762')]");

    public static final Target BUTTON_LIMPIAR = Target.the("").locatedBy("//label[contains(.,'LIMPIAR')]");

    public static final Target VERIF_FILTROS_LIMPIOS = Target.the("").locatedBy("");

    public static final Target VER_MAS_FILTROS = Target.the("").locatedBy("//span[contains(.,'Más filtros')]");

    public static final Target VERIF_MAS_FILTROS = Target.the("").locatedBy("(//label[@for='Fecha inicio'])[2]");

    public static final Target INPUT_NOMBRE = Target.the("").locatedBy("//input[contains(@id,'Nombre de la empresa')]");



    // ACTIVAR - DESACTIVAR EMPRESA

    public static final Target DESACTIVAR_EMPRESA = Target.the("").locatedBy("(//i[contains(@class,'fa fa-eye fa-lg pr-3 iconSee')])[6]");

    public static final Target VERIF_E_DESACTIVAR = Target.the("").locatedBy("(//div[contains(.,'Inactivo')])[13]");

    public static final Target ACTIVAR_EMPRESA = Target.the("").locatedBy("//i[contains(@class,'fa-regular fa-eye-slash fa-lg pr-3 iconSee')]");

    public static final Target VERIF_E_ACTIVA = Target.the("").locatedBy("(//div[contains(.,'Activo')])[34]");


    // EDITAR - EMPRESA

    public static final Target ICONO_EDITAR = Target.the("").locatedBy("(//i[@class='fa fa-pencil-square-o fa-lg pr-3 iconEdit'])[6]");

    public static final Target BUTTON_EDITAR = Target.the("").locatedBy("//button[contains(@id,'btnSave')]");

    public static final Target CONFIRMAR_EDITAR = Target.the("").locatedBy("//i[contains(@class,'fa fa-check btn-icon pt-1 fa-md mr-2')]");

    public static final Target EDICION_EXITOSA = Target.the("").locatedBy("(//div[contains(.,'Éxitoso')])[20]");

    public static final Target BUTTON_CANCELAR_E = Target.the("").locatedBy("//button[contains(.,'Cancelar')]");

    public static final Target CONFIRMAR_CANCELAR_E = Target.the("").locatedBy("//button[@id='btnConfirm']");



}
