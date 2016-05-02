package avl;
import java.util.Set;


public interface AVLinterface<T> extends Set<T> {

    T get(int index);

    int indexOf(T element);
}
