package CodeRefactoringToDoList.Service;
import CodeRefactoringToDoList.Model.ToDoListModel;

public class TodoListAddService {
        public static void addTodoList(String todo) {
            ToDoListModel.addTodoList(todo);
        }
    
        public static void testAddTodoList() {
            for (int i = 0; i < 25; i++) {
                addTodoList("Contoh Todo Ke." + i);
            }
    
            TodoListShowService.showTodoList();
        }
    }
