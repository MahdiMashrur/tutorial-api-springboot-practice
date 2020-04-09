package io.mahdi.tutorial;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TutorialService  {
	@Autowired
	TutorialRepository repository ;
	
	public List<Tutorial> getAllTutorials(){
		List<Tutorial> tutorials= new ArrayList<Tutorial>();
		 for(Tutorial tutorial: repository.findAll())
			 tutorials.add(tutorial);
		 return tutorials;
	}
	
	
	public   Tutorial  getTutorial(String id){
		return repository.findById(id).get();
	}
	
	public List<Tutorial> getAllTutorialsPublished(){
		List<Tutorial> tutorials= new ArrayList<Tutorial>();
		 for(Tutorial tutorial: repository.findByIspublished(true))
			 tutorials.add(tutorial);
		 return tutorials;
	}
	
	public void addTutorial(Tutorial tutorial) {
		repository.save(tutorial);
	}
	
	public void updateTutorial(Tutorial tutorial) {
		repository.save(tutorial);
	}
	
	public void deleteTutorial(String id) {
		repository.deleteById(id); 
	}
	
}
