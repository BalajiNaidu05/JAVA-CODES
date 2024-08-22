package com.Game;
public class GameState {
    private static GameState instance;
    private int currentLevel;
    private String difficulty;

    private GameState() {
        this.currentLevel = 1;
        this.difficulty = "Normal";
    }

    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void nextLevel() {
        currentLevel++;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }
}

