package li.cil.oc.example.processor;

import li.cil.oc.api.Network;
import li.cil.oc.api.driver.EnvironmentHost;
import li.cil.oc.api.driver.item.Container;
import li.cil.oc.api.driver.item.Processor;
import li.cil.oc.api.driver.item.Slot;
import li.cil.oc.api.machine.Architecture;
import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.ManagedEnvironment;
import li.cil.oc.api.network.Visibility;
import li.cil.oc.api.prefab.DriverItem;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import java.util.Random;

public class DriverCardParticleSpawner extends DriverItem implements Processor {
    protected DriverCardParticleSpawner() {
        super(new ItemStack(ModExampleItem.cardParticleSpawner));
    }

    // We want our item to be a cpu component, i.e. it can be placed into
    // computers' cpu slots.

    @Override
    public String slot(ItemStack stack) {
        return Slot.CPU;
    }

    @Override
    public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) {
        return null;
    }
    
    @Override
    public int supportedComponents(ItemStack stack) {
        if (stack.getItem() instanceof ItemCardParticleSpawner)
            return 16;
        return 0;
    }

    @Override
    public Class<? extends Architecture> architecture(ItemStack stack) {
        if (stack.getItem() instanceof ItemCardParticleSpawner)
            return PseudoArchitecture.class;
        return null;
    }
}
