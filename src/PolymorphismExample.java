import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PolymorphismExample  {
    public static void main(String[] args) {
        Animal animal = new Bird();
        animal.noise();
        List<Animal> zoo = new ArrayList<>();
        zoo.add(new Bird());
        zoo.add(new SmallBird());
//        for(Animal animal : zoo) {
//            animal.makeSound();
//        }
    }
}

interface Matrix {
    Matrix mul(Matrix m);

    Matrix sum(Matrix m);

    default int sum(int a, int b) {
        return a + b;
    }
}

class MatrixIml implements Matrix, Comparable<Integer>, Serializable {

    @Override
    public Matrix mul(Matrix m) {
        return null;
    }

    @Override
    public Matrix sum(Matrix m) {
        return null;
    }

    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}

class MatrixUsage {
    public void foo() {
        Matrix m;
//        m.mul(m);
    }
}

abstract class Animal {
    public abstract void makeSound();

    public void noise() {
        makeSound();
    }
}

class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Chirik");
    }
}

class SmallBird extends Bird {
    @Override
    public void makeSound() {
        System.out.println("Small chirik");
    }
}
