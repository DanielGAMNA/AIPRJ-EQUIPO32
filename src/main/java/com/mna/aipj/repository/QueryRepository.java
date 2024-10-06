package com.mna.aipj.repository;

import com.mna.aipj.model.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QueryRepository extends JpaRepository<Query, Integer> {

    Optional<Query> findByQueryID(String queryID);
}
