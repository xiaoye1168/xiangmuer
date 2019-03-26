package zrr;
//1.首先，创造动物类：
//动物类
class Animal {
 int age;
 String name;

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 // 动物类里面有叫和吃两个方法
 public void cry() {
     System.out.println("我不知道叫什么");
 }

 public void eat() {
     System.out.println("我不知道吃什么");
 }
}
//2.其次，分别创造猫类和狗类（他们继承于动物类）：

//狗类继承于动物类
class Dog extends Animal {
 // 覆盖（重写）方法
 public void cry() {
     System.out.println("旺旺");
 }

 public void eat() {
     System.out.println("我是狗，我爱吃骨头");
 }
}

//猫类继承于动物类
class Cat extends Animal {
 // 覆盖（重写）方法
 public void cry() {
     System.out.println("喵喵");
 }

 public void eat() {
     System.out.println("我是猫，我爱吃鱼");
 }
}
//3.再者，创建食物类：
//食物类
class Food {

 String name;

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 // 食物类里面让它有一个方法
 public void showName() {

 }
}

//4.再者，猫和狗都有自己不同的爱吃的食物（他们继承于食物类）：

//鱼（食物的一种）继承于食物
class Fish extends Food {
 public void showName() {
     System.out.println("食物：鱼");
 }
}

//骨头（食物的一种）继承于食物
class Bone extends Food {
 public void showName() {
     System.out.println("食物：骨头");
 }
}
//5.主人类（就可以将动物和对应的食物统一起来）：

//主人类 存在一喂食食方法
class Master {
 // 给动物喂食物，如果没有多态，他要写给猫喂食和给狗喂食两个方法
 // 有了多态，以后即使再来好多动物，用这一个函数就可以了
 public void feed(Animal an, Food f) {
     an.eat();
     f.showName();

 }
}

//6.最后，方法的调用（测试）：


public class Test{

 public static void main(String args[]) {
     Master master = new Master();
     master.feed(new Dog(), new Bone());
     master.feed(new Cat(), new Fish());

 }
}

