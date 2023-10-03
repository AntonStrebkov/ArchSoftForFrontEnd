package Fabric;

import Interface.iGameItem;
import Product.Copper;

public class CopperGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Copper();
    }
    
}
