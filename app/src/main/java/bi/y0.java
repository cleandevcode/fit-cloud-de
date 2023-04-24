package bi;

import com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import jj.k1;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.QrCodeSettingsViewModel$setQrCode$1", f = "QrCodeSettingsFragment.kt", l = {282}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y0 extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f4388e;

    /* renamed from: f */
    public final /* synthetic */ QrCodeSettingsViewModel f4389f;

    /* renamed from: g */
    public final /* synthetic */ int f4390g;

    /* renamed from: h */
    public final /* synthetic */ String f4391h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(QrCodeSettingsViewModel qrCodeSettingsViewModel, int i10, String str, xl.d<? super y0> dVar) {
        super(1, dVar);
        this.f4389f = qrCodeSettingsViewModel;
        this.f4390g = i10;
        this.f4391h = str;
    }

    @Override // fm.l
    public final Object k(xl.d<? super tl.l> dVar) {
        return new y0(this.f4389f, this.f4390g, this.f4391h, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        int i10;
        tk.a s10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i11 = this.f4388e;
        if (i11 != 0) {
            if (i11 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            jj.g s11 = this.f4389f.f11277j.s();
            int i12 = this.f4390g;
            String str = this.f4391h;
            k1 k1Var = (k1) s11;
            k1Var.getClass();
            gm.l.f(str, "content");
            if (i12 == 128) {
                i10 = 347;
            } else {
                i10 = 274;
            }
            Charset charset = StandardCharsets.UTF_8;
            gm.l.e(charset, "UTF_8");
            byte[] bytes = str.getBytes(charset);
            gm.l.e(bytes, "this as java.lang.String).getBytes(charset)");
            if (bytes.length > i10) {
                s10 = new bl.c(new IllegalArgumentException(androidx.appcompat.widget.u0.a("Code length exceeds the limit of ", i10)));
            } else {
                byte[] bArr = new byte[bytes.length + 3];
                bArr[0] = (byte) i12;
                bArr[1] = (byte) ((bytes.length >> 8) & 255);
                bArr[2] = (byte) (bytes.length & 255);
                System.arraycopy(bytes, 0, bArr, 3, bytes.length);
                s10 = h7.a.s(k1Var.f17917a, new bj.b((byte) 2, (byte) -123, bArr));
            }
            this.f4388e = 1;
            if (a.f.b(s10, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
