package dockercontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/user")
	public String getMapping()
	{
		
		return "Simple spring boot application";
	}
	
	@GetMapping("/date")
	public String todayDate()
	{
		return "todays date";
		
	}
}