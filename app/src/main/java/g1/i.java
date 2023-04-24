package g1;

import android.content.Context;
import g1.k;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class i implements Callable<k.a> {

    /* renamed from: a */
    public final /* synthetic */ String f14819a;

    /* renamed from: b */
    public final /* synthetic */ Context f14820b;

    /* renamed from: c */
    public final /* synthetic */ f f14821c;

    /* renamed from: d */
    public final /* synthetic */ int f14822d;

    public i(String str, Context context, f fVar, int i10) {
        this.f14819a = str;
        this.f14820b = context;
        this.f14821c = fVar;
        this.f14822d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final k.a call() {
        try {
            return k.a(this.f14819a, this.f14820b, this.f14821c, this.f14822d);
        } catch (Throwable unused) {
            return new k.a(-3);
        }
    }
}
