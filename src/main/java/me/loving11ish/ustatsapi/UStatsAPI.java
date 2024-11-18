package me.loving11ish.ustatsapi;

import me.loving11ish.ustatsapi.enums.Enums;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;

import java.util.List;
import java.util.UUID;

/**
 * This is the main API class for UStats.
 * This class contains all the methods that can be used to interact with the plugin.
 */
@SuppressWarnings("unused")
public interface UStatsAPI {

    /**
     *
     * @return Returns the instance of the UStatsAPI.
     */
    static UStatsAPI getInstance() {
        RegisteredServiceProvider<UStatsAPI> registration = Bukkit.getServicesManager().getRegistration(UStatsAPI.class);
        if (registration == null) {
            return null;
        }
        return registration.getProvider();
    }

    /**
     *
     * @return Returns the version of the plugin.
     */
    String getVersion();

    /**
     *
     * @return Returns the author of the plugin.
     */
    String getAuthor();

    /**
     *
     * @return Returns the website of the plugin.
     */
    String getWebsite();

    /**
     *
     * @return Returns the description of the plugin.
     */
    String getDescription();

    /**
     *
     * @param statsType The stats type to get the name of.
     * @return Returns the name of the stats type.
     */
    String getName(Enums.StatsType statsType);

    /**
     *
     * @param eventType The event type to get the name of.
     * @return Returns the name of the event type.
     */
    String getName(Enums.EventType eventType);

    /**
     *
     * @param statsType The stats type to check if it is shown.
     * @return Returns true if the stats type is shown, otherwise returns false.
     */
    boolean isShown(Enums.StatsType statsType);

    /**
     *
     * @param eventType The event type to check if it is shown.
     * @return Returns true if the event type is shown, otherwise returns false.
     */
    boolean isShown(Enums.EventType eventType);

    /**
     *
     * @return Returns the current TPS of the server.
     */
    double getTPS();

    /**
     *
     * @param player The player to get the CPS(Clicks Per Second) of.
     * @return Returns the CPS of the player.
     */
    int getCPS(Player player);

    /**
     * This method will reset all player stats.
     */
    void reset();

    /**
     *
     * @param uuid The UUID of the player to delete the stats of.
     */
    void delete(UUID uuid);

    /**
     *
     * @param uuid The UUID of the player to delete the stats of.
     * @param statsType The stats type to delete.
     */
    void delete(UUID uuid, Enums.StatsType statsType);

    /**
     *
     * @param statsType The stats type to enable.
     */
    void enableCategory(Enums.StatsType statsType);

    /**
     *
     * @param statsType The stats type to disable.
     */
    void disableCategory(Enums.StatsType statsType);

    /**
     *
     * @param eventType The event type to enable.
     */
    void enableCategory(Enums.EventType eventType);

    /**
     *
     * @param eventType The event type to disable.
     */
    void disableCategory(Enums.EventType eventType);

    /**
     *
     * @param uuid The UUID of the player to check if they have data.
     * @param statsType The stats type to check.
     * @return Returns true if the player has data, otherwise returns false.
     */
    boolean hasData(UUID uuid, Enums.StatsType statsType);

    /**
     *
     * @param uuid The UUID of the player to check if they have data.
     * @param eventType The event type to check.
     * @return Returns true if the player has data, otherwise returns false.
     */
    boolean hasData(UUID uuid, Enums.EventType eventType);

    /**
     *
     * @param uuid The UUID of the player to get the stats of.
     * @param eventType The event type to get the stats of.
     * @param key The key of the stats to get.
     * @return Returns the stats of the player.
     */
    Object getStats(UUID uuid, Enums.EventType eventType, String key);

    /**
     *
     * @param statsType The stats type to get the events of.
     * @return Returns the events of the stats type.
     */
    Enums.EventType[] getEvents(Enums.StatsType statsType);

    /**
     *
     * @param eventType The event type to get the stats type of.
     * @return Returns the stats type of the event type.
     */
    Enums.StatsType getStatsType(Enums.EventType eventType);

    /**
     *
     * @return Returns a list of OfflinePlayer objects that currently have data stored.
     */
    List<OfflinePlayer> getOfflinePlayersWithStats();
}
