package com.topstep.fitcloud.pro.ui.data.ecg;

import androidx.lifecycle.l0;
import com.topstep.fitcloud.pro.model.data.EcgRecord;
import fm.l;
import fm.p;
import gm.m;
import java.util.UUID;
import kotlin.Metadata;
import lg.c;
import mf.a0;
import rh.h0;
import xl.d;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class EcgViewModel extends v6.b<h0> {

    /* renamed from: j */
    public final c f10733j;

    @e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgViewModel$requestDetail$1", f = "EcgFragment.kt", l = {298}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements l<d<? super EcgRecord>, Object> {

        /* renamed from: e */
        public int f10734e;

        /* renamed from: g */
        public final /* synthetic */ UUID f10736g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UUID uuid, d<? super a> dVar) {
            super(1, dVar);
            EcgViewModel.this = r1;
            this.f10736g = uuid;
        }

        @Override // fm.l
        public final Object k(d<? super EcgRecord> dVar) {
            return new a(this.f10736g, dVar).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f10734e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                c cVar = EcgViewModel.this.f10733j;
                UUID uuid = this.f10736g;
                this.f10734e = 1;
                obj = cVar.L(uuid, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements p<h0, u6.a<? extends EcgRecord>, h0> {

        /* renamed from: b */
        public static final b f10737b = new b();

        public b() {
            super(2);
        }

        @Override // fm.p
        public final h0 A(h0 h0Var, u6.a<? extends EcgRecord> aVar) {
            u6.a<? extends EcgRecord> aVar2 = aVar;
            gm.l.f(h0Var, "$this$execute");
            gm.l.f(aVar2, "it");
            return new h0(aVar2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcgViewModel(l0 l0Var, c cVar) {
        super(new h0(null, 1, null), l0Var);
        gm.l.f(l0Var, "savedStateHandle");
        gm.l.f(cVar, "dataRepository");
        boolean z10 = true;
        this.f10733j = cVar;
        String str = (String) l0Var.c("ecgId");
        if (str != null && str.length() != 0) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        UUID fromString = UUID.fromString(str);
        gm.l.e(fromString, "fromString(ecgId)");
        j(fromString);
    }

    public final void j(UUID uuid) {
        gm.l.f(uuid, "ecgId");
        v6.b.f(this, new a(uuid, null), null, b.f10737b, 3);
    }
}
