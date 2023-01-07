package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "testDrive")
public class bookTestDrive extends BaseEntity {
//		@Column(name = "model", length = 30, nullable = false)
//		private String model;
		@Column(name = "model_name", length = 30)
		private String modelName;
		@Column(name = "vehicle_no", length = 30, nullable = false)
		private String vehicleNo;
		@Column(name = "customer_name", length = 30, nullable = false)
		private String customerName;
		@Column(name = "customer_id", length = 30)
		private int customerId;
		
		
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private LocalDate testDriveDate;
		
		
	}

