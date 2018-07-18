package com.terry.cxfclient.service;

import java.util.List;
import javax.jws.WebParam;
import book.dto.cxfserver.terry.com.Book; // Server Side의 Book 클래스의 @XmlType Annotation의 namespace 속성에 정의된 값을 역순으로 해서 package를 만들어서 클래스를 저장한다

public interface ClientService {

	List<Book> getList();
	Book view(@WebParam(name="key") Integer key);
}
