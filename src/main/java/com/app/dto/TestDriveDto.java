package com.app.dto;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class TestDriveDto {
	private int id;

	private String customerName;
	
	private int customerId;
	
	private String modelName;
	private String vehicleNo;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate testDriveDate;
	
	
}
