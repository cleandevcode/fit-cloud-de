package k1;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.h;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    public a f18093a;

    /* loaded from: classes.dex */
    public interface a {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(androidx.appcompat.view.menu.m mVar) {
    }

    public boolean g() {
        return false;
    }

    public void h(h.a aVar) {
        if (this.f18093a != null) {
            StringBuilder a10 = android.support.v4.media.d.a("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            a10.append(getClass().getSimpleName());
            a10.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", a10.toString());
        }
        this.f18093a = aVar;
    }
}
