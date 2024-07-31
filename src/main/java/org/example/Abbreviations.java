package org.example;
import java.util.HashMap;
public class Abbreviations {
    private HashMap<String, String> abbreviations;
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    public void addAbbreviations(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviations(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(abbreviation);
    }

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviations("API", "Application Programming Interface");
        abbreviations.addAbbreviations("URL", "Uniform Resource Locator");

        System.out.println(abbreviations.hasAbbreviations("API")); // true
        System.out.println(abbreviations.hasAbbreviations("XML")); // false
        System.out.println(abbreviations.findExplanationFor("API")); // Application Programming Interface
    }

}
