package k;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import k1.i2;
import k1.j2;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c */
    public Interpolator f18057c;

    /* renamed from: d */
    public j2 f18058d;

    /* renamed from: e */
    public boolean f18059e;

    /* renamed from: b */
    public long f18056b = -1;

    /* renamed from: f */
    public final a f18060f = new a();

    /* renamed from: a */
    public final ArrayList<i2> f18055a = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a extends com.bumptech.glide.manager.g {

        /* renamed from: a */
        public boolean f18061a = false;

        /* renamed from: b */
        public int f18062b = 0;

        public a() {
            h.this = r1;
        }

        @Override // com.bumptech.glide.manager.g, k1.j2
        public final void c() {
            if (this.f18061a) {
                return;
            }
            this.f18061a = true;
            j2 j2Var = h.this.f18058d;
            if (j2Var != null) {
                j2Var.c();
            }
        }

        @Override // k1.j2
        public final void e() {
            int i10 = this.f18062b + 1;
            this.f18062b = i10;
            if (i10 == h.this.f18055a.size()) {
                j2 j2Var = h.this.f18058d;
                if (j2Var != null) {
                    j2Var.e();
                }
                this.f18062b = 0;
                this.f18061a = false;
                h.this.f18059e = false;
            }
        }
    }

    public final void a() {
        if (this.f18059e) {
            Iterator<i2> it = this.f18055a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f18059e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f18059e) {
            return;
        }
        Iterator<i2> it = this.f18055a.iterator();
        while (it.hasNext()) {
            i2 next = it.next();
            long j10 = this.f18056b;
            if (j10 >= 0) {
                next.c(j10);
            }
            Interpolator interpolator = this.f18057c;
            if (interpolator != null && (view = next.f18125a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f18058d != null) {
                next.d(this.f18060f);
            }
            View view2 = next.f18125a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f18059e = true;
    }
}
