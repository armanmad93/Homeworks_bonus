package homework5VendingMachine.Products.VendingMachine;

import homework5VendingMachine.Command;
import homework5VendingMachine.Products.Chips.Doritos;
import homework5VendingMachine.Products.Chips.Lays;
import homework5VendingMachine.Products.Chips.Pringls;
import homework5VendingMachine.Products.Chocolade.Mars;
import homework5VendingMachine.Products.Chocolade.Snikers;
import homework5VendingMachine.Products.Chocolade.Twix;
import homework5VendingMachine.Products.Drinks.Cola;
import homework5VendingMachine.Products.Drinks.Fanta;
import homework5VendingMachine.Products.Drinks.Sprite;
import homework5VendingMachine.Products.Products;
import homework5VendingMachine.Products.ProductsName;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class VendingMachine {
    private HashMap<Enum<ProductsName>, HashMap<Enum<ProductsName>, Queue<Products>>> product;

    // initialize all products
    //chips
    private Queue<Products> initializeLays() {
        Queue<Products> lays = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            lays.add(new Lays());
        }
        return lays;
    }

    private Queue<Products> initializeDoritos() {
        Queue<Products> doritos = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            doritos.add(new Doritos());
        }
        return doritos;
    }

    private Queue<Products> initializePringls() {
        Queue<Products> pringls = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            pringls.add(new Pringls());
        }
        return pringls;
    }

    //Chocolade
    private Queue<Products> initializeMars() {
        Queue<Products> mars = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            mars.add(new Mars());
        }
        return mars;
    }

    private Queue<Products> initializeSnikers() {
        Queue<Products> snikers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            snikers.add(new Snikers());
        }
        return snikers;
    }

    private Queue<Products> initializeTwix() {
        Queue<Products> twix = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            twix.add(new Twix());
        }
        return twix;
    }

    //drinks
    private Queue<Products> initializeCola() {
        Queue<Products> cola = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            cola.add(new Cola());
        }
        return cola;
    }

    private Queue<Products> initializeFanta() {
        Queue<Products> fanta = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            fanta.add(new Fanta());
        }
        return fanta;
    }

    private Queue<Products> initializeSprite() {
        Queue<Products> sprite = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            sprite.add(new Sprite());
        }
        return sprite;
    }

    //add products by names
    //chips
    private HashMap<Enum<ProductsName>, Queue<Products>> addChips() {
        HashMap<Enum<ProductsName>, Queue<Products>> chips = new LinkedHashMap<>();

        chips.put(ProductsName.Lays, initializeLays());
        chips.put(ProductsName.Doritos, initializeDoritos());
        chips.put(ProductsName.Pringls, initializePringls());

        return chips;
    }

    //chocolade
    private HashMap<Enum<ProductsName>, Queue<Products>> addChocolade() {
        HashMap<Enum<ProductsName>, Queue<Products>> chocolade = new LinkedHashMap<>();

        chocolade.put(ProductsName.Snikers, initializeSnikers());
        chocolade.put(ProductsName.Mars, initializeMars());
        chocolade.put(ProductsName.Twix, initializeTwix());

        return chocolade;
    }

    //drinks
    private HashMap<Enum<ProductsName>, Queue<Products>> addDrinks() {
        HashMap<Enum<ProductsName>, Queue<Products>> drinks = new LinkedHashMap<>();

        drinks.put(ProductsName.Cola, initializeCola());
        drinks.put(ProductsName.Fanta, initializeFanta());
        drinks.put(ProductsName.Sprite, initializeSprite());

        return drinks;
    }

    //add products by catalog
    private HashMap<Enum<ProductsName>, HashMap<Enum<ProductsName>, Queue<Products>>> addProductsByCatalog() {
        product = new LinkedHashMap<>();
        product.put(ProductsName.Chips, addChips());
        product.put(ProductsName.Chocolade, addChocolade());
        product.put(ProductsName.Drinks, addDrinks());

        return product;
    }

    public Queue<Products> takeProduct(Command command) {

        product = addProductsByCatalog();

        HashMap<Enum<ProductsName>, Queue<Products>> catalogProducts = null;
        Queue<Products> products = null;
        Queue<Products> howMatchTake = new LinkedList<>();

        if (command.getType() == ProductsName.Chips) {
            catalogProducts = product.get(ProductsName.Chips);
            if (command.getProductsName() == ProductsName.Lays) {
                products = catalogProducts.get(ProductsName.Lays);

            } else if (command.getProductsName() == ProductsName.Doritos) {
                products = catalogProducts.get(ProductsName.Doritos);

            } else if (command.getProductsName() == ProductsName.Pringls) {
                products = catalogProducts.get(ProductsName.Pringls);
            }
        } else if (command.getType() == ProductsName.Chocolade) {
            catalogProducts = product.get(ProductsName.Chocolade);
            if (command.getProductsName() == ProductsName.Snikers) {
                products = catalogProducts.get(ProductsName.Snikers);

            } else if (command.getProductsName() == ProductsName.Mars) {
                products = catalogProducts.get(ProductsName.Mars);

            } else if (command.getProductsName() == ProductsName.Twix) {
                products = catalogProducts.get(ProductsName.Twix);
            }
        } else if (command.getType() == ProductsName.Drinks) {
            catalogProducts = product.get(ProductsName.Drinks);
            if (command.getProductsName() == ProductsName.Cola) {
                products = catalogProducts.get(ProductsName.Cola);

            } else if (command.getProductsName() == ProductsName.Fanta) {
                products = catalogProducts.get(ProductsName.Fanta);

            } else if (command.getProductsName() == ProductsName.Sprite) {
                products = catalogProducts.get(ProductsName.Sprite);
            }
        }

        for (int i = 0; i < command.getProductCount(); i++) {
            products.remove();
        }

        product.put(command.getType(), catalogProducts);

        for (int i = 0; i < 10 - products.size(); i++) {
            howMatchTake.add(products.peek());
        }

        return howMatchTake;

    }

}
