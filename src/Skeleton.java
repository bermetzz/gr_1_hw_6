public class Skeleton extends Boss{
    private int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    @Override
    public String printInfo() {
        return "skeleton's health: "+getHealth()+" skeleton's damage: "+getDamage()+
                " skeleton's weapon: "+ getWeapon().getWeaponName()+", "+ getWeapon().getWeaponType();
    }
}
