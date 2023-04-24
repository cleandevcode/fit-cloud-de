package lh;

import kotlin.Metadata;
import qi.p;

@Metadata
/* loaded from: classes2.dex */
public abstract class i extends c {

    /* renamed from: m0 */
    public final tl.d f20018m0;

    /* renamed from: n0 */
    public final tl.d f20019n0;

    public i() {
        this.f20018m0 = p.d(this);
        this.f20019n0 = p.c(this);
    }

    public i(int i10) {
        super(i10);
        this.f20018m0 = p.d(this);
        this.f20019n0 = p.c(this);
    }

    public final d7.e e1() {
        return (d7.e) this.f20019n0.getValue();
    }

    public final d7.e f1() {
        return (d7.e) this.f20018m0.getValue();
    }
}
