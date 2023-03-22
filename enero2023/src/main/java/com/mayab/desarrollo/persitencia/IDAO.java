package com.mayab.desarrollo.persitencia;

import com.mayab.desarrollo.entities.Usuario;

import java.util.List;

public interface IDAO {
    public List<Usuario> findAll();
    public int createUser(Usuario usuario);//regresar id
    public boolean deleteUser(int id);
    public Usuario findById(int id);
    public Usuario updatePass(Usuario usuario, String NContra);
    public Usuario findByName(String nombre);
}
