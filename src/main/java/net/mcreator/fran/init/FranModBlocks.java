
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fran.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.fran.block.YefriBlock;
import net.mcreator.fran.FranMod;

public class FranModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FranMod.MODID);
	public static final RegistryObject<Block> YEFRI = REGISTRY.register("yefri", () -> new YefriBlock());
}
