package o5;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum f0 {
    GET,
    POST,
    /* JADX INFO: Fake field, exist only in values array */
    DELETE;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static f0[] valuesCustom() {
        return (f0[]) Arrays.copyOf(values(), 3);
    }
}
