package ezra4ka.sVFurniture.api.Events;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FurnitureRightClickEvent extends Event implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Player player;
    private final Block block;
    private final BlockFace clickedFace;
    private final ItemStack item;
    private final String furnitureId;

    private boolean cancelled;

    public FurnitureRightClickEvent(
            @NotNull Player player,
            @NotNull Block block,
            @NotNull BlockFace clickedFace,
            @Nullable ItemStack item,
            @Nullable String furnitureId
    ) {
        this.player = player;
        this.block = block;
        this.clickedFace = clickedFace;
        this.item = item == null ? null : item.clone();
        this.furnitureId = furnitureId;
    }

    public @NotNull Player getPlayer() {
        return player;
    }

    public @NotNull Block getBlock() {
        return block;
    }

    public @NotNull BlockFace getClickedFace() {
        return clickedFace;
    }


    public @Nullable ItemStack getItem() {
        return item == null ? null : item.clone();
    }


    public @Nullable String getFurnitureId() {
        return furnitureId;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLER_LIST;
    }
}