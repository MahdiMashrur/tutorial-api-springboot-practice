package io.mahdi.tutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorialController {
	// This function is a controller that returns a dummy string to check if the controller is working
	@RequestMapping("/hello")
	public String HelloWorld() {
		return "Hi";
	}

}
