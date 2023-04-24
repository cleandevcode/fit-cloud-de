package oc;

import android.bluetooth.BluetoothGatt;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import yk.a;

/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements wk.e {

    /* renamed from: a */
    public final /* synthetic */ int f23035a;

    /* renamed from: b */
    public final /* synthetic */ Object f23036b;

    public /* synthetic */ s0(int i10, Object obj) {
        this.f23035a = i10;
        this.f23036b = obj;
    }

    @Override // wk.e
    public final Object apply(Object obj) {
        switch (this.f23035a) {
            case 0:
                ql.b bVar = (ql.b) this.f23036b;
                tk.i iVar = (tk.i) obj;
                bVar.getClass();
                iVar.getClass();
                List asList = Arrays.asList(bVar.u(new a.b()), new fl.y0(iVar, bVar));
                Objects.requireNonNull(asList, "sources is null");
                return new fl.b(asList);
            default:
                Long l10 = (Long) obj;
                return new gl.n(new o5.u(1, (BluetoothGatt) this.f23036b));
        }
    }
}
