package basic;
import java.util.ArrayList;
import java.util.List;

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class WildcardReturnExample {
    // 반환 타입으로 와일드카드를 사용한 메서드
    public static List<? extends Animal> getAnimals(boolean getDogs) {	//타입에 <? extends Animal>로 줘서 
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        if (getDogs) {
            return dogs;
        } else {
            return cats;
        }
    }
    
//    public static List<Animal> getAnimals(boolean getDogs) {	//타입을 Animal로 줘서 업캐스팅한 경우
//        List<Animal> dogs = new ArrayList<>();
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//
//        List<Animal> cats = new ArrayList<>();
//        cats.add(new Cat());
//        cats.add(new Cat());
//
//        if (getDogs) {
//            return dogs;
//        } else {
//            return cats;
//        }
//    }

    public static void main(String[] args) {
        // 개 리스트를 반환
        List<? extends Animal> animals = getAnimals(true);
        for (Animal animal : animals) {
            animal.sound(); // "Bark" 출력
        }

        // 고양이 리스트를 반환
        animals = getAnimals(false);
        for (Animal animal : animals) {
            animal.sound(); // "Meow" 출력
        }
    }
}
