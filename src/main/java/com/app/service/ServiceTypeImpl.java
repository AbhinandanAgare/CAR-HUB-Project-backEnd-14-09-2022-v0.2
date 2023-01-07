package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ServiceTypeRepository;
import com.app.pojos.ServiceType;
@Service
@Transactional
public class ServiceTypeImpl implements IServiceType {

	@Autowired
	private ServiceTypeRepository serviceTypeRepo;
	
	@Override
	public ServiceType addServiceType(ServiceType serviceType) {
		
		return serviceTypeRepo.save(serviceType);
	}

	@Override
	public List<ServiceType> getServiceTypeList() {
		
		return serviceTypeRepo.findAll();
	}

	@Override
	public String removeServiceType(Integer id) {
		// TODO Auto-generated method stub
		if (serviceTypeRepo.existsById(id)) {
			serviceTypeRepo.deleteById(id);
			return "ServiceType Details deleted with" + id;
		}
		return "ServiceType Details are not present";
	}
	}

	

