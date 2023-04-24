package com.topstep.fitcloud.pro.ui.settings.assist;

import com.topstep.fitcloud.pro.model.location.LocationInfo;
import fm.p;
import mf.a0;
import pm.e0;
import tl.l;
import zl.e;
import zl.i;

@e(c = "com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment$onViewCreated$2$1", f = "WeatherFragment.kt", l = {56, 65, 73}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f12000e;

    /* renamed from: f */
    public final /* synthetic */ WeatherFragment f12001f;

    @e(c = "com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment$onViewCreated$2$1$location$1", f = "WeatherFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<e0, xl.d<? super LocationInfo>, Object> {

        /* renamed from: e */
        public final /* synthetic */ WeatherFragment f12002e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WeatherFragment weatherFragment, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f12002e = weatherFragment;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super LocationInfo> dVar) {
            return ((a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f12002e, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            ug.b bVar = this.f12002e.f11991v0;
            if (bVar != null) {
                return bVar.a(60000L);
            }
            gm.l.l("locationRepository");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WeatherFragment weatherFragment, xl.d<? super b> dVar) {
        super(2, dVar);
        this.f12001f = weatherFragment;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((b) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new b(this.f12001f, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00bd  */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.settings.assist.b.t(java.lang.Object):java.lang.Object");
    }
}
