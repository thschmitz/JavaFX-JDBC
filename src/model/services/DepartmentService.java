package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	public List<Department> findAll() {
		// MOCK dos dados -> retornar os dados de mentira, nao eh o do banco de dados.
		
		List<Department> list = new ArrayList<>();
		
		list.add(new Department(1, "Books"));
		list.add(new Department(2, "Computer"));
		list.add(new Department(3, "Eletronics"));
		
		return list;
	}
}
