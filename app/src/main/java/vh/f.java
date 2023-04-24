package vh;

import com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel;
import fm.p;
import java.util.ArrayList;
import java.util.Iterator;
import mf.a0;
import pm.e0;
import qi.s;
import vh.c;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel$addContacts$1", f = "ContactsViewModel.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f29396e;

    /* renamed from: f */
    public final /* synthetic */ ContactsViewModel f29397f;

    /* renamed from: g */
    public final /* synthetic */ rj.c f29398g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ContactsViewModel contactsViewModel, rj.c cVar, xl.d<? super f> dVar) {
        super(2, dVar);
        this.f29397f = contactsViewModel;
        this.f29398g = cVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((f) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new f(this.f29397f, this.f29398g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f29396e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            ArrayList<rj.c> a10 = this.f29397f.e().f29395a.a();
            if (a10 != null) {
                boolean z10 = false;
                Iterator<rj.c> it = a10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (gm.l.a(it.next().f25770b, this.f29398g.f25770b)) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    a10.add(this.f29398g);
                    ContactsViewModel contactsViewModel = this.f29397f;
                    c.a aVar2 = new c.a(a10.size());
                    this.f29396e = 1;
                    if (contactsViewModel.f(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return tl.l.f28297a;
        }
        s.b(this.f29397f.f10904i);
        return tl.l.f28297a;
    }
}
