package n4;

import java.io.InputStream;
import java.security.PrivilegedAction;

/* loaded from: classes.dex */
public final class f implements PrivilegedAction<InputStream> {
    @Override // java.security.PrivilegedAction
    public final InputStream run() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader.getResourceAsStream("fastjson.properties") : ClassLoader.getSystemResourceAsStream("fastjson.properties");
    }
}
