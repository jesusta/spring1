package com.Spring.primero.Controllers;

import com.Spring.primero.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;



 @RestController
public class UsuarioController  {

    @RequestMapping(value = "Usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario= new Usuario();
        usuario.setId(id);
        usuario.setNombre("Juan");
        usuario.setApellido("Perez");
        usuario.setEmail("Juan.perez@hotmail.com");
        usuario.setTelefono("3003101222");
        usuario.setPassword("12345678");
        return usuario;

    }

     @RequestMapping(value = "Usuarios")
     public List<Usuario> getUsuario(){
         List<Usuario> usuarios= new ArrayList<>();
         Usuario usuario= new Usuario();
         usuario.setId(1L);
         usuario.setNombre("Juan");
         usuario.setApellido("Perez");
         usuario.setEmail("Juan.perez@hotmail.com");
         usuario.setTelefono("3003101222");


         Usuario usuario2= new Usuario();
         usuario2.setId(2L);
         usuario2.setNombre("Dian");
         usuario2.setApellido("Perez");
         usuario2.setEmail("Diana.perez@hotmail.com");
         usuario2.setTelefono("3213992019");


         Usuario usuario3= new Usuario();
         usuario3.setId(3L);
         usuario3.setNombre("Critian");
         usuario3.setApellido("Perez");
         usuario3.setEmail("Cristian.perez@hotmail.com");
         usuario3.setTelefono("3032351222");

         usuarios.add(usuario);
         usuarios.add(usuario2);
         usuarios.add(usuario3);



         return usuarios;

     }
}
