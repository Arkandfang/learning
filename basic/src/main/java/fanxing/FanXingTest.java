package fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fangzhou
 * @date 2022/7/21 8:25 下午
 */
public class FanXingTest {


    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setSmell("狗的嗅觉");
//        Animal animal = new Animal();
//        animal.setName("动物");

        Animal animal = (Animal)dog;
        Dog dogs = (Dog) animal;
        System.out.println(dogs.getSmell());



//        Animal animal11 = new Dog();
//        String smell = ((Dog) animal).getSmell();
//        System.out.println(smell);
//        String info = getInfo(dog);
//        System.out.println("输出的信息是" + info);
//
//        ArrayList<Animal> animals = new ArrayList<>();
//
//        ArrayList<Dog> dogs = new ArrayList<>();
//
//
//        Integer count = getCount(dogs);
//        Integer count1 = getCount(animals);
//
//        System.out.println("数量是 " + count);
    }

    public static String getInfo(Animal animal) {
        return animal.getName();
    }


    public static Integer getCount(List<? extends Object> animalList) {
        return animalList.size();
    }
}
