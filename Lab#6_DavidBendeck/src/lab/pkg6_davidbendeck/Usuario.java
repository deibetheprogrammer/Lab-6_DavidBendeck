/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_davidbendeck;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author davidbendeck
 */
public class Usuario implements Serializable {
    
    private String nombre;
    private String nickname;
    private String password;
    private Date birthday;

    public Usuario() {
    }

    public Usuario(String nombre, String nickname, String password, Date birthday) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.password = password;
        this.birthday = birthday;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return nickname;
    }
    
}
