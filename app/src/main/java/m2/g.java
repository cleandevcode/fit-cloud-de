package m2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import m2.t;
import r2.c;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public final Context f20194a;

    /* renamed from: b */
    public final String f20195b;

    /* renamed from: c */
    public final c.InterfaceC0458c f20196c;

    /* renamed from: d */
    public final t.c f20197d;

    /* renamed from: e */
    public final List<t.b> f20198e;

    /* renamed from: f */
    public final boolean f20199f;

    /* renamed from: g */
    public final int f20200g;

    /* renamed from: h */
    public final Executor f20201h;

    /* renamed from: i */
    public final Executor f20202i;

    /* renamed from: j */
    public final Intent f20203j;

    /* renamed from: k */
    public final boolean f20204k;

    /* renamed from: l */
    public final boolean f20205l;

    /* renamed from: m */
    public final Set<Integer> f20206m;

    /* renamed from: n */
    public final Callable<InputStream> f20207n;

    /* renamed from: o */
    public final List<Object> f20208o;

    /* renamed from: p */
    public final List<Object> f20209p;

    /* renamed from: q */
    public final boolean f20210q;

    @SuppressLint({"LambdaLast"})
    public g(Context context, String str, c.InterfaceC0458c interfaceC0458c, t.c cVar, ArrayList arrayList, boolean z10, int i10, Executor executor, Executor executor2, boolean z11, boolean z12, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        gm.l.f(context, "context");
        gm.l.f(cVar, "migrationContainer");
        gm.k.b(i10, "journalMode");
        gm.l.f(arrayList2, "typeConverters");
        gm.l.f(arrayList3, "autoMigrationSpecs");
        this.f20194a = context;
        this.f20195b = str;
        this.f20196c = interfaceC0458c;
        this.f20197d = cVar;
        this.f20198e = arrayList;
        this.f20199f = z10;
        this.f20200g = i10;
        this.f20201h = executor;
        this.f20202i = executor2;
        this.f20203j = null;
        this.f20204k = z11;
        this.f20205l = z12;
        this.f20206m = linkedHashSet;
        this.f20207n = null;
        this.f20208o = arrayList2;
        this.f20209p = arrayList3;
        this.f20210q = false;
    }

    public final boolean a(int i10, int i11) {
        Set<Integer> set;
        return !((i10 > i11) && this.f20205l) && this.f20204k && ((set = this.f20206m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
