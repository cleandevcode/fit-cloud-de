package vh;

import com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel;
import fm.p;
import mf.a0;
import pm.e0;
import vh.c;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel$sendNavigateUpEvent$1", f = "ContactsViewModel.kt", l = {104, 105}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f29407e;

    /* renamed from: f */
    public final /* synthetic */ ContactsViewModel f29408f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ContactsViewModel contactsViewModel, xl.d<? super i> dVar) {
        super(2, dVar);
        this.f29408f = contactsViewModel;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((i) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new i(this.f29408f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f29407e;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    a0.k(obj);
                    return tl.l.f28297a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.k(obj);
        } else {
            a0.k(obj);
            this.f29407e = 1;
            if (a0.g(1000L, this) == aVar) {
                return aVar;
            }
        }
        ContactsViewModel contactsViewModel = this.f29408f;
        c.C0533c c0533c = c.C0533c.f29392a;
        this.f29407e = 2;
        if (contactsViewModel.f(c0533c, this) == aVar) {
            return aVar;
        }
        return tl.l.f28297a;
    }
}
