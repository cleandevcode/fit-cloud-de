package y3;

import android.os.Looper;

/* loaded from: classes.dex */
public final class i1 extends gm.m implements fm.a<Boolean> {

    /* renamed from: b */
    public static final i1 f30960b = new i1();

    public i1() {
        super(0);
    }

    @Override // fm.a
    public final Boolean m() {
        return Boolean.valueOf(gm.l.a(Looper.myLooper(), Looper.getMainLooper()));
    }
}
