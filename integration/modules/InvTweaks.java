package appeng.integration.modules;

import invtweaks.api.InvTweaksAPI;
import net.minecraft.item.ItemStack;
import appeng.integration.BaseModule;
import appeng.integration.abstraction.IInvTweaks;
import cpw.mods.fml.common.Mod.Instance;

public class InvTweaks extends BaseModule implements IInvTweaks
{

	public static InvTweaks instance;

	@Instance("inventorytweaks")
	static InvTweaksAPI api;

	@Override
	public void Init()
	{

	}

	@Override
	public void PostInit()
	{
		if ( api == null )
			throw new RuntimeException( "InvTweaks API Instance Failed." );
	}

	@Override
	public int compareItems(ItemStack i, ItemStack j)
	{
		return api.compareItems( i, j );
	}
}
