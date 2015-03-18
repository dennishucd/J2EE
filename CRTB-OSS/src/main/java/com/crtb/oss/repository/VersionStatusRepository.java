package com.crtb.oss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crtb.oss.model.TVersionstatus;

@Repository //指出被注解的是一个仓库或者DAO
public interface VersionStatusRepository extends JpaRepository<TVersionstatus, Integer> {
	
}
