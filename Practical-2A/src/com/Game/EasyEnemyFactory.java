package com.Game;

public class EasyEnemyFactory extends EnemyFactory {

	@Override
	public Enemy createEnemy() {
		// TODO Auto-generated method stub
		return new EasyEnemy();
	}

}
