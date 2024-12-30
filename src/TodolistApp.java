public class TodolistApp {
    public static String[] model = new String[10];
    public static void main(String[] args) {
        testRemoveTodolist();
    }
    /**
     * Show Todolist
     */
    public static void showTodolist(){
        for (var i = 0; i < model.length ; i++) {
            var todo = model[i];
            var no = i + 1;

            if(todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    /**
     * Testing show todolist
     */
    public static void testShowTodolist(){
        model[0] = "Belajar Java";
        model[1] = "Belajar Spring";
        model[2] = "Belajar Maven";
        showTodolist();
    }

    /**
     * Add Todolist
     */
    public static void addTodolist(String todo){
        // Check is model full?
        var isFull = true;
        for (var i = 0; i < model.length; i++) {
            if(model[i] == null){
                isFull = false;
                break;
            }
        }

        // If isFull true, resize array to 2x
        if(isFull){
            var temp = model;
            model = new String[model.length * 2];

            for (var i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // Add todolist
        for (var i = 0; i < model.length ; i++) {
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }
    /**
     * Testing add todolist
     */
    public static void testAddTodolist(){
        for (var i = 0; i < 25 ; i++) {
            addTodolist("Todo ke - " + i);
        }
        showTodolist();
    }

    /**
     * Remove Todolist
     */

    public static boolean removeTodolist(Integer number){
        if((number - 1) >= model.length){
            return false;
        } else if(model[number - 1] == null){
            return false;
        } else {
           for(var i = (number - 1);i < model.length;i++){
              if(i == (model.length - 1)){
                  model[i] = null;
              } else {
                  model[i] = model[i + 1];
              }
            }
            return true;
        }
    }

    /**
     * Testing remove todolist
     */
    public static void testRemoveTodolist(){
        addTodolist("satu");
        addTodolist("dua");
        addTodolist("tiga");
        showTodolist();

        var result = removeTodolist(20);
        System.out.println(result);

        result = removeTodolist(4);
        System.out.println(result);

        result = removeTodolist(2);
        System.out.println(result);

        showTodolist();
    }


    /**
     * Show view todolist
     */
    public static void viewShowTodolist(){

    }

    /**
     * Show view add todolist
     */
    public static void viewAddTodolist(){

    }

    /**
     * Show view remove todolist
     */
    public static void viewRemoveTodolist(){

    }
}
