package s;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 {
    public static /* synthetic */ String a(int i10) {
        if (i10 == 1) {
            return "INITIALIZED";
        }
        if (i10 == 2) {
            return "PENDING_OPEN";
        }
        if (i10 == 3) {
            return "OPENING";
        }
        if (i10 == 4) {
            return "OPENED";
        }
        if (i10 == 5) {
            return "CLOSING";
        }
        if (i10 == 6) {
            return "REOPENING";
        }
        if (i10 == 7) {
            return "RELEASING";
        }
        if (i10 == 8) {
            return "RELEASED";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i10) {
        return i10 == 1 ? "INITIALIZED" : i10 == 2 ? "PENDING_OPEN" : i10 == 3 ? "OPENING" : i10 == 4 ? "OPENED" : i10 == 5 ? "CLOSING" : i10 == 6 ? "REOPENING" : i10 == 7 ? "RELEASING" : i10 == 8 ? "RELEASED" : "null";
    }
}
