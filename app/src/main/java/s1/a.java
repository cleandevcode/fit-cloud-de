package s1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends IOException {
    public a(String str) {
        super(str, null);
    }

    public a(w1.z zVar) {
        super("Unable to parse preferences proto.", zVar);
    }
}
