package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.BookeTestDriveRepository;
import com.app.dao.CustomerAdmRepository;
import com.app.dao.ServiceRepository;
import com.app.dto.ServiceDto;
import com.app.dto.TestDriveDto;
import com.app.pojos.BookService;
import com.app.pojos.Customer;
import com.app.pojos.bookTestDrive;
@Service
@Transactional
public class TestDriveSeviceImpl implements ITestDrive {
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private AdminServiceImpl admnSer;
	
	@Autowired
	private BookeTestDriveRepository testRepo;
	
	@Autowired
	private CustomerAdmRepository customerRepo;
	
	@Override
	public String bookTestdrive(TestDriveDto bs) {
		// TODO Auto-generated method stub
		
			bookTestDrive bookedtestDrive = new bookTestDrive();
			
			bookedtestDrive.setCustomerName(bs.getCustomerName());
			bookedtestDrive.setCustomerId(bs.getCustomerId());
			bookedtestDrive.setVehicleNo(bs.getVehicleNo());
			bookedtestDrive.setModelName(bs.getModelName());
			bookedtestDrive.setTestDriveDate(bs.getTestDriveDate());
			bookedtestDrive.setId(0);
			Customer cust = customerRepo.findById(bs.getCustomerId()).orElseThrow();
			admnSer.sendEmail4(cust.getEmailId(),cust.getName());
			bookTestDrive saved = testRepo.save(bookedtestDrive);
			return "Testdrive booked successfully" ;
			

		}
	
}
