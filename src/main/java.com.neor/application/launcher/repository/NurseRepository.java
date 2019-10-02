package application.launcher.repository;

import org.springframework.data.repository.CrudRepository;

import application.launcher.models.Nurse;


public interface NurseRepository extends CrudRepository<Nurse, Long> {
	 
	Nurse findById(int id);
}