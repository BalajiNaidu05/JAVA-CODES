package com.Game;
public class Game {
    public static void main(String[] args) {
        GameState gameState = GameState.getInstance();

        // Set difficulty
        gameState.setDifficulty("Hard");

        // Create factories based on difficulty
        AbstractFactory factory;
        EnemyFactory enemyFactory;
        if (gameState.getDifficulty().equals("Easy")) {
            factory = new EasyGameFactory();
            enemyFactory = new EasyEnemyFactory();
        } else {
            factory = new HardGameFactory();
            enemyFactory = new HardEnemyFactory();
        }

        // Create and use objects
        Enemy enemy = enemyFactory.createEnemy();
        Weapon weapon = factory.createWeapon();
        PowerUp powerUp = factory.createPowerUp();

        // Simulate game
        System.out.println("Level: " + gameState.getCurrentLevel());
        enemy.attack();
        weapon.use();
        powerUp.activate();

        // Advance to next level
        gameState.nextLevel();
        System.out.println("Advanced to Level: " + gameState.getCurrentLevel());
    }
}

