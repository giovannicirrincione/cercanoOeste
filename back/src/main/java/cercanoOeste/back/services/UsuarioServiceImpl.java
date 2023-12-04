package cercanoOeste.back.services;

import cercanoOeste.back.entities.Usuario;
import cercanoOeste.back.repositories.BaseRepository;
import cercanoOeste.back.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioServiceImpl extends BaseServiceImpl<Usuario,Long> implements UsuarioService{
    @Autowired
    UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository, UsuarioRepository usuarioRepository) {
        super(baseRepository);
    }
}
