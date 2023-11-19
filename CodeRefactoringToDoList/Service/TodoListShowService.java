// TodoListShowService.java
package CodeRefactoringToDoList.Service;
import CodeRefactoringToDoList.Model.ToDoListModel;

public class TodoListShowService {
    public static void showTodoList() {
        ToDoListModel.showTodoList();
    }

    public static void testShowTodoList() {
        ToDoListModel.model[0] = "Belajar Java Dasar";
        ToDoListModel.model[1] = "Studi Kasus Java Dasar : Aplikasi Todolist";
        showTodoList();
    }
}
