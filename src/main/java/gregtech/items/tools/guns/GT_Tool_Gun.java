/**
 * Copyright (c) 2018 Gregorius Techneticies
 *
 * This file is part of GregTech.
 *
 * GregTech is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * GregTech is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with GregTech. If not, see <http://www.gnu.org/licenses/>.
 */

package gregtech.items.tools.guns;

import static gregapi.data.CS.*;

import gregapi.data.MT;
import gregapi.item.multiitem.MultiItemTool;
import gregapi.item.multiitem.tools.ToolStats;
import gregapi.old.Textures;
import gregapi.render.IIconContainer;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class GT_Tool_Gun extends ToolStats {
	@Override public int getToolDamagePerBlockBreak()                     {return 200;}
	@Override public int getToolDamagePerDropConversion()                 {return 100;}
	@Override public int getToolDamagePerContainerCraft()                 {return 200;}
	@Override public int getToolDamagePerEntityAttack()                   {return 100;}
	@Override public float getSpeedMultiplier()                           {return 0.25F;}
	@Override public boolean isWeapon()                                   {return T;}
	@Override public boolean isRangedWeapon()                             {return T;}
	@Override public boolean isMiningTool()                               {return F;}
	@Override public boolean isMinableBlock(Block aBlock, byte aMetaData) {return F;}
	@Override public IIconContainer getIcon(boolean aIsToolHead, ItemStack aStack) {return !aIsToolHead ? Textures.ItemIcons.KNIFE : Textures.ItemIcons.VOID;}
	@Override public short[]        getRGBa(boolean aIsToolHead, ItemStack aStack) {return !aIsToolHead ? MultiItemTool.getPrimaryMaterial(aStack, MT.Steel).mRGBaSolid : MultiItemTool.getSecondaryMaterial(aStack, MT.Wood).mRGBaSolid;}
}