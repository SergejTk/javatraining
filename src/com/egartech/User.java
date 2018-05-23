package com.egartech;


public class User {
    private String username;

    private String password;

    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof User))
            return false;
        User o = (User)obj;
        return o.getUsername().equals(this.username) && o.getPassword().equals(this.password) && o.getEmail().equals(this.email);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.username.hashCode();
        result = 31 * result + this.password.hashCode();
        result = 31 * result + this.email.hashCode();
        return result;
    }
}
