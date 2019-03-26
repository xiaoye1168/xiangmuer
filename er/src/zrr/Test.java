package zrr;
//1.���ȣ����춯���ࣺ
//������
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

 // �����������нкͳ���������
 public void cry() {
     System.out.println("�Ҳ�֪����ʲô");
 }

 public void eat() {
     System.out.println("�Ҳ�֪����ʲô");
 }
}
//2.��Σ��ֱ���è��͹��ࣨ���Ǽ̳��ڶ����ࣩ��

//����̳��ڶ�����
class Dog extends Animal {
 // ���ǣ���д������
 public void cry() {
     System.out.println("����");
 }

 public void eat() {
     System.out.println("���ǹ����Ұ��Թ�ͷ");
 }
}

//è��̳��ڶ�����
class Cat extends Animal {
 // ���ǣ���д������
 public void cry() {
     System.out.println("����");
 }

 public void eat() {
     System.out.println("����è���Ұ�����");
 }
}
//3.���ߣ�����ʳ���ࣺ
//ʳ����
class Food {

 String name;

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 // ʳ��������������һ������
 public void showName() {

 }
}

//4.���ߣ�è�͹������Լ���ͬ�İ��Ե�ʳ����Ǽ̳���ʳ���ࣩ��

//�㣨ʳ���һ�֣��̳���ʳ��
class Fish extends Food {
 public void showName() {
     System.out.println("ʳ���");
 }
}

//��ͷ��ʳ���һ�֣��̳���ʳ��
class Bone extends Food {
 public void showName() {
     System.out.println("ʳ���ͷ");
 }
}
//5.�����ࣨ�Ϳ��Խ�����Ͷ�Ӧ��ʳ��ͳһ��������

//������ ����һιʳʳ����
class Master {
 // ������ιʳ����û�ж�̬����Ҫд��èιʳ�͸���ιʳ��������
 // ���˶�̬���Ժ�ʹ�����öද�����һ�������Ϳ�����
 public void feed(Animal an, Food f) {
     an.eat();
     f.showName();

 }
}

//6.��󣬷����ĵ��ã����ԣ���


public class Test{

 public static void main(String args[]) {
     Master master = new Master();
     master.feed(new Dog(), new Bone());
     master.feed(new Cat(), new Fish());

 }
}

