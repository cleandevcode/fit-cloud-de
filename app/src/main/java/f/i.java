package f;

import android.content.Context;
import android.content.res.Configuration;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a */
    public static int f13880a = -100;

    /* renamed from: b */
    public static final o0.d<WeakReference<i>> f13881b = new o0.d<>();

    /* renamed from: c */
    public static final Object f13882c = new Object();

    public static void q(i iVar) {
        synchronized (f13882c) {
            Iterator<WeakReference<i>> it = f13881b.iterator();
            while (it.hasNext()) {
                i iVar2 = it.next().get();
                if (iVar2 == iVar || iVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean d();

    public Context e(Context context) {
        return context;
    }

    public abstract <T extends View> T f(int i10);

    public int g() {
        return -100;
    }

    public abstract MenuInflater h();

    public abstract void i();

    public abstract void j();

    public abstract void k(Configuration configuration);

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract boolean r(int i10);

    public abstract void s(int i10);

    public abstract void t(View view);

    public abstract void u(View view, ViewGroup.LayoutParams layoutParams);

    public void v(int i10) {
    }

    public abstract void w(CharSequence charSequence);
}
