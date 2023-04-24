package com.topstep.fitcloud.pro.ui.friend;

import androidx.lifecycle.l0;
import com.topstep.fitcloud.pro.model.friend.Friend;
import ei.z0;
import fm.l;
import fm.p;
import gm.m;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class FriendViewModel extends v6.b<z0> {

    /* renamed from: j */
    public final tg.c f11682j;

    /* renamed from: k */
    public final HashMap<Long, String> f11683k;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendViewModel$requestFriends$1", f = "FriendFragment.kt", l = {50}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements l<xl.d<? super List<? extends Friend>>, Object> {

        /* renamed from: e */
        public int f11684e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(1, dVar);
            FriendViewModel.this = r1;
        }

        @Override // fm.l
        public final Object k(xl.d<? super List<? extends Friend>> dVar) {
            return new a(dVar).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f11684e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                tg.c cVar = FriendViewModel.this.f11682j;
                this.f11684e = 1;
                obj = cVar.c(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            List list = (List) obj;
            FriendViewModel.this.f11683k.clear();
            return list;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements p<z0, u6.a<? extends List<? extends Friend>>, z0> {

        /* renamed from: b */
        public static final b f11686b = new b();

        public b() {
            super(2);
        }

        @Override // fm.p
        public final z0 A(z0 z0Var, u6.a<? extends List<? extends Friend>> aVar) {
            u6.a<? extends List<? extends Friend>> aVar2 = aVar;
            gm.l.f(z0Var, "$this$execute");
            gm.l.f(aVar2, "it");
            return new z0(aVar2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendViewModel(l0 l0Var, tg.c cVar) {
        super(new z0(null, 1, null), l0Var);
        gm.l.f(l0Var, "savedStateHandle");
        gm.l.f(cVar, "friendRepository");
        this.f11682j = cVar;
        this.f11683k = new HashMap<>();
        j();
    }

    public final void j() {
        v6.b.f(this, new a(null), null, b.f11686b, 3);
    }
}
