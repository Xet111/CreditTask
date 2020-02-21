package xe;

import java.util.Locale;

public enum SupportedLanguages {
    ENGLISH("1 [English]"),
    RUSSIAN("2 [Russian]");

    private String language;

    SupportedLanguages(String language){
        this.language = language;
    }
    public String getLanguage(){
        return language;
    }

    public static Locale determineLocale(SupportedLanguages language) {
        switch (language) {
            case ENGLISH:
                return new Locale("en", "US");
            case RUSSIAN:
                return new Locale("ru", "RU");
            default:
                return new Locale("en", "US");
        }
    }
}
