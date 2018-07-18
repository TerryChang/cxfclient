package com.terry.cxfclient.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.terry.cxfclient.service.ClientService;

import book.dto.cxfserver.terry.com.Book;

@RestController
public class WebController {

	@Autowired
	ClientService clientService;
	
	@RequestMapping(value="/getList")
	public List<Book> getList() {
		return clientService.getList();
	}
	
	@RequestMapping(value="/view")
	public Book view(@RequestParam(name="key") int key) {
		return clientService.view(key);
	}
}
