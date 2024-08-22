package com.Game;
class EasyGameFactory extends AbstractFactory {
    @Override
    public Weapon createWeapon() {
        return new EasyWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new HealthPowerUp();
    }
}

