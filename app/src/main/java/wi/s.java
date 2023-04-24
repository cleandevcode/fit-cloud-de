package wi;

import android.bluetooth.BluetoothGattService;
import fl.a0;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kc.x0;
import kc.y0;

/* loaded from: classes2.dex */
public final class s extends gm.m implements fm.l<y0, tk.t<? extends BluetoothGattService>> {

    /* renamed from: b */
    public final /* synthetic */ k f29950b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(k kVar) {
        super(1);
        this.f29950b = kVar;
    }

    @Override // fm.l
    public final tk.t<? extends BluetoothGattService> k(y0 y0Var) {
        UUID uuid = this.f29950b.f29898f;
        List<BluetoothGattService> list = y0Var.f18434a;
        Objects.requireNonNull(list, "source is null");
        return new dl.g(new fl.p(new fl.t(new a0(list), new x0(uuid))), tk.p.d(new lc.o(uuid)));
    }
}
