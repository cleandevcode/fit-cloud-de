package v2;

import android.animation.Animator;
import v2.d;

/* loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a */
    public final /* synthetic */ d.a f28996a;

    /* renamed from: b */
    public final /* synthetic */ d f28997b;

    public c(d dVar, d.a aVar) {
        this.f28997b = dVar;
        this.f28996a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.f28997b.a(1.0f, this.f28996a, true);
        d.a aVar = this.f28996a;
        aVar.f29017k = aVar.f29011e;
        aVar.f29018l = aVar.f29012f;
        aVar.f29019m = aVar.f29013g;
        aVar.a((aVar.f29016j + 1) % aVar.f29015i.length);
        d dVar = this.f28997b;
        if (dVar.f29006f) {
            dVar.f29006f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            d.a aVar2 = this.f28996a;
            if (aVar2.f29020n) {
                aVar2.f29020n = false;
                return;
            }
            return;
        }
        dVar.f29005e += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f28997b.f29005e = 0.0f;
    }
}
