package automationPlatform;

public class Selectors {
public static final String GOOGLE_SEARCH_INPUT = "form textarea";
public static final String WIKIPEDIA_SEARCH_INPUTCONTAINER = ".vector-typeahead-search-container";
public static final String WIKIPEDIA_SEARCH_INPUT = "#searchform .cdx-search-input input";
public static final String CES_GOTOFORMLOGIN_BUTTON = ".login a[href=\"https://capacitacion.ces.com.uy/login/index.php";
public static final String CES_USERNAME_INPUT = "#username";
public static final String CES_PASSWORD_INPUT = "#password";
public static final String CES_LOGIN_BUTTON = "#loginbtn";
public static final String CES_GOTO_TATF = "a[href=\"https://capacitacion.ces.com.uy/course/view.php?id=1128\"]";
public static final String CES_GOTO_FORUM = "aside > section:nth-of-type(2) ul > li:nth-of-type(3) a";
public static final String CES_INPUT_SEARCH = "section .input-group.mr-5 form .input-group input";
public static final String CES_USERMENU_TOGGLE = "#user-menu-toggle";
public static final String CES_LOGOUT_BUTTON = "#carousel-item-main > a:nth-of-type(7)";
public static final String ASSERTION_GOOGLE_RESULTPAGE = "//h3[contains(text(),'Recetas de strogonoff')]";
public static final String ASSERTION_GOOGLE_EMPTYRESULT = "//p[contains(normalize-space(.), \"No se han encontrado resultados para tu búsqueda ("+Variables.entryValue+").\")]";
public static final String ASSERTION_WIKIPEDIA_TITLERESULTPAGE= "h1 .mw-page-title-main";
public static final String ASSERTION_WIKIPEDIA_SEARCHRESULTLIST = ".mw-search-results > li a";
public static final String ASSERTION_SUCCESS_LOGIN = "//p[contains(.,'¡Te damos la bienvenida al Aula Virtual!')]";
public static final String ASSERTION_CES_SUCCESS_LOAD_TATF = "//h1[contains(text(), \"TALLER DE AUTOMATIZACIÓN\")]";
public static final String ASSERTION_CES_SUCCESS_LOAD_FORUM = "//h2[contains(text(), \"Foros generales\")]";
public static final String ASSERTION_CES_LOAD_FORUMBIENVENIDA = "//a[contains(text(), \"¡Bienvenid@s al curso!\")]";
}
