package com.topstep.fitcloud.pro.ui.friend;

import android.os.Parcelable;
import androidx.fragment.app.h1;
import androidx.lifecycle.l0;
import com.topstep.fitcloud.pro.model.data.EcgRecord;
import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import com.topstep.fitcloud.pro.model.friend.Friend;
import ei.q;
import ei.s;
import ei.t;
import ei.u;
import fm.l;
import fm.p;
import gm.m;
import java.io.Serializable;
import java.util.UUID;
import kotlin.Metadata;
import mf.a0;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class FriendEcgViewModel extends v6.b<u> {

    /* renamed from: j */
    public final tg.a f11543j;

    /* renamed from: k */
    public final q f11544k;

    /* renamed from: l */
    public SimpleEcgRecord f11545l;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendEcgViewModel$requestDetail$1", f = "FriendEcgFragment.kt", l = {231}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements l<xl.d<? super EcgRecord>, Object> {

        /* renamed from: e */
        public int f11546e;

        /* renamed from: g */
        public final /* synthetic */ SimpleEcgRecord f11548g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SimpleEcgRecord simpleEcgRecord, xl.d<? super a> dVar) {
            super(1, dVar);
            FriendEcgViewModel.this = r1;
            this.f11548g = simpleEcgRecord;
        }

        @Override // fm.l
        public final Object k(xl.d<? super EcgRecord> dVar) {
            return new a(this.f11548g, dVar).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f11546e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                FriendEcgViewModel friendEcgViewModel = FriendEcgViewModel.this;
                tg.a aVar2 = friendEcgViewModel.f11543j;
                long userId = friendEcgViewModel.f11544k.f13779a.getUserId();
                UUID uuid = this.f11548g.f9595a;
                this.f11546e = 1;
                obj = aVar2.m(userId, uuid, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements p<u, u6.a<? extends EcgRecord>, u> {

        /* renamed from: b */
        public static final b f11549b = new b();

        public b() {
            super(2);
        }

        @Override // fm.p
        public final u A(u uVar, u6.a<? extends EcgRecord> aVar) {
            u uVar2 = uVar;
            u6.a<? extends EcgRecord> aVar2 = aVar;
            gm.l.f(uVar2, "$this$execute");
            gm.l.f(aVar2, "it");
            return u.copy$default(uVar2, null, aVar2, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendEcgViewModel(l0 l0Var, tg.a aVar) {
        super(new u(null, null, 3, null), l0Var);
        gm.l.f(l0Var, "savedStateHandle");
        gm.l.f(aVar, "friendDataRepository");
        this.f11543j = aVar;
        if (l0Var.f2739a.containsKey("friend")) {
            if (!Parcelable.class.isAssignableFrom(Friend.class) && !Serializable.class.isAssignableFrom(Friend.class)) {
                throw new UnsupportedOperationException(h1.a(Friend.class, new StringBuilder(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            Friend friend = (Friend) l0Var.f2739a.get("friend");
            if (friend != null) {
                this.f11544k = new q(friend);
                v6.b.f(this, new s(this, null), null, t.f13787b, 3);
                return;
            }
            throw new IllegalArgumentException("Argument \"friend\" is marked as non-null but was passed a null value");
        }
        throw new IllegalArgumentException("Required argument \"friend\" is missing and does not have an android:defaultValue");
    }

    public final void j(SimpleEcgRecord simpleEcgRecord) {
        gm.l.f(simpleEcgRecord, "record");
        this.f11545l = simpleEcgRecord;
        v6.b.f(this, new a(simpleEcgRecord, null), null, b.f11549b, 3);
    }
}
