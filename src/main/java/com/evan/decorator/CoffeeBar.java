package com.evan.decorator;

/**
 * @Description
 * @ClassName CoffeeBar
 * @Author Evan
 * @date 2019.12.02 23:19
 */
public class CoffeeBar {
    public static void main(String[] args) {

        // 装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack

        // 1. 点一份 LongBlack
        Drink order = new LongBackCoffee();
        System.out.println("费用1=" + order.cost());
        System.out.println("描述=" + order.getDes());

        // 2. order 加入一份牛奶
        order = new Milk(order);

        System.out.println("order 加入一份牛奶 费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 描述 = " + order.getDes());

        // 3. order 加入一份巧克力

        order = new Chocolate(order);

        System.out.println("order 加入一份牛奶 加入一份巧克力  费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 加入一份巧克力 描述 = " + order.getDes());

        // 3. order 加入一份巧克力

        order = new Chocolate(order);

        System.out.println("order 加入一份牛奶 加入2份巧克力   费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 加入2份巧克力 描述 = " + order.getDes());

        System.out.println("===========================");

        Drink order2 = new BlackCoffee();

        System.out.println("order2 黑咖啡  费用 =" + order2.cost());
        System.out.println("order2 黑咖啡 描述 = " + order2.getDes());

        order2 = new Milk(order2);

        System.out.println("order2 黑咖啡 加入一份牛奶  费用 =" + order2.cost());
        System.out.println("order2 黑咖啡 加入一份牛奶 描述 = " + order2.getDes());


    }

}
