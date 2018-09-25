package co.cafdo.profile.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import co.cafdo.profile.mdw.model.Profile;

@Service
public class ListService {
	private static List<Profile> todos = new ArrayList<Profile>();
	private static int todoCount = 3;

	static {
		todos.add(new Profile(1, "in28Minutes", "Learn Spring MVC", new Date(), false));
		todos.add(new Profile(2, "in28Minutes", "Learn Struts", new Date(), false));
		todos.add(new Profile(3, "in28Minutes", "Learn Hibernate", new Date(), false));
	}

	public List<Profile> retrieveTodos(String user) {
		List<Profile> filteredTodos = new ArrayList<Profile>();
		for (Profile todo : todos) {
			if (todo.getUser().equals(user)) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
}
