package kh;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import bi.r;
import com.topstep.fitcloudpro.R;
import f.q;
import gm.l;
import java.util.Date;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class c extends q {
    public static final /* synthetic */ int D0 = 0;
    public b B0;
    public final r C0 = new r();

    /* loaded from: classes2.dex */
    public static final class a {
        public static c a(Date date) {
            int[] iArr;
            if (date != null) {
                iArr = tb.a.s(date, null);
            } else {
                iArr = new int[]{2000, 1, 1};
            }
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putIntArray("date", iArr);
            cVar.Z0(bundle);
            return cVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void B(Date date);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void A0(Context context) {
        b bVar;
        l.f(context, "context");
        super.A0(context);
        androidx.fragment.app.r rVar = this.f2537v;
        if (rVar instanceof b) {
            bVar = (b) rVar;
        } else {
            bVar = null;
        }
        this.B0 = bVar;
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void F0() {
        super.F0();
        this.B0 = null;
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        int[] intArray = U0().getIntArray("date");
        l.c(intArray);
        m7.a aVar = new m7.a(V0());
        aVar.f(tb.a.r(new int[]{hh.b.f16095b, 1, 1}, null), null, o0(R.string.unit_year), o0(R.string.unit_month), o0(R.string.unit_day), this.C0);
        aVar.g(intArray[0], intArray[1], intArray[2]);
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.user_info_birthday);
        bVar.f(null);
        bVar.h(17039370, new kh.b(this, aVar, 0));
        bVar.m(aVar);
        return bVar.a();
    }
}
