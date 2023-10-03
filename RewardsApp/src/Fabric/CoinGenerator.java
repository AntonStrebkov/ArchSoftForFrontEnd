package Fabric;

import Interface.iGameItem;
import Product.Coin;

public class CoinGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Coin();
    }
    
}
