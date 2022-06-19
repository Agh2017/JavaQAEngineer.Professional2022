package testsHelpers;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.context.TestContext;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;
import com.consol.citrus.ws.message.SoapMessage;
import features.PojoToXML;
import org.oorsprong.websamples.CurrencyName;
import org.oorsprong.websamples.CurrencyNameResponse;
import org.springframework.core.io.ClassPathResource;
import org.testng.annotations.Test;
import com.dataaccess.webservicesserver.NumberToDollars;
import com.dataaccess.webservicesserver.NumberToDollarsResponse;

import java.math.BigDecimal;

public class TestHelperSOAP extends TestNGCitrusTestRunner {

    private TestContext context;

    @Test(description = "Получение названия валюты")
    @CitrusTest
    public void getNameOfCurrency() {

        this.context = citrus.createTestContext();

        PojoToXML<Class<CurrencyName>> convRequest = new PojoToXML<>();
        PojoToXML<Class<CurrencyNameResponse>> convResponse = new PojoToXML<>();

        soap(soapActionBuilder -> soapActionBuilder
                .client("soapHelperCountryInfoClient")
                .send()
                .payload(convRequest.convert(CurrencyName.class,
                        getCurrencyNameRequest(), "http://www.oorsprong.org/websamples.countryinfo", "CurrencyName"))
        );

        soap(soapActionBuilder -> soapActionBuilder
                .client("soapHelperCountryInfoClient")
                .receive()
                .payload(new ClassPathResource("wsdl/schemaCountryInfo.xml"))
                .timeout(5000L));
    }


    //готовим pojo для запроса
    public CurrencyName getCurrencyNameRequest() {
        CurrencyName currencyName = new CurrencyName();
        currencyName.setSCurrencyISOCode("RUB");
        return currencyName;
    }

    //готовим эталон для валидации ответа если есть wsdl или xsd file
    public CurrencyNameResponse getCurrencyNameResponse() {
        CurrencyNameResponse currencyNameResponse = new CurrencyNameResponse();
        currencyNameResponse.setCurrencyNameResult("Rubles");
        return currencyNameResponse;
    }
}
