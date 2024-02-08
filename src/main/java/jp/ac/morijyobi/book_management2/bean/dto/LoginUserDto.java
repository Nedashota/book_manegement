package jp.ac.morijyobi.book_management2.bean.dto;

public class LoginUserDto {
    private int id;
    private String username;
    private String password;
    private String name;
    private String authority;

    private String chatform;

    private String chatform2;

    private String chatform3;

    //k
    private String chatform4;
    private String chatform5;

    private String getChatform6;



    public String getGetChatform6() {
        return getChatform6;
    }


    public void setGetChatform6(String getChatform6) {
        this.getChatform6 = getChatform6;
    }

    public String getChatform5() {
        return chatform5;
    }


    public void setChatform5(String chatform5) {
        this.chatform5 = chatform5;
    }

    public String getChatform3() {
        return chatform3;
    }

    public void setChatform3(String chatform3) {
        this.chatform3 = chatform3;
    }

    public String getChatform2() {
        return chatform2;
    }

    public void setChatform2(String chatform2) {
        this.chatform2 = chatform2;
    }

    public LoginUserDto(String chatform) {
        this.chatform = chatform;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
