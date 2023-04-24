package ei;

import com.topstep.fitcloud.pro.model.friend.FriendMsg;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class f0 extends gm.m implements fm.p<i0, u6.a<? extends Boolean>, i0> {

    /* renamed from: b */
    public final /* synthetic */ int f13727b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(int i10) {
        super(2);
        this.f13727b = i10;
    }

    @Override // fm.p
    public final i0 A(i0 i0Var, u6.a<? extends Boolean> aVar) {
        ArrayList arrayList;
        i0 i0Var2 = i0Var;
        u6.a<? extends Boolean> aVar2 = aVar;
        gm.l.f(i0Var2, "$this$execute");
        gm.l.f(aVar2, "it");
        u6.a<List<FriendMsg>> aVar3 = i0Var2.f13751a;
        if ((aVar2 instanceof u6.a0) && (aVar3 instanceof u6.a0)) {
            List<FriendMsg> a10 = aVar3.a();
            if (a10 != null) {
                arrayList = ul.q.Z(a10);
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                int i10 = this.f13727b;
                if (size > i10) {
                    arrayList.remove(i10);
                }
            }
            aVar3 = new u6.a0(arrayList);
        }
        gm.l.f(aVar3, "asyncMsgs");
        return new i0(aVar3, aVar2);
    }
}
