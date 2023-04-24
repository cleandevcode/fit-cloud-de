package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.f1;
import androidx.fragment.app.m;

/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2345a;

    /* renamed from: b */
    public final /* synthetic */ View f2346b;

    /* renamed from: c */
    public final /* synthetic */ boolean f2347c;

    /* renamed from: d */
    public final /* synthetic */ f1.b f2348d;

    /* renamed from: e */
    public final /* synthetic */ m.a f2349e;

    public e(ViewGroup viewGroup, View view, boolean z10, f1.b bVar, m.a aVar) {
        this.f2345a = viewGroup;
        this.f2346b = view;
        this.f2347c = z10;
        this.f2348d = bVar;
        this.f2349e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2345a.endViewTransition(this.f2346b);
        if (this.f2347c) {
            i1.a(this.f2348d.f2367a, this.f2346b);
        }
        this.f2349e.a();
        if (j0.J(2)) {
            StringBuilder a10 = android.support.v4.media.d.a("Animator from operation ");
            a10.append(this.f2348d);
            a10.append(" has ended.");
            Log.v("FragmentManager", a10.toString());
        }
    }
}
