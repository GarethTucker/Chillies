package com.zivel.Chillies.handler;

import com.zivel.Chillies.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{

    public static Configuration configuration;
    public static boolean testValue = true;

    public static void init(File configFile) {
        //create the configuration object from the given configuration file
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }


    @SubscribeEvent
    public void onConfigurationChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event)
        {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            // Resync configs
            loadConfiguration();
        }
    }

    public static void loadConfiguration(){
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, true, "This is an example config value");
        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
