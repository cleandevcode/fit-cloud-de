package ei;

import com.topstep.fitcloud.pro.model.friend.Friend;
import com.topstep.fitcloud.pro.ui.friend.FriendViewModel;
import java.util.ArrayList;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;

@zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendViewModel$onFriendRename$1", f = "FriendFragment.kt", l = {73}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f13807e;

    /* renamed from: f */
    public final /* synthetic */ FriendViewModel f13808f;

    /* renamed from: g */
    public final /* synthetic */ long f13809g;

    /* renamed from: h */
    public final /* synthetic */ String f13810h;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendViewModel$onFriendRename$1$1", f = "FriendFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.l<xl.d<? super List<Friend>>, Object> {

        /* renamed from: e */
        public final /* synthetic */ List<Friend> f13811e;

        /* renamed from: f */
        public final /* synthetic */ long f13812f;

        /* renamed from: g */
        public final /* synthetic */ String f13813g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<Friend> list, long j10, String str, xl.d<? super a> dVar) {
            super(1, dVar);
            this.f13811e = list;
            this.f13812f = j10;
            this.f13813g = str;
        }

        @Override // fm.l
        public final Object k(xl.d<? super List<Friend>> dVar) {
            return new a(this.f13811e, this.f13812f, this.f13813g, dVar).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            Friend copy;
            mf.a0.k(obj);
            ArrayList Z = ul.q.Z(this.f13811e);
            int size = Z.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (((Friend) Z.get(i10)).getUserId() == this.f13812f) {
                    copy = r4.copy((r27 & 1) != 0 ? r4.userId : 0L, (r27 & 2) != 0 ? r4.nickName : null, (r27 & 4) != 0 ? r4.sex : 0, (r27 & 8) != 0 ? r4.birthday : null, (r27 & 16) != 0 ? r4.height : 0.0f, (r27 & 32) != 0 ? r4.weight : 0.0f, (r27 & 64) != 0 ? r4.avatar : null, (r27 & 128) != 0 ? r4.identityId : null, (r27 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0 ? r4.mark : this.f13813g, (r27 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) != 0 ? ((Friend) Z.get(i10)).lastUpdateTime : 0L);
                    Z.set(i10, copy);
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
        public static final b f13814b = new b();

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
    public y0(FriendViewModel friendViewModel, long j10, String str, xl.d<? super y0> dVar) {
        super(2, dVar);
        this.f13808f = friendViewModel;
        this.f13809g = j10;
        this.f13810h = str;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((y0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new y0(this.f13808f, this.f13809g, this.f13810h, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f13807e;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            FriendViewModel friendViewModel = this.f13808f;
            this.f13807e = 1;
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
            v6.b.f(this.f13808f, new a(a10, this.f13809g, this.f13810h, null), null, b.f13814b, 3);
        }
        return tl.l.f28297a;
    }
}
