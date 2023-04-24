package xh;

import com.topstep.fitcloud.pro.model.dial.DialComponent;
import java.util.List;
import jj.k1;
import mf.a0;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentViewModel$setComponents$1", f = "DialComponentViewModel.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f30579e;

    /* renamed from: f */
    public final /* synthetic */ List<DialComponent> f30580f;

    /* renamed from: g */
    public final /* synthetic */ i f30581g;

    /* renamed from: h */
    public final /* synthetic */ int f30582h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List<DialComponent> list, i iVar, int i10, xl.d<? super m> dVar) {
        super(1, dVar);
        this.f30580f = list;
        this.f30581g = iVar;
        this.f30582h = i10;
    }

    @Override // fm.l
    public final Object k(xl.d<? super tl.l> dVar) {
        return new m(this.f30580f, this.f30581g, this.f30582h, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        tk.a s10;
        boolean z10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f30579e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            List<DialComponent> list = this.f30580f;
            if (list == null) {
                bArr = null;
            } else {
                bArr = new byte[list.size()];
                int size = this.f30580f.size();
                for (int i11 = 0; i11 < size; i11++) {
                    bArr[i11] = (byte) this.f30580f.get(i11).getStyleCurrent();
                }
            }
            jj.g s11 = this.f30581g.f30567f.s();
            int i12 = this.f30582h;
            k1 k1Var = (k1) s11;
            if (h7.a.m(((jj.l) k1Var.f17918b).f17930d, 285)) {
                s10 = h7.a.e();
            } else {
                if (bArr != null) {
                    if (bArr.length == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        bArr2 = new byte[bArr.length + 2];
                        bArr2[0] = (byte) i12;
                        bArr2[1] = (byte) bArr.length;
                        System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
                        s10 = h7.a.s(k1Var.f17917a, new bj.b((byte) 2, (byte) 112, bArr2));
                    }
                }
                bArr2 = new byte[]{(byte) i12};
                s10 = h7.a.s(k1Var.f17917a, new bj.b((byte) 2, (byte) 112, bArr2));
            }
            this.f30579e = 1;
            if (a.f.b(s10, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
