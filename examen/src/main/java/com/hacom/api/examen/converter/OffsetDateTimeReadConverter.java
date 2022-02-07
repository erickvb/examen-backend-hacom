package com.hacom.api.examen.converter;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class OffsetDateTimeReadConverter implements Converter<Date, OffsetDateTime>{

	@Override
	public OffsetDateTime convert(Date date) {
		//return OffsetDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		ZoneOffset offset = OffsetDateTime.now().getOffset();
		return  date.toInstant().atOffset(offset);
	}

}
