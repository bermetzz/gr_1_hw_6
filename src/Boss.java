public class Boss extends GameEntity{
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "boss health: "+getHealth()+" boss damage: "+getDamage()+
                " boss weapon: "+ getWeapon().getWeaponName()+", "+ getWeapon().getWeaponType();
    }
}
