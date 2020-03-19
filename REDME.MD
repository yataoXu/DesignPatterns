## 设计模式复盘


#### 掌握设计模式的层次
1. 第1层:刚开始学编程不久,听说过什么是设计模式
2. 第2层:有很长时间的编程经验,自己写了很多代码,其中用到了设计模式,但是自己却不知道
3. 第3层:学习过了设计模式,发现自己已经在使用了,并且发现了一些新的模式挺好用的
4. 第4层:**阅读了很多别人写的源码和框架,在其中看到别人设计模式,并且能够领会设计模式的精妙和带来的好处**。
5. 第5层：代码写着写着,自己都没有意识到使了设计模式,并且熟练的写了出来


#### 设计模式概述
是对软件设计中普遍存在(反复出现)的各种问题,所提出的解决方案。

#### 学习设计模式目的
编写软件过程中，程序员面临着来自耦合性，内聚性以及可维护性，可扩展性，重用性，灵活性等多方面的挑战，
设计模式是为了让软件具有更好的
1. 代码重用性(即:相同功能的代码,不用多次编写)
2. 可读性(即:编程规范性,便于其他程序员的阅读和理解)
3. 可扩展性(即: 当需要增加新的功能时,非常的方便,称为可维护)
4. 可靠性(即:当我们增加新的功能后,对原来的功能没有影响)
5. 使程序呈现高内聚,低耦合的特性

##设计模式7大原则
1. 单一职责原则
2. 接口隔离原则
3. 依赖倒转原则
4. 里氏替换原则
5. 开闭原则
6. 迪米特法则
7. 合成复用原则


####  单一职责原则
对类来说的，即一个类应该只负责一项职责。如果类A负责两个不同的职责：职责1，职责2。当职责1需求变更而改变A时。可能造成职责2执行错误，所以需要将类的粒度分解为A1，A2。

