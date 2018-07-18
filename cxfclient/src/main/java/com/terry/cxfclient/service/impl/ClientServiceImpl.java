package com.terry.cxfclient.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terry.cxfclient.service.ClientService;
import com.terry.cxfserver.service.WSDLService;

import book.dto.cxfserver.terry.com.Book;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	WSDLService wsdlService;

	@Override
	public List<Book> getList() {
		// TODO Auto-generated method stub
		List<Book> result = wsdlService.getList();
		return result;
	}

	@Override
	public Book view(Integer key) {
		// TODO Auto-generated method stub
		Book result = wsdlService.view(key);
		return result;
	}

}
