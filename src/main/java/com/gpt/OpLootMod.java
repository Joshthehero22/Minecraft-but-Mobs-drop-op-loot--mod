package com.gpt.oploot;

import net.fabricmc.api.ModInitializer;

public class OpLootMod implements ModInitializer {
    @Override
    public void onInitialize() {
        // Loot tables are provided as resources (data/oploot/loot_tables/entities/*.json)
        // The mod can include code to replace loot tables on load if desired.
        System.out.println("OP Loot Mod initialized.");
    }
}
