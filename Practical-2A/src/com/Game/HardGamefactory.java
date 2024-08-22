package com.Game;
class HardGameFactory extends AbstractFactory {
    @Override
    public Weapon createWeapon() {
        return new HardWeapon();
    }

    @Override
    public PowerUp createPowerUp() {
        return new SpeedPowerUp();
    }
}

