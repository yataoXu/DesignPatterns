package com.evan.observer;

/**
 * @Description Observer 抽象观察者，是观察者者的抽象类，它定义了一个更新接口，使得在得到主题更改通知时更新自己。
 * @ClassName Observer
 * @Author Evan
 * @date 2019.12.17 23:02
 */
public interface Observer {

    public void update(float temperature,float preference, float humidity);

}
