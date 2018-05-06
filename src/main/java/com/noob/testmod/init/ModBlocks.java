package com.noob.testmod.init;

import java.util.ArrayList;
import java.util.List;

import com.noob.testmod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON);
	
	
}
