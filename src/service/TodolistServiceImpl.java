package service;

import entity.Todolist;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;

public class TodolistServiceImpl implements TodolistService {

    private TodolistRepository todolistRepository;

    public TodolistServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showTodolist() {
        Todolist[] model = todolistRepository.getAll();

        System.out.println("TODOLIST");
        for (var i = 0; i < model.length ; i++) {
            var todo = model[i];
            var no = i + 1;

            if(todo != null){
                System.out.println(no + ". " + todo.getTodo());
            }
        }
    }

    @Override
    public void addTodolist(String todo) {
        Todolist todolist = new Todolist(todo);
        todolistRepository.add(todolist);
        System.out.println("Success add todo : " + todo);
    }

    @Override
    public void removeTodolist(Integer number) {
        boolean success = todolistRepository.remove(number);
        if(success){
            System.out.println("Success remove number : " + number);
        } else {
            System.out.println("Failed remove number : " + number);
        }
    }
}
