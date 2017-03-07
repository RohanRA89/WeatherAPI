package com.ironyard;

import com.ironyard.dto.LocationInformation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


	@Test
	public void contextLoads() {

		RestTemplate restTemplateCard = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36");

		HttpEntity entity = new HttpEntity(headers);

		HttpEntity response = restTemplateCard.exchange("https://api.darksky.net/forecast/2bc9b4eeef27543c62a89114b80f3305/37.8267,-122.4233", HttpMethod.GET, entity, LocationInformation.class);
		LocationInformation myWeatherCall = (LocationInformation) response.getBody();

		System.out.println(myWeatherCall.toString());

	}

}
