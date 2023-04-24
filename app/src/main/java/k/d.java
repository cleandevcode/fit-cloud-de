package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.a;

/* loaded from: classes.dex */
public final class d extends a implements f.a {

    /* renamed from: c */
    public Context f18008c;

    /* renamed from: d */
    public ActionBarContextView f18009d;

    /* renamed from: e */
    public a.InterfaceC0312a f18010e;

    /* renamed from: f */
    public WeakReference<View> f18011f;

    /* renamed from: g */
    public boolean f18012g;

    /* renamed from: h */
    public androidx.appcompat.view.menu.f f18013h;

    public d(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0312a interfaceC0312a) {
        this.f18008c = context;
        this.f18009d = actionBarContextView;
        this.f18010e = interfaceC0312a;
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(actionBarContextView.getContext());
        fVar.f943l = 1;
        this.f18013h = fVar;
        fVar.f936e = this;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        return this.f18010e.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        i();
        androidx.appcompat.widget.c cVar = this.f18009d.f1256d;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // k.a
    public final void c() {
        if (this.f18012g) {
            return;
        }
        this.f18012g = true;
        this.f18010e.d(this);
    }

    @Override // k.a
    public final View d() {
        WeakReference<View> weakReference = this.f18011f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // k.a
    public final androidx.appcompat.view.menu.f e() {
        return this.f18013h;
    }

    @Override // k.a
    public final MenuInflater f() {
        return new g(this.f18009d.getContext());
    }

    @Override // k.a
    public final CharSequence g() {
        return this.f18009d.getSubtitle();
    }

    @Override // k.a
    public final CharSequence h() {
        return this.f18009d.getTitle();
    }

    @Override // k.a
    public final void i() {
        this.f18010e.b(this, this.f18013h);
    }

    @Override // k.a
    public final boolean j() {
        return this.f18009d.f1043s;
    }

    @Override // k.a
    public final void k(View view) {
        this.f18009d.setCustomView(view);
        this.f18011f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // k.a
    public final void l(int i10) {
        m(this.f18008c.getString(i10));
    }

    @Override // k.a
    public final void m(CharSequence charSequence) {
        this.f18009d.setSubtitle(charSequence);
    }

    @Override // k.a
    public final void n(int i10) {
        o(this.f18008c.getString(i10));
    }

    @Override // k.a
    public final void o(CharSequence charSequence) {
        this.f18009d.setTitle(charSequence);
    }

    @Override // k.a
    public final void p(boolean z10) {
        this.f18001b = z10;
        this.f18009d.setTitleOptional(z10);
    }
}
