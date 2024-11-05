package me.loving11ish.ustatsapi.enums;

public class Enums {

    public enum StatsType {
        Live,
        Server,
        Kills,
        Deaths,
        Damage,
        Accuracy,
        World,
        Movement,
        Inventory,
        Activity,
        Survival,
        Interactions,
        Moderation,
        Advancements
    }

    public enum EventType {
        // Live
        Time_Spent,
        Health,
        Food_Level,
        Inventory_Items,
        First_Time_Joined,
        CPS,
        Latency,

        // Server
        TPS,
        RAM,
        Players,
        CPU,

        // Kills
        Players_Killed,
        Mobs_Killed,
        Animals_Killed,
        Villagers_Killed,

        // Deaths
        Deaths_By_Player,
        Deaths_By_Mobs,
        Deaths_By_Suicide,

        // Damage
        Players_Damaged,
        Mobs_Damaged,
        Animals_Damaged,
        Villagers_Damaged,

        // Accuracy
        Hits_Dealt,
        Hits_Missed,
        Percentage,

        // World
        Ores_Mined,
        Seeds_Planted,
        Blocks_Placed,
        Blocks_Broken,
        Blocks_Ignited,
        Fishing_Successes,
        Times_Respawned,

        // Movement
        Distance_Travelled,
        Worlds_Visited,
        Times_Teleported,

        // Inventory
        Potions_Made,
        Items_Crafted,
        Foods_Cooked,
        Items_Picked,
        Items_Dropped,

        // Activity
        Chat_Messages_Sent,
        Times_Kicked,
        Commands_Executed,
        Times_Joined,
        Times_Left,
        Time_Played,

        // Survival
        Foods_Eaten,
        Hearts_Regained,
        Hearts_Lost,
        Armors_Worn,

        // Interactions
        Doors_Interacted,
        Chests_Interacted,
        Levers_Interacted,
        Fence_Gates_Interacted,
        Buttons_Interacted,
        Trapdoors_Interacted,
        Droppers_Interacted,
        Dispensers_Interacted,
        Hoppers_Interacted,
        Furnaces_Interacted,
        Craft_Tables_Interacted,

        // Moderation
        Players_Banned,
        Players_Muted,
        Players_Kicked,
        Players_Frozen,
        Players_Teleported,
        Players_Spectated,

        // Advancements
        Story,
        Nether,
        End,
        Adventure,
        Husbandry
    }
}
