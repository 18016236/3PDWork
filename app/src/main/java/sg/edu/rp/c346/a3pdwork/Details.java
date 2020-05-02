package sg.edu.rp.c346.a3pdwork;

public class Details {
    String name;
    int phoneNum;
    String rate;
    String speciality;
    String Recommendations;

    public Details(String name, int phoneNum, String rate, String speciality, String recommendations) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.rate = rate;
        this.speciality = speciality;
        Recommendations = recommendations;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getRecommendations() {
        return Recommendations;
    }

    public void setRecommendations(String recommendations) {
        Recommendations = recommendations;
    }
}
