package introducao.application;

import introducao.entities.Product;

import java.util.Comparator;

/**
 * Interface Funcional
 * É uma interface que possui um único método abstrato. Suas
 * implementações serão tratadas como expressões lambda.
 **/

public class MyComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
