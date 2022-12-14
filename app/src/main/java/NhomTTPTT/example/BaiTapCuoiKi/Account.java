package NhomTTPTT.example.BaiTapCuoiKi;


public class Account {
    private String userName;
    private String password;
    private String fullname;
    private String email;
    private String phone;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Account(String userName) {
        this.userName = userName;
    }

    public Account(String userName, String password, String fullname, String email, String phone) {
        this.userName = userName;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
    }
    public Account(String userName,  String fullname, String email, String phone) {
        this.userName = userName;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
    }

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public Account(){
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

    @Override
    public String toString() {
        return "TaiKhoan:" +
                "userName:'" + userName + '\'' +
                ", password:'" + password + '\'';
    }
}
