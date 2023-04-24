package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.b;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ b.d f912a;

    /* renamed from: b */
    public final /* synthetic */ MenuItem f913b;

    /* renamed from: c */
    public final /* synthetic */ f f914c;

    /* renamed from: d */
    public final /* synthetic */ b.c f915d;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.f915d = cVar;
        this.f912a = dVar;
        this.f913b = hVar;
        this.f914c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.d dVar = this.f912a;
        if (dVar != null) {
            b.this.A = true;
            dVar.f910b.c(false);
            b.this.A = false;
        }
        if (this.f913b.isEnabled() && this.f913b.hasSubMenu()) {
            this.f914c.q(this.f913b, null, 4);
        }
    }
}
