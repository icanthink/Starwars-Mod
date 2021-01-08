package net.icanthink.spacemod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.icanthink.spacemod.creativetab.TabForceTab;
import net.icanthink.spacemod.ElementsSpaceMod;

import com.google.common.collect.Multimap;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.IItemPropertyGetter;
import javax.annotation.Nullable;
import net.minecraft.item.EnumAction;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;

@ElementsSpaceMod.ModElement.Tag
public class ItemLightsaberDown extends ElementsSpaceMod.ModElement {
	@GameRegistry.ObjectHolder("spacemod:lightsaberdown")
	public static final Item block = null;
	public ItemLightsaberDown(ElementsSpaceMod instance) {
		super(instance, 138);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
		}.setUnlocalizedName("lightsaberdown").setRegistryName("lightsaberdown").setCreativeTab(TabForceTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("spacemod:lightsaberdown", "inventory"));
	}
	private static class ItemToolCustom extends Item {
		protected ItemToolCustom() {
			setMaxDamage(100);
			setMaxStackSize(1);
			this.addPropertyOverride(new ResourceLocation("blocking"), new IItemPropertyGetter() {

                @SideOnly(Side.CLIENT)
                public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
                    return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F : 0.0F;
                }
            });
		}

		@Override
		public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
			Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);
			if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
				multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 20f, 0));
				multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", -3, 0));
			}
			return multimap;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			IBlockState require;
			return 0;
		}

		@Override
		public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
			stack.damageItem(1, entityLiving);
			return true;
		}

		@Override
		public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
			stack.damageItem(2, attacker);
			return true;
		}

		@Override
		public boolean isFull3D() {
			return true;
		}

		@Override
		public int getItemEnchantability() {
			return 2;
		}
		
		@Override
        public int getMaxItemUseDuration(ItemStack par1ItemStack) {
            return 72000;
        }

		public EnumAction getItemUseAction(ItemStack stack) {
            return EnumAction.BLOCK;
        }
        
        public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
            ItemStack itemstack = playerIn.getHeldItem(handIn);
            playerIn.setActiveHand(handIn);
            return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
        }
        
        @SubscribeEvent
    	public void onEntityAttacked(LivingAttackEvent event){
        	Entity entity = event != null ? event.getEntity() : null;
        	float damage = event.getAmount();
        	int damageInt = (int) damage;
        	if (entity != null && entity instanceof EntityPlayer) {
            	EntityPlayer player = (EntityPlayer)entity;
            	ItemStack activeItem = player.getActiveItemStack();

            	if (player.isActiveItemStackBlocking() == true && ((activeItem).getItem() == new ItemStack(block, (int) (1)).getItem())) {
                	activeItem.damageItem(damageInt, player);
            	}
        	}
    	}
	}
}
