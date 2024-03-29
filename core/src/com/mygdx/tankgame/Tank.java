package com.mygdx.tankgame;

import com.badlogic.gdx.physics.box2d.Body;

import java.io.IOException;
import java.io.Serializable;

public class Tank extends GameObject {

    Tank(){
        tankTurret = new Turret();
        tankHp = 1;
    }
    private float tankHp;
    private String tankName;//final
    private int tankAngle;
    private float fuel = 1;
    Turret tankTurret;
    private boolean canMove = true;
    private Weapon[] weaponList;

    public float getTankHp() {
        return tankHp;
    }

    public void setTankHp(float tankHp) {
        this.tankHp = tankHp;
    }

    public String getTankName() {
        return tankName;
    }

    public void setTankName(String tankName) {
        this.tankName = tankName;
    }


    public int getTankAngle() {
        return tankAngle;
    }

    public void setTankAngle(int tankAngle) {
        this.tankAngle = tankAngle;
    }

    public float getFuel() {
        return fuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public Turret getTankTurret() {
        return tankTurret;
    }

    public void setTankTurret(Turret tankTurret) {
        this.tankTurret = tankTurret;
    }

    public boolean isCanMove() {
        return canMove;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    public Weapon[] getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(Weapon[] weaponList) {
        this.weaponList = weaponList;
    }

    public boolean isDead(){

        return false;
    }
    public class Turret implements Serializable {
        public float turretAngle = 0f;
        public Position position = new Position();
        public Position getPosition(){
            return this.position;
        }
        public void setPosition(Position p){
            this.position = p;
        }
        public void setTurretAngle(float angle){
            this.turretAngle = angle;
        }


        public float getTurretAngle() {
            return this.getTurretAngle();
        }

        public void IncreaseTurretAngle(Body tankTurretBody) {
            float total = tankTurretBody.getAngle();
            if (total < 1.9f) {
                total = total + 0.002f;
                tankTurretBody.setTransform(tankTurretBody.getPosition().x, tankTurretBody.getPosition().y, total);
            }
        }
        public void DecreaseTurretAngle(Body tankTurretBody) {
            float total = tankTurretBody.getAngle();
            if (total > 0f) {
                total = total - 0.002f;
                tankTurretBody.setTransform(tankTurretBody.getPosition().x, tankTurretBody.getPosition().y, total);
            }
        }
        public void IncreaseTurretAngle2(Body tankTurretBody) {
            float total = tankTurretBody.getAngle();
            if (total > -1.9f) {
                total = total - 0.002f;
                tankTurretBody.setTransform(tankTurretBody.getPosition().x, tankTurretBody.getPosition().y, total);
            }
        }
        public void DecreaseTurretAngle2(Body tankTurretBody) {
            float total = tankTurretBody.getAngle();
            if (total < 0.2f) {
                total = total + 0.002f;
                tankTurretBody.setTransform(tankTurretBody.getPosition().x, tankTurretBody.getPosition().y, total);
            }
        }


    }
}

