package Fabric;

import Interface.iGameItem;
import Product.Stone;

public class StoneGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Stone();
    }
    
}
