package ka;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.textfield.b f18212a;

    public h(com.google.android.material.textfield.b bVar) {
        this.f18212a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        com.google.android.material.textfield.b bVar = this.f18212a;
        bVar.f18218c.setChecked(bVar.f6858m);
        this.f18212a.f6864s.start();
    }
}
