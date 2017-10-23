package com.bike.server.data.repo;

import com.bike.server.annotation.Dev;
import com.bike.server.data.bean.EndUserJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Dev
@Repository
public interface EndUserRepo extends JpaRepository<EndUserJPA,Long> {
}
