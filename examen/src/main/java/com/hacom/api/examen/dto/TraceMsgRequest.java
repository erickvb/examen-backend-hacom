package com.hacom.api.examen.dto;

import lombok.Data;
import lombok.Getter;

@Data
public class TraceMsgRequest {
	 private String sessionId;
	 private String payload;
	// private OffsetDateTime ts;

}
