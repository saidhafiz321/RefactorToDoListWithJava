// TodoListViewService.java
package CodeRefactoringToDoList.Service;

public class TodoListViewService {
    public static void viewShowTodoList() {
        TodoListShowService.showTodoList();

        System.out.println("MENU : ");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("x. Keluar");

        var input = TodoListInputService.input("Pilih");

        if (input.equals("1")) {
            TodoListViewService.viewAddTodoList();
        } else if (input.equals("2")) {
            TodoListViewService.viewRemoveTodoList();
        } else if (input.equals("x")) {
            // Do nothing, exit the loop
        } else {
            System.out.println("Pilihan tidak dimengerti");
        }
    }

    public static void testViewShowTodoList() {
        TodoListAddService.addTodoList("Satu");
        TodoListAddService.addTodoList("Dua");
        TodoListAddService.addTodoList("Tiga");
        TodoListAddService.addTodoList("Empat");
        TodoListAddService.addTodoList("Lima");
        viewShowTodoList();
    }

    public static void viewAddTodoList() {
        System.out.println("MENAMBAH TODOLIST");

        var todo = TodoListInputService.input("Todo (x Jika Batal)");

        if (!todo.equals("x")) {
            TodoListAddService.addTodoList(todo);
        }
    }

    public static void testViewAddTodoList() {
        TodoListAddService.addTodoList("Satu");
        TodoListAddService.addTodoList("Dua");

        viewAddTodoList();

        TodoListShowService.showTodoList();
    }

    public static void viewRemoveTodoList() {
        System.out.println("MENGHAPUS TODOLIST");

        var number = TodoListInputService.input("Nomor yang Dihapus (x Jika Batal)");

        if (!number.equals("x")) {
            boolean success = TodoListRemoveService.removeTodoList(Integer.valueOf(number));
            if (!success) {
                System.out.println("Gagal menghapus todolist : " + number);
            }
        }
    }

    public static void testViewRemoveTodoList() {
        TodoListAddService.addTodoList("Satu");
        TodoListAddService.addTodoList("Dua");
        TodoListAddService.addTodoList("Tiga");

        TodoListShowService.showTodoList();

        viewRemoveTodoList();

        TodoListShowService.showTodoList();
    }
}
