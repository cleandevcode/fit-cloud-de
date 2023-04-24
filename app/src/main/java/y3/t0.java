package y3;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class t0 extends gm.m implements fm.l<Object, Bundle> {

    /* renamed from: b */
    public final /* synthetic */ Class<Object> f31073b;

    /* renamed from: c */
    public final /* synthetic */ Class<Object> f31074c;

    /* renamed from: d */
    public final /* synthetic */ Object f31075d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Class<Object> cls, Class<Object> cls2, Object obj) {
        super(1);
        this.f31073b = cls;
        this.f31074c = cls2;
        this.f31075d = obj;
    }

    @Override // fm.l
    public final Bundle k(Object obj) {
        b0 b0Var = (b0) obj;
        gm.l.f(b0Var, "state");
        Bundle bundle = new Bundle();
        Class<Object> cls = this.f31073b;
        Class<Object> cls2 = this.f31074c;
        Object obj2 = this.f31075d;
        bundle.putBundle("mvrx:saved_instance_state", tb.a.k(b0Var, false));
        bundle.putSerializable("mvrx:saved_viewmodel_class", cls);
        bundle.putSerializable("mvrx:saved_state_class", cls2);
        if (obj2 != null) {
            if (obj2 instanceof Parcelable) {
                bundle.putParcelable("mvrx:saved_args", (Parcelable) obj2);
            } else if (obj2 instanceof Serializable) {
                bundle.putSerializable("mvrx:saved_args", (Serializable) obj2);
            } else {
                throw new IllegalStateException("Args must be parcelable or serializable".toString());
            }
        }
        return bundle;
    }
}
