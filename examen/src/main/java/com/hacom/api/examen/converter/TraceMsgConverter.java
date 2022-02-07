package com.hacom.api.examen.converter;

import com.hacom.api.examen.dto.TraceMsgDto;
import com.hacom.api.examen.dto.TraceMsgRequest;
import com.hacom.api.examen.entity.TraceMsg;



public class TraceMsgConverter extends AbstractConverter<TraceMsg, TraceMsgDto>{

	@Override
	public TraceMsg toEntity(TraceMsgDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TraceMsgDto toDTO(TraceMsg entity) {
		TraceMsgDto tmDto = new TraceMsgDto();
		tmDto.setPayload(entity.getPayload());
		tmDto.setSessionId(entity.getSessionId());
		tmDto.setId(entity.get_id()+"");
		tmDto.setTs(entity.getTs());
		return tmDto;
	}

	public TraceMsg toEntityFromRequest(TraceMsgRequest request) {

		TraceMsg tm = new TraceMsg();
		tm.setPayload(request.getPayload());
		tm.setSessionId(request.getSessionId());
		return tm;
	}
	
	
}
