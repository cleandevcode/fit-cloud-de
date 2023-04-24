package bi;

import com.topstep.fitcloud.pro.ui.device.settings.BusinessCardViewModel;
import java.util.List;
import jj.k1;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.BusinessCardViewModel$request$1", f = "BusinessCardFragment.kt", l = {137}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends zl.i implements fm.l<xl.d<? super e>, Object> {

    /* renamed from: e */
    public int f4288e;

    /* renamed from: f */
    public final /* synthetic */ BusinessCardViewModel f4289f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BusinessCardViewModel businessCardViewModel, xl.d<? super f> dVar) {
        super(1, dVar);
        this.f4289f = businessCardViewModel;
    }

    @Override // fm.l
    public final Object k(xl.d<? super e> dVar) {
        return new f(this.f4289f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        Object d10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f4288e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
                d10 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            tk.p<List<Integer>> c10 = ((k1) this.f4289f.f11096j.s()).c();
            this.f4288e = 1;
            d10 = a.f.d(c10, this);
            if (d10 == aVar) {
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
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        for (Number number : (List) d10) {
            switch (number.intValue()) {
                case 33:
                    z10 = true;
                    break;
                case 35:
                    z11 = true;
                    break;
                case 36:
                    z12 = true;
                    break;
                case 37:
                    z13 = true;
                    break;
                case 38:
                    z14 = true;
                    break;
                case 39:
                    z15 = true;
                    break;
                case 41:
                    z16 = true;
                    break;
                case 43:
                    z17 = true;
                    break;
                case 44:
                    z18 = true;
                    break;
                case 45:
                    z19 = true;
                    break;
                case 46:
                    z20 = true;
                    break;
            }
        }
        return new e(z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20);
    }
}
