package ru.test.info.skip;

import ru.test.info.ObjectFactory;
import ru.test.info.WSInfoGetResponseType;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.3
 * 2014-12-15T16:28:22.177+04:00
 * Generated source version: 3.0.3
 */
@WebService(targetNamespace = "http://CorruptedWSInfo12.ws.test.ru", name = "CorruptedWSInfo12PortType")
@XmlSeeAlso({ObjectFactory.class})
public interface SkippedWSInfo12PortType {

  @WebMethod(operationName = "CorruptedWSInfoGet", action = "/TEST/INFO/WSInfo12#Get")
  @RequestWrapper(localName = "CorruptedWSInfoGet", targetNamespace = "http://CorruptedWSInfo12.ru.test.ws", className = "CorruptedWSInfoGet")
  @ResponseWrapper(localName = "CorruptedWSInfoGetResponse", targetNamespace = "http://CorruptedWSInfo12.ru.test.ws", className = "CorruptedWSInfoGetResponse")
  @WebResult(name = "response", targetNamespace = "")
  public WSInfoGetResponseType wsCustomerChannelsInfoGet(
          @WebParam(name = "inParms", targetNamespace = "")
                  String inParms
  );
}
