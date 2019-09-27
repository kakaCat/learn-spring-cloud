package learn.spring.annotation;

public class AnnUser {

    public String getHello(){
        return "Hello";
    }

    private String userName;

    private int userAge;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
