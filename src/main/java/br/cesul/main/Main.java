package br.cesul.main;

import br.cesul.collection.ActionFigure;
import br.cesul.collection.Book;
import br.cesul.collection.CollectableItem;
import br.cesul.collection.Vinil;

public class Main {

    public static void main(String[] args) {
        String option = args[0];

        CollectableItem item = null;

        if (option.equals("A")) {
            item = new ActionFigure();
        } else if (option.equals("B")) {
            item = new Book();
        } else if (option.equals("V")) {
            item = new Vinil();
        } else {
            item = new CollectableItem();
        }

        item.setName("Batman");

        System.out.println(item.getName());

        if (item instanceof ActionFigure) {
            System.out.println("Item é ActionFigure");
        } else if (item instanceof Book) {
            System.out.println("Item é Book");
        } else if (item instanceof Vinil) {
            System.out.println("Item é Vinil");
        } else {
            System.out.println("Item é CollectableItem");
        }
    }
}
