package ci;

import android.app.Dialog;
import android.os.Bundle;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class g extends s {
    public static final /* synthetic */ int H0 = 0;
    public final androidx.lifecycle.t0 G0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f4761b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(0);
            this.f4761b = eVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f4761b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.a<androidx.lifecycle.x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f4762b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tl.d dVar) {
            super(0);
            this.f4762b = dVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.x0 m() {
            return ih.b.a(this.f4762b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f4763b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.d dVar) {
            super(0);
            this.f4763b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f4763b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f4764b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f4765c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.fragment.app.r rVar, tl.d dVar) {
            super(0);
            this.f4764b = rVar;
            this.f4765c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f4765c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f4764b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.a<y0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(0);
            g.this = r1;
        }

        @Override // fm.a
        public final y0 m() {
            return g.this.W0();
        }
    }

    public g() {
        tl.d a10 = fb.e.a(new a(new e()));
        this.G0 = ab.b.f(this, gm.b0.a(SongPushViewModel.class), new b(a10), new c(a10), new d(this, a10));
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.tip_prompt);
        bVar.d(R.string.ds_song_transfer_cancel_msg);
        bVar.f(null);
        bVar.h(17039370, new vh.l(this, 1));
        return bVar.a();
    }
}
