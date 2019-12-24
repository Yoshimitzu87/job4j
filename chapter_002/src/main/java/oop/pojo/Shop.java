package oop.pojo;

public class Shop {

    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Pork", 27);
        products[4] = new Product("Chicken", 15);


        Shop shop = new Shop();
        shop.delete(products, 2);

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }

        }
    }

    public Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = index; i < products.length; i++) {
            if (products[i] == null && i != products.length - 1) {
                products[i] = products[i + 1];
                products[i + 1] = null;
            }
        }
        return products;
    }
}

