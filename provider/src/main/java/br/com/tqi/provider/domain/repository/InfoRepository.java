package br.com.tqi.provider.domain.repository;

import br.com.tqi.provider.domain.entity.InfoProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends JpaRepository<InfoProvider, Long> {

    InfoProvider findByState(String state);
}
