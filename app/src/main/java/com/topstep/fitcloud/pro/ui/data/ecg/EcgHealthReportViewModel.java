package com.topstep.fitcloud.pro.ui.data.ecg;

import android.content.Context;
import androidx.lifecycle.l0;
import bi.r;
import com.topstep.fitcloud.pro.model.data.EcgRecord;
import fm.l;
import fm.p;
import gh.d;
import gm.m;
import kotlin.Metadata;
import mf.a0;
import rh.v;
import sm.g1;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class EcgHealthReportViewModel extends v6.b<v> {

    /* renamed from: j */
    public final Context f10722j;

    /* renamed from: k */
    public final d f10723k;

    /* renamed from: l */
    public final EcgRecord f10724l;

    /* renamed from: m */
    public final g1 f10725m;

    /* renamed from: n */
    public final g1 f10726n;

    @e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel$1", f = "EcgHealthReportActivity.kt", l = {260}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements l<xl.d<? super vf.d>, Object> {

        /* renamed from: e */
        public int f10727e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(1, dVar);
            EcgHealthReportViewModel.this = r1;
        }

        @Override // fm.l
        public final Object k(xl.d<? super vf.d> dVar) {
            return new a(dVar).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f10727e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                EcgHealthReportViewModel ecgHealthReportViewModel = EcgHealthReportViewModel.this;
                d dVar = ecgHealthReportViewModel.f10723k;
                EcgRecord ecgRecord = ecgHealthReportViewModel.f10724l;
                this.f10727e = 1;
                obj = dVar.b(ecgRecord, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements p<v, u6.a<? extends vf.d>, v> {

        /* renamed from: b */
        public static final b f10729b = new b();

        public b() {
            super(2);
        }

        @Override // fm.p
        public final v A(v vVar, u6.a<? extends vf.d> aVar) {
            v vVar2 = vVar;
            u6.a<? extends vf.d> aVar2 = aVar;
            gm.l.f(vVar2, "$this$execute");
            gm.l.f(aVar2, "it");
            return v.copy$default(vVar2, aVar2, null, null, 6, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcgHealthReportViewModel(l0 l0Var, Context context, d dVar) {
        super(new v(null, null, null, 7, null), l0Var);
        gm.l.f(l0Var, "savedStateHandle");
        gm.l.f(context, "context");
        gm.l.f(dVar, "ecgAlgorithmUseCase");
        this.f10722j = context;
        this.f10723k = dVar;
        Object obj = l0Var.f2739a.get("record");
        gm.l.c(obj);
        this.f10724l = (EcgRecord) obj;
        v6.b.f(this, new a(null), null, b.f10729b, 3);
        g1 c10 = r.c(0);
        this.f10725m = c10;
        this.f10726n = c10;
    }
}
