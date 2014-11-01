package li.cil.oc.example.processor;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * This mod demonstrates how to add item components, i.e. items that can be
 * placed in a computer and provide methods to it.
 */
@Mod(modid = "OpenComputers|ExampleProcessor",
        name = "OpenComputers Addon Example - Processor",
        version = "1.0.0",
        dependencies = "required-after:OpenComputers@[1.4.0,)")
public class ModExampleProcessor {
    @Mod.Instance
    public static ModExampleProcessor instance;

    public static ItemPseudoProcessor cpuPseudoProcessor;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        cpuPseudoProcessor = new ItemPseudoProcessor();
        GameRegistry.registerItem(cpuPseudoProcessor, "oc:cpu_pseudo_processor");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        li.cil.oc.api.Driver.add(new DriverPseudoProcessor());
    }
}
