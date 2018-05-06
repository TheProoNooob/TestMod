package com.noob.testmod.init;

import java.util.ArrayList;
import java.util.List;

import com.noob.testmod.armors.ArmorBase;
import com.noob.testmod.items.ItemBase;
import com.noob.testmod.tools.ToolAxe;
import com.noob.testmod.tools.ToolHoe;
import com.noob.testmod.tools.ToolPickaxe;
import com.noob.testmod.tools.ToolShovel;
import com.noob.testmod.tools.ToolSword;
import com.noob.testmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial RUBY_TOOL = EnumHelper.addToolMaterial("ruby_tool", 2, 250, 6.0F, 2.0F, 14);
	public static final ArmorMaterial RUBY_ARMOR = EnumHelper.addArmorMaterial("ruby_armor", Reference.MODID + ":ruby", 40, new int[]{5, 8, 10, 5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
			
	//Items
	public static final Item RUBY = new ItemBase("ruby");
	
	//Tools
	public static final Item RUBY_AXE = new ToolAxe("ruby_axe", RUBY_TOOL);
	public static final Item RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", RUBY_TOOL);
	public static final Item RUBY_HOE = new ToolHoe("ruby_hoe", RUBY_TOOL);
	public static final Item RUBY_SHOVEL = new ToolShovel("ruby_shovel", RUBY_TOOL);
	public static final Item RUBY_SWORD = new ToolSword("ruby_sword", RUBY_TOOL);
	
	//Armor
	public static final Item RUBY_HELMET = new ArmorBase("ruby", RUBY_ARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLAT = new ArmorBase("ruby", RUBY_ARMOR, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby", RUBY_ARMOR, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby", RUBY_ARMOR, 1, EntityEquipmentSlot.FEET);
}
