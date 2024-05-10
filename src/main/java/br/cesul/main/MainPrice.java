package br.cesul.main;

import br.cesul.collection.Book;
import br.cesul.collection.CollectableItem;
import br.cesul.collection.ConservationState;
import br.cesul.collection.RarityLevel;

public class MainPrice {
    public static void main(String[] args) {
        CollectableItem item = new Book();
        item.setPrice(100);
        item.setRarity(RarityLevel.MEDIUM);
        item.setConservationState(ConservationState.PRISTINE);
        item.setAutographed(true);

        System.out.println("Preço de venda: " + item.getSellPrice());
    }
}
