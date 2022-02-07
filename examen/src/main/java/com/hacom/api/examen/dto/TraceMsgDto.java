package com.hacom.api.examen.dto;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TraceMsgDto {
	 private String id;
	 private String sessionId;
	 private String payload;
	 private OffsetDateTime ts;

}
