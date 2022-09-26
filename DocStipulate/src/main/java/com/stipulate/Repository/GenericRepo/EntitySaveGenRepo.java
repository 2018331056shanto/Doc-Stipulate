package com.stipulate.Repository.GenericRepo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;




@NoRepositoryBean
public interface EntitySaveGenRepo<T> extends JpaRepository<T, String> {
	<S extends T> S save(S entity);

}
