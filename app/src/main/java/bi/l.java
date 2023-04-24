package bi;

import com.topstep.fitcloud.pro.ui.device.settings.CollectionCodeViewModel;
import java.util.List;
import jj.k1;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.CollectionCodeViewModel$request$1", f = "CollectionCodeFragment.kt", l = {124}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l extends zl.i implements fm.l<xl.d<? super k>, Object> {

    /* renamed from: e */
    public int f4327e;

    /* renamed from: f */
    public final /* synthetic */ CollectionCodeViewModel f4328f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CollectionCodeViewModel collectionCodeViewModel, xl.d<? super l> dVar) {
        super(1, dVar);
        this.f4328f = collectionCodeViewModel;
    }

    @Override // fm.l
    public final Object k(xl.d<? super k> dVar) {
        return new l(this.f4328f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f4327e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            tk.p<List<Integer>> c10 = ((k1) this.f4328f.f11114j.s()).c();
            this.f4327e = 1;
            obj = a.f.d(c10, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        for (Number number : (List) obj) {
            switch (number.intValue()) {
                case 1:
                    z11 = true;
                    break;
                case 2:
                    z12 = true;
                    break;
                case 3:
                    z13 = true;
                    break;
                case 4:
                    z10 = true;
                    break;
                case 5:
                    z14 = true;
                    break;
                case 6:
                    z15 = true;
                    break;
                case 7:
                    z16 = true;
                    break;
                case 8:
                    z17 = true;
                    break;
            }
        }
        return new k(z10, z11, z12, z13, z14, z15, z16, z17);
    }
}
