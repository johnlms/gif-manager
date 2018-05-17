package com.company.gifmanager.util;

import org.springframework.http.HttpStatus;

public class RestUtil {

	public static Boolean isError(HttpStatus status) {
		HttpStatus.Series series = status.series();
		return (HttpStatus.Series.CLIENT_ERROR.equals(series) ||
				HttpStatus.Series.SERVER_ERROR.equals(series));
	}
	
}
