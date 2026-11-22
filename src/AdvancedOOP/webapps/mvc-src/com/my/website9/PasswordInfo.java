package com.my.website9;

// DB의 한 행을 담는 JAVA 객체
public class PasswordInfo {
    private String url;
    private String id;
    private String password;

    public PasswordInfo(String url, String id, String pw) {
        this.url = url;
        this.id = id;
        this.password = pw;
    }

    public String toString() {
        return "" + url + ", " + id + ", " + password;
    }

    public String getKey() {
        return url;
    }

    // list.jsp에서 p.getUrl()로 호출
    public String getUrl() {
        return url;
    }

    public void setName(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pw) {
        this.password = pw;
    }
}
