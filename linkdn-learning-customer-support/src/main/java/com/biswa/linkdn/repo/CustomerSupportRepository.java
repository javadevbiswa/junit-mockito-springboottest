package com.biswa.linkdn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biswa.linkdn.entity.CustomerSupport;

@Repository
public interface CustomerSupportRepository extends JpaRepository<CustomerSupport, Integer> {

}
