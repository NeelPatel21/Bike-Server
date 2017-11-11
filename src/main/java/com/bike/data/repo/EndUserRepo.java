package com.bike.data.repo;

import com.bike.annotation.Dev;
import com.bike.data.bean.EndUserJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Dev
@Repository
public interface EndUserRepo extends JpaRepository<EndUserJPA,Long> {
}
