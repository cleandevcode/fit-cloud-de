package com.topstep.fitcloud.pro.ui.settings.assist;

import android.content.Context;
import android.os.Bundle;
import com.topstep.fitcloudpro.R;
import fm.p;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import ji.n;
import mf.a0;
import mm.h;
import pm.e0;
import tl.l;
import zl.e;
import zl.i;

@e(c = "com.topstep.fitcloud.pro.ui.settings.assist.AssistFragment$blockClick$1$2", f = "AssistFragment.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f11998e;

    /* renamed from: f */
    public final /* synthetic */ AssistFragment f11999f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AssistFragment assistFragment, xl.d<? super a> dVar) {
        super(2, dVar);
        this.f11999f = assistFragment;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((a) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new a(this.f11999f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f11998e;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            AssistFragment assistFragment = this.f11999f;
            sg.a aVar2 = assistFragment.f11949v0;
            if (aVar2 != null) {
                Context V0 = assistFragment.V0();
                this.f11998e = 1;
                obj = aVar2.a(V0, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                gm.l.l("feedbackFileHelper");
                throw null;
            }
        }
        List<File> list = (List) obj;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            AssistFragment assistFragment2 = this.f11999f;
            h<Object>[] hVarArr = AssistFragment.f11946x0;
            d7.e.d(assistFragment2.f1(), R.string.tip_current_no_data, null, 0, 30);
        } else {
            int i11 = n.B0;
            gm.l.f(list, "files");
            Bundle bundle = new Bundle();
            ArrayList arrayList = new ArrayList(ul.l.B(list, 10));
            for (File file : list) {
                arrayList.add(file.getPath());
            }
            Object[] array = arrayList.toArray(new String[0]);
            gm.l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            bundle.putStringArray("extraArgs", (String[]) array);
            n nVar = new n();
            nVar.Z0(bundle);
            nVar.h1(this.f11999f.h0(), null);
        }
        return l.f28297a;
    }
}
