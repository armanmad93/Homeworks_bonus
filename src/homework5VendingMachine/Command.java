package homework5VendingMachine;

import class4.problem1.MyExeption;
import homework5VendingMachine.Products.ProductsName;

public class Command {

    private Enum<ProductsName> type;
    private Enum<ProductsName> productsName;
    private int productCount;


    public Enum<ProductsName> getType() {
        return type;
    }

    public void setType(Enum<ProductsName> type) {
        this.type = type;
    }

    public Enum<ProductsName> getProductsName() {
        return productsName;
    }

    public void setProductsName(Enum<ProductsName> productsName) {
        this.productsName = productsName;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public String commandControl(String commandControl) throws MyNewExeption {
        String[] forExeption = commandControl.split("");

        if (forExeption.length > 5) {
            throw new MyNewExeption();
        } else if (!forExeption[0].equals("A") && !forExeption[0].equals("B") && !forExeption[0].equals("C")) {
            throw new MyNewExeption();
        } else if (!forExeption[1].equals(":") && !forExeption[3].equals(":")) {
            throw new MyNewExeption();
        }
        try {
            productCount = Integer.parseInt(forExeption[2]);
        } catch (NumberFormatException e) {
            throw new MyNewExeption();
        }
        return commandControl;
    }

    public void commandSplit(String command) {
        String[] commandSplit = command.split(":");

        switch (commandSplit[0]) {
            case "A" -> {
                type = ProductsName.Chips;
                switch (commandSplit[1]) {
                    case "1" -> productsName = ProductsName.Lays;
                    case "2" -> productsName = ProductsName.Doritos;
                    case "3" -> productsName = ProductsName.Pringls;
                }
            }
            case "B" -> {
                type = ProductsName.Chocolade;
                switch (commandSplit[1]) {
                    case "1" -> productsName = ProductsName.Snikers;
                    case "2" -> productsName = ProductsName.Mars;
                    case "3" -> productsName = ProductsName.Twix;
                }
            }
            case "C" -> {
                type = ProductsName.Drinks;
                switch (commandSplit[1]) {
                    case "1" -> productsName = ProductsName.Cola;
                    case "2" -> productsName = ProductsName.Fanta;
                    case "3" -> productsName = ProductsName.Sprite;
                }
            }
        }
        productCount = Integer.parseInt(commandSplit[2]);

    }
}
