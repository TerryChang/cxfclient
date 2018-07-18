
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.terry.cxfserver.service;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-07-18T15:54:14.922+09:00
 * Generated source version: 3.2.5
 *
 */

@javax.jws.WebService(
                      serviceName = "WSDLBookService",
                      portName = "WSDLBookServiceImplPort",
                      targetNamespace = "http://impl.service.cxfserver.terry.com/",
                      wsdlLocation = "http://localhost:8080/cxf/WSDLBookService?wsdl",
                      endpointInterface = "com.terry.cxfserver.service.WSDLService")

public class WSDLBookServiceImplPortImpl implements WSDLService {

    private static final Logger LOG = Logger.getLogger(WSDLBookServiceImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.terry.cxfserver.service.WSDLService#view(java.lang.Integer key)*
     */
    public book.dto.cxfserver.terry.com.Book view(java.lang.Integer key) {
        LOG.info("Executing operation view");
        System.out.println(key);
        try {
            book.dto.cxfserver.terry.com.Book _return = new book.dto.cxfserver.terry.com.Book();
            _return.setIdx(-421637384);
            _return.setCategory("Category-1712692787");
            _return.setIsbn("Isbn1649306121");
            _return.setBookName("BookName1700401274");
            _return.setAuthor("Author-1491510526");
            _return.setSummary("Summary203179148");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.terry.cxfserver.service.WSDLService#getList()*
     */
    public java.util.List<book.dto.cxfserver.terry.com.Book> getList() {
        LOG.info("Executing operation getList");
        try {
            java.util.List<book.dto.cxfserver.terry.com.Book> _return = new java.util.ArrayList<book.dto.cxfserver.terry.com.Book>();
            book.dto.cxfserver.terry.com.Book _returnVal1 = new book.dto.cxfserver.terry.com.Book();
            _returnVal1.setIdx(1912116174);
            _returnVal1.setCategory("Category-964121307");
            _returnVal1.setIsbn("Isbn194220274");
            _returnVal1.setBookName("BookName-1210589459");
            _returnVal1.setAuthor("Author1802190182");
            _returnVal1.setSummary("Summary102060024");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
