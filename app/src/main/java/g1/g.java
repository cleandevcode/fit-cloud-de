package g1;

import android.content.Context;
import g1.k;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class g implements Callable<k.a> {

    /* renamed from: a */
    public final /* synthetic */ String f14814a;

    /* renamed from: b */
    public final /* synthetic */ Context f14815b;

    /* renamed from: c */
    public final /* synthetic */ f f14816c;

    /* renamed from: d */
    public final /* synthetic */ int f14817d;

    public g(String str, Context context, f fVar, int i10) {
        this.f14814a = str;
        this.f14815b = context;
        this.f14816c = fVar;
        this.f14817d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final k.a call() {
        return k.a(this.f14814a, this.f14815b, this.f14816c, this.f14817d);
    }
}
