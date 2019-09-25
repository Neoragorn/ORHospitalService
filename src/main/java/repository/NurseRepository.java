package repository;

import org.springframework.data.repository.CrudRepository;

import models.Nurse;

public interface NurseRepository extends CrudRepository<Nurse, Long> {
	 
	Nurse findById(int id);
}