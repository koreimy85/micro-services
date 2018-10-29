package vn.ifi.entities.dao;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import vn.ifi.entities.Societe;
@RepositoryRestResource
public interface SocieteRepository extends JpaRepository<Societe, Long>{
	@Query("select s from Societe s where s.nomSociete like:mc")
	public Page<Societe> societeParMC(@Param("mc")String mc, Pageable pageable);
	//http://localhost:8080/societes/search/societeParMC?mc=%25A%25&page=0&size=4

}
