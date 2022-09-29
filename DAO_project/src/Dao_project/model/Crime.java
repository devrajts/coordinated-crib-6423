package Dao_project.model;

public class Crime {
    private String name;
    private String date;
    private String place;
    private String description;
    private String victims;
    private String detailedDescription;

    public Crime() {

    }

    public Crime(String name, String date, String place, String description, String victims, String detailedDescription) {
        this.name = name;
        this.date = date;
        this.place = place;
        this.description = description;
        this.victims = victims;
        this.detailedDescription = detailedDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVictims() {
        return victims;
    }

    public void setVictims(String victims) {
        this.victims = victims;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    @Override
    public String toString() {
        return "Crime{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", place='" + place + '\'' +
                ", description='" + description + '\'' +
                ", victims='" + victims + '\'' +
                ", detailedDescription='" + detailedDescription + '\'' +
                '}';
    }
}
