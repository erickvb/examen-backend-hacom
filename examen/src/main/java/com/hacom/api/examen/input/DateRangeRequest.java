package com.hacom.api.examen.input;

import java.time.OffsetDateTime;

import org.springframework.lang.NonNull;

import lombok.Data;

@Data
public class DateRangeRequest {
	 @NonNull
	 private OffsetDateTime from;
	 @NonNull
	 private OffsetDateTime to;
}
