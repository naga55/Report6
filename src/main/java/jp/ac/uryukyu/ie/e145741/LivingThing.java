package jp.ac.uryukyu.ie.e145741;
import java.util.Random;
/**
 * Created by e145741 on 2016/11/28.
 */
public class LivingThing {

    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    private Random ran = new Random();

    public LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead(){
        return dead;
    }

    public String getName(){
        return name;
    }


    public void attack(LivingThing opponent){
        if (hitPoint > 0){
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name,opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    public boolean randAttack(int odds){
        int rand;
        rand = ran.nextInt(100);
        if(rand < odds)
            return true;

        return false;
    }


    public boolean getIsDead() {
        return this.dead = dead;
    }

    public void setIsDead(boolean dead){
        this.dead = dead;
    }

    public int gethitPoint(){
        return this.hitPoint = hitPoint;
    }

    public void sethitPoint(){
        this.hitPoint = hitPoint;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }


}
