package ru.gb.chat.server;

import ru.gb.chat.server.service.impl.inMemoryUserServiceImpl;

public class App {
    public static void main(String[] args) {
        new Server(new inMemoryUserServiceImpl()).start();
    }
}
