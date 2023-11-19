// TodoListRemoveService.java
package CodeRefactoringToDoList.Service;
import CodeRefactoringToDoList.Model.ToDoListModel; 

public class TodoListRemoveService {
    public static boolean removeTodoList(Integer number) {
        return ToDoListModel.removeTodoList(number);
    }

    public static void testRemoveTodoList() {
        TodoListAddService.addTodoList("Satu");
        TodoListAddService.addTodoList("Dua");
        TodoListAddService.addTodoList("Tiga");
        TodoListAddService.addTodoList("Empat");
        TodoListAddService.addTodoList("Lima");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        TodoListShowService.showTodoList();
    }
}
