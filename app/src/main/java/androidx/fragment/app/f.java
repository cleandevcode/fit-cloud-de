package androidx.fragment.app;

import android.animation.Animator;
import android.util.Log;
import androidx.fragment.app.f1;
import f1.d;

/* loaded from: classes.dex */
public final class f implements d.b {

    /* renamed from: a */
    public final /* synthetic */ Animator f2355a;

    /* renamed from: b */
    public final /* synthetic */ f1.b f2356b;

    public f(Animator animator, f1.b bVar) {
        this.f2355a = animator;
        this.f2356b = bVar;
    }

    @Override // f1.d.b
    public final void onCancel() {
        this.f2355a.end();
        if (j0.J(2)) {
            StringBuilder a10 = android.support.v4.media.d.a("Animator from operation ");
            a10.append(this.f2356b);
            a10.append(" has been canceled.");
            Log.v("FragmentManager", a10.toString());
        }
    }
}
