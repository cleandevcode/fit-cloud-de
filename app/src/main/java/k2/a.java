package k2;

import android.view.Menu;
import android.view.MenuItem;
import ba.f;
import gm.l;
import i2.m;
import i2.v;
import java.lang.ref.WeakReference;
import p001if.d;

/* loaded from: classes.dex */
public final class a implements m.b {

    /* renamed from: a */
    public final /* synthetic */ WeakReference<f> f18186a;

    /* renamed from: b */
    public final /* synthetic */ m f18187b;

    public a(WeakReference<f> weakReference, m mVar) {
        this.f18186a = weakReference;
        this.f18187b = mVar;
    }

    @Override // i2.m.b
    public final void a(m mVar, v vVar) {
        l.f(mVar, "controller");
        l.f(vVar, "destination");
        f fVar = this.f18186a.get();
        if (fVar == null) {
            m mVar2 = this.f18187b;
            mVar2.getClass();
            mVar2.f16337p.remove(this);
            return;
        }
        Menu menu = fVar.getMenu();
        l.e(menu, "view.menu");
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = menu.getItem(i10);
            l.b(item, "getItem(index)");
            if (d.e(vVar, item.getItemId())) {
                item.setChecked(true);
            }
        }
    }
}
