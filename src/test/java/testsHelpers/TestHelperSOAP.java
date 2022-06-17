package testsHelpers;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.context.TestContext;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;
import com.consol.citrus.ws.message.SoapMessage;
import features.PojoToXML;
import org.oorsprong.websamples.CurrencyName;
import org.oorsprong.websamples.CurrencyNameResponse;
import org.testng.annotations.Test;
import com.dataaccess.webservicesserver.NumberToDollars;
import com.dataaccess.webservicesserver.NumberToDollarsResponse;

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

    @Test(description = "Получение названия валюты")
    @CitrusTest
    public void getNameOfCurrency() {

        this.context = citrus.createTestContext();

        PojoToXML<Class<CurrencyName>> convRequest = new PojoToXML<>();
        PojoToXML<Class<CurrencyNameResponse>> convResponse = new PojoToXML<>();

        soap(soapActionBuilder -> soapActionBuilder
                .client("soapHelperCountryInfoClient")
                .send()
                .payload(convRequest.convert(CurrencyName.class, getCurrencyNameRequest(), "http://www.oorsprong.org/", "websamples.countryinfo"))
        );
        // продолжить на 0,57
        soap(soapActionBuilder -> soapActionBuilder
                .client("soapHelperCountryInfoClient")
                .receive()
                .xsdSchemaRepository("schemaRepositoryService2")
                .payload(convResponse.convert(CurrencyNameResponse.class, getCurrencyNameResponse(), "http://www.oorsprong.org/", "websamples.countryinfo"))
        );
    }

    //готовим pojo для запроса
    public CurrencyName getCurrencyNameRequest() {
        CurrencyName currencyName = new CurrencyName();
        currencyName.setSCurrencyISOCode("DZD");
        return currencyName;
    }

    //готовим эталон для валидации ответа
    public CurrencyNameResponse getCurrencyNameResponse() {
        CurrencyNameResponse currencyNameResponse = new CurrencyNameResponse();
        currencyNameResponse.setCurrencyNameResult("Algeria Dinars");
        return currencyNameResponse;
    }
}
