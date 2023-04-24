package com.topstep.fitcloud.pro.ui.data.ecg;

import androidx.lifecycle.l0;
import fm.l;
import fm.p;
import gm.m;
import java.util.UUID;
import kotlin.Metadata;
import mf.a0;
import rh.e;
import rh.g;
import xl.d;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class EcgDetailReportViewModel extends v6.b<g> {

    /* renamed from: j */
    public final lg.c f10654j;

    /* renamed from: k */
    public final dk.a<tg.a> f10655k;

    /* renamed from: l */
    public final e f10656l;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailReportViewModel$requestEcgReport$1", f = "EcgDetailReportFragment.kt", l = {110, 112}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements l<d<? super String>, Object> {

        /* renamed from: e */
        public int f10657e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<? super a> dVar) {
            super(1, dVar);
            EcgDetailReportViewModel.this = r1;
        }

        @Override // fm.l
        public final Object k(d<? super String> dVar) {
            return new a(dVar).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f10657e;
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.k(obj);
            } else {
                a0.k(obj);
                UUID fromString = UUID.fromString(EcgDetailReportViewModel.this.f10656l.f25686a);
                EcgDetailReportViewModel ecgDetailReportViewModel = EcgDetailReportViewModel.this;
                if (ecgDetailReportViewModel.f10656l.f25688c > 0) {
                    long j10 = EcgDetailReportViewModel.this.f10656l.f25688c;
                    gm.l.e(fromString, "ecgId");
                    this.f10657e = 1;
                    obj = ecgDetailReportViewModel.f10655k.get().e(j10, fromString, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    lg.c cVar = ecgDetailReportViewModel.f10654j;
                    gm.l.e(fromString, "ecgId");
                    this.f10657e = 2;
                    obj = cVar.h(fromString, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            }
            return (String) obj;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements p<g, u6.a<? extends String>, g> {

        /* renamed from: b */
        public static final b f10659b = new b();

        public b() {
            super(2);
        }

        @Override // fm.p
        public final g A(g gVar, u6.a<? extends String> aVar) {
            u6.a<? extends String> aVar2 = aVar;
            gm.l.f(gVar, "$this$execute");
            gm.l.f(aVar2, "it");
            return new g(aVar2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements l<g, g> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(1);
            EcgDetailReportViewModel.this = r1;
        }

        @Override // fm.l
        public final g k(g gVar) {
            gm.l.f(gVar, "$this$setState");
            return new g(new u6.a0(EcgDetailReportViewModel.this.f10656l.f25687b));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcgDetailReportViewModel(l0 l0Var, lg.c cVar, dk.a<tg.a> aVar) {
        super(new g(null, 1, null), l0Var);
        gm.l.f(l0Var, "savedStateHandle");
        gm.l.f(cVar, "dataRepository");
        gm.l.f(aVar, "friendDataRepository");
        this.f10654j = cVar;
        this.f10655k = aVar;
        if (l0Var.b("ecgId")) {
            String str = (String) l0Var.c("ecgId");
            if (str != null) {
                if (l0Var.b("reportUrl")) {
                    String str2 = (String) l0Var.c("reportUrl");
                    if (l0Var.b("friendId")) {
                        Long l10 = (Long) l0Var.c("friendId");
                        if (l10 != null) {
                            this.f10656l = new e(str, l10.longValue(), str2);
                            j();
                            return;
                        }
                        throw new IllegalArgumentException("Argument \"friendId\" of type long does not support null values");
                    }
                    throw new IllegalArgumentException("Required argument \"friendId\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Required argument \"reportUrl\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"ecgId\" is marked as non-null but was passed a null value");
        }
        throw new IllegalArgumentException("Required argument \"ecgId\" is missing and does not have an android:defaultValue");
    }

    public final void j() {
        boolean z10;
        String str = this.f10656l.f25687b;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            v6.b.f(this, new a(null), null, b.f10659b, 3);
        } else {
            h(new c());
        }
    }
}
