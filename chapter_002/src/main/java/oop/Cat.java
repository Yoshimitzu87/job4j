package oop;


public class Cat {

        private String food;
        private String name;

        public void show() {
            System.out.println(this.name + " Скушал " + this.food);
        }

        public void giveNick(String nick){
            this.name = nick;

        }

        public void eat(String meat) {
            this.food = meat;
        }

        public static void main(String[] args) {

            Cat gav = new Cat();
            gav.eat("kotleta");
            gav.giveNick("ГАВ");
            gav.show();

            Cat black = new Cat();
            black.giveNick("БЛЭК");
            black.eat("fish");
            black.show();
        }
    }