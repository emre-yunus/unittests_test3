package be.wikiformatter;

public class WikiFormatter {
    public String format(String[] arrayOfStrings) {
        String emptyString = "";
        for (String strings : arrayOfStrings) {
            if (!strings.contains("*")) {
                emptyString += "<p>" + strings + "</p>";
            } else {
                String[] part = strings.split("\\*");
                if (part.length > 0) {
                    for (int j = 0; j < part.length; j++) {
                        if (j == 0) emptyString += "<p>";
                        if (j % 2 == 1) emptyString += "<b>";
                        emptyString += part[j];
                        if (j % 2 == 1) emptyString += "</b>";
                        if (j >= part.length - 1) emptyString += "</p>";
                    }
                }
            }
        }
        return emptyString;
    }
}
