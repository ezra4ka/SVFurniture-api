package ezra4ka.sVFurniture.api;

import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

public interface SVFurnitureAPI {

    boolean isFurniture(Block block);

    boolean isCustomItem(ItemStack stack);

    String getCustomId(ItemStack stack);

    ItemStack getCustomItem(String id);

    NamespacedKey getItemNamespace();
//dfsdd
}
