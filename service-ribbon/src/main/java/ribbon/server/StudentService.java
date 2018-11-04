package ribbon.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {
	@Autowired
	RestTemplate restTemplate;
	
	public String student(String name) {
		return restTemplate.getForObject("http://service-student/student?name=" + name,String.class);
	}
}
