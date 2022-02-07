package com.hacom.api.examen.util;



public class UtilEnum {
	private UtilEnum() {
		
	}
	
	public  enum STATUS_OPERATION{
		SUCCESS(0,"SUCCESS"),
		ERROR(1,"ERROR");
		

		private final int status;
		private final String message;
		private STATUS_OPERATION(int status,String message){
			this.status = status;
			this.message = message;
		}
		public int getStatus() {
			return status;
		}
		public String getMessage() {
			return message;
		}
		
	}

	
	
	
	
}