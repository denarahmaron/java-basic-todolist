public class TodolistApp {
    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        viewShowTodolist();
    }
    /**
     * Show Todolist
     */
    public static void showTodolist(){
        System.out.println("TODOLIST");
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

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var name = input("Name");
        System.out.println("Hi " + name);

        var age = input("Age");
        System.out.println("Your age is " + age);
    }


    /**
     * Show view todolist
     */
    public static void viewShowTodolist(){
        while(true){
            showTodolist();

            System.out.println("Menu : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");

            if(input.equals("1")){
                viewAddTodolist();
            }else if(input.equals("2")){
                viewRemoveTodolist();
            }else if(input.equals("x")){
                break;
            }else{
                System.out.println("Maaf pilihan tidak ada");
            }
        }
    }

    /**
     * Test Show view todolist
     */
    public static void testViewShowTodolist(){
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        addTodolist("Empat");
        addTodolist("Lima");
        viewShowTodolist();
    }

    /**
     * Show view add todolist
     */
    public static void viewAddTodolist(){
        System.out.println("Menambahkan Todolist");

        var todo = input("Todo (x jika batal)");

        if(todo.equals("x")){
            //batal
        }else{
            addTodolist(todo);
        }
    }

    /**
     * Test Show view add todolist
     */
    public static void testViewAddTodolist(){
        addTodolist("Satu");
        addTodolist("Dua");

        viewAddTodolist();
        showTodolist();
    }

    /**
     * Show view remove todolist
     */
    public static void viewRemoveTodolist(){
        System.out.println("Menghapus Todolist");

        var number = input("Nomor yang dihapus (x jika batal)");
        if(number.equals("x")){
            //Batal
        }else{
            boolean success = removeTodolist(Integer.valueOf(number));
            if(!success){
                System.out.println("Gagal menghapus todolist : " + number);
            }
        }
    }

    /**
     * Test Show view remove todolist
     */
    public static void testViewRemoveTodolist() {
        addTodolist("satu");
        addTodolist("dua");
        addTodolist("tiga");
        showTodolist();
        viewRemoveTodolist();
        showTodolist();
    }
}
