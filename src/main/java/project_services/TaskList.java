package project_services;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import project_classes.TaskModel;
import project_interfaces.Task;

public class TaskList {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	List<Task> mainList = new ArrayList();

	@SuppressWarnings({ "rawtypes", "unchecked" })
	List<Task> startedList = new ArrayList();

	@SuppressWarnings({ "rawtypes", "unchecked" })
	List<Task> doneList = new ArrayList();

	@SuppressWarnings({ "rawtypes", "unchecked" })
	List<Task> deletedList = new ArrayList();

	public void done(String title) {
		startedList.forEach(t -> {
			if (t.getTitle().equals(title)) {
				startedList.remove(t);
				doneList.add(t);
			} 
		});
		mainList.forEach(t -> {
			if (t.getTitle().equals(title)) {
				mainList.remove(t);
				doneList.add(t);
			} 
		});
	}

	public void start(String title) {	
		mainList.forEach(t -> {
			if (t.getTitle().equals(title)) {
				mainList.remove(t);
				startedList.add(t);
			} 
		});
	}

	public void stop(String title) {	
		mainList.forEach(t -> {
			if (t.getTitle().equals(title)) {
				startedList.remove(t);
				mainList.add(t);
			} 
		});
	}

	public void create(Task task) {
		mainList.add(task);
	};

	public List<Task> list() {
		Class<?> taskClass;
		List<Task> list = startedList;
		taskClass = TaskModel.class;
		try {
			Field[] fields = taskClass.getDeclaredFields();
			Set<String> ignoreFields = new LinkedHashSet<>();

			for (Field field : fields) {
				Annotation[] annotations = field.getDeclaredAnnotations();
				for (Annotation annotation : annotations) {
					if (annotation.annotationType().getSimpleName().equals("RemoveAsListParameter")) {
						ignoreFields.add(field.getName());
					}
				}
			}

			list.addAll(mainList);

			if (!ignoreFields.contains("isDone")) {
				list.addAll(doneList);
			}
			if (!ignoreFields.contains("isDelete")) {
				list.addAll(deletedList);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	};

	public void delete(String title) {
		startedList.forEach(t -> {
			if (t.getTitle().equals(title)) {
				startedList.remove(t);
				deletedList.add(t);
			} 
		});
		mainList.forEach(t -> {
			if (t.getTitle().equals(title)) {
				mainList.remove(t);
				deletedList.add(t);
			} 
		});
	}

	public void edit(String title, Task task) {
		mainList.forEach(t -> {
			if (t.getTitle().equals(title)) {
				mainList.remove(t);
				mainList.add(task);
			} 
		});
	}
}
