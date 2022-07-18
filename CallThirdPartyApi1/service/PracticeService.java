package com.learn.CallThirdPartyApi1.service;

import java.util.HashMap;
import java.util.List;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.learn.CallThirdPartyApi1.dao.PracticeDao;
import com.learn.CallThirdPartyApi1.modal.Book;


@Service
public class PracticeService {

	private PracticeDao repo;

	
	@SuppressWarnings("unchecked")
	//@Override
	public HashMap<String, Object> bookDetails(String requestBody) throws ParseException, org.apache.tomcat.util.json.ParseException{
		// TODO Auto-generated method stub
		JSONParser parser=new JSONParser(requestBody);
		HashMap<String, Object> reqMap=(HashMap<String, Object>)parser.parse();
		String url="http://uat.torusdigital.in:5000/api/v1/wealth/stock/Mpost/OrderBook";
		System.out.println(url);
		RestTemplate restTemplate=new RestTemplate();
		HashMap<String, Object> map=new HashMap<String, Object>();
		try {
			String result=restTemplate.postForObject(url, reqMap, String.class);
			JSONParser parser2=new JSONParser(result);
			map=(HashMap<String, Object>)parser2.parse();
		}
		catch (Exception e) {
			map.put("status", "error");
			map.put("error", "1");
			map.put("message", e.toString());
		}
		return map;
		
	}

//	public List<Book> save(String book) {
//		// TODO Auto-genera ted method stub
//		return repo.save(book);
//	}


	
}
