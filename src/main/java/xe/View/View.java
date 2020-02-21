package xe.View;
import xe.SupportedLanguages;

import java.util.ArrayList;
import java.util.ResourceBundle;

public class View {
    private SupportedLanguages currentLanguage;
    private ResourceBundle bundle;
    private final String BUNDLE_NAME = "Credit18";

    public static final String USER_WELCOME = "user.welcome";
    public static final String USER_QUIT = "user.quit";
    public static final String USER_CREDIT_AVAILABLE = "user.credit.available";
    public static final String USER_CREDIT = "user.credit.header";
    public static final String USER_CREDIT_AMOUNT = "user.input.amount";
    public static final String USER_CREDIT_TERM= "";
    public static final String CREDIT_AMOUNT = "";
    public static final String WRONG_INPUT = "input.wrong";
    public static final String INPUT_RETURN = "input.return";
    public static final String INPUT_EXIT = "input.exit";


    public View() {
        currentLanguage = SupportedLanguages.ENGLISH;
        setLocalization(currentLanguage);
    }

    public void setLocalization(SupportedLanguages lang) {
        currentLanguage = lang;
        bundle = ResourceBundle.getBundle(BUNDLE_NAME, SupportedLanguages.determineLocale(lang));
    }

    public void printMessage(String message) { System.out.println(getLocalizedText(message)); }

    public String getLocalizedText(String token) {
        return bundle.keySet().contains(token) ? bundle.getString(token) : token;
    }






}
