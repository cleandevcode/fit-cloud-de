package bi;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.appcompat.app.AlertController;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.DeviceViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class r0 extends f.q {
    public static final /* synthetic */ int E0 = 0;
    public final androidx.lifecycle.t0 B0;
    public final SparseIntArray C0;
    public final ArrayList D0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.a<androidx.lifecycle.y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f4345b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(0);
            this.f4345b = eVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.y0 m() {
            return (androidx.lifecycle.y0) this.f4345b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.a<androidx.lifecycle.x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f4346b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tl.d dVar) {
            super(0);
            this.f4346b = dVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.x0 m() {
            return ih.b.a(this.f4346b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f4347b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.d dVar) {
            super(0);
            this.f4347b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            androidx.lifecycle.y0 b10 = ab.b.b(this.f4347b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f4348b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f4349c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.fragment.app.r rVar, tl.d dVar) {
            super(0);
            this.f4348b = rVar;
            this.f4349c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            androidx.lifecycle.y0 b10 = ab.b.b(this.f4349c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f4348b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.a<androidx.lifecycle.y0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(0);
            r0.this = r1;
        }

        @Override // fm.a
        public final androidx.lifecycle.y0 m() {
            return r0.this.W0();
        }
    }

    public r0() {
        tl.d a10 = fb.e.a(new a(new e()));
        this.B0 = ab.b.f(this, gm.b0.a(DeviceViewModel.class), new b(a10), new c(a10), new d(this, a10));
        this.C0 = new SparseIntArray(15);
        this.D0 = new ArrayList(15);
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        final nj.c c10 = ((DeviceViewModel) this.B0.getValue()).f10182h.D().c();
        final nj.i iVar = new nj.i(((jj.l) ((DeviceViewModel) this.B0.getValue()).f10182h.D().f23334a).f17931e.get((byte) 23));
        this.C0.clear();
        this.D0.clear();
        if (c10.h(1)) {
            SparseIntArray sparseIntArray = this.C0;
            sparseIntArray.put(sparseIntArray.size(), 1);
            ArrayList arrayList = this.D0;
            String o02 = o0(R.string.ds_page_config_step);
            gm.l.e(o02, "getString(R.string.ds_page_config_step)");
            arrayList.add(o02);
        }
        if (c10.h(2)) {
            SparseIntArray sparseIntArray2 = this.C0;
            sparseIntArray2.put(sparseIntArray2.size(), 2);
            ArrayList arrayList2 = this.D0;
            String o03 = o0(R.string.ds_page_config_distance);
            gm.l.e(o03, "getString(R.string.ds_page_config_distance)");
            arrayList2.add(o03);
        }
        if (c10.h(3)) {
            SparseIntArray sparseIntArray3 = this.C0;
            sparseIntArray3.put(sparseIntArray3.size(), 3);
            ArrayList arrayList3 = this.D0;
            String o04 = o0(R.string.ds_page_config_calorie);
            gm.l.e(o04, "getString(R.string.ds_page_config_calorie)");
            arrayList3.add(o04);
        }
        if (c10.h(4)) {
            SparseIntArray sparseIntArray4 = this.C0;
            sparseIntArray4.put(sparseIntArray4.size(), 4);
            ArrayList arrayList4 = this.D0;
            String o05 = o0(R.string.ds_page_config_sleep);
            gm.l.e(o05, "getString(R.string.ds_page_config_sleep)");
            arrayList4.add(o05);
        }
        if (c10.h(5)) {
            SparseIntArray sparseIntArray5 = this.C0;
            sparseIntArray5.put(sparseIntArray5.size(), 5);
            ArrayList arrayList5 = this.D0;
            String o06 = o0(R.string.ds_page_config_heart_rate);
            gm.l.e(o06, "getString(R.string.ds_page_config_heart_rate)");
            arrayList5.add(o06);
        }
        if (c10.h(6)) {
            SparseIntArray sparseIntArray6 = this.C0;
            sparseIntArray6.put(sparseIntArray6.size(), 6);
            ArrayList arrayList6 = this.D0;
            String o07 = o0(R.string.ds_page_config_oxygen);
            gm.l.e(o07, "getString(R.string.ds_page_config_oxygen)");
            arrayList6.add(o07);
        }
        if (c10.h(7)) {
            SparseIntArray sparseIntArray7 = this.C0;
            sparseIntArray7.put(sparseIntArray7.size(), 7);
            ArrayList arrayList7 = this.D0;
            String o08 = o0(R.string.ds_page_config_blood_pressure);
            gm.l.e(o08, "getString(R.string.ds_page_config_blood_pressure)");
            arrayList7.add(o08);
        }
        if (c10.h(8)) {
            SparseIntArray sparseIntArray8 = this.C0;
            sparseIntArray8.put(sparseIntArray8.size(), 8);
            ArrayList arrayList8 = this.D0;
            String o09 = o0(R.string.ds_page_config_weather);
            gm.l.e(o09, "getString(R.string.ds_page_config_weather)");
            arrayList8.add(o09);
        }
        if (c10.h(9)) {
            SparseIntArray sparseIntArray9 = this.C0;
            sparseIntArray9.put(sparseIntArray9.size(), 9);
            ArrayList arrayList9 = this.D0;
            String o010 = o0(R.string.ds_page_config_find_phone);
            gm.l.e(o010, "getString(R.string.ds_page_config_find_phone)");
            arrayList9.add(o010);
        }
        if (c10.h(13)) {
            SparseIntArray sparseIntArray10 = this.C0;
            sparseIntArray10.put(sparseIntArray10.size(), 13);
            ArrayList arrayList10 = this.D0;
            String o011 = o0(R.string.ds_page_config_stop_watch);
            gm.l.e(o011, "getString(R.string.ds_page_config_stop_watch)");
            arrayList10.add(o011);
        }
        final boolean[] zArr = new boolean[this.C0.size()];
        int size = this.C0.size();
        for (int i10 = 0; i10 < size; i10++) {
            zArr[i10] = iVar.d(this.C0.get(this.C0.keyAt(i10)));
        }
        CharSequence[] charSequenceArr = new CharSequence[this.D0.size()];
        int size2 = this.D0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            charSequenceArr[i11] = (CharSequence) this.D0.get(i11);
        }
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.ds_page_config);
        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener = new DialogInterface.OnMultiChoiceClickListener() { // from class: bi.p0
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i12, boolean z10) {
                boolean[] zArr2 = zArr;
                int i13 = r0.E0;
                gm.l.f(zArr2, "$checks");
                zArr2[i12] = z10;
            }
        };
        AlertController.b bVar2 = bVar.f838a;
        bVar2.f819o = charSequenceArr;
        bVar2.f828x = onMultiChoiceClickListener;
        bVar2.f824t = zArr;
        bVar2.f825u = true;
        bVar.f(null);
        bVar.h(17039370, new DialogInterface.OnClickListener() { // from class: bi.q0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                nj.i iVar2 = nj.i.this;
                r0 r0Var = this;
                boolean[] zArr2 = zArr;
                nj.c cVar = c10;
                int i13 = r0.E0;
                gm.l.f(iVar2, "$pageConfig");
                gm.l.f(r0Var, "this$0");
                gm.l.f(zArr2, "$checks");
                gm.l.f(cVar, "$deviceInfo");
                byte[] a10 = iVar2.a();
                if (a10 == null || a10.length != 2) {
                    a10 = new byte[2];
                }
                int size3 = r0Var.C0.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    m0.B(a10, 1, r0Var.C0.get(r0Var.C0.keyAt(i14)), zArr2[i14]);
                }
                if (cVar.h(0)) {
                    m0.B(a10, 1, 0, true);
                }
                if (cVar.h(10)) {
                    m0.B(a10, 1, 10, true);
                }
                og.f D = ((DeviceViewModel) r0Var.B0.getValue()).f10182h.D();
                nj.i iVar3 = new nj.i(a10);
                D.getClass();
                mf.a0.j(D.f23335b, new og.i(D, iVar3, null));
            }
        });
        return bVar.a();
    }
}
