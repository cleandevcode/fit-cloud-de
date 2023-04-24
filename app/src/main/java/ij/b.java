package ij;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes2.dex */
public final /* synthetic */ class b {
    public static int[] _values() {
        return s.c0.c(8);
    }

    public static /* synthetic */ Iterator a() {
        try {
            return Arrays.asList(new qm.b()).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static /* synthetic */ String b(int i10) {
        return i10 == 1 ? "NONE" : i10 == 2 ? "DOWNLOAD_FILE" : i10 == 3 ? "PREPARE_FILE" : i10 == 4 ? "PREPARE_DFU" : i10 == 5 ? "DFU_ING" : i10 == 6 ? "DFU_SUCCESS" : i10 == 7 ? "DFU_FAIL" : "null";
    }
}
