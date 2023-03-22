package com.mayab.desarrollo.servicios;

import com.mayab.desarrollo.entities.Usuario;
import com.mayab.desarrollo.persitencia.UserDao;

public class UsuarioServicio {

    private UserDao dao;
    public UsuarioServicio(UserDao d){
        this.dao =d;
    }
    public boolean login(String user, String pass)
    {
        boolean result = false;
        Usuario usuario =dao.findByName(user);
        if(usuario != null){
            if ( usuario.getPassword().equals(pass)){
                result = true;
            }
        }
        return result;
    }
    public boolean updatePass(String user, String pass)
    {
        boolean result = false;
        Usuario usuario = dao.findByName(user);
        if(usuario != null){
            Usuario usuario2 = dao.updatePass(usuario, pass);
            if(usuario2 != null){
                result = true;
            }
        }
        return result;
    }

}
