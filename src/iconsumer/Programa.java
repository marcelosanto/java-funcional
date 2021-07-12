package iconsumer;

import iconsumer.entities.Product;
import iconsumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        //Implementação da interface
        //list.forEach(new PriceUpdate());

        // Method reference com metodo estático
        //list.forEach(Product::staticPriceUpdate);

        // Method reference com metodo não estático
        //list.forEach(Product::nonStaticPriceUpdate);

        // Expressão lambda declarada
        Double juros = 1.1;
        //Consumer<Product> consumer = p -> p.setPrice(p.getPrice() * juros);

        // Expressão lambda inline
       list.forEach(p -> p.setPrice(p.getPrice() * juros));

        list.forEach(System.out::println);
    }
}
