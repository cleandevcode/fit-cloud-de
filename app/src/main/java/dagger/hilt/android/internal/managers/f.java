package dagger.hilt.android.internal.managers;

import androidx.fragment.app.r;
import ih.v;

/* loaded from: classes2.dex */
public final class f implements lk.b<Object> {

    /* renamed from: a */
    public volatile of.f f12961a;

    /* renamed from: b */
    public final Object f12962b = new Object();

    /* renamed from: c */
    public final r f12963c;

    /* loaded from: classes2.dex */
    public interface a {
        of.e n();
    }

    public f(r rVar) {
        this.f12963c = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
        r1 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.content.Context b(dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper r1) {
        /*
        L0:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto Lf
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 != 0) goto Lf
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L0
        Lf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dagger.hilt.android.internal.managers.f.b(dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper):android.content.Context");
    }

    public final Object a() {
        if (this.f12963c.j0() != null) {
            h7.a.h(this.f12963c.j0() instanceof lk.b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f12963c.j0().getClass());
            of.e n10 = ((a) v.f(this.f12963c.j0(), a.class)).n();
            r rVar = this.f12963c;
            n10.getClass();
            rVar.getClass();
            n10.getClass();
            return new of.f(n10.f23094a, n10.f23095b, n10.f23096c);
        }
        throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
    }

    @Override // lk.b
    public final Object h() {
        if (this.f12961a == null) {
            synchronized (this.f12962b) {
                if (this.f12961a == null) {
                    this.f12961a = (of.f) a();
                }
            }
        }
        return this.f12961a;
    }
}
