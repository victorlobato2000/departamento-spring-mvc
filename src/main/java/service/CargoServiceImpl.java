package service;

import com.victorlobato.gerenciamento.departamento.dao.CargoDao;
import com.victorlobato.gerenciamento.departamento.domain.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false) // propriedade padrão é falso
public class CargoServiceImpl implements CargoService {

    @Autowired
    private CargoDao dao;

    @Override
    public void salvar(Cargo cargo) {
        dao.save(cargo);
    }

    @Override
    public void editar(Cargo cargo) {
        dao.update(cargo);
    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    @Transactional(readOnly = true) // apenas leitura
    public Cargo buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    @Transactional(readOnly = true) // apenas leitura
    public List<Cargo> buscarTodos() {
        return dao.findAll();
    }
}
