package yk;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public static final a f31795a = new a();

    /* loaded from: classes2.dex */
    public static final class a implements wk.b<Object, Object> {
    }

    public static void a(int i10, String str) {
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i10);
    }
}
