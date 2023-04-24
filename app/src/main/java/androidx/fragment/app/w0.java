package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w0 implements Transition.TransitionListener {

    /* renamed from: a */
    public final /* synthetic */ Object f2603a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f2604b;

    /* renamed from: c */
    public final /* synthetic */ Object f2605c = null;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f2606d = null;

    /* renamed from: e */
    public final /* synthetic */ Object f2607e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f2608f;

    /* renamed from: g */
    public final /* synthetic */ v0 f2609g;

    public w0(v0 v0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f2609g = v0Var;
        this.f2603a = obj;
        this.f2604b = arrayList;
        this.f2607e = obj2;
        this.f2608f = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        Object obj = this.f2603a;
        if (obj != null) {
            this.f2609g.t(obj, this.f2604b, null);
        }
        Object obj2 = this.f2605c;
        if (obj2 != null) {
            this.f2609g.t(obj2, this.f2606d, null);
        }
        Object obj3 = this.f2607e;
        if (obj3 != null) {
            this.f2609g.t(obj3, this.f2608f, null);
        }
    }
}
