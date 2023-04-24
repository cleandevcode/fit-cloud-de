package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends ContextWrapper {

    /* renamed from: k */
    public static final a f5667k = new a();

    /* renamed from: a */
    public final u4.b f5668a;

    /* renamed from: b */
    public final m5.f f5669b;

    /* renamed from: c */
    public final a.g f5670c;

    /* renamed from: d */
    public final b.a f5671d;

    /* renamed from: e */
    public final List<i5.f<Object>> f5672e;

    /* renamed from: f */
    public final Map<Class<?>, p<?, ?>> f5673f;

    /* renamed from: g */
    public final t4.o f5674g;

    /* renamed from: h */
    public final i f5675h;

    /* renamed from: i */
    public final int f5676i;

    /* renamed from: j */
    public i5.g f5677j;

    public h(Context context, u4.b bVar, l lVar, a.g gVar, c cVar, o0.b bVar2, List list, t4.o oVar, i iVar, int i10) {
        super(context.getApplicationContext());
        this.f5668a = bVar;
        this.f5670c = gVar;
        this.f5671d = cVar;
        this.f5672e = list;
        this.f5673f = bVar2;
        this.f5674g = oVar;
        this.f5675h = iVar;
        this.f5676i = i10;
        this.f5669b = new m5.f(lVar);
    }

    public final k a() {
        return (k) this.f5669b.get();
    }
}
