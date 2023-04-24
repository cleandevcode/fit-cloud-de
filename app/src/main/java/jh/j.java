package jh;

import eh.b;
import java.util.Date;

@zl.e(c = "com.topstep.fitcloud.pro.ui.auth.FillUserViewModel$fillUser$1", f = "FillUserFragment.kt", l = {217}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends zl.i implements fm.l<xl.d<? super Boolean>, Object> {

    /* renamed from: e */
    public int f17798e;

    /* renamed from: f */
    public final /* synthetic */ String f17799f;

    /* renamed from: g */
    public final /* synthetic */ String f17800g;

    /* renamed from: h */
    public final /* synthetic */ int f17801h;

    /* renamed from: i */
    public final /* synthetic */ Date f17802i;

    /* renamed from: j */
    public final /* synthetic */ float f17803j;

    /* renamed from: k */
    public final /* synthetic */ float f17804k;

    /* renamed from: l */
    public final /* synthetic */ String f17805l;

    /* renamed from: m */
    public final /* synthetic */ i f17806m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, String str2, int i10, Date date, float f10, float f11, String str3, i iVar, xl.d<? super j> dVar) {
        super(1, dVar);
        this.f17799f = str;
        this.f17800g = str2;
        this.f17801h = i10;
        this.f17802i = date;
        this.f17803j = f10;
        this.f17804k = f11;
        this.f17805l = str3;
        this.f17806m = iVar;
    }

    @Override // fm.l
    public final Object k(xl.d<? super Boolean> dVar) {
        return new j(this.f17799f, this.f17800g, this.f17801h, this.f17802i, this.f17803j, this.f17804k, this.f17805l, this.f17806m, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f17798e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            b.a aVar2 = new b.a(this.f17799f, this.f17800g, this.f17801h, this.f17802i, this.f17803j, this.f17804k, this.f17805l);
            dk.a<eh.b> aVar3 = this.f17806m.f17791f;
            if (aVar3 != null) {
                this.f17798e = 1;
                obj = aVar3.get().b(aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                gm.l.l("fillUserUseCase");
                throw null;
            }
        }
        return obj;
    }
}
