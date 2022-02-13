package com.victorlobato.gerenciamento.departamento.dao;

import com.victorlobato.gerenciamento.departamento.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{
}
