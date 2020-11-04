package zone.rong.openj9classfilter;

import com.ibm.oti.shared.SharedClassFilter;

public class ModpackClassFilter implements SharedClassFilter {

    final String predicate = "net.minecraftforge.fml.common.launcher.FMLDeobfTweaker";

    @Override
    public boolean acceptStore(String className) {
        return !className.contains(predicate);
    }

    @Override
    public boolean acceptFind(String className) {
        return !className.contains(predicate);
    }

}
