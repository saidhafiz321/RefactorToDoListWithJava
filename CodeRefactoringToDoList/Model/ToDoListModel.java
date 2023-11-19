// TodoListModel.java
package CodeRefactoringToDoList.Model;

public class ToDoListModel {
    public static String[] model = new String[10];

    public static void showTodoList() {
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void addTodoList(String todo) {
        // cek apakah model penuh?
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        // jika penuh, kita resize ukuran array 2x lipat
        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // tambahkan ke posisi yang data array nya NULL
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static boolean removeTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }
}
