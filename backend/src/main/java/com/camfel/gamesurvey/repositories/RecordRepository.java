package com.camfel.gamesurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.camfel.gamesurvey.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}
