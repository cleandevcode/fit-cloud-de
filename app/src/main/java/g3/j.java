package g3;

import java.util.HashMap;
import java.util.HashSet;
import p2.a;

/* loaded from: classes.dex */
public final /* synthetic */ class j {
    public static HashSet a(HashMap hashMap, String str, a.C0427a c0427a, int i10) {
        hashMap.put(str, c0427a);
        return new HashSet(i10);
    }

    public static /* synthetic */ String b(int i10) {
        return i10 == 1 ? "UNINITIALIZED" : i10 == 2 ? "SESSION_INITIALIZED" : i10 == 3 ? "ON_CAPTURE_SESSION_STARTED" : i10 == 4 ? "ON_CAPTURE_SESSION_ENDED" : i10 == 5 ? "CLOSED" : "null";
    }
}
