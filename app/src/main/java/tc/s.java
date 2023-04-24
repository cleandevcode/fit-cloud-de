package tc;

import kc.o0;

/* loaded from: classes.dex */
public final class s implements wk.e<Boolean, o0.a> {
    @Override // wk.e
    public final o0.a apply(Boolean bool) {
        return bool.booleanValue() ? o0.a.READY : o0.a.LOCATION_SERVICES_NOT_ENABLED;
    }
}
