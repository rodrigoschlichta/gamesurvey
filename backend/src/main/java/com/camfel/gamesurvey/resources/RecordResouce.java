package com.camfel.gamesurvey.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.camfel.gamesurvey.dto.RecordDTO;
import com.camfel.gamesurvey.dto.RecordInsertDTO;
import com.camfel.gamesurvey.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordResouce {
	
	@Autowired
	private RecordService service;
		
	@PostMapping
	public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto){
		RecordDTO newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);
		
	}
}
