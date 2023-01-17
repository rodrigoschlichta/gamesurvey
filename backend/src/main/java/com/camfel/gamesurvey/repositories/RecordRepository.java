package com.camfel.gamesurvey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camfel.gamesurvey.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
