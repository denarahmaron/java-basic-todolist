public class TodolistApp {
    public static String[] model = new String[10];
    public static void main(String[] args) {
        testAddTodolist();
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

    public static void removeTodolist(){

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
