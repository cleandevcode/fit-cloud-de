package vh;

import com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel;
import fm.p;
import java.util.ArrayList;
import java.util.Collections;
import mf.a0;
import pm.e0;
import qi.s;
import vh.c;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel$swipeContacts$1", f = "ContactsViewModel.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f29409e;

    /* renamed from: f */
    public final /* synthetic */ ContactsViewModel f29410f;

    /* renamed from: g */
    public final /* synthetic */ int f29411g;

    /* renamed from: h */
    public final /* synthetic */ int f29412h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ContactsViewModel contactsViewModel, int i10, int i11, xl.d<? super j> dVar) {
        super(2, dVar);
        this.f29410f = contactsViewModel;
        this.f29411g = i10;
        this.f29412h = i11;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((j) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new j(this.f29410f, this.f29411g, this.f29412h, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f29409e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            ArrayList<rj.c> a10 = this.f29410f.e().f29395a.a();
            if (a10 != null && this.f29411g < a10.size() && this.f29412h < a10.size()) {
                Collections.swap(a10, this.f29411g, this.f29412h);
                ContactsViewModel contactsViewModel = this.f29410f;
                c.b bVar = new c.b(this.f29411g, this.f29412h);
                this.f29409e = 1;
                if (contactsViewModel.f(bVar, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
        s.b(this.f29410f.f10904i);
        return tl.l.f28297a;
    }
}
