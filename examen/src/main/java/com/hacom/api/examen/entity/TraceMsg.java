package com.hacom.api.examen.entity;

import java.time.OffsetDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("trace_msg")
public class TraceMsg {

	@Id
	 private ObjectId _id;
	 private String sessionId;
	 private String payload;
	 private OffsetDateTime ts;

}
