package model;

public class ComputerScienceStudent extends Student implements Citizen {

    private String favoriteLanguage;

    public ComputerScienceStudent(String id, String name, String favoriteLanguage) {
        super(id, name);
        this.favoriteLanguage = favoriteLanguage;
    }

    public ComputerScienceStudent(String id, String name, String favoriteLanguage, String address, String identityCardNumber) {
        super(id, name);
        this.favoriteLanguage = favoriteLanguage;
        this.address = address;
        this.identityCardNumber = identityCardNumber;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ComputerScienceStudent that = (ComputerScienceStudent) o;

        return getFavoriteLanguage() != null ? getFavoriteLanguage().equals(that.getFavoriteLanguage()) : that.getFavoriteLanguage() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getFavoriteLanguage() != null ? getFavoriteLanguage().hashCode() : 0);
        return result;
    }

    @Override
    public String getCourse() {
        return "Software Development 101";
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", identityCardNumber='" + getIdentityCardNumber() + '\'' +
                ", favoriteLanguage='" + favoriteLanguage + '\'' +
                '}';
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getIdentityCardNumber() {
        return this.identityCardNumber;
    }
}