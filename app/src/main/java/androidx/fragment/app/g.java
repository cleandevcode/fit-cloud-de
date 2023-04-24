package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.f1;
import androidx.fragment.app.m;

/* loaded from: classes.dex */
public final class g implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ f1.b f2374a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f2375b;

    /* renamed from: c */
    public final /* synthetic */ View f2376c;

    /* renamed from: d */
    public final /* synthetic */ m.a f2377d;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            g.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            gVar.f2375b.endViewTransition(gVar.f2376c);
            g.this.f2377d.a();
        }
    }

    public g(View view, ViewGroup viewGroup, m.a aVar, f1.b bVar) {
        this.f2374a = bVar;
        this.f2375b = viewGroup;
        this.f2376c = view;
        this.f2377d = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f2375b.post(new a());
        if (j0.J(2)) {
            StringBuilder a10 = android.support.v4.media.d.a("Animation from operation ");
            a10.append(this.f2374a);
            a10.append(" has ended.");
            Log.v("FragmentManager", a10.toString());
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (j0.J(2)) {
            StringBuilder a10 = android.support.v4.media.d.a("Animation from operation ");
            a10.append(this.f2374a);
            a10.append(" has reached onAnimationStart.");
            Log.v("FragmentManager", a10.toString());
        }
    }
}