单一职责原则的注意事项和细节
1. 降低类的复杂度，一个类只负责一项职责
2. 提高类的可读性，可维护性
3. 降低变更引起的风险
4. 通常情况下，我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级别违反单一职责原则；只有类中方法数量足够少，可以在方法级别保持单一职责原则
 
 
 #### 接口隔离原则
 客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上
 
 ![image](https://mmbiz.qpic.cn/mmbiz_png/vb4xFWPs1FjJzqM54mqBHAPWyQoU4saITlNpZDMg8q35Ig0icoIUiaibNcpQ2YHtNAu5Cj6Pb99TJO9o4H79axSsg/0?wx_fmt=png)
 
 ```
 public class Segregation1 {
 
     public static void main(String[] args) {
 
         A a = new A();
         a.dependency1(new B());
         a.dependency2(new B());
         a.dependency3(new B());
         C c = new C();
         c.dependency1(new D());
         c.dependency4(new D());
         c.dependency5(new D());
 
     }
 
 }
 
 interface Interface1 {
     void operation1();
 
     void operation2();
 
     void operation3();
 
     void operation4();
 
     void operation5();
 }
 
 class B implements Interface1 {
     @Override
     public void operation1() {
         System.out.println("B 实现了 operation1");
     }
 
     @Override
     public void operation2() {
         System.out.println("B 实现了 operation2");
     }
 
     @Override
     public void operation3() {
         System.out.println("B 实现了 operation3");
     }
 
     @Override
     public void operation4() {
         System.out.println("B 实现了 operation4");
     }
 
     @Override
     public void operation5() {
         System.out.println("B 实现了 operation5");
     }
 }
 
 
 class D implements Interface1 {
     @Override
     public void operation1() {
         System.out.println("D 实现了 operation1");
     }
 
     @Override
     public void operation2() {
         System.out.println("D 实现了 operation2");
     }
 
     @Override
     public void operation3() {
         System.out.println("D 实现了 operation3");
     }
 
     @Override
     public void operation4() {
         System.out.println("D 实现了 operation4");
     }
 
     @Override
     public void operation5() {
         System.out.println("D 实现了 operation5");
     }
 }
 
 class A {
     public void dependency1(Interface1 i) {
         i.operation1();
     }
 
     public void dependency2(Interface1 i) {
         i.operation2();
     }
 
     public void dependency3(Interface1 i) {
         i.operation3();
     }
 }
 
 
 class C {
     public void dependency1(Interface1 i) {
         i.operation1();
     }
 
     public void dependency4(Interface1 i) {
         i.operation4();
     }
 
     public void dependency5(Interface1 i) {
         i.operation5();
     }
 }
 ```
 
 ```
 B 实现了 operation1
 B 实现了 operation2
 B 实现了 operation3
 D 实现了 operation1
 D 实现了 operation4
 D 实现了 operation5
 ```
 应该这个样子
 
 ![image](https://mmbiz.qpic.cn/mmbiz_png/vb4xFWPs1FjJzqM54mqBHAPWyQoU4saIhO2hLk0LB9SYcoeFnYsJSULtvIhsw9kicX3iaq5o7pE7utcSBLrO87jA/0?wx_fmt=png)
 
 ```
 package com.evan.segregation;
 
 /**
  * @Description
  * @ClassName Segregation1
  * @Author Evan
  * @date 2019.11.25 22:56
  */
 public class Segregation2 {
 
     public static void main(String[] args) {
 
         A a = new A();
         a.dependency1(new B());
         a.dependency2(new B());
         a.dependency3(new B());
         C c = new C();
         c.dependency1(new D());
         c.dependency4(new D());
         c.dependency5(new D());
 
     }
 
 }
 
 interface Interface1 {
     void operation1();
 
 }
 
 interface Interface2 {
     void operation2();
 
     void operation3();
 
 }
 
 interface Interface3 {
     void operation4();
 
     void operation5();
 }
 
 class B implements Interface1, Interface2 {
     @Override
     public void operation1() {
         System.out.println("B 实现了 operation1");
     }
 
     @Override
     public void operation2() {
         System.out.println("B 实现了 operation2");
     }
 
     @Override
     public void operation3() {
         System.out.println("B 实现了 operation3");
     }
 }
 
 
 class D implements Interface1, Interface3 {
     @Override
     public void operation1() {
         System.out.println("D 实现了 operation1");
     }
 
     @Override
     public void operation4() {
         System.out.println("D 实现了 operation4");
     }
 
     @Override
     public void operation5() {
         System.out.println("D 实现了 operation5");
     }
 }
 
 class A {
     public void dependency1(Interface1 i) {
         i.operation1();
     }
 
     public void dependency2(Interface2 i) {
         i.operation2();
     }
 
     public void dependency3(Interface2 i) {
         i.operation3();
     }
 }
 
 
 class C {
     public void dependency1(Interface1 i) {
         i.operation1();
     }
 
     public void dependency4(Interface3 i) {
         i.operation4();
     }
 
     public void dependency5(Interface3 i) {
         i.operation5();
     }
 }
 ```
 
#### 依赖倒转原则

依赖倒转原则(Dependence Inversion Principle)是指:

1. 高层模块不应该依赖低层模块,二者都应该依赖其抽象
2. 抽象不应该依赖细节
3. 细节应该依赖抽象
4. 依赖倒转(倒置)的中心思想是面向接口编程
5. 依赖倒转原则是基于这样的设计理念:**相对于细节的多变性,抽象的东西要稳定的多** 。以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在java中,抽象指的是接口或抽象类,细节就是具体的实现类
6. 使用接口或抽象类的目的是制定好规范,而不涉及任何具体的操作,把展现细节的任务交给他们的实现类去完成
7. 采用依赖倒置原则可以减少类间的耦合性，降低并行开发引起的风险，提高代码的可读性和可维护性。


##### 完成Person接受消息的功能
```
public class DependecyInversion1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件: hello world";
    }
}
// 完成Person接收消息的功能

class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}

```

 public void receive(Email email) 如果我们获取的对象时微信，短信等，则需要增加类，同事Person也要增加相应接收的方法
 
改进方法
引入一个抽象的接口IReceiver,表示接受者，这样Person与接口IReceiver发生依赖。

```
public class DependecyInversion2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());

        person.receive(new Wechat());
    }
}

 interface IRecever {
    String getInfo();
}

class Email implements IRecever{
    public String getInfo() {
        return "电子邮件: hello world";
    }
}

class Wechat implements IRecever{
    public String getInfo() {
        return "Wechat: hello world";
    }
}
// 完成Person接收消息的功能
class Person {
    public void receive(IRecever receiver) {
        System.out.println(receiver.getInfo());
    }
}

```

##### 依赖关系传递的三种方式和应用案例
1. 接口传递
2. 构造方法传递
3. setter方式传递



###### 接口传递
![](images/DIP-2.jpg)
```
package com.evan.inversion;

public interface ICar {

    default void run() {
        System.out.println("老子是车，肯定会跑呀");
    }

    void name();
}


package com.evan.inversion;

public interface IDriver {

    void driver(ICar car);
}


package com.evan.inversion;

public class Client {

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.driver(new Benz());
        System.out.println("-----------");
        driver.driver(new WuLin());
    }
}

```




###### 构造方法传递
```
package com.evan.mysqltest;

public class DepencyMain {
    public static void main(String[] args) {
        MITV mi = new MITV();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(mi);
    }
}


class MITV implements ITV{

    @Override
    public void play() {
        System.out.println("打开了小米电视机");
    }
}

// 通过接口传递依赖
interface IOpenAndClose{
    public void open(ITV itv);
}

interface ITV{
    public void play();
}

class OpenAndClose implements IOpenAndClose{
    @Override
    public void open(ITV itv) {
        itv.play();
    }
}
```

```
package com.evan.mysqltest;

public class DepencyMain {
    public static void main(String[] args) {
        MITV mi = new MITV();
        OpenAndClose openAndClose = new OpenAndClose(mi);
        openAndClose.open();
    }
}


class MITV implements ITV{

    @Override
    public void play() {
        System.out.println("打开了小米电视机");
    }
}

// 通过构造方法实现依赖
interface IOpenAndClose {
    public void open();
}

interface ITV {
    public void play();
}

class OpenAndClose implements IOpenAndClose {

    public ITV itv;

    public OpenAndClose(ITV itv) {
        this.itv = itv;
    }

    @Override
    public void open() {
      this.itv.play();
    }
}
```


###### setter方式传递
```
package com.evan.mysqltest;

public class DepencyMain {
    public static void main(String[] args) {
        MITV mi = new MITV();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setItv(mi);
        openAndClose.open();
    }
}


class MITV implements ITV {

    @Override
    public void play() {
        System.out.println("打开了小米电视机");
    }
}

// 通过setter方法
interface IOpenAndClose {
    public void open();
}

interface ITV {
    public void play();
}

class OpenAndClose implements IOpenAndClose {

    public ITV itv;

    public void setItv(ITV itv) {
        this.itv = itv;
    }

    @Override
    public void open() {
        this.itv.play();
    }
}


```



##### 依赖倒转原则的注意事项
1. 低层模块尽量都要有抽象类或者接口，或者两者都有，程序稳定性更好
2. 变量的声明类型尽量是抽象类或接口，这样我们的变量引用和实际对象间，就存在一个缓冲层，利于程序扩展和优化
3. 继承时遵守里氏替换原则



##### 依赖倒转原则 深入理解
依赖倒置原则的本质就是通过抽象(抽象类或接口)使各个类或模块实现彼此独立，不互相影响，实现模块间的松耦合。在项目中使用这个规则需要以下原则;

1. **每个类尽量都要有接口或抽象类，或者抽象类和接口都有： 依赖倒置原则的基本要求，有抽象才能依赖倒置**
2. 变量的表面类型尽量是接口或者抽象类
3. 任何类都不应该从具体类派生
4. 尽量不要重写基类已经写好的方法(里式替换原则)
5. 结合里式替换原则来使用： 结合里式替换原则和依赖倒置原则我们可以得出一个通俗的规则，接口负责定义public属性和方法，并且声明与其他对象的依赖关系，抽象类负责公共构造部分的实现，实现类准确的实现业务逻辑，
同时在适当的时候对父类进行细化。

**一句话：依赖倒置原则的核心就是面向抽象(抽象类或者接口)编程**


#### 里氏替换原则


###### 说说继承
继承是面向对象三大特性之一，是一种非常优秀的语言机制，它有如下有点：
- 代码共享，减少创建类的工作量，每个子类都拥有父类的方法和属性
- 提高代码的重用性
- 子类可以形似父类
- 提高代码的可扩展性
- 提高产品或项目的开放性

继承有它的优点，但是也有一些致命的缺点：

- 继承具有侵入性，只要子类继承了父类，那么子类必须拥有父类的所有属性和方法
- 降低了代码的灵活性
- 增强了耦合性。当父类中发生方法，属性的修改时需要考虑子类是否修改，而且在缺乏规范的情况下，还可能发生大段的代码重构

正如前面所说，继承是面向对象非常优良的特性，使用继承有利也有弊，如何将继承的利最大化，弊最小化呢(这就是为什么说在开发时多用组合，少用继承)，解决方案就是引入里式替换原则。




###### OO中的继承性的思考
1. 继承包换这样一层含义：父类中凡是已经实现好的方法，实际上是在设定规范和契约,虽然它不强制要求所有的子类必须遵守这些契的,但是如果子类对这些已经实现的方法任意修改,就会对整个维承体系造成破坏。
2. 维承在给程序设计带来便利的同时,也带来了弊端,比如使用继承会给程序带来侵入性,程序的可移植性降低,增加对象间的耦合性,如果一个类被其他的类所继承，
则当这个类需要修改时,必须考虑到所有的子类,并且父类修改后,所有涉及到子类的功能都有可能产生故障
3. 问题提出:在编程中,如何正确的使用继承?=>里氏替换原则

##### 什么是里式替换原则(LiskovSubstitution Principle， LSP)

子类型必须能替换掉它们的基类型

理解：通俗来说就是：只要父类出现的地方子类就可以出现，而且提换为子类也不会出现任何的错误和异常。但是反过来是不行的，有子类出现的地方，父类未必能替换。


1. 在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类的方法
2. 里氏替换原则告诉我们，继承实际上让两个类耦合性增强了，在适当的情况下，可以通过聚合，组合，依赖来解决问题。


```
public class Liskov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println("11-3=" + a.func1(11, 3));
		System.out.println("1-8=" + a.func1(1, 8));

		System.out.println("-----------------------");
		B b = new B();
		System.out.println("11-3=" + b.func1(11, 3));//这里本意是求出11-3
		System.out.println("1-8=" + b.func1(1, 8));// 1-8
		System.out.println("11+3+9=" + b.func2(11, 3));
	}
}

// A类
class A {
	// 返回两个数的差
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}

// B类继承了A
// 增加了一个新功能：完成两个数相加,然后和9求和
class B extends A {
	//这里，重写了A类的方法, 可能是无意识
	public int func1(int a, int b) {
		return a + b;
	}

	public int func2(int a, int b) {
		return func1(a, b) + 9;
	}
}

```
##### 解决方法
1. 我们发现原来运行正常的相减功能发生了错误，原因就是类B无意中重写了父类A的方法，造成原有的功能出现错误。在实际编程中，我们常常会通过重写父类中的方法完成新的功能，
这样写起来虽然简单，但整个继承体系的复用性会比较差。特别是运行多态比较频繁的时候
2. 通用的做法是：原来的父类和子类都继承一个更简约的基类，原有的继承关系去掉，采用聚合，组合，依赖等关系替代
```
public class Liskov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println("11-3=" + a.func1(11, 3));
		System.out.println("1-8=" + a.func1(1, 8));

		System.out.println("-----------------------");
		B b = new B();
		//因为B类不再继承A类，因此调用者，不会再func1是求减法
		//调用完成的功能就会很明确
		System.out.println("11+3=" + b.func1(11, 3));//这里本意是求出11+3
		System.out.println("1+8=" + b.func1(1, 8));// 1+8
		System.out.println("11+3+9=" + b.func2(11, 3));
		
		
		//使用组合仍然可以使用到A类相关方法
		System.out.println("11-3=" + b.func3(11, 3));// 这里本意是求出11-3
		

	}

}

//创建一个更加基础的基类
class Base {
	//把更加基础的方法和成员写到Base类
}

// A类
class A extends Base {
	// 返回两个数的差
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}

// B类继承了A
// 增加了一个新功能：完成两个数相加,然后和9求和
class B extends Base {
	//如果B需要使用A类的方法,使用组合关系
	private A a = new A();
	
	//这里，重写了A类的方法, 可能是无意识
	public int func1(int a, int b) {
		return a + b;
	}

	public int func2(int a, int b) {
		return func1(a, b) + 9;
	}
	
	//我们仍然想使用A的方法
	public int func3(int a, int b) {
		return this.a.func1(a, b);
	}
}

```

###### LSP的深层含义

里式替换原则为良好的继承定义了一个规范，它包含四个深层含义：
1.子类必须完全实现父类的方法, 但不能覆盖(重写)父类的非抽象方法
2. 子类可以增加自己特有的方法
3. 当子类的方法重载父类的方法时，子类方法的前置条件（即方法的形参）要比父类方法的输入参数更宽松
```
package com.evan.lsp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

abstract class Father {
    public Collection doSomething(HashMap map) {
        System.out.println("父类被执行...");
        return map.values();
    }
}

public class Son extends Father {
    // 放大输入参数类型
    public Collection doSomething(Map map) {
        System.out.println("子类被执行...");
        return map.values();
    }

}

class Test {

    public static void invoker() {
        // 父类存在的地方，子类就应该能够存在
        // Father f = new Father();
        Son son = new Son();
        HashMap map = new HashMap();
        son.doSomething(map);
    }

    public static void main(String[] args) {
        invoker();
    }

}

两个输出结果都是：父类被执行...
```

>  解释如下：在上面的例子中，子类中的doSomething(Map map)和父类中的doSomething(HashMap map)两个方法构成重载(并不是重写，因为参数列表不同，子类继承父类那么相应的父类方法就存在于子类的生命周期中，所以构成重载)，而子类方法的形参范围比父类方法的形参范围要大。其实我们可以想一想，子类方法的形参范围比父类方法的形参范围要大，则子类代替父类传递参数到调用者中，子类的方法将永远不会被执行，这其实和里式交换原则是想符合的，父类的空间必须是子类的子区间，那么子类才能替换父类。而假如父类方法的形参范围大于子类方法的形参范围，子类方法在没有重写父类方法的前提下被执行了，这会引起业务逻辑的混乱，因为在实际应用中父类一般是抽象类，子类是实现类，你传递了一个这样的实现类就会“歪曲”父类的意图，引起一堆意想不到的逻辑混乱，所以子类中方法的前置条件必须与超类中被覆写的方法的前置条相同或更宽松

4. 当子类的方法实现父类的抽象方法时，方法的后置条件（即方法的返回值）要比父类更加严格： 如父类要求返回List，那么子类就应该返回List的实现ArrayList，父类是采用泛型，那么子类则不能采用泛型，而是具体的返回。

#### 开闭原则
 1. 开闭原则（Open Closed Principle） 是编程中最基础，最重要的原则
 2. 一个软件实体如类，模块和函数应该对扩展开放（对提供方），对修改关闭（d对使用者）。用抽象构建框架，用实现扩展细节。
 3. 当软件需要变化时，尽量通过扩展软件实体的行为方法来实现变化，而不是通过修改已有的代码来实现变化
 4. 编程中遵循其他原则，以及使用设计模式的目的就是遵循开闭原则
 



```
public class Ocp {

	public static void main(String[] args) {
		//使用看看存在的问题
		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.drawShape(new Rectangle());
		graphicEditor.drawShape(new Circle());
		graphicEditor.drawShape(new Triangle());
	}

}

//这是一个用于绘图的类 [使用方]
class GraphicEditor {
	//接收Shape对象，然后根据type，来绘制不同的图形
	public void drawShape(Shape s) {
		if (s.m_type == 1)
			drawRectangle(s);
		else if (s.m_type == 2)
			drawCircle(s);
		else if (s.m_type == 3)
			drawTriangle(s);
	}

	//绘制矩形
	public void drawRectangle(Shape r) {
		System.out.println(" 绘制矩形 ");
	}

	//绘制圆形
	public void drawCircle(Shape r) {
		System.out.println(" 绘制圆形 ");
	}
	
	//绘制三角形
	public void drawTriangle(Shape r) {
		System.out.println(" 绘制三角形 ");
	}
}

//Shape类，基类
class Shape {
	int m_type;
}

class Rectangle extends Shape {
	Rectangle() {
		super.m_type = 1;
	}
}

class Circle extends Shape {
	Circle() {
		super.m_type = 2;
	}
}

//新增画三角形
class Triangle extends Shape {
	Triangle() {
		super.m_type = 3;
	}
}

```
##### 优缺点：
1. 代码简单，好理解
2. 违反了开闭原则，即对扩展开放，对修改关闭
3. 比如我们这里要新增一个三角形，我们需要修改很多地方

改进后


```
public class Ocp {

	public static void main(String[] args) {
		//使用看看存在的问题
		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.drawShape(new Rectangle());
		graphicEditor.drawShape(new Circle());
		graphicEditor.drawShape(new Triangle());
		graphicEditor.drawShape(new OtherGraphic());
	}

}

//这是一个用于绘图的类 [使用方]
class GraphicEditor {
	//接收Shape对象，调用draw方法
	public void drawShape(Shape s) {
		s.draw();
	}

	
}

//Shape类，基类
abstract class Shape {
	int m_type;
	
	public abstract void draw();//抽象方法
}

class Rectangle extends Shape {
	Rectangle() {
		super.m_type = 1;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(" 绘制矩形 ");
	}
}

class Circle extends Shape {
	Circle() {
		super.m_type = 2;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(" 绘制圆形 ");
	}
}

//新增画三角形
class Triangle extends Shape {
	Triangle() {
		super.m_type = 3;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(" 绘制三角形 ");
	}
}

//新增一个图形
class OtherGraphic extends Shape {
	OtherGraphic() {
		super.m_type = 4;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(" 绘制其它图形 ");
	}
}

```

#### 迪米特法则
1. 一个对象应该对其他对象保持最少的了解
2. 类与类关系越密切,耦合度越大
3. 迪米特法则(Demeter Principle)又叫最少知道原则,即一个类对自己依赖的类知道的
越少越好。也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内
部。对外除了提供的public方法,不对外泄露任何信息
4. 迪米特法则还有个更简单的定义:只与直接的朋友通信

5. 直接的朋友:每个对象都会与其他对象有耦合关系,只要两个对象之间有耦合关系,
我们就说这两个对象之间是朋友关系。耦合的方式很多,依赖,关联,组合,聚合
等。其中,我们称出现成员变量,方法参数,方法返回值中的类为直接的朋友,而
出现在局部变量中的类不是直接的朋友。也就是说,陌生的类最好不要以局部变量
的形式出现在类的内部。


##### 实例
有一个餐厅，由店面和总部构成。现在需要打印出总部员工ID和各个店面中员工ID

```
// 客户端
public class Demeter1 {

    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.println(new StoreEmployeeeManager());
    }


}

// 总部
class Employee {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

// 店面员工
class StoreEmployee {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

// 店面员工管理类
class StoreEmployeeeManager {
    public List<StoreEmployee> getAllStoreEmployees() {
        List<StoreEmployee> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            StoreEmployee storeEmployee = new StoreEmployee();
            storeEmployee.setId(i);
            list.add(storeEmployee);
        }
        return list;
    }
}

// 总部员工管理类
class EmployeeManager {
    public List<Employee> getAlLEmployees() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Employee employee = new Employee();
            employee.setId(i);
            list.add(employee);
        }
        return list;
    }

    void println(StoreEmployeeeManager storeEmployeeeManager){

        // 总部员工

        List<Employee> alLEmployees = this.getAlLEmployees();

        System.out.println("==============总部员工===============");
        for (int i = 0; i < alLEmployees.size(); i++) {
            System.out.println(alLEmployees.get(i).getId());
        }

        List<StoreEmployee> allStoreEmployees = storeEmployeeeManager.getAllStoreEmployees();
        System.out.println("==============店面员工===============");
        for (int i = 0; i < allStoreEmployees.size(); i++) {
            System.out.println(allStoreEmployees.get(i).getId());
        }
    }
}
```

- 直接朋友：StoreEmployeeeManager 
- 陌生类：StoreEmployee

```

// 店面员工管理类
class StoreEmployeeeManager {
    public List<StoreEmployee> getAllStoreEmployees() {
        List<StoreEmployee> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            StoreEmployee storeEmployee = new StoreEmployee();
            storeEmployee.setId(i);
            list.add(storeEmployee);
        }
        return list;
    }

    public void print() {

        List<StoreEmployee> allStoreEmployees = this.getAllStoreEmployees();
        System.out.println("==============店面员工===============");
        for (int i = 0; i < allStoreEmployees.size(); i++) {
            System.out.println(allStoreEmployees.get(i).getId());
        }

    }
}

// 总部员工管理类
class EmployeeManager {
    public List<Employee> getAlLEmployees() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Employee employee = new Employee();
            employee.setId(i);
            list.add(employee);
        }
        return list;
    }

    void println(StoreEmployeeeManager storeEmployeeeManager) {

        // 总部员工
        List<Employee> alLEmployees = this.getAlLEmployees();

        System.out.println("==============总部员工===============");
        for (int i = 0; i < alLEmployees.size(); i++) {
            System.out.println(alLEmployees.get(i).getId());
        }

        storeEmployeeeManager.print();
    }

```
##### 迪米特法则注意事项
1. 迪米特法则的核心是降低类之间的耦合度
2. 但是 注意：由于每个类都减少了不必要的依赖，因此迪米特法则只是要求降低类之间（对象间）耦合关系，并不是要求完全没有依赖关系。


#### 合成复用原则（composite reuse principle）

原则是尽量使用合成/聚合的方式，而不是使用继承


举个例子

若B类用到A类中的方法，不要使用B extends A 而是使用
1. @autowired
2. 把A类写成B的成员属性
3. 在B类中new A

### 设计原则的核心思想
1. 找出应用中可能需要变化之处，把他们独立出来，不要和那些不需要变化的代码混合在一起
2. 针对接口编程，而不是针对实现编程
3. 为了交互对象之间的低耦合设计而努力
