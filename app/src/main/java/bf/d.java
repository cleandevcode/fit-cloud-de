package bf;

/* loaded from: classes.dex */
public final class d extends we.a {
    public static boolean s(int i10) {
        if (i10 == 4 || i10 == 6 || i10 == 7 || i10 == 8 || i10 == 13 || i10 == 10) {
            return true;
        }
        ge.b.o(String.format("not support section size check for ic:0x%02X", Integer.valueOf(i10)), we.a.f29796b);
        return false;
    }
}
