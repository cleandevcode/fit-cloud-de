package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import k.a;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a */
    public final Context f18014a;

    /* renamed from: b */
    public final k.a f18015b;

    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0312a {

        /* renamed from: a */
        public final ActionMode.Callback f18016a;

        /* renamed from: b */
        public final Context f18017b;

        /* renamed from: c */
        public final ArrayList<e> f18018c = new ArrayList<>();

        /* renamed from: d */
        public final o0.h<Menu, Menu> f18019d = new o0.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f18017b = context;
            this.f18016a = callback;
        }

        @Override // k.a.InterfaceC0312a
        public final boolean a(k.a aVar, MenuItem menuItem) {
            return this.f18016a.onActionItemClicked(e(aVar), new l.c(this.f18017b, (c1.b) menuItem));
        }

        @Override // k.a.InterfaceC0312a
        public final boolean b(k.a aVar, androidx.appcompat.view.menu.f fVar) {
            ActionMode.Callback callback = this.f18016a;
            e e10 = e(aVar);
            Menu orDefault = this.f18019d.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new l.e(this.f18017b, fVar);
                this.f18019d.put(fVar, orDefault);
            }
            return callback.onPrepareActionMode(e10, orDefault);
        }

        @Override // k.a.InterfaceC0312a
        public final boolean c(k.a aVar, androidx.appcompat.view.menu.f fVar) {
            ActionMode.Callback callback = this.f18016a;
            e e10 = e(aVar);
            Menu orDefault = this.f18019d.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new l.e(this.f18017b, fVar);
                this.f18019d.put(fVar, orDefault);
            }
            return callback.onCreateActionMode(e10, orDefault);
        }

        @Override // k.a.InterfaceC0312a
        public final void d(k.a aVar) {
            this.f18016a.onDestroyActionMode(e(aVar));
        }

        public final e e(k.a aVar) {
            int size = this.f18018c.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f18018c.get(i10);
                if (eVar != null && eVar.f18015b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f18017b, aVar);
            this.f18018c.add(eVar2);
            return eVar2;
        }
    }

    public e(Context context, k.a aVar) {
        this.f18014a = context;
        this.f18015b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f18015b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f18015b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new l.e(this.f18014a, this.f18015b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f18015b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f18015b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f18015b.f18000a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f18015b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f18015b.f18001b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f18015b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f18015b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f18015b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f18015b.l(i10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f18015b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f18015b.f18000a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f18015b.n(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f18015b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f18015b.p(z10);
    }
}
