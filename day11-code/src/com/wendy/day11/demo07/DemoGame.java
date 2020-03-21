package com.wendy.day11.demo07;

/**
 * Author : wendy_wan
 * Created : 2020/3/17 17:01
 */
public class DemoGame {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");

/*        //使用单独定义地实现类
        //设置英雄技能
        hero.setSkill(new SkillImpl());
        */

/*        //还可以改成使用匿名内部类
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("SASASA");
            }
        };
        hero.setSkill(skill);*/

        //简化。同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biubiubiub");
            }
        });
        hero.attack();
    }
}
