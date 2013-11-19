package redmennl.mods.efm.block;

import redmennl.mods.efm.tileentity.TileMatterCondenser;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockMatterCondenser extends BlockEmc
{

    public BlockMatterCondenser(int id)
    {
        super(id, Material.iron);
    }

    @Override
    public TileEntity createNewTileEntity(World world)
    {
        return new TileMatterCondenser();
    }

    @Override
    public boolean openGui(EntityPlayer player, World world, int x, int y, int z)
    {
        return false;
    }
    
}
