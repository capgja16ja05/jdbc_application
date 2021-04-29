package com.capg.app.service;

import java.util.List;

import com.capg.app.beans.Instructor;
import com.capg.app.dto.InstructorsLocationCountDTO;
import com.capg.app.exception.InstructorNotFoundException;

public interface InstructorService {

	public boolean insertInstructor(Instructor instructor);
	public Instructor getInstructorByCode(int code)throws InstructorNotFoundException;
	public List<Instructor> getInstructors();
	
	
	public List<Instructor> getInstructorsByLocation();
	public List<InstructorsLocationCountDTO> getInstructorsCountByLocation(); // group by
	public List<Instructor> getInstructorsBySalary(); // order by ASC 
	
	
	public boolean delteInstructorByCode(int code)throws InstructorNotFoundException;
	public Instructor updateInstructor(Instructor oldInfoInstructor);
	
	
}
