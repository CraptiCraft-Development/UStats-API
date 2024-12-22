package me.loving11ish.ustatsapi.events;

import me.loving11ish.ustatsapi.enums.Enums;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * This event is called when the data is updated asynchronously.
 * This event is cancellable.
 * This event is called when either the data is modified or replaced.
 * This event is called when the local file or remote MySQL are updated, replaced or created.
 */
public class AsyncDataUpdateEvent extends Event implements Cancellable {

    private final UUID uuid;
    private final String key;
    private final Object data;
    private final Enums.EventType eventType;
    private final Enums.StatsType statsType;
    private final boolean replaces, modifies;

    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

    /**
     * Constructor for the AsyncDataUpdateEvent
     *
     * @param modifies Represents if the data modifies the previous data
     * @param replaces Represents if the data replaces the previous data
     * @param statsType Represents the type of the data
     * @param eventType Represents the event type
     * @param data The data to be updated
     * @param key The key of the data
     * @param uuid The UUID of the Player/OfflinePlayer
     */
    public AsyncDataUpdateEvent(boolean modifies, boolean replaces, Enums.StatsType statsType, Enums.EventType eventType, Object data, String key, UUID uuid) {
        super(true);
        this.modifies = modifies;
        this.replaces = replaces;
        this.statsType = statsType;
        this.eventType = eventType;
        this.data = data;
        this.key = key;
        this.uuid = uuid;
        this.cancelled = false;
    }

    /**
     * Get if the event is cancelled
     * @return If the event is cancelled
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Set the event to be cancelled
     * @param cancelled If the event should be cancelled
     */
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * Get the UUID of the Player/OfflinePlayer
     * @return The UUID of the Player/OfflinePlayer
     */
    public UUID getUUID() {
        return this.uuid;
    }

    /**
     * Get the key of the data
     * @return The key of the data
     */
    public String getKey() {
        return key;
    }

    /**
     * Get the data to be updated
     * @return The data to be updated
     */
    public Object getData() {
        return data;
    }

    /**
     * Get the type of the data
     * @return The type of the data
     */
    public Enums.StatsType getStatsType() {
        return statsType;
    }

    /**
     * Get the event type
     * @return The event type
     */
    public Enums.EventType getEventType() {
        return eventType;
    }

    /**
     * Get if the data replaces the previous data
     * @return If the data replaces the previous data
     */
    public boolean replacesPreviousData() {
        return replaces;
    }

    /**
     * Get if the data modifies the previous data
     * @return If the data modifies the previous data
     */
    public boolean modifiesData() {
        return modifies;
    }

    /**
     * Get the handlers for the event
     * @return The handlers
     */
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    /**
     * Get the handlers for the event
     * @return The handlers
     */
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
