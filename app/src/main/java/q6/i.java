package q6;

import android.os.Bundle;
import androidx.fragment.app.a0;
import o5.n;
import o5.p;
import o5.q0;
import o5.v;
import p5.m;

/* loaded from: classes.dex */
public final class i extends a0 {

    /* renamed from: a */
    public final /* synthetic */ n<p6.a> f24625a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n<p6.a> nVar) {
        super(nVar);
        this.f24625a = nVar;
    }

    public final void H(d6.a aVar) {
        n<p6.a> nVar = this.f24625a;
        ge.b.l("cancelled", null);
        if (nVar == null) {
            return;
        }
        nVar.onCancel();
    }

    public final void I(d6.a aVar, p pVar) {
        n<p6.a> nVar = this.f24625a;
        ge.b.l("error", pVar.getMessage());
        if (nVar == null) {
            return;
        }
        nVar.onError(pVar);
    }

    public final void J(d6.a aVar, Bundle bundle) {
        if (bundle != null) {
            String str = "completionGesture";
            if (!bundle.containsKey("completionGesture")) {
                str = "com.facebook.platform.extra.COMPLETION_GESTURE";
            }
            String string = bundle.getString(str);
            if (string != null && !om.h.V("post", string)) {
                if (om.h.V("cancel", string)) {
                    n<p6.a> nVar = this.f24625a;
                    ge.b.l("cancelled", null);
                    if (nVar != null) {
                        nVar.onCancel();
                        return;
                    }
                    return;
                }
                n<p6.a> nVar2 = this.f24625a;
                p pVar = new p("UnknownError");
                ge.b.l("error", pVar.getMessage());
                if (nVar2 != null) {
                    nVar2.onError(pVar);
                    return;
                }
                return;
            }
            n<p6.a> nVar3 = this.f24625a;
            String str2 = "postId";
            if (!bundle.containsKey("postId")) {
                str2 = "com.facebook.platform.extra.POST_ID";
                if (!bundle.containsKey("com.facebook.platform.extra.POST_ID")) {
                    str2 = "post_id";
                }
            }
            bundle.getString(str2);
            m mVar = new m(v.a(), (String) null);
            Bundle bundle2 = new Bundle();
            bundle2.putString("fb_share_dialog_outcome", "succeeded");
            if (q0.b()) {
                mVar.f("fb_share_dialog_result", bundle2);
            }
            if (nVar3 != null) {
                nVar3.onSuccess(new p6.a());
            }
        }
    }
}
