public class Main {

    public static void main(String[] args) {
        Boss boss=new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        Weapon bossW =new Weapon();
        bossW.setWeaponType(WeaponType.HOT);
        bossW.setWeaponName("Gun");
        boss.setWeapon(bossW);
        System.out.println("boss health: "+boss.getHealth()+" boss damage: "+boss.getDamage()+
                " boss weapon: "+ boss.getWeapon().getWeaponName()+", "+boss.getWeapon().getWeaponType());

// 2
        System.out.println(boss.printInfo());
        Skeleton skeleton=new Skeleton();
        skeleton.setNumberOfArrows(12);
        skeleton.setDamage(30);
        skeleton.setHealth(230);
        Weapon skeletonW=new Weapon();
        skeletonW.setWeaponType(WeaponType.MAGICAL);
        skeletonW.setWeaponName("Magical arrow");
        skeleton.setWeapon(skeletonW);
        System.out.println(skeleton.printInfo());
        Skeleton skeleton1=new Skeleton();
        skeleton1.setNumberOfArrows(9);
        skeleton1.setDamage(50);
        skeleton1.setHealth(240);
        Weapon skeletonW1=new Weapon();
        skeletonW1.setWeaponType(WeaponType.COLD);
        skeletonW1.setWeaponName("Arrow");
        skeleton1.setWeapon(skeletonW1);
        System.out.println(skeleton1.printInfo());

    }
}
