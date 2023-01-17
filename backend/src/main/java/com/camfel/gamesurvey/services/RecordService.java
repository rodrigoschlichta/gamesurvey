package com.camfel.gamesurvey.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.camfel.gamesurvey.dto.RecordDTO;
import com.camfel.gamesurvey.dto.RecordInsertDTO;
import com.camfel.gamesurvey.entities.Game;
import com.camfel.gamesurvey.entities.Record;
import com.camfel.gamesurvey.repositories.GameRepository;
import com.camfel.gamesurvey.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		
		return new RecordDTO(entity);
		
	}
}
