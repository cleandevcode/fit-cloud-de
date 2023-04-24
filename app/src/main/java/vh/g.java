package vh;

import com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel;
import fm.p;
import java.util.ArrayList;
import mf.a0;
import pm.e0;
import qi.s;
import vh.c;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel$deleteContacts$1", f = "ContactsViewModel.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f29399e;

    /* renamed from: f */
    public final /* synthetic */ ContactsViewModel f29400f;

    /* renamed from: g */
    public final /* synthetic */ int f29401g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ContactsViewModel contactsViewModel, int i10, xl.d<? super g> dVar) {
        super(2, dVar);
        this.f29400f = contactsViewModel;
        this.f29401g = i10;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((g) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new g(this.f29400f, this.f29401g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f29399e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            ArrayList<rj.c> a10 = this.f29400f.e().f29395a.a();
            if (a10 != null && this.f29401g < a10.size()) {
                a10.remove(this.f29401g);
                ContactsViewModel contactsViewModel = this.f29400f;
                c.d dVar = new c.d(this.f29401g);
                this.f29399e = 1;
                if (contactsViewModel.f(dVar, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
        s.b(this.f29400f.f10904i);
        return tl.l.f28297a;
    }
}
