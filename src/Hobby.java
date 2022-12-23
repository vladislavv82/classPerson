public class Hobby {
    private String hobby;
    private int ageHobby;
    private String descriptionHobby;

    public Hobby(String hobby, int ageHobby, String descriptionHobby) {
        this.hobby = hobby;
        this.ageHobby = ageHobby;
        this.descriptionHobby = descriptionHobby;
    }

    public Hobby() {
        this.hobby = "";
        this.ageHobby = 0;
        this.descriptionHobby = "";
    }

    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public int getAgeHobby() {
        return ageHobby;
    }

    public void setAgeHobby(int ageHobby) {
        this.ageHobby = ageHobby;
    }

    public String getDescriptionHobby() {
        return descriptionHobby;
    }

    public void setDescriptionHobby(String descriptionHobby) {
        this.descriptionHobby = descriptionHobby;
    }

    @Override
    public String toString() {
        return this.hobby + "";
    }
}