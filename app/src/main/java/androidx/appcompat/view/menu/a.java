package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.j;

/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: a */
    public Context f872a;

    /* renamed from: b */
    public Context f873b;

    /* renamed from: c */
    public f f874c;

    /* renamed from: d */
    public LayoutInflater f875d;

    /* renamed from: e */
    public j.a f876e;

    /* renamed from: f */
    public int f877f;

    /* renamed from: g */
    public int f878g;

    /* renamed from: h */
    public k f879h;

    /* renamed from: i */
    public int f880i;

    public a(Context context, int i10, int i11) {
        this.f872a = context;
        this.f875d = LayoutInflater.from(context);
        this.f877f = i10;
        this.f878g = i11;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        this.f876e = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return this.f880i;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(h hVar) {
        return false;
    }
}
