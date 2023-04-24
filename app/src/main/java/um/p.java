package um;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes2.dex */
public final /* synthetic */ class p {
    public static /* synthetic */ Iterator a() {
        try {
            return Arrays.asList(new qm.a()).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
