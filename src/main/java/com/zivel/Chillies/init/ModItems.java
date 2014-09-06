package com.zivel.Chillies.init;

import com.zivel.Chillies.item.ItemChilli;
import com.zivel.Chillies.item.ItemChillies;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemChillies chilli = new ItemChilli();

    public static void init(){
        GameRegistry.registerItem(chilli,"chilli");
    }
}
