package com.Spring.primero.dao;

import com.Spring.primero.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{

    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        return null;
    }
}
