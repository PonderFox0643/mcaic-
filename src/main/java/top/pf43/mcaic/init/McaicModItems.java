
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package top.pf43.mcaic.init;

import top.pf43.mcaic.item.ReNoelBattleItem;
import top.pf43.mcaic.item.ReNoelBSPItem;
import top.pf43.mcaic.item.NoelItem;
import top.pf43.mcaic.item.MastaffItem;
import top.pf43.mcaic.item.MacrystalItem;
import top.pf43.mcaic.item.CrystalstaffItem;
import top.pf43.mcaic.item.BigstaffItem;
import top.pf43.mcaic.McaicMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class McaicModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McaicMod.MODID);
	public static final RegistryObject<Item> CRYSTALSTAFF = REGISTRY.register("crystalstaff", () -> new CrystalstaffItem());
	public static final RegistryObject<Item> NOEL = REGISTRY.register("noel", () -> new NoelItem());
	public static final RegistryObject<Item> MACRYSTAL = REGISTRY.register("macrystal", () -> new MacrystalItem());
	public static final RegistryObject<Item> MASTAFF = REGISTRY.register("mastaff", () -> new MastaffItem());
	public static final RegistryObject<Item> RE_NOEL_BATTLE = REGISTRY.register("re_noel_battle", () -> new ReNoelBattleItem());
	public static final RegistryObject<Item> RE_NOEL_BSP = REGISTRY.register("re_noel_bsp", () -> new ReNoelBSPItem());
	public static final RegistryObject<Item> MCAICTBC = block(McaicModBlocks.MCAICTBC, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> MA_XM = block(McaicModBlocks.MA_XM, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> MA_DM = block(McaicModBlocks.MA_DM, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> MA_F = block(McaicModBlocks.MA_F, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> MA_JM = block(McaicModBlocks.MA_JM, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> MA_JUE = block(McaicModBlocks.MA_JUE, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> MAPGY = block(McaicModBlocks.MAPGY, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> MA_JY = block(McaicModBlocks.MA_JY, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> L_MA_ROGE = block(McaicModBlocks.L_MA_ROGE, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> L_MA_SAGA_TEST = block(McaicModBlocks.L_MA_SAGA_TEST, null);
	public static final RegistryObject<Item> MA_SAGA_TEST = block(McaicModBlocks.MA_SAGA_TEST, null);
	public static final RegistryObject<Item> TEST_1 = REGISTRY.register("test_1_spawn_egg",
			() -> new ForgeSpawnEggItem(McaicModEntities.TEST_1, -1, -16777216, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> MA_SAGA_QB = block(McaicModBlocks.MA_SAGA_QB, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> L_MA_SAGA_QB = block(McaicModBlocks.L_MA_SAGA_QB, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> MA_SAGA_BB = block(McaicModBlocks.MA_SAGA_BB, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> L_MA_SAGA_BB = block(McaicModBlocks.L_MA_SAGA_BB, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> L_MA_SAGA_BG = block(McaicModBlocks.L_MA_SAGA_BG, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> MA_SAGA_BG = block(McaicModBlocks.MA_SAGA_BG, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> MA_SAGA_ZZ = block(McaicModBlocks.MA_SAGA_ZZ, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> L_MA_SAGA_ZZ = block(McaicModBlocks.L_MA_SAGA_ZZ, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> MA_SAGA_YY = block(McaicModBlocks.MA_SAGA_YY, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> L_MA_SAGA_YY = block(McaicModBlocks.L_MA_SAGA_YY, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> MA_SAGA_FF = block(McaicModBlocks.MA_SAGA_FF, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> L_MA_SAGA_FF = block(McaicModBlocks.L_MA_SAGA_FF, McaicModTabs.TAB_MCAIC);
	public static final RegistryObject<Item> BIGSTAFF = REGISTRY.register("bigstaff", () -> new BigstaffItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
