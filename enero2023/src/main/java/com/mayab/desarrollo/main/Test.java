package com.mayab.desarrollo.main;

import com.mayab.desarrollo.entities.Usuario;
import com.mayab.desarrollo.persitencia.UserDao;
import com.mayab.desarrollo.servicios.UsuarioServicio;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		//Add new user object
		Usuario user = new Usuario();
		user.setNombre("Usuario1");
		user.setPassword("password");
		user.setEmail("email@email.com");
		UserDao dao= new UserDao();
		//create User
		int id = dao.createUser(user);
		System.out.println("new user id = "+ id);
		//Find All
		/*List<Usuario> userList = dao.findAll();
		for (Usuario u: userList)
		{
			System.out.println(u.getId());
			System.out.println(u.getNombre());
			System.out.println(u.getEmail());
			System.out.println(u.getPassword());

		}*/
		//find by id
		/*Usuario u2 = dao.findById(1);
		System.out.println(u2.getId());
		System.out.println(u2.getNombre());
		System.out.println(u2.getEmail());
		System.out.println(u2.getPassword());*/
		//delete user
		//System.out.println(dao.deleteUser(5));
		//update pass
		/*Usuario u3= dao.updatePass(user, "tEST");
		System.out.println(u3.getId());
		System.out.println(u3.getNombre());
		System.out.println(u3.getEmail());
		System.out.println(u3.getPassword());*/
		//testing servicios

		/*Usuario user2 = new Usuario();
		user2.setNombre("UsuarioUNICO");
		user2.setPassword("password");
		user2.setEmail("test@servicio.com");
		//dao.createUser(user2);
		UsuarioServicio usuarioServicio = new UsuarioServicio(dao);
		boolean isLogin = usuarioServicio.login("UsuarioUNICO", "password");
		System.out.println("Result = "+ isLogin);*/
	}
}
