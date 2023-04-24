package androidx.fragment.app;

/* loaded from: classes.dex */
public final /* synthetic */ class h1 {
    public static String a(Class cls, StringBuilder sb2, String str) {
        sb2.append(cls.getName());
        sb2.append(str);
        return sb2.toString();
    }

    public static void b(int i10, StringBuilder sb2, String str, ie.a aVar) {
        sb2.append(o8.b.q(i10));
        sb2.append(str);
        sb2.append(aVar.toString());
        ge.b.p(sb2.toString());
    }

    public static /* synthetic */ String c(int i10) {
        return i10 == 1 ? "NONE" : i10 == 2 ? "ADDING" : i10 == 3 ? "REMOVING" : "null";
    }
}
