/**
 * This work is licensed under the Creative Commons
 * Attribution-ShareAlike 3.0 Unported License. To view a copy of this
 * license, visit http://creativecommons.org/licenses/by-sa/3.0/.
 */

package extrabiomes.module.summa.biome;

import net.minecraft.world.biome.BiomeDecorator;
import extrabiomes.lib.BiomeSettings;

public class BiomeShrubland extends ExtrabiomeGenBase {

    public BiomeShrubland() {
        super(BiomeSettings.SHRUBLAND.getID());

        setColor(0x51B57D);
        setBiomeName("Shrubland");
        temperature = 0.4F;
        rainfall = 0.6F;
        minHeight = 0.1F;
        maxHeight = 0.3F;
    }

    @Override
    public BiomeDecorator createBiomeDecorator() {
        return new CustomBiomeDecorator.Builder(this).treesPerChunk(0).flowersPerChunk(3)
                .grassPerChunk(1).build();
    }
}
