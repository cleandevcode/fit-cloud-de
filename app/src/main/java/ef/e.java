package ef;

import com.realsil.sdk.dfu.DfuService;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class e extends f {
    public e(DfuService dfuService, ze.e eVar, DfuService.c cVar) {
        super(dfuService, eVar, cVar);
    }

    public final boolean G0() {
        int i10;
        E0();
        z(522);
        ge.b.e("wait master to handover ...", this.f29221a);
        ArrayList arrayList = new ArrayList();
        int i11 = q().L;
        byte[] bArr = s().C;
        if (bArr != null && i11 < 0) {
            throw new IllegalArgumentException("invalid manufacture id");
        }
        arrayList.add(new ce.a(null, null, null, null, null, null, null, null, null, i11, bArr, null, 0, null));
        be.d Y = xe.f.Y();
        Y.f4172p = arrayList;
        if (!this.f29233h) {
            z(527);
            this.D = 0;
            this.f29800p0 = false;
            H(Y);
            try {
                synchronized (this.f29799o0) {
                    if (this.D == 0 && !this.f29800p0) {
                        this.f29799o0.wait(31000L);
                    }
                }
            } catch (InterruptedException e10) {
                StringBuilder a10 = android.support.v4.media.d.a("findRemoteDevice interrupted, e = ");
                a10.append(e10.toString());
                ge.b.p(a10.toString());
                this.D = 259;
            }
            if (this.D == 0 && !this.f29800p0) {
                ge.b.p("didn't find the secondary bud device");
                this.D = 265;
            }
            if (this.D == 0) {
                ge.b.e("start to upload secondary bud ...", this.f29221a);
                this.f29237j = true;
                this.f29235i = false;
                this.A = 0;
                boolean n02 = n0();
                if (n02) {
                    if (!this.U) {
                        i10 = 523;
                    } else {
                        E0();
                        i10 = 258;
                    }
                    z(i10);
                }
                return n02;
            }
            throw new ne.c("Error while scan remote device", this.D);
        }
        throw new ne.c("user aborted", 4128);
    }

    @Override // xe.f, we.b, ve.a
    public final void o() {
        int v10;
        int i10;
        super.o();
        try {
            v10 = v();
        } catch (Exception e10) {
            ge.b.p(e10.toString());
            c(0, false);
        }
        if (v10 != 0) {
            c(v10, false);
            return;
        }
        z(514);
        this.F = this.H;
        this.f29237j = true;
        if (n0()) {
            if (s().f32273w) {
                G0();
            } else {
                if (!this.U) {
                    i10 = 523;
                } else {
                    E0();
                    i10 = 258;
                }
                z(i10);
            }
        }
        n(this.f29254x);
        ge.b.e("ProcessorXG0010S stopped", this.f29221a);
        A();
        if (this.f29252v == 525) {
            z(259);
        }
    }
}
