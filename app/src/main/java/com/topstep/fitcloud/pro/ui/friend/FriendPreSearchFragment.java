package com.topstep.fitcloud.pro.ui.friend;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.topstep.fitcloud.pro.databinding.FragmentFriendPreSearchBinding;
import com.topstep.fitcloudpro.R;
import fm.l;
import gm.b0;
import gm.m;
import gm.t;
import kotlin.Metadata;
import mm.h;

@Metadata
/* loaded from: classes2.dex */
public final class FriendPreSearchFragment extends lh.c {

    /* renamed from: n0 */
    public static final /* synthetic */ h<Object>[] f11624n0;

    /* renamed from: m0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11625m0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<TextView, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            FriendPreSearchFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(TextView textView) {
            gm.l.f(textView, "it");
            tb.a.f(FriendPreSearchFragment.this).n(new i2.a(R.id.toSearch));
            return tl.l.f28297a;
        }
    }

    static {
        t tVar = new t(FriendPreSearchFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentFriendPreSearchBinding;", 0);
        b0.f15488a.getClass();
        f11624n0 = new h[]{tVar};
    }

    public FriendPreSearchFragment() {
        super(R.layout.fragment_friend_pre_search);
        this.f11625m0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentFriendPreSearchBinding.class, this);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        p.b.g(((FragmentFriendPreSearchBinding) this.f11625m0.a(this, f11624n0[0])).tvSearch, new a());
    }
}
