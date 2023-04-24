package l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import o0.h;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    public final Context f18648a;

    /* renamed from: b */
    public h<c1.b, MenuItem> f18649b;

    /* renamed from: c */
    public h<c1.c, SubMenu> f18650c;

    public b(Context context) {
        this.f18648a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof c1.b) {
            c1.b bVar = (c1.b) menuItem;
            if (this.f18649b == null) {
                this.f18649b = new h<>();
            }
            MenuItem menuItem2 = this.f18649b.get(bVar);
            if (menuItem2 == null) {
                c cVar = new c(this.f18648a, bVar);
                this.f18649b.put(bVar, cVar);
                return cVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof c1.c) {
            c1.c cVar = (c1.c) subMenu;
            if (this.f18650c == null) {
                this.f18650c = new h<>();
            }
            SubMenu subMenu2 = this.f18650c.get(cVar);
            if (subMenu2 == null) {
                g gVar = new g(this.f18648a, cVar);
                this.f18650c.put(cVar, gVar);
                return gVar;
            }
            return subMenu2;
        }
        return subMenu;
    }
}
