package com.example.myapp.cunsumer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeConsumerController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value = "/consume/employees")
	public String getEmployeeList(){
		/*HttpHeaders headers = new HttpHeaders();
		headers.setAccept((List<MediaType>) MediaType.APPLICATION_JSON);
		//setAccept(Arrays.asList(org.springframework.http.MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		return restTemplate.exchange("http://localhost:9091/myapp/api/v1/employees", HttpMethod.GET, entity, String.class).getBody();*/
		
		String getEmpUrl = "http://localhost:9091/myapp/api/v1/employees";
		String response	= restTemplate.getForObject(getEmpUrl, String.class);
		System.out.println("response " + response);
		return response;
	}

}
