package predicado;

import predicado.entities.Product;
import predicado.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD case", 80.90));

        //Implementação da interface
        //list.removeIf(new ProductPredicate());

        // Method reference com metodo estático
        //list.removeIf(Product::staticProductPredicate);

        // Method reference com metodo não estático
        list.removeIf(Product::nonStaticProductPredicate);

        // Expressão lambda declarada
        Double min = 100.0;
        //Predicate<Product> pred = p -> p.getPrice() >= min;

        // Expressão lambda inline
        list.removeIf(p -> p.getPrice() >= min);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
