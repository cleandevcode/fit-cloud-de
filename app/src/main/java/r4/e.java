package r4;

import java.io.IOException;

/* loaded from: classes.dex */
public final class e extends IOException {
    public e(String str, int i10, IOException iOException) {
        super(str + ", status code: " + i10, iOException);
    }
}
