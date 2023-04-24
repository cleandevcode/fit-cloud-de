package com.topstep.fitcloud.pro.ui.device.game.push;

import ai.f;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.r;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.topstep.fitcloud.pro.databinding.FragmentGamePacketParentBinding;
import com.topstep.fitcloudpro.R;
import gm.b0;
import gm.l;
import gm.t;
import kotlin.Metadata;
import lh.c;
import mm.h;
import n6.e;
import s.i;

@Metadata
/* loaded from: classes2.dex */
public final class GamePacketParentFragment extends c {

    /* renamed from: n0 */
    public static final /* synthetic */ h<Object>[] f11057n0;

    /* renamed from: m0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11058m0;

    /* loaded from: classes2.dex */
    public static final class a extends FragmentStateAdapter {
        public a(GamePacketParentFragment gamePacketParentFragment) {
            super(gamePacketParentFragment);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public final r A(int i10) {
            f.a aVar = f.f542s0;
            boolean z10 = i10 != 0;
            aVar.getClass();
            f fVar = new f();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_local", z10);
            fVar.Z0(bundle);
            return fVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int e() {
            return 2;
        }
    }

    static {
        t tVar = new t(GamePacketParentFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentGamePacketParentBinding;", 0);
        b0.f15488a.getClass();
        f11057n0 = new h[]{tVar};
    }

    public GamePacketParentFragment() {
        super(R.layout.fragment_game_packet_parent);
        this.f11058m0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentGamePacketParentBinding.class, this);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        e1().toolbar.setNavigationOnClickListener(new e(5, this));
        e1().viewPager.setAdapter(new a(this));
        new com.google.android.material.tabs.e(e1().tabLayout, e1().viewPager, new i(9, this)).a();
    }

    public final FragmentGamePacketParentBinding e1() {
        return (FragmentGamePacketParentBinding) this.f11058m0.a(this, f11057n0[0]);
    }
}
