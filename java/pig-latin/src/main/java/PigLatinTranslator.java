import java.util.regex.Pattern;

public class PigLatinTranslator {

    public String translate(String phrase) {

        Pattern xt = Pattern.compile("xt");

        String newPhrase = "";

        if (phrase.matches("^[aeyiuo]+$") || phrase.matches("^xr") || (phrase.matches("^xt"))) {
            newPhrase= phrase + "ay";
        }

        if (phrase.matches("/\\b[aeiou]\\w*/ig")) {
            newPhrase = phrase + "ay";
        }
        if (phrase.matches("^xr") || (phrase.matches("^yt"))) {
            newPhrase = phrase + "ay";
        }
        return newPhrase;
    }
}
