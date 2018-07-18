
package com.terry.cxfserver.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import book.dto.cxfserver.terry.com.Book;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.terry.cxfserver.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetList_QNAME = new QName("http://service.cxfserver.terry.com/", "getList");
    private final static QName _GetListResponse_QNAME = new QName("http://service.cxfserver.terry.com/", "getListResponse");
    private final static QName _Record_QNAME = new QName("http://service.cxfserver.terry.com/", "record");
    private final static QName _View_QNAME = new QName("http://service.cxfserver.terry.com/", "view");
    private final static QName _ViewResponse_QNAME = new QName("http://service.cxfserver.terry.com/", "viewResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.terry.cxfserver.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetList }
     * 
     */
    public GetList createGetList() {
        return new GetList();
    }

    /**
     * Create an instance of {@link GetListResponse }
     * 
     */
    public GetListResponse createGetListResponse() {
        return new GetListResponse();
    }

    /**
     * Create an instance of {@link View }
     * 
     */
    public View createView() {
        return new View();
    }

    /**
     * Create an instance of {@link ViewResponse }
     * 
     */
    public ViewResponse createViewResponse() {
        return new ViewResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfserver.terry.com/", name = "getList")
    public JAXBElement<GetList> createGetList(GetList value) {
        return new JAXBElement<GetList>(_GetList_QNAME, GetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfserver.terry.com/", name = "getListResponse")
    public JAXBElement<GetListResponse> createGetListResponse(GetListResponse value) {
        return new JAXBElement<GetListResponse>(_GetListResponse_QNAME, GetListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfserver.terry.com/", name = "record")
    public JAXBElement<Book> createRecord(Book value) {
        return new JAXBElement<Book>(_Record_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link View }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfserver.terry.com/", name = "view")
    public JAXBElement<View> createView(View value) {
        return new JAXBElement<View>(_View_QNAME, View.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfserver.terry.com/", name = "viewResponse")
    public JAXBElement<ViewResponse> createViewResponse(ViewResponse value) {
        return new JAXBElement<ViewResponse>(_ViewResponse_QNAME, ViewResponse.class, null, value);
    }

}
