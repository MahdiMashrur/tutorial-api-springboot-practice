package io.mahdi.tutorial;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface TutorialRepository extends CrudRepository<Tutorial,String>{
	  //Optional<Tutorial> findById(String id) ;
	  List<Tutorial> findByIspublished(boolean ispublished);
}
