package a1;

/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public static String a(StringBuilder sb2, int i10, char c10) {
        sb2.append(i10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static /* synthetic */ String b(int i10) {
        return i10 == 1 ? "LEGACY_UNKNOWN" : i10 == 2 ? "CONNECTABLE" : i10 == 3 ? "NOT_CONNECTABLE" : "null";
    }

    public static /* synthetic */ String c(int i10) {
        return i10 == 1 ? "BEGIN_ARRAY" : i10 == 2 ? "END_ARRAY" : i10 == 3 ? "BEGIN_OBJECT" : i10 == 4 ? "END_OBJECT" : i10 == 5 ? "NAME" : i10 == 6 ? "STRING" : i10 == 7 ? "NUMBER" : i10 == 8 ? "BOOLEAN" : i10 == 9 ? "NULL" : i10 == 10 ? "END_DOCUMENT" : "null";
    }
}
