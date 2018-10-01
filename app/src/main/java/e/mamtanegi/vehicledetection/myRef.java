package e.mamtanegi.vehicledetection;

public class myRef {
    String User;
    int phoneno,password;
    public myRef(){
    }
    public myRef(String userName,int phoneno,int password){
        this.User=userName;
        this.phoneno=phoneno;
        this.password=password;
    }

    public String getUser() {
        return User;
    }

    public int getPassword() {
        return password;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        User = userName;
    }
}
