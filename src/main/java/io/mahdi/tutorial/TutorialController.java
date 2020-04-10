package io.mahdi.tutorial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorialController {
	// This function is a controller that returns a dummy string to check if the controller is working
	@Autowired
	TutorialService tutorialService;
	
	@RequestMapping("/hello")
	public String HelloWorld() {
		return "Hi";
	}

	@GetMapping("/tutorials")
	public List<Tutorial> getTutorials() {
		return tutorialService.getAllTutorials();
	}
	
	@GetMapping("/tutorials/published")
	public List<Tutorial> getPublishedTutorials() {
		return tutorialService.getAllTutorialsPublished();
	}
	
	@GetMapping("/tutorials/{id}")
	public  Tutorial  getTutorial(@PathVariable String id ) {
		return tutorialService.getTutorial(id);
	}
	
	@PostMapping("/tutorials")
	public  void createTutorial( @RequestBody Tutorial tutorial ) {
		  tutorialService.createTutorial(tutorial);;
	}
	
	
	@PutMapping("/tutorials")
	public  void updateTutorial( @RequestBody Tutorial tutorial ) {
		  tutorialService.updateTutorial(tutorial) ;
	}
	
	
	@PostMapping("/tutorials/{id}")
	public  void deleteTutorial( @PathVariable String id ) {
		  tutorialService.deleteTutorial(id) ;
	}
	
}
