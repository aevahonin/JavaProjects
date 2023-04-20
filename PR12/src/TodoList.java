import java.util.ArrayList;
import java.util.List;

    public class TodoList {

        private final List<String> todoList = new ArrayList<>();

        public void add(String todo) {
            todoList.add(todo);
            System.out.println("Добавлено дело: " + todo);
        }

        public void add(Integer index, String todo) {
            if (exist(index)){
                todoList.add(index, todo);
            } else {
                add(todo);
            }
        }

        public void edit(Integer index, String todo) {
            if (exist(index)) {
                String oldName = todoList.get(index);
                todoList.set(index, todo);
                System.out.println("Дело " + oldName + " заменено на " + todo);
            } else {
            }
        }

        public void delete(int index) {
            if (exist(index)) {
                String oldName = todoList.get(index);
                todoList.remove(index);
                System.out.println("Дело " + oldName + " удалено");
            } else {
                System.out.println("Дело с таким номером не существует");
            }
        }

        public String list() {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < todoList.size(); i++) {
                stringBuilder.append(i).append(" - ").append(todoList.get(i)).append("\n");
            }
            return stringBuilder.toString();
        }

        private boolean exist(Integer index) {
            return index != null && index >= 0 && index < todoList.size();
        }
        public ArrayList<String> getTodos() {
            return (ArrayList<String>) todoList;
        }
    }
