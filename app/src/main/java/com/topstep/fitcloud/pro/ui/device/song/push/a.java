package com.topstep.fitcloud.pro.ui.device.song.push;

import ci.h0;
import ci.j0;
import ci.k0;
import ci.m;
import fm.p;
import ih.v;
import mf.a0;
import mm.h;
import pm.e0;
import tl.l;
import xl.d;
import zl.e;
import zl.i;

@e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment$onViewCreated$5$1$1", f = "SongPushFragment.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<e0, d<? super l>, Object> {

    /* renamed from: e */
    public int f11409e;

    /* renamed from: f */
    public final /* synthetic */ SongPushFragment f11410f;

    @e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment$onViewCreated$5$1$1$1", f = "SongPushFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.topstep.fitcloud.pro.ui.device.song.push.a$a */
    /* loaded from: classes2.dex */
    public static final class C0194a extends i implements p<e0, d<? super l>, Object> {

        /* renamed from: e */
        public final /* synthetic */ SongPushFragment f11411e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0194a(SongPushFragment songPushFragment, d<? super C0194a> dVar) {
            super(2, dVar);
            this.f11411e = songPushFragment;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super l> dVar) {
            return ((C0194a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final d<l> p(Object obj, d<?> dVar) {
            return new C0194a(this.f11411e, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            SongPushFragment songPushFragment = this.f11411e;
            h<Object>[] hVarArr = SongPushFragment.f11348w0;
            d7.e.e(songPushFragment.f1(), "only support rws status is single mode");
            return l.f28297a;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment$onViewCreated$5$1$1$2", f = "SongPushFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, d<? super l>, Object> {

        /* renamed from: e */
        public final /* synthetic */ SongPushFragment f11412e;

        /* renamed from: f */
        public final /* synthetic */ int f11413f;

        /* renamed from: g */
        public final /* synthetic */ j0 f11414g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SongPushFragment songPushFragment, int i10, j0 j0Var, d<? super b> dVar) {
            super(2, dVar);
            this.f11412e = songPushFragment;
            this.f11413f = i10;
            this.f11414g = j0Var;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super l> dVar) {
            return ((b) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final d<l> p(Object obj, d<?> dVar) {
            return new b(this.f11412e, this.f11413f, this.f11414g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            v.l(tb.a.f(this.f11412e), new h0(this.f11413f, this.f11414g.f4780a));
            return l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SongPushFragment songPushFragment, d<? super a> dVar) {
        super(2, dVar);
        this.f11410f = songPushFragment;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, d<? super l> dVar) {
        return ((a) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final d<l> p(Object obj, d<?> dVar) {
        return new a(this.f11410f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f11409e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            SongPushFragment songPushFragment = this.f11410f;
            h<Object>[] hVarArr = SongPushFragment.f11348w0;
            SongPushViewModel k12 = songPushFragment.k1();
            this.f11409e = 1;
            obj = k12.e(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        j0 a10 = ((k0) obj).f4783a.a();
        if (a10 == null) {
            return l.f28297a;
        }
        m mVar = a10.f4781b;
        if (mVar.f4795d != 0) {
            rm.l.g(this.f11410f).e(new C0194a(this.f11410f, null));
        } else {
            rm.l.g(this.f11410f).e(new b(this.f11410f, mVar.f4796e, a10, null));
        }
        return l.f28297a;
    }
}
