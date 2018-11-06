package lesson03;

public class ArtificialPerson extends User {
    private String fullNameOfArtificialPerson;
    private String abbreviatedNameOfArtificialPerson;
    private String mainActivityAode;
    private String[] codesForAdditionalActivities;

    public String getFullNameOfArtificialPerson() {
        return fullNameOfArtificialPerson;
    }

    public void setFullNameOfArtificialPerson(String fullNameOfArtificialPerson) {
        this.fullNameOfArtificialPerson = fullNameOfArtificialPerson;
    }

    public String getAbbreviatedNameOfArtificialPerson() {
        return abbreviatedNameOfArtificialPerson;
    }

    public void setAbbreviatedNameOfArtificialPerson(String abbreviatedNameOfArtificialPerson) {
        this.abbreviatedNameOfArtificialPerson = abbreviatedNameOfArtificialPerson;
    }

    public String getMainActivityAode() {
        return mainActivityAode;
    }

    public void setMainActivityAode(String mainActivityAode) {
        this.mainActivityAode = mainActivityAode;
    }

    public String[] getCodesForAdditionalActivities() {
        return codesForAdditionalActivities;
    }

    public void setCodesForAdditionalActivities(String[] codesForAdditionalActivities) {
        this.codesForAdditionalActivities = codesForAdditionalActivities;
    }
}
