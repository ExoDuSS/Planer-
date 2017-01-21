/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planerapp.user;

import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author nolde
 */
public class User {
    private int id;
    private String nickname;
    private String email;
    private String firstname;
    private String lastname;
    private String pw;
    
    private ArrayList<Integer> history; //VoteID
    
    private static final Logger LOG = Logger.getLogger(User.class.getName());
    
    /*
      Constructor  
     */

    public User() {
        this.id = -1;
        this.nickname = "N/A";
        this.email = "N/A@N/A.com";
        this.firstname = "N/A";
        this.lastname = "N/A";
        this.pw = "0000";
        this.history = new ArrayList<Integer>();
    }

    public User(String nickname, String email, String firstname, String lastname) {
        this.nickname = nickname;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.pw = "N/A";
        this.history = new ArrayList<Integer>();
    }
     
    public User(int id, String nickname, String email, String firstname, String lastname, String pw) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.pw = pw;
        this.history = new ArrayList<Integer>();
    }
    
    /*
        Getter Setter
    */
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public ArrayList getHistory() {
        return history;
    }

    public void setHistory(ArrayList history) {
        this.history = history;
    }

    /* 
        toString
    */
    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nickname=" + nickname + ", email=" + email + ", firstname=" + firstname + ", lastname=" + lastname + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.nickname);
        hash = 17 * hash + Objects.hashCode(this.email);
        hash = 17 * hash + Objects.hashCode(this.firstname);
        hash = 17 * hash + Objects.hashCode(this.lastname);
        hash = 17 * hash + Objects.hashCode(this.pw);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.pw, other.pw)) {
            return false;
        }
        return true;
    }
   
}
