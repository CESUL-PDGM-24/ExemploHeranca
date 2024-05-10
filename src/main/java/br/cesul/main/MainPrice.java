package br.cesul.main;

import br.cesul.collection.*;

public class MainPrice {
    public static void main(String[] args) {
        CollectableItem item = new ActionFigure();
        item.setPrice(100);
        item.setRarity(RarityLevel.MEDIUM);
        item.setConservationState(ConservationState.PRISTINE);
        item.setAutographed(true);

        ActionFigure actionFigure = (ActionFigure) item;
        actionFigure.setArticulated(true);

        System.out.println("Preço de venda: " + item.getSellPrice());
    }
}
