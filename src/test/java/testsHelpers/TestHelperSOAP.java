package testsHelpers;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.context.TestContext;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;
import com.consol.citrus.ws.message.SoapMessage;
import features.PojoToXML;
import org.testng.annotations.Test;
import com.dataaccess.webservicesserver.NumberToDollars;
import com.dataaccess.webservicesserver.NumberToDollarsResponse;
import ru.moneta.schemas.messages.AccountInfo;

import java.math.BigDecimal;

public class TestHelperSOAP extends TestNGCitrusTestRunner {

    private TestContext context;

    @Test(description = "Получение", enabled = true)
    @CitrusTest
    public void getTestActions() {
        this.context = citrus.createTestContext();

        PojoToXML<Class<NumberToDollars>> convRequest = new PojoToXML<>();
        PojoToXML<Class<NumberToDollarsResponse>> convResponse = new PojoToXML<>();


        soap(soapActionBuilder -> soapActionBuilder
                        .client("soapHelperClient")
                        .send()
//                .payload(getNumberToDollarsRequest(), "marshallerRequest")
                        .payload(convRequest.convert(NumberToDollars.class, getNumberToDollarsRequest(), "http://www.dataaccess.com/webservicesserver/", "NumberToDollars"))
        );

        soap(soapActionBuilder -> soapActionBuilder
                        .client("soapHelperClient")
                        .receive()
                        .xsdSchemaRepository("schemaRepositoryService")
//                .payload(getNumberToDollarsResponse(), "marshallerResponse")
                        .payload(convResponse.convert(NumberToDollarsResponse.class, getNumberToDollarsResponse(), "http://www.dataaccess.com/webservicesserver/", "NumberToDollarsResponse"))
        );
    }

    public NumberToDollars getNumberToDollarsRequest() {
        NumberToDollars numberToDollars = new NumberToDollars();
        numberToDollars.setDNum(new BigDecimal("15"));
        return numberToDollars;
    }

    public NumberToDollarsResponse getNumberToDollarsResponse() {
        NumberToDollarsResponse numberToDollarsResponse = new NumberToDollarsResponse();
        numberToDollarsResponse.setNumberToDollarsResult("fifteen dollars");
        return numberToDollarsResponse;
    }

    @Test(description = "Удаление пользователя")
    @CitrusTest
    public void convertFahrenheitToCelsius() {

        this.context = citrus.createTestContext();

        PojoToXML<Class<ru.moneta.schemas.messages.AccountInfo>> convRequest = new PojoToXML<>();
        PojoToXML<Class<NumberToDollarsResponse>> convResponse = new PojoToXML<>();
        SoapMessage soapMessage = new SoapMessage();
        soapMessage.soapAction("/HelloService/sayHello");
        soapMessage.setPayload(
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n" +
                        "  <soap12:Body>\n" +
                        "    <FahrenheitToCelsius xmlns=\"https://www.w3schools.com/xml/\">\n" +
                        "      <Fahrenheit>75</Fahrenheit>\n" +
                        "    </FahrenheitToCelsius>\n" +
                        "  </soap12:Body>\n" +
                        "</soap12:Envelope>");

        soap(soapActionBuilder -> soapActionBuilder
                .client("soapHelperMonetaClient")
                .send()
                .payload(convRequest.convert(ru.moneta.schemas.messages.AccountInfo.class, getInfoOnNumberProfileRequest(),"https://demo.moneta.ru/services/",  "FindAccountByIdRequest"))
        );
        //TODO выяснить про localparts & namespace
        // продолжить на 0,57
        soap(soapActionBuilder -> soapActionBuilder
                .client("soapHelperFahrenheitConversionClient")
                .receive()
                .xsdSchemaRepository("schemaRepositoryService2")
                .payload(soapMessage.toString())
        );
    }

    //готовим pojo для запроса
    public ru.moneta.schemas.messages.AccountInfo getInfoOnNumberProfileRequest() {
        ru.moneta.schemas.messages.AccountInfo accountInfo = new AccountInfo();
        accountInfo.setId(12154);
        return accountInfo;
    }

    //готовим эталон для валидации ответа
    public ru.moneta.schemas.messages.AccountInfo getInfoOnNumberProfile() {
        ru.moneta.schemas.messages.AccountInfo accountInfo = new AccountInfo();
        accountInfo.setId(12154);
        return accountInfo;
    }
}
