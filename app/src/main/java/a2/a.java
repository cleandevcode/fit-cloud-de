package a2;

import android.view.ViewGroup;
import androidx.fragment.app.r;
import gm.l;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: b */
    public final ViewGroup f240b;

    public /* synthetic */ a(r rVar, ViewGroup viewGroup) {
        super(rVar, "Attempting to add fragment " + rVar + " to container " + viewGroup + " which is not a FragmentContainerView");
        this.f240b = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(r rVar, String str) {
        super(rVar, "Attempting to reuse fragment " + rVar + " with previous ID " + str);
        l.f(rVar, "fragment");
        l.f(str, "previousFragmentId");
    }
}
