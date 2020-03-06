package mx.iteso.marioKart.characters;

import mx.iteso.marioKart.abstracts.Character;

public class Mario extends Character {
    private final int idCharacter = 1;
    private final int speedMax = 8;
    private final int acceleration = 5;
    private final int balance = 5;
    private final int weight = 5;
    private boolean moving = false;

    public void setCurrentAcceleration(int iCurrentAcceleration) {
        this.currentAcceleration = iCurrentAcceleration;
    }

    public void setCharacterSelector() {
        this.characterSelector = idCharacter;
    }

    public void speedUp() {
        if(moving){
            for (int i=0;i<this.speedMax;i++){
                if(this.item.isActiveItem()){
                    for(int j=0;j<this.item.getTimeEfectItem();j++){
                        this.setCurrentAcceleration(this.getCurrentAcceleration()+this.item.getEfectAccelerationItem());
                    }
                }
                this.setCurrentAcceleration(this.getCurrentAcceleration()+i);
            }
        }else{
            this.setCurrentAcceleration(0);
        }
    }

    public void setStarMove(boolean isMoving) {
        this.moving = isMoving;
    }
}
