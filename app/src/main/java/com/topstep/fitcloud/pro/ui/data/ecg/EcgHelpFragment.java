package com.topstep.fitcloud.pro.ui.data.ecg;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.topstep.fitcloud.pro.databinding.FragmentEcgHelpBinding;
import com.topstep.fitcloudpro.R;
import gm.b0;
import gm.l;
import gm.t;
import kotlin.Metadata;
import lh.i;
import mm.h;

@Metadata
/* loaded from: classes2.dex */
public final class EcgHelpFragment extends i {

    /* renamed from: p0 */
    public static final /* synthetic */ h<Object>[] f10730p0;

    /* renamed from: o0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10731o0;

    /* loaded from: classes2.dex */
    public static final class a extends b3.a {

        /* renamed from: b */
        public final View[] f10732b = new View[3];

        @Override // b3.a
        public final void a(ViewGroup viewGroup, Object obj) {
            l.f(viewGroup, "container");
            l.f(obj, "o");
            viewGroup.removeView((View) obj);
        }

        @Override // b3.a
        public final int b() {
            return this.f10732b.length;
        }

        @Override // b3.a
        public final Object c(ViewGroup viewGroup, int i10) {
            l.f(viewGroup, "container");
            View view = this.f10732b[i10];
            if (view == null) {
                int i11 = i10 != 0 ? i10 != 1 ? R.layout.layout_ecg_tips_view3 : R.layout.layout_ecg_tips_view2 : R.layout.layout_ecg_tips_view1;
                Context context = viewGroup.getContext();
                View inflate = LayoutInflater.from(context).inflate(i11, viewGroup, false);
                this.f10732b[i10] = inflate;
                if (i11 == R.layout.layout_ecg_tips_view3) {
                    String string = context.getString(R.string.app_name);
                    l.e(string, "context.getString(R.string.app_name)");
                    ((TextView) inflate.findViewById(R.id.tv_ecg_tips_view3_title)).setText(context.getString(R.string.ecg_tips_view_title2, string));
                }
                view = inflate;
            }
            viewGroup.addView(view);
            l.c(view);
            return view;
        }

        @Override // b3.a
        public final boolean d(View view, Object obj) {
            l.f(view, "view");
            l.f(obj, "o");
            return l.a(view, obj);
        }
    }

    static {
        t tVar = new t(EcgHelpFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentEcgHelpBinding;", 0);
        b0.f15488a.getClass();
        f10730p0 = new h[]{tVar};
    }

    public EcgHelpFragment() {
        super(R.layout.fragment_ecg_help);
        this.f10731o0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentEcgHelpBinding.class, this);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        com.topstep.fitcloud.pro.utils.viewbinding.a aVar = this.f10731o0;
        h<?>[] hVarArr = f10730p0;
        ((FragmentEcgHelpBinding) aVar.a(this, hVarArr[0])).viewPagerIndicator.c(((FragmentEcgHelpBinding) this.f10731o0.a(this, hVarArr[0])).viewPager);
        ((FragmentEcgHelpBinding) this.f10731o0.a(this, hVarArr[0])).viewPager.setAdapter(new a());
    }
}
