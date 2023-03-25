package sanjeevaniapp.pojo;

public class UserPojo {

    public UserPojo(){
        
    }
    public UserPojo(String loginid, String userName, String password, String userType) {
        this.loginId = loginid;
        this.userName = userName;
        this.password = password;
        this.userType = userType;
    }

    public String getLoginid() {
        return loginId;
    }

    public void setLoginid(String loginid) {
        this.loginId = loginid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
   private String loginId;
  private String userName;
  private String password;
  private String userType;
  
}
