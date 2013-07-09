package co.uk.silvania.city.items.econ;

import co.uk.silvania.city.FlenixCities;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemNote50 extends Item {
	
	public static int moneyValue = 5000;

	public ItemNote50(int id) {
		super(id);
		this.setCreativeTab(FlenixCities.tabEcon);
		this.setMaxStackSize(50);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon("flenixcities:Note5000");
	}
	
	public static void saveBalanceForPlayer(EntityPlayer player, World world) {
		NBTTagCompound nbt = player.getEntityData();
		nbt.setInteger("Balance", (nbt.getInteger("Balance") + moneyValue));
	}
}