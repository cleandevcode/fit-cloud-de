package ei;

import com.topstep.fitcloud.pro.model.friend.Friend;
import com.topstep.fitcloud.pro.ui.friend.FriendViewModel;
import java.util.ArrayList;
import java.util.List;

@zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendViewModel$onFriendRemove$1", f = "FriendFragment.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class x0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f13798e;

    /* renamed from: f */
    public final /* synthetic */ FriendViewModel f13799f;

    /* renamed from: g */
    public final /* synthetic */ long f13800g;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendViewModel$onFriendRemove$1$1", f = "FriendFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.l<xl.d<? super List<Friend>>, Object> {

        /* renamed from: e */
        public final /* synthetic */ List<Friend> f13801e;

        /* renamed from: f */
        public final /* synthetic */ long f13802f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, List list, xl.d dVar) {
            super(1, dVar);
            this.f13801e = list;
            this.f13802f = j10;
        }

        @Override // fm.l
        public final Object k(xl.d<? super List<Friend>> dVar) {
            List<Friend> list = this.f13801e;
            return new a(this.f13802f, list, dVar).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            ArrayList Z = ul.q.Z(this.f13801e);
            int size = Z.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (((Friend) Z.get(i10)).getUserId() == this.f13802f) {
                    Z.remove(i10);
                    break;
                } else {
                    i10++;
                }
            }
            return Z;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.p<z0, u6.a<? extends List<Friend>>, z0> {

        /* renamed from: b */
        public static final b f13803b = new b();

        public b() {
            super(2);
        }

        @Override // fm.p
        public final z0 A(z0 z0Var, u6.a<? extends List<Friend>> aVar) {
            u6.a<? extends List<Friend>> aVar2 = aVar;
            gm.l.f(z0Var, "$this$execute");
            gm.l.f(aVar2, "it");
            return new z0(aVar2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(FriendViewModel friendViewModel, long j10, xl.d<? super x0> dVar) {
        super(2, dVar);
        this.f13799f = friendViewModel;
        this.f13800g = j10;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((x0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new x0(this.f13799f, this.f13800g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f13798e;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            FriendViewModel friendViewModel = this.f13799f;
            this.f13798e = 1;
            obj = friendViewModel.e(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        List<Friend> a10 = ((z0) obj).f13816a.a();
        if (a10 != null && !a10.isEmpty()) {
            z10 = false;
        }
        if (!z10) {
            v6.b.f(this.f13799f, new a(this.f13800g, a10, null), null, b.f13803b, 3);
        }
        return tl.l.f28297a;
    }
}
