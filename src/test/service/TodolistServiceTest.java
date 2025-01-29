package test.service;

import entity.Todolist;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;

public class TodolistServiceTest {
    public static void main(String[] args) {
        testRemoveTodolist();
    }

    public static void testShowTodolist(){
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
        todolistRepository.data[0] = new Todolist("Belajar Java");
        todolistRepository.data[1] = new Todolist("Belajar JS");
        todolistRepository.data[2] = new Todolist("Belajar OOP");

        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        todolistService.showTodolist();
    }

    public static void testAddTodolist(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.addTodolist("Belajar JAVA");
        todolistService.addTodolist("Belajar JS");
        todolistService.addTodolist("Belajar OOP");

        todolistService.showTodolist();
    }

    public static void testRemoveTodolist(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.addTodolist("Belajar JAVA");
        todolistService.addTodolist("Belajar JS");
        todolistService.addTodolist("Belajar OOP");

        todolistService.showTodolist();

        todolistService.removeTodolist(2);

        todolistService.showTodolist();
    }
}
