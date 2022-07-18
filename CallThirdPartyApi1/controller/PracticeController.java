package com.learn.CallThirdPartyApi1.controller;

//import java.awt.print.Book;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.tomcat.util.json.ParseException;
import org.springframework.beans.factory.annotation.Autowired;

//import javax.validation.Valid;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.learn.CallThirdPartyApi1.modal.Book;
import com.learn.CallThirdPartyApi1.service.PracticeService;

//import com.learn.CallThirdPartyApi1.modal.Book;

//import com.example.demo.entities.Company;

//@RestController
//public class PracticeController {
//
//	PracticeService practiceService;
//	
//	@PostMapping("/book")
//	public List<Object> getBook(@RequestBody String book ){
//		System.out.println("book = "+book);
//	String url="http://uat.torusdigital.in:5000/api/v1/wealth/stock/Mpost/OrderBook";
//	RestTemplate restTemplate=new RestTemplate();
//	Object[] Book=restTemplate.postForObject(url, book, Object[].class);
//	return Arrays.asList(Book);
//	}
//	
//}

//@RestController
//public class PracticeController{
//	PracticeService practiceService;
//	
//	@PostMapping("/book")
//	public Object[] postBook(@RequestBody String book){
//		System.out.println("book= "+ book);
//		String url="http://uat.torusdigital.in:5000/api/v1/wealth/stock/Mpost/OrderBook";
//	RestTemplate restTemplate=new RestTemplate();`
//	Object[] Book=restTemplate.postForObject(url, book, String[].class);
//	return Book;
//	}
//}
//	@PostMapping("/add")
//	public Company saveCompany(@Valid @RequestBody Company company) {
//	    return companyService.save(company);
//	}
//}

@RestController
public class PracticeController{
	
	@Autowired
	private PracticeService practiceService;
	
	@PostMapping("/books")
	public HashMap<String, Object> bookDetails(
			@RequestBody String postBookDetailsRequestBody) throws ParseException{
		HashMap<String, Object> result=practiceService.bookDetails(postBookDetailsRequestBody);
		return result;
	}
	
}
















