package project_services;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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

    public void done(Task task) {
        if (startedList.contains(task)) {
            startedList.remove(task);
            doneList.add(task);
        } else if (mainList.contains(task)) {
            mainList.remove(task);
            doneList.add(task);
        } else
            throw new IllegalArgumentException("this task not found");
    };

    public void start(Task task) {
        if (mainList.contains(task)) {
            mainList.remove(task);
            startedList.add(task);
        } else
            throw new IllegalArgumentException("this task not found");
    };

    public void stop(Task task) {
        if (startedList.contains(task)) {
            startedList.remove(task);
            mainList.add(task);
        } else
            throw new IllegalArgumentException("this task not found");
    };

    public void create(Task task) {
        mainList.add(task);
    };

    public List<Task> list(Task task) {
        Class<?> taskClass = task.getClass();
        Field[] fields = taskClass.getDeclaredFields();
        Set<String> ignoreFields = new LinkedHashSet<>();
        List<Task> list = startedList;

        for (Field field : fields) {
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType().getSimpleName().equals("RemoveAsListParameter")) {
                    ignoreFields.add(field.getName());
                }
            }
        }

        list.addAll(mainList);

        if (!ignoreFields.contains("")) {
            list.addAll(doneList);
        }
        if (!ignoreFields.contains("")) {
            list.addAll(deletedList);
        }
        return list;
    };

    public void delete(Task task) {
        if (startedList.contains(task)) {
            startedList.remove(task);
            deletedList.add(task);
        } else if (mainList.contains(task)) {
            mainList.remove(task);
            deletedList.add(task);
        } else
            throw new IllegalArgumentException("this task not found");
    };
}
