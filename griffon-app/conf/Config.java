import griffon.util.AbstractMapResourceBundle;

import javax.annotation.Nonnull;
import java.util.Map;

import static java.util.Arrays.asList;
import static griffon.util.CollectionUtils.map;

public class Config extends AbstractMapResourceBundle {
    @Override
    protected void initialize(@Nonnull Map<String, Object> entries) {
        map(entries)
            .e("application", map()
                //.e("title", "testjfx2")
                .e("startupGroups", asList("console"))
                .e("autoShutdown", true)
            )
            .e("mvcGroups", map()
                .e("console", map()
                    .e("model", "org.serger.app.ConsoleModel")
                    .e("view", "org.serger.app.ConsoleView")
                    .e("controller", "org.serger.app.ConsoleController")
                )
            )
//            .e("mappers", map()
//                    .e("mapper", map()
//                            .e("resource", "org.serger.app.mapper.PersonMapper.xml")
//                    )
//            )
        ;
    }
}