package jp.ac.uryukyu.ie.e145741;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {

    public Hero(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    @Override
    public void attack(LivingThing opponent){
        if(!isDead()) {
            int damage = ((int) (Math.random() * getAttack()));
            if(damage > 0){
                if(randAttack(30)) {
                    damage *= 2;
                    System.out.printf("%sの攻撃！会心の一撃！！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
                    opponent.wounded(damage);
                }
                else{
                    System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\nR", getName(), opponent.getName(), damage);
                    opponent.wounded(damage);
                }
            }
            else
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getName(), opponent.getName());
        }
    }

}
