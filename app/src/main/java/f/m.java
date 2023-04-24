package f;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ j f13956a;

    /* loaded from: classes.dex */
    public class a extends com.bumptech.glide.manager.g {
        public a() {
            m.this = r1;
        }

        @Override // com.bumptech.glide.manager.g, k1.j2
        public final void c() {
            m.this.f13956a.f13909p.setVisibility(0);
        }

        @Override // k1.j2
        public final void e() {
            m.this.f13956a.f13909p.setAlpha(1.0f);
            m.this.f13956a.f13912s.d(null);
            m.this.f13956a.f13912s = null;
        }
    }

    public m(j jVar) {
        this.f13956a = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0050  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r4 = this;
            f.j r0 = r4.f13956a
            android.widget.PopupWindow r1 = r0.f13910q
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f13909p
            r2 = 55
            r3 = 0
            r1.showAtLocation(r0, r2, r3, r3)
            f.j r0 = r4.f13956a
            k1.i2 r0 = r0.f13912s
            if (r0 == 0) goto L15
            r0.b()
        L15:
            f.j r0 = r4.f13956a
            boolean r1 = r0.f13914u
            if (r1 == 0) goto L29
            android.view.ViewGroup r0 = r0.f13915v
            if (r0 == 0) goto L29
            java.util.WeakHashMap<android.view.View, k1.i2> r1 = k1.o0.f18161a
            boolean r0 = k1.o0.g.c(r0)
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L50
            f.j r0 = r4.f13956a
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f13909p
            r2 = 0
            r0.setAlpha(r2)
            f.j r0 = r4.f13956a
            androidx.appcompat.widget.ActionBarContextView r2 = r0.f13909p
            k1.i2 r2 = k1.o0.a(r2)
            r2.a(r1)
            r0.f13912s = r2
            f.j r0 = r4.f13956a
            k1.i2 r0 = r0.f13912s
            f.m$a r1 = new f.m$a
            r1.<init>()
            r0.d(r1)
            goto L5e
        L50:
            f.j r0 = r4.f13956a
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f13909p
            r0.setAlpha(r1)
            f.j r0 = r4.f13956a
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f13909p
            r0.setVisibility(r3)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.m.run():void");
    }
}
