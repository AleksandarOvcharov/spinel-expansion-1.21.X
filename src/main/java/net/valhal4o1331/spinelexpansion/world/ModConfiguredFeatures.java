package net.valhal4o1331.spinelexpansion.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.valhal4o1331.spinelexpansion.SpinelExpansion;
import net.valhal4o1331.spinelexpansion.block.ModBlocks;

import java.util.ArrayList;
import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> SPINEL_ORE_KEY = registerKey("spinel_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANTHRACITE_ORE_KEY = registerKey("anthracite_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldSpinelOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SPINEL_ORE.getDefaultState()),
                    (OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.SPINEL_DEEPSLATE_ORE.getDefaultState())));

        List<OreFeatureConfig.Target> overworldAnthraciteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.ANTHRACITE_ORE.getDefaultState()),
                        (OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.ANTHRACITE_ORE.getDefaultState())));

        register(context, SPINEL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSpinelOres, 12));
        register(context, ANTHRACITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAnthraciteOres, 12));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(SpinelExpansion.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
