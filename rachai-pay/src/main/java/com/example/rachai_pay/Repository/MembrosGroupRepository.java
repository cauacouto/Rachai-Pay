package com.example.rachai_pay.Repository;

import com.example.rachai_pay.domin.Grupo;
import com.example.rachai_pay.domin.MembrosGrup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MembrosGroupRepository extends JpaRepository<MembrosGrup,Long> {
    List<MembrosGrup> findByGrupo(Grupo grupo);
}
