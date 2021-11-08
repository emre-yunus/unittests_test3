package be.wikiformatter;

public class WikiFormatter {
    public String format(String[] arrayOfStrings) {
        String emptyString = "";
        for (String strings : arrayOfStrings) {
            if (!strings.contains("*")) {
                emptyString += "<p>";
            }
            if (strings.contains("*")) {
                int i = strings.indexOf("*");
                String[] part = strings.split("\\*");
                int previous = i - 1;
                if (part.length > 0) {
                    for (int j = 0; j < part.length; j++) {
                        if (previous > i || j == 0) {
                            emptyString += "<p>";
                        }
                        if (i != previous && j % 2 == 1)
                            emptyString += "<b>";
                        if (j >= 0 && j < part.length) {
                            emptyString += part[j];
                        }
                        if (j % 2 == 1) {
                            emptyString += "</b>";
                        }
                        if (j >= part.length - 1)
                            emptyString += "</p>";
                    }
                } else {
                    part[i] = arrayOfStrings[previous];
                }
            } else {
                emptyString += strings;
                emptyString += "</p>";
            }
        }
        return emptyString;
    }
}
