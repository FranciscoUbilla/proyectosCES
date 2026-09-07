package automationPlatform;

public class Selectors {
public static final String GOOGLE_INPUT_SEARCH = "form textarea";
public static final String ASSERTION_GOOGLE_RESULTPAGE_TC001 = "//h3[contains(text(),'Recetas de strogonoff')]";
public static final String ASSERTION_GOOGLE_EMPTYRESULT_TC002 = "//p[contains(normalize-space(.), \"No se han encontrado resultados para tu búsqueda ("+Variables.entryValue+").\")]";
}
