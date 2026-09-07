package automationPlatform;

public class Selectors {
public static final String GOOGLE_SEARCH_INPUT = "form textarea";
public static final String WIKIPEDIA_SEARCH_INPUTCONTAINER = ".vector-typeahead-search-container";
public static final String WIKIPEDIA_SEARCH_INPUT = "#searchform .cdx-search-input input";
public static final String ASSERTION_GOOGLE_RESULTPAGE = "//h3[contains(text(),'Recetas de strogonoff')]";
public static final String ASSERTION_GOOGLE_EMPTYRESULT = "//p[contains(normalize-space(.), \"No se han encontrado resultados para tu búsqueda ("+Variables.entryValue+").\")]";
public static final String ASSERTION_WIKIPEDIA_TITLERESULTPAGE= "h1 .mw-page-title-main";
public static final String ASSERTION_WIKIPEDIA_SEARCHRESULTLIST = ".mw-search-results > li a";
}
